package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment.Crf5bQ25Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment.Crf5bQ49Fragment;

public class TestingCrf5b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_crf5b);


        Crf5bQ49Fragment fragment = new Crf5bQ49Fragment();
      //  Crf5bQ25Fragment fragment = new Crf5bQ25Fragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_frame_test, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();



    }

}
