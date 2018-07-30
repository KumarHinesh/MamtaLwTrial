package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;


import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf1_fragments.PwInfoFragment1;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3b80Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3bQ13Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3bQ29Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3bQ44Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3bQ72Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormsCrf2AndCrf3All;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.FormCrf3bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class CRF3bActivity extends AppCompatActivity {

//    FrameLayout frame_layout_crf3b;

    public  static FormCrf3bDTO formCrf3bDTO;
    public  static FormsCrf2AndCrf3All formsCrf2AndCrf3All;
    PregnantWomanDTO pregnantWomanDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf3b);

      //  frame_layout_crf3b = (FrameLayout) findViewById(R.id.frame_layout_crf3b);

        formCrf3bDTO = new FormCrf3bDTO();

        formsCrf2AndCrf3All  = new Gson().fromJson(getIntent().getStringExtra("forms"),FormsCrf2AndCrf3All.class);

        pregnantWomanDTO = formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman();
        formCrf3bDTO.setTeam(formsCrf2AndCrf3All.getFormCrf3aDTO().getTeam());

        formCrf3bDTO.setPregnantWoman(pregnantWomanDTO);
        formCrf3bDTO.setQ2(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        formCrf3bDTO.setQ3(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format( Calendar.getInstance().getTime()));


        //   Crf3bQ29Fragment fragment4 = new Crf3bQ29Fragment();

     //   Crf3b80Fragment fragment4 = new Crf3b80Fragment();

       // Crf3bQ72Fragment fragment4 = new Crf3bQ72Fragment();
      //  Crf3bQ44Fragment fragment4 = new Crf3bQ44Fragment();


       // Fragment fragment4 = new Crf3bQ29Fragment();
        Crf3bQ13Fragment fragment4 = new Crf3bQ13Fragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout_crf3b, fragment4, fragment4.getClass().getSimpleName()).commit();

    }

    @Override
    public void onBackPressed() {

    try{

        if(formCrf3bDTO.getQ13()!=null) {

            Crf3bQ13Fragment fragment = new Crf3bQ13Fragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame_layout_crf3b, fragment);
            fragmentTransaction.commit();

        }

    }catch (Exception e){

    }



       // super.onBackPressed();
    }
}
