package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments;

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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.Crf6Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments.Crf6WeightLW;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments.VaccinationFragment;


public class Crf6_q28 extends Fragment {

    Button btn_next;
    RadioButton rb_q28;
    RadioGroup rg_q28;
    TextView tv_q28;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf6_q28, container, false);

        btn_next = (Button) view.findViewById(R.id.btn_next);
        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);

        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());

               /* Fragment fragment;

                if (rb_q28.getTag().equals("1")){

                    fragment = new Crf6WeightLW();

                }else {

                    fragment = new VaccinationFragment();

                }

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layoutcrf6, fragment);
                fragmentTransaction.commit();
*/

            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rb_q28.getTag() != null){

                    Crf6Activity.formCrf6.setQ28(rb_q28.getTag().toString());
                    Fragment fragment;

                    if (rb_q28.getTag().equals("2")){

                        fragment = new VaccinationFragment();
                    }else {
                        fragment = new Crf6WeightLW();
                    }

                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layoutcrf6, fragment);
                    fragmentTransaction.commit();

                }

            }
        });



        // Inflate the layout for this fragment
        return view;
    }
}
