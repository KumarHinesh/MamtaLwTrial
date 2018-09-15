package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3_fragments.Crf3PwInfoFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormsCrf2AndCrf3All;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3a.FormCrf3aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class CRF3Activity extends AppCompatActivity {


   //public  static FormCrf3aDTO formCrf3aDTO;
   // PregnantWomanDTO pregnantWomanDTO;

    public static FormsCrf2AndCrf3All formsCrf2AndCrf3All;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf3);

        formsCrf2AndCrf3All = new Gson().fromJson(getIntent().getStringExtra("forms"),FormsCrf2AndCrf3All.class);

        formsCrf2AndCrf3All.getFormCrf3aDTO().setPregnantWoman(formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman());
        TeamDTO teamDTO = new TeamDTO();
        teamDTO.setId(getSharedPreferences("teamId",CRF3Activity.MODE_PRIVATE).getInt("id",-1));
        formsCrf2AndCrf3All.getFormCrf3aDTO().setTeam(teamDTO);

        formsCrf2AndCrf3All.getFormCrf3aDTO().setQ2(new SimpleDateFormat(ContantsValues.DATEFORMAT).format( Calendar.getInstance().getTime()));
        formsCrf2AndCrf3All.getFormCrf3aDTO().setQ3(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format( Calendar.getInstance().getTime()));

        //   Fragment fragment = new Crf3Q15Fragment();
        Fragment fragment = new Crf3PwInfoFragment();


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layoutCrf3, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();

    }
}
