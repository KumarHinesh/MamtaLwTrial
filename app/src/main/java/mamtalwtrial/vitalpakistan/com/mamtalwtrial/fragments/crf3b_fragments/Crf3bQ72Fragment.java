package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments;

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
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;

public class Crf3bQ72Fragment extends Fragment {

    EditText et_q73_z, et_q77_i;

    RadioGroup rg_q73_z, rg_q77_i;

    RadioButton rb_q73_z, rb_q77_i;

    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            final View view = inflater.inflate(R.layout.fragment_crf3b_q72, container, false);

        et_q73_z = (EditText) view.findViewById(R.id.et_q73_z);
        et_q77_i = (EditText) view.findViewById(R.id.et_q77_i);

        rg_q73_z = (RadioGroup) view.findViewById(R.id.rg_q73_z);
        rg_q73_z.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_z = (RadioButton) view.findViewById(rg_q73_z.getCheckedRadioButtonId());

                if(rb_q73_z.getTag().toString().equalsIgnoreCase("yes")){
                    et_q73_z.setVisibility(View.VISIBLE);
                }else {
                    et_q73_z.setVisibility(View.INVISIBLE);
                }
            }
        });

        rg_q77_i = (RadioGroup) view.findViewById(R.id.rg_q77_i);
        rg_q77_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q77_i = (RadioButton) view.findViewById(rg_q77_i.getCheckedRadioButtonId());

                if(rb_q77_i.getTag().toString().equalsIgnoreCase("yes")){
                    et_q77_i.setVisibility(View.VISIBLE);
                }else {
                    et_q77_i.setVisibility(View.INVISIBLE);
                }
            }
        });

        btn_submit = (Button) view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Crf3b80Fragment crf3b80Fragment = new Crf3b80Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout_crf3b, crf3b80Fragment);
                fragmentTransaction.commit();


            }
        });
        return view;
    }

}
