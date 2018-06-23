package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3_fragments;

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
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3bQ44Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class Crf3Q15Fragment extends Fragment {

    Button btnConform, btnCancel;
    TextView tv_engText,tv_RomanEngText;
    Dialog dialog;

    RadioGroup rg_q22, rg_q19, rg_q20;

    RadioButton rb_q22, rb_q19, rb_q20;

    EditText et_q22, et_q17, et_q24;

    LinearLayout ll_q24;

    Button btn_next;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view  = inflater.inflate(R.layout.fragment_crf3_q15, container, false);
        ll_q24 = (LinearLayout) view.findViewById(R.id.ll_q24);
        et_q22 = (EditText) view.findViewById(R.id.et_q22);
        et_q24 = (EditText) view.findViewById(R.id.et_q24);
        et_q17 = (EditText) view.findViewById(R.id.et_q17);

        rg_q22 = (RadioGroup) view.findViewById(R.id.rg_q22);
        rg_q22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q22 = (RadioButton) view.findViewById(rg_q22.getCheckedRadioButtonId());
                if(rb_q22.getTag().toString().equalsIgnoreCase("yes")){

                    ll_q24.setVisibility(View.VISIBLE);
                    et_q22.setVisibility(View.VISIBLE);
                }else {

                    ll_q24.setVisibility(View.GONE);
                    et_q22.setVisibility(View.GONE);
                }
            }
        });


        btn_next = (Button) view.findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myCustomeDialog();
            }
        });

        rg_q19 = (RadioGroup) view.findViewById(R.id.rg_q19);
        rg_q19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q19 = (RadioButton) view.findViewById(rg_q19.getCheckedRadioButtonId());

                 CRF3Activity.formCrf3aDTO.setQ19(rb_q19.getTag().toString());
            }
        });

        rg_q20 = (RadioGroup) view.findViewById(R.id.rg_q20);
        rg_q20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q20 = (RadioButton) view.findViewById(rg_q20.getCheckedRadioButtonId());

                if(rb_q20.getTag().toString().equalsIgnoreCase("yes")){

                    CRF3Activity.formCrf3aDTO.setQ20("y");
                }
                if(rb_q20.getTag().toString().equalsIgnoreCase("no")){
                    CRF3Activity.formCrf3aDTO.setQ20("n");
                }
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

        tv_engText.setText("You successfully filled CRF3A Now fill CRF3B");
        tv_RomanEngText.setText("Apny CRF3A bhar lia h ab ap CRF3B bharay");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb_q22.getTag().toString().equalsIgnoreCase("yes")){

                    CRF3Activity.formCrf3aDTO.setQ22(et_q22.getText().toString());
                    CRF3Activity.formCrf3aDTO.setQ24(et_q24.getText().toString());
                }else {

                    CRF3Activity.formCrf3aDTO.setQ22("n");
                }

                CRF3Activity.formCrf3aDTO.setQ25(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format( Calendar.getInstance().getTime()));
                CRF3Activity.formCrf3aDTO.setQ17(et_q17.getText().toString());
                SendDataToServer.sendCrf3aForm(CRF3Activity.formCrf3aDTO);
                startActivity(new Intent(getContext(), CRF3bActivity.class).putExtra("pwData",new Gson().toJson(CRF3Activity.formCrf3aDTO.getPregnantWoman())));
                getActivity().finish();

            }
        });

        dialog.show();

    }


}
