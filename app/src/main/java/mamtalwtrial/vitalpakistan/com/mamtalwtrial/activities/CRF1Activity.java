package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf1_fragments.PwInfoFragment1;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf1_fragments.PwMuacAssessmentFragment2;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;

public class CRF1Activity extends AppCompatActivity {

    public static int turnId = -1;
    public static int fragmentNo = 0;
    public static FormCrf1DTO formCrf1DTO;
    boolean  b;
//, ,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf1);


        TeamDTO teamDTO = new TeamDTO();

        teamDTO.setId(getSharedPreferences("teamId",CRF1Activity.MODE_PRIVATE).getInt("id",-1));

        formCrf1DTO =   new Gson().fromJson(getIntent().getStringExtra("form"),FormCrf1DTO.class) ;

//        Log.d("33333333333",formCrf1DTO.getFollowUpPositionInList()+"");


        try{

            b = formCrf1DTO.getPregnantWoman()!= null;

        }catch (Exception e){formCrf1DTO = new FormCrf1DTO();}

        if(b){

          //  formCrf1DTO.setPregnantWoman(pregnantWoman);
          //  formCrf1DTO.setFollowupId(details.getId());
            formCrf1DTO.setFollowupStatus(Constants.FOLLOWUP_COMPLETED);
            Fragment fragment = new PwInfoFragment1();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_frame, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();

       }
        else {


            Fragment fragment = new PwInfoFragment1();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_frame, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();

        }

        formCrf1DTO.setTeam(teamDTO);

    }

    @Override
    public void onBackPressed() {

       android.app.Fragment runningFragment = getFragmentManager().findFragmentById(R.id.fragment_frame);

    /*    if(getFragmentManager().findFragmentById(R.id.fragment_frame)==){}*/

        Toast.makeText(CRF1Activity.this,"Clicked back",Toast.LENGTH_LONG).show();

        int count = getFragmentManager().getBackStackEntryCount();

        if (fragmentNo == 1) {

            startActivity(new Intent(CRF1Activity.this,DashboardActivity.class));
            finish();
        }else if(fragmentNo == 2) {

            Fragment fragment = new PwInfoFragment1();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_frame, fragment);
            fragmentTransaction.commit();


            // getFragmentManager().popBackStack();
        }else if(fragmentNo == 3) {

            PwMuacAssessmentFragment2 pwMuacAssessmentFragment2 = new PwMuacAssessmentFragment2();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_frame, pwMuacAssessmentFragment2);
            fragmentTransaction.commit();

            // getFragmentManager().popBackStack();
        }


         //   super.onBackPressed();

    //    }
    }
}
