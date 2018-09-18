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

    public  static FormsCrf2AndCrf3All formsCrf2AndCrf3All;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf3b);

        formsCrf2AndCrf3All  = new Gson().fromJson(getIntent().getStringExtra("forms"),FormsCrf2AndCrf3All.class);

        formsCrf2AndCrf3All.setCrf3bStatus(true);
        formsCrf2AndCrf3All.setFormCrf3bDTO(new FormCrf3bDTO());

        formsCrf2AndCrf3All.getFormCrf3bDTO().setPregnantWoman(formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman());
        formsCrf2AndCrf3All.getFormCrf3bDTO().setTeam(formsCrf2AndCrf3All.getFormCrf3aDTO().getTeam());

        formsCrf2AndCrf3All.getFormCrf3bDTO().setQ2(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        formsCrf2AndCrf3All.getFormCrf3bDTO().setQ3(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format( Calendar.getInstance().getTime()));

        Crf3bQ13Fragment fragment4 = new Crf3bQ13Fragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout_crf3b, fragment4, fragment4.getClass().getSimpleName()).commit();

    }

    @Override
    public void onBackPressed() {

    try{

        if(formsCrf2AndCrf3All.getFormCrf3bDTO().getQ13()!=null) {

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
