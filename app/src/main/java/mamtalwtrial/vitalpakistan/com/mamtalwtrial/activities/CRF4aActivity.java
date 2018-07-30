package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments.Crf4aCounselingQ79;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments.Crf4aQ20Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments.Crf4aQ27Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5a_fragment.Crf5aQ26Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a.FormCrf4aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4b.FormCrf4bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;

public class CRF4aActivity extends AppCompatActivity {

    public static FormCrf4aDTO formCrf4aDTO;
    public static FormCrf4bDTO formCrf4bDTO;
    public static FormCrf5a formCrf5a;

    public static int startHour = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf4a);

        formCrf4aDTO = new FormCrf4aDTO();
        formCrf4bDTO = new FormCrf4bDTO();
        formCrf5a = new FormCrf5a();

        Crf4aQ27Fragment fragment = new Crf4aQ27Fragment();


       // Crf4aCounselingQ79 crf4aCounselingQ79 = new Crf4aCounselingQ79();

        /*Crf4aQ20Fragment fragment = new Crf4aQ20Fragment();*/

      //  Crf5aQ26Fragment fragment = new Crf5aQ26Fragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout4a, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();


    }
}
