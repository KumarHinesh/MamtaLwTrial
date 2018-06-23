package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3c_fragments.Crf3cQ14BabyWeightFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.FormCrf3cDTO;

public class CRF3cActivity extends AppCompatActivity {

    public static FormCrf3cDTO formCrf3cDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf3c);

        formCrf3cDTO = new FormCrf3cDTO();

        Crf3cQ14BabyWeightFragment fragment4 = new Crf3cQ14BabyWeightFragment();



        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout_crf3c, fragment4, fragment4.getClass().getSimpleName()).addToBackStack(null).commit();



    }


}
