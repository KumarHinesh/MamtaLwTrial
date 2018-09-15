package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.messageDialogBox.SingleButtonDialog;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.LoginDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserLoginActivity extends AppCompatActivity {


    ProgressDialog progressDialog;

    SharedPreferences sharedpreferences1, sharedpreferences2, sharedpreferences3, sharedpreferences, sharedpreferences4, spreferencesTeamId, spreferencesTeamId5;

    static  String strUser;
    Button btnUserLogin;
    EditText etUserName, etPass;
    //toolbar
    TextView tv_headingText;
      int TEAMID;
    public static String teamType;
    Set<String>  set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        progressDialog = new ProgressDialog(UserLoginActivity.this);
   //     startActivity(new Intent(UserLoginActivity.this,CRF3bActivity.class));
        //startActivity(new Intent(UserLoginActivity.this,CRF2DashboargActivity.class));
       //startActivity(new Intent(UserLoginActivity.this,CRF3cActivity.class));
       // startActivity(new Intent(UserLoginActivity.this,Crf6Activity.class));
      //  this.finish();
        spreferencesTeamId = getSharedPreferences("teamId",
                UserLoginActivity.MODE_PRIVATE);
        sharedpreferences = getSharedPreferences("Values",
                UserLoginActivity.MODE_PRIVATE);
        sharedpreferences1 = getSharedPreferences("comp",
                UserLoginActivity.MODE_PRIVATE);
        sharedpreferences2 = getSharedPreferences("incomp",
                UserLoginActivity.MODE_PRIVATE);
        sharedpreferences3 = getSharedPreferences("comptask",
                UserLoginActivity.MODE_PRIVATE);
        sharedpreferences4 = getSharedPreferences("notEligble",
                UserLoginActivity.MODE_PRIVATE);
        spreferencesTeamId5 = getSharedPreferences("site",
                UserLoginActivity.MODE_PRIVATE);

        if (sharedpreferences.getBoolean("IsLogin",false)) {

            startActivity(new Intent(UserLoginActivity.this,DashboardActivity.class));
            finish();
        }else {

            SharedPreferences.Editor editorid = spreferencesTeamId.edit();
            editorid.putInt("id",-1);
            editorid.commit();


            SharedPreferences.Editor editor1 = sharedpreferences1.edit();
            editor1.putInt("val",0);
            editor1.commit();

            SharedPreferences.Editor editor2 = sharedpreferences2.edit();
            editor2.putInt("val",0);
            editor2.commit();

            SharedPreferences.Editor editor3 = sharedpreferences3.edit();
            editor3.putInt("val",0);
            editor3.commit();

            SharedPreferences.Editor editor4 = sharedpreferences4.edit();
            editor4.putInt("val",0);
            editor4.commit();

            SharedPreferences.Editor editor5 = spreferencesTeamId5.edit();
            editor5.putString("val","");
            editor5.commit();


        }

        etUserName = (EditText) findViewById(R.id.etUserName);

        etPass = (EditText) findViewById(R.id.etPass);

        tv_headingText = (TextView) findViewById(R.id.tv_headingText);
        tv_headingText.setText("USER LOGIN");

        btnUserLogin = (Button) findViewById(R.id.btnUserLogin);
        btnUserLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                TeamDTO teamDTO = new TeamDTO();
                strUser = etUserName.getText().toString();
                teamDTO.setUserName(etUserName.getText().toString().trim());
                teamDTO.setPassword(etPass.getText().toString().trim());
                teamDTO.setDate(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
                teamDTO.setTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

                if(WifiConnectOrNot.haveNetworkConnection(UserLoginActivity.this)){

                    sendUserPassword(teamDTO);
                    progressDialog.setTitle("Logging in..");
                    progressDialog.setMessage("Wait");
                    progressDialog.show();

                }else {




                       SingleButtonDialog.singleBtnDialog(UserLoginActivity.this,"First Connect With Internet",
                            "Pehle Internet Say Connect hpjai");
                }
            }
        });

    }

    public void sendUserPassword(TeamDTO team){

        APIService mAPIService = ApiUtils.getAPIService();

        final ArrayList<LoginDTO> listOfLoginDto = new ArrayList<LoginDTO>();

        //final FormCrf1DTO dto;
        mAPIService.userLogin(team).enqueue(new Callback<LoginDTO>() {

            @Override
            public void onResponse(Call<LoginDTO> call, Response<LoginDTO> response) {

                ArrayList<String> jsonObjList = new ArrayList<String>();

                    if(response.code()==404){
                        progressDialog.dismiss();
                        SingleButtonDialog.singleBtnDialog(UserLoginActivity.this,"Invalid User","User Tasdeek shuda nhi hai");

                    }else {

                        try{
                            LoginDTO loginDTO = response.body();

                            if(loginDTO.getFollowups()!=null){

                                for(int i=0; i<loginDTO.getFollowups().size(); i++){

                                    Gson gson  =  new Gson();

                                    jsonObjList.add(gson.toJson(loginDTO.getFollowups().get(i)));

                                }

                                SaveAndReadInternalData.saveFollowUpsList(UserLoginActivity.this,jsonObjList);
                            }

                            SharedPreferences.Editor editorid = spreferencesTeamId.edit();
                            editorid.putInt("id",loginDTO.getTeamId());
                            editorid.commit();

                            teamType = loginDTO.getTeamType();

                            SharedPreferences.Editor editor = sharedpreferences.edit();
                            editor.putBoolean("IsLogin",true);
                            editor.commit();


                            SharedPreferences.Editor editor7 = spreferencesTeamId5.edit();
                            editor7.putString("val",loginDTO.getSite().toString());
                            editor7.commit();

                            switch (loginDTO.getTeamType()){

                                case "SCREENING":

                                    startActivity(new Intent(UserLoginActivity.this,DashboardActivity.class).putExtra("site", loginDTO.getSite()));
                                    finish();
                                    break;

                                case "ANTHRO":
                                    startActivity(new Intent(UserLoginActivity.this,AnthroDashBoard.class));
                                    finish();
                                    Toast.makeText(getApplicationContext(), "Anthro is not put ",Toast.LENGTH_LONG).show();
                                    //finish();
                                    break;

                                case "RANDOMIZATION":
                                    startActivity(new Intent(UserLoginActivity.this,CRF2DashboargActivity.class));
                                    finish();
                                    break;

                                case "NEW BORN":
                                    startActivity(new Intent(UserLoginActivity.this,CRF4And5Dashboard.class));
                                    finish();
                                    Toast.makeText(getApplicationContext(), "New Born is not put",Toast.LENGTH_LONG).show();
                                    break;


                                case "COMPLIANCE":
                                    Toast.makeText(getApplicationContext(), "compliance is not put",Toast.LENGTH_LONG).show();
                                    break;
                            }

                        }catch (Exception e){

                            e.printStackTrace();
                        }

                    }
            }

            @Override
            public void onFailure(Call<LoginDTO> call, Throwable t) {

                Log.d("eeror","666666666666666666666");
            }
        });

    }

    @Override
    public void onBackPressed() {

        if(sharedpreferences.getBoolean("IsLogin",false)){

            super.onBackPressed();
        }

    }
}