package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.messageDialogBox.SingleButtonDialog;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;

public class DashboardActivity extends AppCompatActivity {


    SharedPreferences sharedPreferences1, sharedPreferences2, sharedPreferences3, sharedPreferences4;
    int taskCount;
    ArrayList<FollowupsDTO> listOfFollowUp;

    Button btnNewScreening, btn_task, btnUploadData, btnlogOut;

    int a =0;

    String getSite;

    //toolbar
    TextView tv_headingText, tv_incom_form, tv_com_form, tv_com_task, tv_total_visit, tv_nEligble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent intent = getIntent();
        getSite =  intent.getStringExtra("site");

        sharedPreferences1  = getSharedPreferences("incomp",DashboardActivity.MODE_PRIVATE);
        sharedPreferences2  = getSharedPreferences("comp",DashboardActivity.MODE_PRIVATE);
        sharedPreferences3  = getSharedPreferences("comptask",DashboardActivity.MODE_PRIVATE);
        sharedPreferences4  = getSharedPreferences("notEligble",DashboardActivity.MODE_PRIVATE);

        tv_headingText = (TextView) findViewById(R.id.tv_headingText);
        tv_headingText.setText("SCREENING TEAM");

        tv_nEligble = (TextView) findViewById(R.id.tv_nEligble);
        tv_total_visit = (TextView) findViewById(R.id.tv_total_visit);
        tv_incom_form = (TextView) findViewById(R.id.tv_incom_form);
        tv_com_form = (TextView) findViewById(R.id.tv_com_form);
        tv_com_task = (TextView) findViewById(R.id.tv_com_task);

        tv_nEligble.setText(sharedPreferences4.getInt("val",0)+"");
        tv_total_visit.setText((sharedPreferences1.getInt("val",0))+(sharedPreferences2.getInt("val",0))+
                (sharedPreferences3.getInt("val",0))+(sharedPreferences4.getInt("val",0))+"");
        tv_incom_form.setText(sharedPreferences1.getInt("val",0)+"");
        tv_com_form.setText(sharedPreferences2.getInt("val",0)+"");
        tv_com_task.setText(sharedPreferences3.getInt("val",0)+"");

        btnNewScreening = (Button) findViewById(R.id.btnNewScreening);

        btnNewScreening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(DashboardActivity.this,CRF1Activity.class).putExtra("site", getSite));
                 finish();
            }
        });

        a =  SaveAndReadInternalData.isDataAvailable(DashboardActivity.this);

        if(UserLoginActivity.strUser==null){

            SharedPreferences sharedPreferences = getSharedPreferences("Values",DashboardActivity.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("IsLogin", false);
            editor.commit();

            startActivity(new Intent(DashboardActivity.this,UserLoginActivity.class));
        }

        btnlogOut = (Button) findViewById(R.id.btnlogOut);
        btnlogOut.setText("Logout \n "+UserLoginActivity.strUser);
        btnlogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences("Values",DashboardActivity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("IsLogin", false);
                editor.commit();


                startActivity(new Intent(DashboardActivity.this,UserLoginActivity.class));
                finish();


            }
        });


        btnUploadData = (Button) findViewById(R.id.btnUploadData);

        if(a==-1){

            btnUploadData.setBackgroundResource(R.drawable.button_shape_green);
            btnUploadData.setText("DataUploaded");
        }else {

            btnUploadData.setBackgroundResource(R.drawable.button_shape_color);
            btnUploadData.setText("Upload Data "+a);
        }

        btnUploadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(WifiConnectOrNot.haveNetworkConnection(DashboardActivity.this)){

                    SaveAndReadInternalData.uploadData(DashboardActivity.this);
                    startActivity(new Intent(DashboardActivity.this,DashboardActivity.class));
                    finish();

                }else {

                    SingleButtonDialog.singleBtnDialog(DashboardActivity.this,"First Connect With Internet","Pehle Internet Say Connect hpjai");

                }

            }
        });

        btn_task = (Button) findViewById(R.id.btn_task);

        listOfFollowUp = SaveAndReadInternalData.getFollowUpsList(DashboardActivity.this);

        if(listOfFollowUp != null && listOfFollowUp.isEmpty()==false){

            btn_task.setText("YOUR TASK "+"("+listOfFollowUp.size()+")");

        }

        btn_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(listOfFollowUp!=null && listOfFollowUp.isEmpty()==false){

                    startActivity(new Intent(DashboardActivity.this,TaskListActivity.class));
                    finish();
                }else {

                    SingleButtonDialog.singleBtnDialog(DashboardActivity.this,"Zero Task","Task Nhi h");
                }


            }
        });

    }


}
