package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;


import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3bQ13Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3bQ29Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.FormCrf3bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class CRF3bActivity extends AppCompatActivity {

    public  static FormCrf3bDTO formCrf3bDTO;
    PregnantWomanDTO pregnantWomanDTO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf3b);


        formCrf3bDTO = new FormCrf3bDTO();
        pregnantWomanDTO = new Gson().fromJson(getIntent().getStringExtra("pwData"),PregnantWomanDTO.class);

        formCrf3bDTO.setPregnantWoman(pregnantWomanDTO);
        formCrf3bDTO.setQ2(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        formCrf3bDTO.setQ3(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format( Calendar.getInstance().getTime()));


           Crf3bQ29Fragment fragment4 = new Crf3bQ29Fragment();

       // Crf3b80Fragment fragment4 = new Crf3b80Fragment();

       // Crf3bQ72Fragment fragment4 = new Crf3bQ72Fragment();
        //Crf3bQ44Fragment fragment4 = new Crf3bQ44Fragment();

     //   Fragment fragment4 = new Crf3bQ29Fragment();

      //  Crf3bQ13Fragment fragment4 = new Crf3bQ13Fragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout_crf3b, fragment4, fragment4.getClass().getSimpleName()).addToBackStack(null).commit();



    }
}
