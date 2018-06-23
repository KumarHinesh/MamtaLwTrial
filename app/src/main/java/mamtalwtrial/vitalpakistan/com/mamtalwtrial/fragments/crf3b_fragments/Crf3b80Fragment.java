package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.gson.Gson;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;

public class Crf3b80Fragment extends Fragment {

    Button btnConform, btnCancel;
    TextView tv_engText,tv_RomanEngText;
    Dialog dialog;

    EditText et_q96_p, et_q101_l;

    RadioGroup rg_q96_p, rg_q101_l;

    RadioButton rb_q96_p, rb_q101_l;

    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf3b80, container, false);

        et_q96_p = (EditText) view.findViewById(R.id.et_q96_p);
        et_q101_l = (EditText) view.findViewById(R.id.et_q101_l);

        rg_q96_p = (RadioGroup) view.findViewById(R.id.rg_q96_p);
        rg_q96_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q96_p = (RadioButton) view.findViewById(rg_q96_p.getCheckedRadioButtonId());

                if(rb_q96_p.getTag().toString().equalsIgnoreCase("yes")){

                    et_q96_p.setVisibility(View.VISIBLE);

                }else {

                    et_q96_p.setVisibility(View.GONE);
                }

            }
        });

        rg_q101_l = (RadioGroup) view.findViewById(R.id.rg_q101_l);
        rg_q101_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q101_l = (RadioButton) view.findViewById(rg_q101_l.getCheckedRadioButtonId());

                if(rb_q101_l.getTag().toString().equalsIgnoreCase("yes")){

                    et_q101_l.setVisibility(View.VISIBLE);

                }else {

                    et_q101_l.setVisibility(View.GONE);
                }

            }
        });

        btn_submit = (Button) view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myCustomeDialog();

            }
        });

        return view;
    }


    public void myCustomeDialog(){


        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);


        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);
        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);

        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);

        btnCancel.setVisibility(View.GONE);

        tv_engText.setText("You successfully filled CRF3B Now fill CRF3C");
        tv_RomanEngText.setText("Apny CRF3B bhar lia h ab ap CRF3c bharay");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(getActivity(), CRF3cActivity.class));
                getActivity().finish();

            }
        });

        dialog.show();

    }

}
