package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4b_fragments.Crf4bQ20Fragment;

public class TestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        Crf4bQ20Fragment fragment4 = new Crf4bQ20Fragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.test_layout, fragment4, fragment4.getClass().getSimpleName()).addToBackStack(null).commit();


    }
}
