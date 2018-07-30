package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5a_fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments.Crf4aCounselingQ79;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment.Crf5bQ25Fragment;

public class Crf5aQ59Counseling extends Fragment {

    ScrollView scrolView;
    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_crf5a_q59_counseling, container, false);


        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        btn_submit = (Button) view.findViewById(R.id.btn_submit);


        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Crf5bQ25Fragment fragment = new Crf5bQ25Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                fragmentTransaction.commit();

            }
        });



        return view;
    }

    int x,y;
    public void setFocuseable(float x1, float y1){

        x = (int) x1;
        y = (int) y1;

        scrolView.post(new Runnable() {
            public void run() {
                scrolView.scrollTo(x,y); // these are your x and y coordinates
            }
        });
    }

}
