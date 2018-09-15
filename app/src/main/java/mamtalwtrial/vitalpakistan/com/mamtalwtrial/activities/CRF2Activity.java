package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments.Crf2WomeninfoFragment1;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormsCrf2AndCrf3All;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;

public class CRF2Activity extends AppCompatActivity {

    public  static int fragmentNo = -1;

    FormCrf2DTO formCrf2DTO;
    public static FormsCrf2AndCrf3All formsCrf2AndCrf3All;
    public static int babyHour;
    PregnantWomanDTO pregnantWomanDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf2);

       // formCrf2DTO  = new Gson().fromJson(getIntent().getStringExtra("form"),FormCrf2DTO.class) ;

        formCrf2DTO = new FormCrf2DTO();

        formsCrf2AndCrf3All = new FormsCrf2AndCrf3All();

         try{

             if(formCrf2DTO.getPregnantWoman()==null){

                 pregnantWomanDTO  = new Gson().fromJson(getIntent().getStringExtra("pw"),PregnantWomanDTO.class);
                formCrf2DTO.setPregnantWoman(pregnantWomanDTO);

             }

         }catch (NullPointerException e){
             formCrf2DTO = new FormCrf2DTO();
             pregnantWomanDTO  = new Gson().fromJson(getIntent().getStringExtra("pw"),PregnantWomanDTO.class);

             formCrf2DTO.setPregnantWoman(pregnantWomanDTO);
         }


        TeamDTO teamDTO = new TeamDTO();

        teamDTO.setId(getSharedPreferences("teamId",CRF2Activity.MODE_PRIVATE).getInt("id",-1));

        formCrf2DTO.setTeam(teamDTO);

        formsCrf2AndCrf3All.setCrf2Status(true);
        formsCrf2AndCrf3All.setFormCrf2DTO(formCrf2DTO);
        /*
          if(pregnantWomanDTO != null){

              formCrf2DTO.setPregnantWoman(pregnantWomanDTO);

          }
*/
        Fragment fragment4 = new Crf2WomeninfoFragment1();

        /*FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout_crf2,fragment4,"crf2FragmentInfo");
        transaction.commit();
*/
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout_crf2, fragment4, fragment4.getClass().getSimpleName()).addToBackStack(null).commit();

         //frame_layout_crf2


    }

    @Override
    public void onBackPressed() {


        android.app.Fragment fragment = getFragmentManager().findFragmentByTag("crf2FragmentInfo");





    }


}
