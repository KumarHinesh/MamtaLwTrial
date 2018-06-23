package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.DashboardActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments.Crf2Q45Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class Crf2Q36Fragment extends Fragment {

    boolean[] Q44_fields;

    int weekOfPregnancy;

    int isAllTrue = 0;
    Dialog dialog;

    CheckBox cb_Q36_1, cb_Q36_2, cb_Q37_1, cb_Q37_2, cb_Q38_1, cb_Q38_2, cb_Q38_3, cb_Q38_4,cb_Q39_1,
            cb_Q39_2, cb_Q40_1, cb_Q40_2, cb_Q41_1_1, cb_Q41_1_2, cb_Q41_2_1, cb_Q41_2_2, cb_Q41_3_1, cb_Q41_3_2, cb_Q41_4_1, cb_Q41_4_2,
            cb_Q41_5_1, cb_Q41_5_2, cb_Q41_6_1, cb_Q41_6_2,  cb_Q42_1, cb_Q42_2, cb_Q43_1, cb_Q43_2 ;


    EditText et_other_masla, et_masla_2;
    Button btn_Q36Submit, btn_checkValidation;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf_q36,container,false);

        Q44_fields = new boolean[12];

        et_other_masla = (EditText) view.findViewById(R.id.et_other_masla);
        et_masla_2 = (EditText) view.findViewById(R.id.et_masla_2);


        /// /Q42
        cb_Q42_1 = (CheckBox) view.findViewById(R.id.cb_Q42_1);
        cb_Q42_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q42_2.setChecked(false);
                }
            }
        });
        cb_Q42_2 = (CheckBox) view.findViewById(R.id.cb_Q42_2);
        cb_Q42_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q42_1.setChecked(false);
                }
            }
        });



        //Q43 ///////////  Q43
        cb_Q43_1 = (CheckBox) view.findViewById(R.id.cb_Q43_1);
        cb_Q43_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cb_Q43_2.setChecked(false);
                }
            }
        });
        cb_Q43_2 = (CheckBox) view.findViewById(R.id.cb_Q43_2);
        cb_Q43_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cb_Q43_1.setChecked(false);
                }
            }
        });

        //Q38 part 1
        cb_Q38_1 = (CheckBox) view.findViewById(R.id.cb_Q38_1);
        cb_Q38_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb_Q38_2.setChecked(false);
                }
            }
        });
        cb_Q38_2 = (CheckBox) view.findViewById(R.id.cb_Q38_2);
        cb_Q38_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb_Q38_1.setChecked(false);

                }
            }
        });

        //Q38 part 2
        cb_Q38_3 = (CheckBox) view.findViewById(R.id.cb_Q38_3);
        cb_Q38_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    cb_Q38_4.setChecked(false);
                    et_other_masla.setVisibility(View.VISIBLE);
                }
            }
        });

        cb_Q38_4 = (CheckBox) view.findViewById(R.id.cb_Q38_4);
        cb_Q38_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    et_other_masla.setVisibility(View.GONE);
                    cb_Q38_3.setChecked(false);
                }
            }
        });


        //Q41 part 1
        cb_Q41_1_1 = (CheckBox) view.findViewById(R.id.cb_Q41_1_1);
        cb_Q41_1_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_1_2.setChecked(false);
                }
            }
        });

        cb_Q41_1_2 = (CheckBox) view.findViewById(R.id.cb_Q41_1_2);
        cb_Q41_1_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_1_1.setChecked(false);
                }
            }
        });

        //Q41 part 2
        cb_Q41_2_1 = (CheckBox) view.findViewById(R.id.cb_Q41_2_1);
        cb_Q41_2_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_4_2.setChecked(false);
                }
            }
        });

        cb_Q41_2_2 = (CheckBox) view.findViewById(R.id.cb_Q41_2_2);
        cb_Q41_2_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_2_1.setChecked(false);
                }
            }
        });

        //Q41 part 3
        cb_Q41_3_1 = (CheckBox) view.findViewById(R.id.cb_Q41_3_1);
        cb_Q41_3_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_3_2.setChecked(false);
                }
            }
        });
        cb_Q41_3_2 = (CheckBox) view.findViewById(R.id.cb_Q41_3_2);
        cb_Q41_3_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_3_1.setChecked(false);
                }
            }
        });

        //Q41 part 4
        cb_Q41_4_1 = (CheckBox) view.findViewById(R.id.cb_Q41_4_1);
        cb_Q41_4_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_4_2.setChecked(false);
                }
            }
        });
        cb_Q41_4_2 = (CheckBox) view.findViewById(R.id.cb_Q41_4_2);
        cb_Q41_4_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_4_1.setChecked(false);
                }
            }
        });

        //Q41 part 5
        cb_Q41_5_1 = (CheckBox) view.findViewById(R.id.cb_Q41_5_1);
        cb_Q41_5_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_5_2.setChecked(false);
                }

            }
        });

        cb_Q41_5_2 = (CheckBox) view.findViewById(R.id.cb_Q41_5_2);
        cb_Q41_5_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_5_1.setChecked(false);
                }
            }
        });

        //Q41 part 6
        cb_Q41_6_1 = (CheckBox) view.findViewById(R.id.cb_Q41_6_1);
        cb_Q41_6_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    et_masla_2.setVisibility(View.VISIBLE);
                    cb_Q41_6_2.setChecked(false);
                }
            }
        });

        cb_Q41_6_2 = (CheckBox) view.findViewById(R.id.cb_Q41_6_2);
        cb_Q41_6_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q41_6_1.setChecked(false);
                    et_masla_2.setVisibility(View.GONE);
                }
            }
        });


        //Q39
        cb_Q39_1 = (CheckBox) view.findViewById(R.id.cb_Q39_1);
        cb_Q39_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_Q39_2.setChecked(false);

                }
            }
        });
        cb_Q39_2 = (CheckBox) view.findViewById(R.id.cb_Q39_2);
        cb_Q39_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q39_1.setChecked(false);
                }
            }
        });

        //Q40
        cb_Q40_1 = (CheckBox) view.findViewById(R.id.cb_Q40_1);
        cb_Q40_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb_Q40_2.setChecked(false);
                }

            }
        });

        cb_Q40_2 = (CheckBox) view.findViewById(R.id.cb_Q40_2);
        cb_Q40_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q40_1.setChecked(false);
                }

            }
        });

        //Q36
        cb_Q36_1 = (CheckBox) view.findViewById(R.id.cb_Q36_1);
        cb_Q36_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb_Q36_2.setChecked(false);
                }
            }
        });

        cb_Q36_2 = (CheckBox) view.findViewById(R.id.cb_Q36_2);
        cb_Q36_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q36_1.setChecked(false);
                }
            }
        });

        //Q37
        cb_Q37_1 = (CheckBox) view.findViewById(R.id.cb_Q37_1);
        cb_Q37_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q37_2.setChecked(false);
                }
            }
        });

        cb_Q37_2 = (CheckBox) view.findViewById(R.id.cb_Q37_2);
        cb_Q37_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q37_1.setChecked(false);
                }
            }
        });

        btn_Q36Submit = (Button) view.findViewById(R.id.btn_Q36Submit);
        btn_Q36Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(setValidation()){

                    insertDataInForm();
                    checkWomanValid();

                    myCustomeDialog(1);


                }else {

                    Toast.makeText(getContext(),"Please Enter All Fields",Toast.LENGTH_LONG).show();
                }

            }
        });


        return view;
    }

    public String getCheckBoxResult(CheckBox cb1, CheckBox cb2){

        if(cb1.isChecked()){return "YES";}
        else if(cb2.isChecked()){return "NO";}
        else {return "x";}

    }

    public void insertDataInForm(){

        CRF2Activity.formCrf2DTO.setQ36(getCheckBoxResult(cb_Q36_1,cb_Q36_2));
        CRF2Activity.formCrf2DTO.setQ37(getCheckBoxResult(cb_Q37_1,cb_Q37_2));
        CRF2Activity.formCrf2DTO.setQ38A(getCheckBoxResult(cb_Q38_1,cb_Q38_2));
        if(cb_Q38_3.isChecked()){
            CRF2Activity.formCrf2DTO.setQ38B(et_other_masla.getText().toString());
        }else {
            CRF2Activity.formCrf2DTO.setQ38B("NO");
        }
        CRF2Activity.formCrf2DTO.setQ39(getCheckBoxResult(cb_Q39_1,cb_Q39_2));
        CRF2Activity.formCrf2DTO.setQ40(getCheckBoxResult(cb_Q40_1,cb_Q40_2));
        CRF2Activity.formCrf2DTO.setQ41A(getCheckBoxResult(cb_Q41_1_1,cb_Q41_1_2));
        CRF2Activity.formCrf2DTO.setQ41B(getCheckBoxResult(cb_Q41_2_1,cb_Q41_2_2));
        CRF2Activity.formCrf2DTO.setQ41C(getCheckBoxResult(cb_Q41_3_1,cb_Q41_3_2));
        CRF2Activity.formCrf2DTO.setQ41D(getCheckBoxResult(cb_Q41_4_1,cb_Q41_4_2));
        CRF2Activity.formCrf2DTO.setQ41E(getCheckBoxResult(cb_Q41_5_1,cb_Q41_5_2));
        if(cb_Q41_6_1.isChecked()){
            CRF2Activity.formCrf2DTO.setQ41F(et_masla_2.getText().toString());
        }else {
            CRF2Activity.formCrf2DTO.setQ41F("NO");
        }
        CRF2Activity.formCrf2DTO.setQ42(getCheckBoxResult(cb_Q42_1,cb_Q42_2));
        CRF2Activity.formCrf2DTO.setQ43(getCheckBoxResult(cb_Q43_1,cb_Q43_2));
    }

    public boolean setValidation(){

        boolean b = true;


        if(!cb_Q36_1.isChecked() && !cb_Q36_2.isChecked()){
            cb_Q36_1.setError("Required");
            b = false;
        }
        if(!cb_Q37_1.isChecked() && !cb_Q37_2.isChecked()){
            cb_Q37_1.setError("Required");
            b = false;
        }
        if(!cb_Q38_1.isChecked() && !cb_Q38_2.isChecked()){
            cb_Q38_1.setError("Required");
            b = false;
        }
        if(!cb_Q38_3.isChecked() && !cb_Q38_4.isChecked()){
            cb_Q38_3.setError("Required");
            b = false;
        }
        if(cb_Q38_3.isChecked()){

            String temp = et_other_masla.getText().toString();
            if(TextUtils.isEmpty(temp)){
               et_other_masla.setError("Enter Here");
                b = false;
            }
        }
        if(!cb_Q39_1.isChecked() && !cb_Q39_2.isChecked()){
            cb_Q39_1.setError("Required");
            b = false;
        }
        if(!cb_Q40_1.isChecked() && !cb_Q40_2.isChecked()){
            cb_Q40_1.setError("Required");
            b = false;
        }

        if(!cb_Q41_1_1.isChecked() && !cb_Q41_1_2.isChecked()){
            cb_Q41_1_1.setError("Required");
            b = false;
        }
        if(cb_Q41_2_1.isChecked() && !cb_Q41_2_2.isChecked()){
            cb_Q41_2_1.setError("Required");
            b = false;
        }
        if(!cb_Q41_3_1.isChecked() && !cb_Q41_3_2.isChecked()){
            cb_Q41_3_1.setError("Required");
            b = false;
        }
        if(!cb_Q41_4_1.isChecked() && !cb_Q41_4_2.isChecked()){
            cb_Q41_4_1.setError("Required");
            b = false;

        }
        if(!cb_Q41_5_1.isChecked() && !cb_Q41_5_2.isChecked()){
            cb_Q41_5_1.setError("Required");
            b = false;
        }
        if(!cb_Q41_6_1.isChecked() && !cb_Q41_6_2.isChecked()){
            cb_Q41_5_1.setError("Required");
            b = false;
        }
        if(cb_Q41_6_1.isChecked()){

            String temp = et_masla_2.getText().toString();
            if(TextUtils.isEmpty(temp)){
                et_masla_2.setError("Enter Here");
                b = false;
            }
        }
        if(!cb_Q42_1.isChecked() && !cb_Q42_2.isChecked()){
            cb_Q42_1.setError("Required");
            b = false;
        }
        if(!cb_Q43_1.isChecked() && !cb_Q43_2.isChecked()){
            cb_Q43_1.setError("Required");
            b = false;
        }


        return b;
    }


    public void checkWomanValid(){

        boolean b = true;

        // point 1
         Q44_fields[0] = Integer.parseInt(CRF2Activity.formCrf2DTO.getQ26())<72;

        // point 2
        Q44_fields[1] =CRF2Activity.formCrf2DTO.getQ31().equals("YES");

        // point 3
        Q44_fields[2] = Double.parseDouble(CRF2Activity.formCrf2DTO.getQ32())>=32;
        //  Q44_fields[2] = ;

        // point 4
        Q44_fields[3] =  CRF2Activity.formCrf2DTO.getQ35().equals("YES");

        // point 5
        Q44_fields[4] = CRF2Activity.formCrf2DTO.getQ36().equals("YES");

        // point 6
        Q44_fields[5] = CRF2Activity.formCrf2DTO.getQ37().equals("YES");

        // point 7
        Q44_fields[6] = CRF2Activity.formCrf2DTO.getQ38A().equals("NO") && CRF2Activity.formCrf2DTO.getQ38B().equals("NO");

        // point 8
        Q44_fields[7] = CRF2Activity.formCrf2DTO.getQ39().equals("NO");

        // point 9
        Q44_fields[8] = CRF2Activity.formCrf2DTO.getQ40().equals("YES");

        // point 10
        Q44_fields[9] = CRF2Activity.formCrf2DTO.getQ41A().equals("NO") && CRF2Activity.formCrf2DTO.getQ41B().equals("NO") &&
                CRF2Activity.formCrf2DTO.getQ41C().equals("NO") && CRF2Activity.formCrf2DTO.getQ41D().equals("NO") &&
                CRF2Activity.formCrf2DTO.getQ41E().equals("NO") && CRF2Activity.formCrf2DTO.getQ41F().equals("NO");

        // point 11
        Q44_fields[10] = CRF2Activity.formCrf2DTO.getQ42().equals("NO");

        // point 12
        Q44_fields[11] = CRF2Activity.formCrf2DTO.getQ43().equals("NO");
    }


    public void myCustomeDialog(int i){

        ImageView iv_1, iv_2, iv_3, iv_4, iv_5, iv_6, iv_7, iv_8, iv_9, iv_10, iv_11, iv_12;
      //  Button ;

        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.crf2_q44_dialog);
        dialog.setCancelable(false);

        btn_checkValidation = (Button) dialog.findViewById(R.id.btn_checkValidation);

        iv_1 = (ImageView) dialog.findViewById(R.id.iv_1);
        iv_2 = (ImageView) dialog.findViewById(R.id.iv_2);
        iv_3 = (ImageView) dialog.findViewById(R.id.iv_3);
        iv_4 = (ImageView) dialog.findViewById(R.id.iv_4);
        iv_5 = (ImageView) dialog.findViewById(R.id.iv_5);
        iv_6 = (ImageView) dialog.findViewById(R.id.iv_6);
        iv_7 = (ImageView) dialog.findViewById(R.id.iv_7);
        iv_8 = (ImageView) dialog.findViewById(R.id.iv_8);
        iv_9 = (ImageView) dialog.findViewById(R.id.iv_9);
        iv_10 = (ImageView) dialog.findViewById(R.id.iv_10);
        iv_11 = (ImageView) dialog.findViewById(R.id.iv_11);
        iv_12 = (ImageView) dialog.findViewById(R.id.iv_12);


        if(Q44_fields[0])
            iv_1.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[1])
            iv_2.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[2])
            iv_3.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[3])
            iv_4.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[4])
            iv_5.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[5])
            iv_6.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[6])
            iv_7.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[7])
            iv_8.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[8])
            iv_9.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[9])
            iv_10.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[10])
            iv_11.setImageResource(R.mipmap.right_ison);
        if(Q44_fields[11])
            iv_12.setImageResource(R.mipmap.right_ison);

      //  btn_checkValidation = (Button) dialog.findViewById(R.id.btn_checkValidation);

        btn_checkValidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Q44_fields[0]==true && Q44_fields[1]==true && Q44_fields[2]==true &&
                        Q44_fields[3]==true && Q44_fields[4]==true && Q44_fields[5]==true && Q44_fields[6]==true &&
                        Q44_fields[7]==true && Q44_fields[8]==true && Q44_fields[9]==true && Q44_fields[10]==true &&
                        Q44_fields[11]==true){

                    dialog.dismiss();
                    Crf2Q45Fragment crf2Q45Fragment = new Crf2Q45Fragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf2, crf2Q45Fragment);
                    fragmentTransaction.commit();

                }else {


                    startActivity(new Intent(getActivity(), CRF2DashboargActivity.class));
                    
                    Toast.makeText(getContext(),"This form Is filled",Toast.LENGTH_LONG).show();
                    SendDataToServer.sendCrf2Form(CRF2Activity.formCrf2DTO);

                }


                  //  Toast.makeText(getContext(),"all fields ary true",Toast.LENGTH_LONG).show();
                 //   Toast.makeText(getContext(),"all fields ary no true   "+isAllTrue,Toast.LENGTH_LONG).show();

            }
        });


        dialog.show();
    }



}
