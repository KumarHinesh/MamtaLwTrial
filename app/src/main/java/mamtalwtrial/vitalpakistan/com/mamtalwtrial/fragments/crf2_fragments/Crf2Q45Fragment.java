package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.JsonReader;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;


public class Crf2Q45Fragment extends Fragment {

    CheckBox cb_45_1, cb_45_2, cb_46_1, cb_46_2, cb_47_1, cb_47_2, cb_48_1, cb_48_2, cb_49_1, cb_49_2, cb_50_1, cb_50_2;
    Button btn_submitCrf2;

    Button btnConform, btnCancel;
    TextView tv_engText,tv_RomanEngText;
    Dialog dialog;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_crf2_q45, container,false);

        btn_submitCrf2 = (Button) view.findViewById(R.id.btn_submitCrf2);

        cb_45_1 = (CheckBox) view.findViewById(R.id.cb_Q45_1);
        cb_45_2 = (CheckBox) view.findViewById(R.id.cb_Q45_2);
        cb_46_1 = (CheckBox) view.findViewById(R.id.cb_Q46_1);
        cb_46_2 = (CheckBox) view.findViewById(R.id.cb_Q46_2);
        cb_47_1 = (CheckBox) view.findViewById(R.id.cb_Q47_1);
        cb_47_2 = (CheckBox) view.findViewById(R.id.cb_Q47_2);
        cb_48_1 = (CheckBox) view.findViewById(R.id.cb_Q48_1);
        cb_48_2 = (CheckBox) view.findViewById(R.id.cb_Q48_2);
        cb_49_1 = (CheckBox) view.findViewById(R.id.cb_Q49_1);
        cb_49_2 = (CheckBox) view.findViewById(R.id.cb_Q49_2);
        cb_50_1 = (CheckBox) view.findViewById(R.id.cb_Q50_1);
        cb_50_2 = (CheckBox) view.findViewById(R.id.cb_Q50_2);


        cb_45_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_45_2.setChecked(false);

                }

            }
        });

        cb_45_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_45_1.setChecked(false);

                }

            }
        });


        cb_46_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_46_2.setChecked(false);

                }

            }
        });

        cb_46_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_46_1.setChecked(false);

                }
            }
        });

        cb_47_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_47_2.setChecked(false);

                }

            }
        });

        cb_47_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_47_1.setChecked(false);

                }

            }
        });

        cb_48_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_48_2.setChecked(false);

                }
            }
        });

        cb_48_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_48_1.setChecked(false);

                }

            }
        });


        cb_49_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_49_2.setChecked(false);

                }

            }
        });

        cb_49_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_49_1.setChecked(false);

                }

            }
        });

        cb_50_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_50_2.setChecked(false);

                }

            }
        });

        cb_50_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_50_1.setChecked(false);

                }

            }

        });

        btn_submitCrf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                   myCustomeDialog();

                }else {
                    Log.d("00000","woring000000");
                }


            }
        });


        return view;
    }

    public boolean validation(){

        boolean b = true;

        if(!cb_45_1.isChecked() && !cb_45_2.isChecked()){
            cb_45_1.setError("Required");
            b = false;
        }
        if(!cb_46_1.isChecked() && !cb_46_2.isChecked()){
            cb_46_1.setError("Required");
            b = false;
        }
        if(!cb_47_1.isChecked() && !cb_47_2.isChecked()){
            cb_47_1.setError("Required");
            b = false;
        }
        if(!cb_48_1.isChecked() && !cb_48_2.isChecked()){
            cb_48_1.setError("Required");
            b = false;
        }
        if(!cb_49_1.isChecked() && !cb_49_2.isChecked()){
            cb_49_1.setError("Required");
            b = false;
        }
        if(!cb_50_1.isChecked() && !cb_50_2.isChecked()){
            cb_50_1.setError("Required");
            b = false;
        }

        return b;
    }

    public String getCheckBoxResult(CheckBox cb1, CheckBox cb2){

        if(cb1.isChecked()){return "YES";}
        else if(cb2.isChecked()){return "NO";}
        else {return "x";}

    }

    public void insertDataInForm(){

        CRF2Activity.formCrf2DTO.setQ45(getCheckBoxResult(cb_45_1,cb_45_2));
        CRF2Activity.formCrf2DTO.setQ46(getCheckBoxResult(cb_46_1,cb_46_2));
        CRF2Activity.formCrf2DTO.setQ47(getCheckBoxResult(cb_47_1,cb_47_2));
        CRF2Activity.formCrf2DTO.setQ48(getCheckBoxResult(cb_48_1,cb_48_2));
        CRF2Activity.formCrf2DTO.setQ49(getCheckBoxResult(cb_49_1,cb_49_2));
        CRF2Activity.formCrf2DTO.setQ50(getCheckBoxResult(cb_50_1,cb_50_2));

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

        tv_engText.setText("You filled Crf2 Now fill crf3A");
        tv_RomanEngText.setText("Apny Crf2 bhar lia h ab ap crf3a bharay");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insertDataInForm();

               SendDataToServer.sendCrf2Form(CRF2Activity.formCrf2DTO);
                startActivity(new Intent(getContext(), CRF3Activity.class).putExtra("pwData",new Gson().toJson(CRF2Activity.formCrf2DTO.getPregnantWoman())));
                getActivity().finish();

            }
        });

        dialog.show();

    }




}
