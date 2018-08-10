package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4b_fragments.Crf4bQ20Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a.FormCrf4aDetailsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;


public class Crf4aQ27Fragment extends Fragment {

    boolean[] allFields;

    EditText et_q73_j;
    LinearLayout ll_q29_q39, ll_q31_q39;

    Button btn_submit;

    FormCrf4aDetailsDTO formCrf4aDetailsDTO;
    List listOfq27Toq73;

    LinearLayout ll_q28_to_q73, ll_q33, ll_q34, ll_q35, ll_q37, ll_q39, ll_q41_q57, ll_q42, ll_q43, ll_q44, ll_q45,
                ll_q47_q57, ll_q47, ll_q48, ll_q49, ll_q50, ll_q51, ll_q52, ll_q53, ll_q54, ll_q55, ll_q56, ll_q57,
                      ll_q48_q51, ll_q53_q57, ll_q54_q57, ll_q59_q72, ll_q64_q72, ll_q69_q72;

    int start = 0;
    int end = 0;
    boolean amOrPm = true;

    String startTime, endTime;

    int[] textViewIds;

    View view;

    ScrollView scrolView;

    RadioGroup  rg_q27_b, rg_q28,  rg_q30, rg_q31 ,rg_q32, rg_q34, rg_q36, rg_q37, rg_q38, rg_q40, rg_q41, rg_q46, rg_q47,
                rg_q52, rg_q53, rg_q58, rg_q63, rg_q68, rg_q73_a, rg_q73_b, rg_q73_c, rg_q73_d, rg_q73_e, rg_q73_f,
                rg_q73_g, rg_q73_h, rg_q73_i, rg_q73_j;

    RadioButton rb_q27_b, rb_q28, rb_q30, rb_q31, rb_q32, rb_q34, rb_q36, rb_q37, rb_q38, rb_q40, rb_q41, rb_q46, rb_q47,
                rb_q52, rb_q53, rb_q58, rb_q63, rb_q68, rb_q73_a, rb_q73_b, rb_q73_c, rb_q73_d, rb_q73_e,
                rb_q73_f, rb_q73_g, rb_q73_h, rb_q73_i, rb_q73_j;

    TextView    tv_q27_b, tv_q28, tv_q29,tv_q30, tv_q31, tv_q32, tv_q33, tv_q34, tv_q35, tv_q36, tv_q37, tv_q38, tv_q39, tv_q40,
                tv_q41, tv_q42, tv_q43, tv_q44, tv_q45, tv_q46, tv_q47, tv_q48, tv_q49, tv_q50, tv_q51, tv_q52,
                tv_q53, tv_q54, tv_q55, tv_q56, tv_q57, tv_q58, tv_q59, tv_q60, tv_q61, tv_q62, tv_q63, tv_q64,
                tv_q65, tv_q66, tv_q67, tv_q68, tv_q69, tv_q70, tv_q71, tv_q72, tv_q73_a, tv_q73_b, tv_q73_c,
                tv_q73_d, tv_q73_e, tv_q73_f, tv_q73_g, tv_q73_h, tv_q73_i, tv_q73_j, tv_startTime, tv_endTime ;

    EditText et_q28, et_q29, et_q33, et_q35, et_q39, et_q42, et_q43, et_q44, et_q45, et_q48, et_q49, et_q50,
                et_q51, et_q54, et_q55, et_q56, et_q57, et_q59, et_q60, et_q61, et_q62, et_q64, et_q65, et_q66,
                et_q67, et_q69, et_q70, et_q71, et_q72;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_crf4a_q27, container, false);

        CRF4aActivity.startHour++;

        ll_q28_to_q73 = (LinearLayout) view.findViewById(R.id.ll_q28_to_q73);

        formCrf4aDetailsDTO = new FormCrf4aDetailsDTO();
        listOfq27Toq73 = new ArrayList<FormCrf4aDetailsDTO>();

          allFields = new boolean[47];

        ll_q29_q39 = (LinearLayout) view.findViewById(R.id.ll_q29_q39);
        ll_q33 = (LinearLayout) view.findViewById(R.id.ll_q33);
        ll_q34 = (LinearLayout) view.findViewById(R.id.ll_q34);
        ll_q35 = (LinearLayout) view.findViewById(R.id.ll_q35);
        ll_q37 = (LinearLayout) view.findViewById(R.id.ll_q37);
        ll_q39 = (LinearLayout) view.findViewById(R.id.ll_q39);
        ll_q41_q57 = (LinearLayout) view.findViewById(R.id.ll_q41_q57);
        ll_q42 = (LinearLayout) view.findViewById(R.id.ll_q42);
        ll_q43 = (LinearLayout) view.findViewById(R.id.ll_q43);
        ll_q44 = (LinearLayout) view.findViewById(R.id.ll_q44);
        ll_q45 = (LinearLayout) view.findViewById(R.id.ll_q45);
        ll_q47 = (LinearLayout) view.findViewById(R.id.ll_q47);
        ll_q48 = (LinearLayout) view.findViewById(R.id.ll_q48);
        ll_q49 = (LinearLayout) view.findViewById(R.id.ll_q49);
        ll_q50 = (LinearLayout) view.findViewById(R.id.ll_q50);
        ll_q51 = (LinearLayout) view.findViewById(R.id.ll_q51);
        ll_q52 = (LinearLayout) view.findViewById(R.id.ll_q52);
        ll_q53 = (LinearLayout) view.findViewById(R.id.ll_q53);
        ll_q54 = (LinearLayout) view.findViewById(R.id.ll_q54);
        ll_q55 = (LinearLayout) view.findViewById(R.id.ll_q55);
        ll_q56 = (LinearLayout) view.findViewById(R.id.ll_q56);
        ll_q57 = (LinearLayout) view.findViewById(R.id.ll_q57);
        ll_q47_q57 = (LinearLayout) view.findViewById(R.id.ll_q47_q57);
        ll_q48_q51 = (LinearLayout) view.findViewById(R.id.ll_q48_q51);
        ll_q53_q57 = (LinearLayout) view.findViewById(R.id.ll_q53_q57);
        ll_q54_q57 = (LinearLayout) view.findViewById(R.id.ll_q54_q57);
        ll_q59_q72 = (LinearLayout) view.findViewById(R.id.ll_q59_q72);
        ll_q64_q72 = (LinearLayout) view.findViewById(R.id.ll_q64_q72);
        ll_q69_q72 = (LinearLayout) view.findViewById(R.id.ll_q69_q72);
        ll_q31_q39 =  (LinearLayout) view.findViewById(R.id.ll_q31_q39);


        /*et_q73_j = (EditText) view.findViewById(R.id.et_73_j);*/

        textViewIds = new int[]{R.id.tv_q27, R.id.tv_q28, R.id.tv_q29, R.id.tv_q30, R.id.tv_q31, R.id.tv_q32, R.id.tv_q33
                        ,R.id.tv_q34, R.id.tv_q35, R.id.tv_q36, R.id.tv_q37, R.id.tv_q38, R.id.tv_q39, R.id.tv_q40, R.id.tv_q41, R.id.tv_q42
                        ,R.id.tv_q43, R.id.tv_q44, R.id.tv_q45, R.id.tv_q46, R.id.tv_q47, R.id.tv_q48, R.id.tv_q49, R.id.tv_q50, R.id.tv_q51
                        ,R.id.tv_q52, R.id.tv_q53, R.id.tv_q54, R.id.tv_q55, R.id.tv_q56, R.id.tv_q57, R.id.tv_q58, R.id.tv_q59, R.id.tv_q60
                        ,R.id.tv_q61, R.id.tv_q62, R.id.tv_q63, R.id.tv_q64, R.id.tv_q65, R.id.tv_q66, R.id.tv_q67, R.id.tv_q68, R.id.tv_q69
                        ,R.id.tv_q70, R.id.tv_q71, R.id.tv_q72, R.id.tv_q73_a, R.id.tv_q73_b, R.id.tv_q73_c, R.id.tv_q73_d, R.id.tv_q73_e
                        , R.id.tv_q73_f, R.id.tv_q73_g, R.id.tv_q73_h, R.id.tv_q73_i, R.id.tv_q73_j};


          scrolView = (ScrollView) view.findViewById(R.id.scrolView);


            et_q28 = (EditText) view.findViewById(R.id.et_q28);
            et_q29 = (EditText) view.findViewById(R.id.et_q29);
            et_q33 = (EditText) view.findViewById(R.id.et_q33);
            et_q35 = (EditText) view.findViewById(R.id.et_q35);
            et_q39 = (EditText) view.findViewById(R.id.et_q39);
            et_q42 = (EditText) view.findViewById(R.id.et_q42);
            et_q43 = (EditText) view.findViewById(R.id.et_q43);
            et_q44 = (EditText) view.findViewById(R.id.et_q44);
            et_q45 = (EditText) view.findViewById(R.id.et_q45);
            et_q48 = (EditText) view.findViewById(R.id.et_q48);
            et_q49 = (EditText) view.findViewById(R.id.et_q49);
            et_q50 = (EditText) view.findViewById(R.id.et_q50);
            et_q51 = (EditText) view.findViewById(R.id.et_q51);
            et_q54 = (EditText) view.findViewById(R.id.et_q54);
            et_q55 = (EditText) view.findViewById(R.id.et_q55);
            et_q56 = (EditText) view.findViewById(R.id.et_q56);
            et_q57 = (EditText) view.findViewById(R.id.et_q57);
            et_q59 = (EditText) view.findViewById(R.id.et_q59);
            et_q60 = (EditText) view.findViewById(R.id.et_q60);
            et_q61 = (EditText) view.findViewById(R.id.et_q61);
            et_q62 = (EditText) view.findViewById(R.id.et_q62);
            et_q64 = (EditText) view.findViewById(R.id.et_q64);
            et_q65 = (EditText) view.findViewById(R.id.et_q65);
            et_q66 = (EditText) view.findViewById(R.id.et_q66);
            et_q67 = (EditText) view.findViewById(R.id.et_q67);
            et_q69 = (EditText) view.findViewById(R.id.et_q69);
            et_q70 = (EditText) view.findViewById(R.id.et_q70);
            et_q71 = (EditText) view.findViewById(R.id.et_q71);
            et_q72 = (EditText) view.findViewById(R.id.et_q72);
            et_q73_j = (EditText) view.findViewById(R.id.et_q73_j);


            rg_q27_b = (RadioGroup) view.findViewById(R.id.rg_q27_b);
            rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);
            rg_q30 = (RadioGroup) view.findViewById(R.id.rg_q30);
            rg_q31 = (RadioGroup) view.findViewById(R.id.rg_q31);
            rg_q32 = (RadioGroup) view.findViewById(R.id.rg_q32);
            rg_q34 = (RadioGroup) view.findViewById(R.id.rg_q34);
            rg_q36 = (RadioGroup) view.findViewById(R.id.rg_q36);
            rg_q37 = (RadioGroup) view.findViewById(R.id.rg_q37);
            rg_q38 = (RadioGroup) view.findViewById(R.id.rg_q38);
            rg_q40 = (RadioGroup) view.findViewById(R.id.rg_q40);
            rg_q41 = (RadioGroup) view.findViewById(R.id.rg_q41);
            rg_q46 = (RadioGroup) view.findViewById(R.id.rg_q46);
            rg_q47 = (RadioGroup) view.findViewById(R.id.rg_q47);
            rg_q52 = (RadioGroup) view.findViewById(R.id.rg_q52);
            rg_q53 = (RadioGroup) view.findViewById(R.id.rg_q53);
            rg_q58 = (RadioGroup) view.findViewById(R.id.rg_q58);
            rg_q63 = (RadioGroup) view.findViewById(R.id.rg_q63);
            rg_q68 = (RadioGroup) view.findViewById(R.id.rg_q68);
            rg_q73_a = (RadioGroup) view.findViewById(R.id.rg_q73_a);
            rg_q73_b = (RadioGroup) view.findViewById(R.id.rg_q73_b);
            rg_q73_c = (RadioGroup) view.findViewById(R.id.rg_q73_c);
            rg_q73_d = (RadioGroup) view.findViewById(R.id.rg_q73_d);
            rg_q73_e = (RadioGroup) view.findViewById(R.id.rg_q73_e);
            rg_q73_f = (RadioGroup) view.findViewById(R.id.rg_q73_f);
            rg_q73_g = (RadioGroup) view.findViewById(R.id.rg_q73_g);
            rg_q73_h = (RadioGroup) view.findViewById(R.id.rg_q73_h);
            rg_q73_i = (RadioGroup) view.findViewById(R.id.rg_q73_i);
            rg_q73_j = (RadioGroup) view.findViewById(R.id.rg_q73_j);


            tv_endTime = (TextView) view.findViewById(R.id.tv_endTime);
            tv_startTime = (TextView) view.findViewById(R.id.tv_startTime);
            tv_q27_b = (TextView) view.findViewById(R.id.tv_q27_b);
            tv_q28 = (TextView) view.findViewById(R.id.tv_q28);
            tv_q29 = (TextView) view.findViewById(R.id.tv_q29);
            tv_q30 = (TextView) view.findViewById(R.id.tv_q30);
            tv_q31 = (TextView) view.findViewById(R.id.tv_q31);
            tv_q32 = (TextView) view.findViewById(R.id.tv_q32);
            tv_q33 = (TextView) view.findViewById(R.id.tv_q33);
            tv_q34 = (TextView) view.findViewById(R.id.tv_q34);
            tv_q35 = (TextView) view.findViewById(R.id.tv_q35);
            tv_q36 = (TextView) view.findViewById(R.id.tv_q36);
            tv_q37 = (TextView) view.findViewById(R.id.tv_q37);
            tv_q38 = (TextView) view.findViewById(R.id.tv_q38);
            tv_q39 = (TextView) view.findViewById(R.id.tv_q39);
            tv_q40 = (TextView) view.findViewById(R.id.tv_q40);
            tv_q41 = (TextView) view.findViewById(R.id.tv_q41);
            tv_q42 = (TextView) view.findViewById(R.id.tv_q42);
            tv_q43 = (TextView) view.findViewById(R.id.tv_q43);
            tv_q44 = (TextView) view.findViewById(R.id.tv_q44);
            tv_q45 = (TextView) view.findViewById(R.id.tv_q45);
            tv_q46 = (TextView) view.findViewById(R.id.tv_q46);
            tv_q47 = (TextView) view.findViewById(R.id.tv_q47);
            tv_q48 = (TextView) view.findViewById(R.id.tv_q48);
            tv_q49 = (TextView) view.findViewById(R.id.tv_q49);
            tv_q50 = (TextView) view.findViewById(R.id.tv_q50);
            tv_q51 = (TextView) view.findViewById(R.id.tv_q51);
            tv_q52 = (TextView) view.findViewById(R.id.tv_q52);
            tv_q53 = (TextView) view.findViewById(R.id.tv_q53);
            tv_q54 = (TextView) view.findViewById(R.id.tv_q54);
            tv_q55 = (TextView) view.findViewById(R.id.tv_q55);
            tv_q56 = (TextView) view.findViewById(R.id.tv_q56);
            tv_q57 = (TextView) view.findViewById(R.id.tv_q57);
            tv_q58 = (TextView) view.findViewById(R.id.tv_q58);
            tv_q59 = (TextView) view.findViewById(R.id.tv_q59);
            tv_q60 = (TextView) view.findViewById(R.id.tv_q60);
            tv_q61 = (TextView) view.findViewById(R.id.tv_q61);
            tv_q62 = (TextView) view.findViewById(R.id.tv_q62);
            tv_q63 = (TextView) view.findViewById(R.id.tv_q63);
            tv_q64 = (TextView) view.findViewById(R.id.tv_q64);
            tv_q65 = (TextView) view.findViewById(R.id.tv_q65);
            tv_q66 = (TextView) view.findViewById(R.id.tv_q66);
            tv_q67 = (TextView) view.findViewById(R.id.tv_q67);
            tv_q68 = (TextView) view.findViewById(R.id.tv_q68);
            tv_q69 = (TextView) view.findViewById(R.id.tv_q69);
            tv_q70 = (TextView) view.findViewById(R.id.tv_q70);
            tv_q71 = (TextView) view.findViewById(R.id.tv_q71);
            tv_q72 = (TextView) view.findViewById(R.id.tv_q72);
            tv_q73_a = (TextView) view.findViewById(R.id.tv_q73_a);
            tv_q73_b = (TextView) view.findViewById(R.id.tv_q73_b);
            tv_q73_c = (TextView) view.findViewById(R.id.tv_q73_c);
            tv_q73_d = (TextView) view.findViewById(R.id.tv_q73_d);
            tv_q73_e = (TextView) view.findViewById(R.id.tv_q73_e);
            tv_q73_f = (TextView) view.findViewById(R.id.tv_q73_f);
            tv_q73_g = (TextView) view.findViewById(R.id.tv_q73_g);
            tv_q73_h = (TextView) view.findViewById(R.id.tv_q73_h);
            tv_q73_i = (TextView) view.findViewById(R.id.tv_q73_i);
            tv_q73_j = (TextView) view.findViewById(R.id.tv_q73_j);


          if(CRF4aActivity.startHour>18){

              start = CRF4aActivity.startHour-19;
              end = CRF4aActivity.startHour-18;


          }else {

              start = CRF4aActivity.startHour+5;
              end = CRF4aActivity.startHour+6;


          }

          if(end==24){

              end = 0;
          }

            if(start==24){

                start=0;


            }


                tv_startTime.setText(start+"");
                tv_endTime.setText(end+"");


                formCrf4aDetailsDTO.setQ27From(startTime);
                formCrf4aDetailsDTO.setQ27To(endTime);

                formCrf4aDetailsDTO.setQ27From(start+"");
                formCrf4aDetailsDTO.setQ27To(end+"");


        btn_submit = (Button) view.findViewById(R.id.btn_submit);
        btn_submit.setText("Submit "+start+" TO "+end);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    if(CRF4aActivity.startHour==24){
                   //  if(CRF4aActivity.startHour==1){


                        CRF4aActivity.listOfq27Toq73.add(formCrf4aDetailsDTO);




                        CRF4aActivity.formCrf4aDTO.setDetails(CRF4aActivity.listOfq27Toq73);
                        Crf4bQ20Fragment fragment = new Crf4bQ20Fragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                        fragmentTransaction.commit();

                    }else {

                        CRF4aActivity.listOfq27Toq73.add(formCrf4aDetailsDTO);

                        Crf4aQ27Fragment fragment = new Crf4aQ27Fragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                        fragmentTransaction.commit();

                    }

                }
            }
        });


        rg_q27_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q27_b = (RadioButton) view.findViewById(rg_q27_b.getCheckedRadioButtonId());

                if(rb_q27_b.getTag().toString().equalsIgnoreCase("1")){
                    ll_q28_to_q73.setVisibility(View.VISIBLE);
                }else {
                    ll_q28_to_q73.setVisibility(View.GONE);
                }

            }
        });


        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

              rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());

              if(rb_q28.getTag().toString().equals("2")){

                  ll_q29_q39.setVisibility(View.GONE);

              }else {

                  ll_q29_q39.setVisibility(View.VISIBLE);

              }


            }
        });


        rg_q30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q30 = (RadioButton) view.findViewById(rg_q30.getCheckedRadioButtonId());

                if(rb_q30.getTag().toString().equals("2")){

                    ll_q31_q39.setVisibility(View.GONE);

                }else {


                    ll_q31_q39.setVisibility(View.VISIBLE);

                }

            }
        });

        rg_q31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q31 = (RadioButton) view.findViewById(rg_q31.getCheckedRadioButtonId());

            }
        });

        rg_q32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q32 = (RadioButton) view.findViewById(rg_q32.getCheckedRadioButtonId());

                if(rb_q32.getTag().toString().equals("2")){

                    et_q33.setText("");
                    ll_q34.setVisibility(View.VISIBLE);
                    ll_q33.setVisibility(View.GONE);

                }else if(rb_q32.getTag().toString().equals("3")){

                    et_q33.setText("");
                    ll_q33.setVisibility(View.GONE);
                    ll_q34.setVisibility(View.GONE);
                }else {
                    ll_q33.setVisibility(View.VISIBLE);
                    ll_q34.setVisibility(View.VISIBLE);
                }

            }
        });

        et_q33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                if(et_q33.getText().toString().isEmpty()){


                    ll_q34.setVisibility(View.VISIBLE);
                    ll_q35.setVisibility(View.VISIBLE);

                }else{

                    ll_q34.setVisibility(View.GONE);
                    ll_q35.setVisibility(View.GONE);

                }

            }
        });

        rg_q34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q34 = (RadioButton) view.findViewById(rg_q34.getCheckedRadioButtonId());

            }
        });

        rg_q36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q36 = (RadioButton) view.findViewById(rg_q36.getCheckedRadioButtonId());

                if(rb_q36.getTag().toString().equals("2")){

                    ll_q37.setVisibility(View.GONE);

                }else {

                    ll_q37.setVisibility(View.VISIBLE);
                }


            }
        });

        rg_q37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q37 = (RadioButton) view.findViewById(rg_q37.getCheckedRadioButtonId());
            }
        });

        rg_q38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q38 = (RadioButton) view.findViewById(rg_q38.getCheckedRadioButtonId());

                if(rb_q38.getTag().toString().equals("2")){

                    ll_q39.setVisibility(View.GONE);

                }else {

                    ll_q39.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q40 = (RadioButton) view.findViewById(rg_q40.getCheckedRadioButtonId());

                if(rb_q40.getTag().toString().equals("2") || rb_q40.getTag().toString().equals("9")){

                    ll_q41_q57.setVisibility(View.GONE);

                }else {

                    ll_q41_q57.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q41 = (RadioButton) view.findViewById(rg_q41.getCheckedRadioButtonId());

                if(rb_q41.getTag().toString().equals("2")){

                    ll_q42.setVisibility(View.GONE);
                    ll_q43.setVisibility(View.GONE);
                    ll_q44.setVisibility(View.GONE);
                    ll_q45.setVisibility(View.GONE);

                }else{

                    ll_q42.setVisibility(View.VISIBLE);
                    ll_q43.setVisibility(View.VISIBLE);
                    ll_q44.setVisibility(View.VISIBLE);
                    ll_q45.setVisibility(View.VISIBLE);

                }

            }
        });

        rg_q46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q46 = (RadioButton) view.findViewById(rg_q46.getCheckedRadioButtonId());

                if(rb_q46.getTag().toString().equals("2") || rb_q46.getTag().toString().equals("9")){
//////
                    ll_q47_q57.setVisibility(View.GONE);

                }else {

                    ll_q47_q57.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q47 = (RadioButton) view.findViewById(rg_q47.getCheckedRadioButtonId());

                if(rb_q47.getTag().toString().equals("2")){

                    ll_q48_q51.setVisibility(View.GONE);

                }else {

                    ll_q48_q51.setVisibility(View.VISIBLE);

                }

            }
        });

        rg_q52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q52 = (RadioButton) view.findViewById(rg_q52.getCheckedRadioButtonId());

                if(rb_q52.getTag().toString().equals("2") || rb_q52.getTag().toString().equals("9")){

                    ll_q53_q57.setVisibility(View.GONE);

                }else {

                    ll_q53_q57.setVisibility(View.VISIBLE);

                }

            }
        });


        rg_q53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q53 = (RadioButton) view.findViewById(rg_q53.getCheckedRadioButtonId());

                if(rb_q53.getTag().toString().equals("2")){

                    ll_q54_q57.setVisibility(View.GONE);
                }else {

                    ll_q54_q57.setVisibility(View.VISIBLE);

                }
            }
        });

        rg_q58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q58 = (RadioButton) view.findViewById(rg_q58.getCheckedRadioButtonId());

                if(rb_q58.getTag().toString().equals("2") || rb_q58.getTag().toString().equals("9")){

                    ll_q59_q72.setVisibility(View.GONE);

                }else {
                    ll_q59_q72.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q63.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q63 = (RadioButton) view.findViewById(rg_q63.getCheckedRadioButtonId());

                if(rb_q63.getTag().toString().equals("2") || rb_q63.getTag().toString().equals("9")){

                    ll_q64_q72.setVisibility(View.GONE);

                }else {

                    ll_q64_q72.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q68.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q68 = (RadioButton) view.findViewById(rg_q68.getCheckedRadioButtonId());

                if(rb_q68.getTag().toString().equals("2") || rb_q68.getTag().toString().equals("9")){

                    ll_q69_q72.setVisibility(View.GONE);


                }else {

                    ll_q69_q72.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q73_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_a = (RadioButton) view.findViewById(rg_q73_a.getCheckedRadioButtonId());
            }
        });

        rg_q73_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_b = (RadioButton) view.findViewById(rg_q73_b.getCheckedRadioButtonId());
            }
        });

        rg_q73_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_c = (RadioButton) view.findViewById(rg_q73_c.getCheckedRadioButtonId());
            }
        });

        rg_q73_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_d = (RadioButton) view.findViewById(rg_q73_d.getCheckedRadioButtonId());
            }
        });

        rg_q73_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_e = (RadioButton) view.findViewById(rg_q73_e.getCheckedRadioButtonId());
            }
        });

        rg_q73_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_f = (RadioButton) view.findViewById(rg_q73_f.getCheckedRadioButtonId());
            }
        });

        rg_q73_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_g = (RadioButton) view.findViewById(rg_q73_g.getCheckedRadioButtonId());
            }
        });

        rg_q73_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_h = (RadioButton) view.findViewById(rg_q73_h.getCheckedRadioButtonId());
            }
        });

        rg_q73_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_i = (RadioButton) view.findViewById(rg_q73_i.getCheckedRadioButtonId());
            }
        });

        rg_q73_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q73_j = (RadioButton) view.findViewById(rg_q73_j.getCheckedRadioButtonId());

                if(rb_q73_j.getTag().toString().equals("2")){

                    et_q73_j.setVisibility(View.GONE);
                }else {
                    et_q73_j.setVisibility(View.VISIBLE);
                }

            }
        });

        return view;
    }


    public boolean validation(){

        boolean validation = true;


    if(ll_q28_to_q73.getVisibility()==View.VISIBLE) {

        if (isRBCheckedThree(rg_q28, rb_q28, tv_q28).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ28(isRBCheckedThree(rg_q28, rb_q28, tv_q28));
        }

        if(ll_q29_q39.getVisibility()==View.VISIBLE){


            if (getTextFromField(et_q29, tv_q29).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ29(getTextFromField(et_q29, tv_q29));
            }

            if (isRBCheckedThree(rg_q30, rb_q30, tv_q30).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ30(isRBCheckedThree(rg_q30, rb_q30, tv_q30));
            }

            if(ll_q31_q39.getVisibility()==View.VISIBLE){


                if (isRBCheckedThree(rg_q31, rb_q31, tv_q31).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ31(isRBCheckedThree(rg_q31, rb_q31, tv_q31));
                }


                if (isRBCheckedThree(rg_q32, rb_q32, tv_q32).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ32(isRBCheckedThree(rg_q32, rb_q32, tv_q32));
                }


                if(ll_q33.getVisibility()==View.VISIBLE){


                    if (getTextFromField(et_q33, tv_q33).equals("")) {
                        validation = false;
                    } else {
                        formCrf4aDetailsDTO.setQ33(getTextFromField(et_q33, tv_q33));
                    }

                }


                if(ll_q34.getVisibility()==View.VISIBLE){

                    if (isRBCheckedThree(rg_q34, rb_q34, tv_q34).equals("") && ll_q34.getVisibility()==View.VISIBLE) {
                        validation = false;
                    } else {
                        formCrf4aDetailsDTO.setQ34(isRBCheckedThree(rg_q34, rb_q34, tv_q34));
                    }
                }


                if (getTextFromField(et_q35, tv_q35).equals("") && ll_q35.getVisibility()==View.VISIBLE) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ35(getTextFromField(et_q35, tv_q35));
                }


                if (isRBCheckedThree(rg_q36, rb_q36, tv_q36).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ36(isRBCheckedThree(rg_q36, rb_q36, tv_q36));
                }

                if (isRBCheckedThree(rg_q37, rb_q37, tv_q37).equals("") && ll_q37.getVisibility()==View.VISIBLE) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ37(isRBCheckedThree(rg_q37, rb_q37, tv_q37));
                }

                if (isRBCheckedThree(rg_q38, rb_q38, tv_q38).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ38(isRBCheckedThree(rg_q38, rb_q38, tv_q38));
                }

                if (getTextFromField(et_q39, tv_q39).equals("") && ll_q39.getVisibility()==View.VISIBLE) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ39(getTextFromField(et_q39, tv_q39));
                }



            }


        }


        if (isRBCheckedThree(rg_q40, rb_q40, tv_q40).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ40(isRBCheckedThree(rg_q40, rb_q40, tv_q40));
        }

        if(ll_q41_q57.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q41, rb_q41, tv_q41).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ41(isRBCheckedThree(rg_q41, rb_q41, tv_q41));
            }

            if(ll_q42.getVisibility()==View.VISIBLE){

                if (getTextFromField(et_q42, tv_q42).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ42(getTextFromField(et_q42, tv_q42));
                }
            }

            if(ll_q43.getVisibility()==View.VISIBLE){

                if (getTextFromField(et_q43, tv_q43).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ43(getTextFromField(et_q43, tv_q43));
                }

            }

            if(ll_q44.getVisibility()==View.VISIBLE){

                if (getTextFromField(et_q44, tv_q44).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ44(getTextFromField(et_q44, tv_q44));
                }

            }

            if(ll_q45.getVisibility()==View.VISIBLE){

                if (getTextFromField(et_q45, tv_q45).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ45(getTextFromField(et_q45, tv_q45));
                }
            }

            if (isRBCheckedThree(rg_q46, rb_q46, tv_q46).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ46(isRBCheckedThree(rg_q46, rb_q46, tv_q46));
            }

            if(ll_q47_q57.getVisibility()==View.VISIBLE){



                if (isRBCheckedThree(rg_q47, rb_q47, tv_q47).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ47(isRBCheckedThree(rg_q47, rb_q47, tv_q47));
                }

            if(ll_q48_q51.getVisibility()==View.VISIBLE){

                if (getTextFromField(et_q48, tv_q48).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ48(getTextFromField(et_q48, tv_q48));
                }

                if (getTextFromField(et_q49, tv_q49).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ49(getTextFromField(et_q49, tv_q49));
                }

                if (getTextFromField(et_q50, tv_q50).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ50(getTextFromField(et_q50, tv_q50));
                }

                if (getTextFromField(et_q51, tv_q51).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ51(getTextFromField(et_q51, tv_q51));
                }


            }


                if (isRBCheckedThree(rg_q52, rb_q52, tv_q52).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ52(isRBCheckedThree(rg_q52, rb_q52, tv_q52));
                }

            if(ll_q53_q57.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q53, rb_q53, tv_q53).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ53(isRBCheckedThree(rg_q53, rb_q53, tv_q53));
                }

              if(ll_q54_q57.getVisibility()==View.VISIBLE){


                  if (getTextFromField(et_q54, tv_q54).equals("")) {
                      validation = false;
                  } else {
                      formCrf4aDetailsDTO.setQ54(getTextFromField(et_q54, tv_q54));
                  }

                  if (getTextFromField(et_q55, tv_q55).equals("")) {
                      validation = false;
                  } else {
                      formCrf4aDetailsDTO.setQ55(getTextFromField(et_q55, tv_q55));
                  }

                  if (getTextFromField(et_q56, tv_q56).equals("")) {
                      validation = false;
                  } else {
                      formCrf4aDetailsDTO.setQ56(getTextFromField(et_q56, tv_q56));
                  }

                  if (getTextFromField(et_q57, tv_q57).equals("")) {
                      validation = false;
                  } else {
                      formCrf4aDetailsDTO.setQ57(getTextFromField(et_q57, tv_q57));
                  }

              }

            }

            }

        }


        if (isRBCheckedThree(rg_q58, rb_q58, tv_q58).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ58(isRBCheckedThree(rg_q58, rb_q58, tv_q58));
        }

        if(ll_q59_q72.getVisibility()==View.VISIBLE) {


            if (getTextFromField(et_q59, tv_q59).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ59(getTextFromField(et_q59, tv_q59));
            }


            if (getTextFromField(et_q60, tv_q60).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ60(getTextFromField(et_q60, tv_q60));
            }

            if (getTextFromField(et_q61, tv_q61).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ61(getTextFromField(et_q61, tv_q61));
            }

            if (getTextFromField(et_q62, tv_q62).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ62(getTextFromField(et_q62, tv_q62));
            }

            if (isRBCheckedThree(rg_q63, rb_q63, tv_q63).equals("")) {
                validation = false;
            } else {
                formCrf4aDetailsDTO.setQ63(isRBCheckedThree(rg_q63, rb_q63, tv_q63));
            }

            if (ll_q64_q72.getVisibility() == View.VISIBLE) {

                if (getTextFromField(et_q64, tv_q64).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ64(getTextFromField(et_q64, tv_q64));
                }

                if (getTextFromField(et_q65, tv_q65).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ65(getTextFromField(et_q65, tv_q65));
                }

                if (getTextFromField(et_q66, tv_q66).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ66(getTextFromField(et_q66, tv_q66));
                }

                if (getTextFromField(et_q67, tv_q67).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ67(getTextFromField(et_q67, tv_q67));
                }

                if (isRBCheckedThree(rg_q68, rb_q68, tv_q68).equals("")) {
                    validation = false;
                } else {
                    formCrf4aDetailsDTO.setQ68(isRBCheckedThree(rg_q68, rb_q68, tv_q68));
                }


                if (ll_q69_q72.getVisibility() == View.VISIBLE) {

                    if (getTextFromField(et_q69, tv_q69).equals("")) {
                        validation = false;
                    } else {
                        formCrf4aDetailsDTO.setQ69(getTextFromField(et_q69, tv_q69));
                    }

                    if (getTextFromField(et_q70, tv_q70).equals("")) {
                        validation = false;
                    } else {
                        formCrf4aDetailsDTO.setQ70(getTextFromField(et_q70, tv_q70));
                    }

                    if (getTextFromField(et_q71, tv_q71).equals("")) {
                        validation = false;
                    } else {
                        formCrf4aDetailsDTO.setQ71(getTextFromField(et_q71, tv_q71));
                    }

                    if (getTextFromField(et_q72, tv_q72).equals("")) {
                        validation = false;
                    } else {
                        formCrf4aDetailsDTO.setQ72(getTextFromField(et_q72, tv_q72));
                    }
                }
            }
        }


        if (isRBCheckedThree(rg_q73_a, rb_q73_a, tv_q73_a).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73a(isRBCheckedThree(rg_q73_a, rb_q73_a, tv_q73_a));
        }

        if (isRBCheckedThree(rg_q73_b, rb_q73_b, tv_q73_b).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73b(isRBCheckedThree(rg_q73_b, rb_q73_b, tv_q73_b));
        }

        if (isRBCheckedThree(rg_q73_c, rb_q73_c, tv_q73_c).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73c(isRBCheckedThree(rg_q73_c, rb_q73_c, tv_q73_c));
        }

        if (isRBCheckedThree(rg_q73_d, rb_q73_d, tv_q73_d).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73d(isRBCheckedThree(rg_q73_d, rb_q73_d, tv_q73_d));
        }

        if (isRBCheckedThree(rg_q73_e, rb_q73_e, tv_q73_e).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73e(isRBCheckedThree(rg_q73_e, rb_q73_e, tv_q73_e));
        }

        if (isRBCheckedThree(rg_q73_f, rb_q73_f, tv_q73_f).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73f(isRBCheckedThree(rg_q73_f, rb_q73_f, tv_q73_f));
        }

        if (isRBCheckedThree(rg_q73_g, rb_q73_g, tv_q73_g).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73g(isRBCheckedThree(rg_q73_g, rb_q73_g, tv_q73_g));
        }

        if (isRBCheckedThree(rg_q73_h, rb_q73_h, tv_q73_h).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73h(isRBCheckedThree(rg_q73_h, rb_q73_h, tv_q73_h));
        }

        if (isRBCheckedThree(rg_q73_i, rb_q73_i, tv_q73_i).equals("")) {
            validation = false;
        } else {
            formCrf4aDetailsDTO.setQ73i(isRBCheckedThree(rg_q73_i, rb_q73_i, tv_q73_i));
        }


        if (getEditText(rg_q73_j, rb_q73_j, et_q73_j, tv_q73_j, ContantsValues.YES,"","","","","").equals("")) {
            validation = false;
        } else {

            formCrf4aDetailsDTO.setQ73j(getEditText(rg_q73_j, rb_q73_j, et_q73_j, tv_q73_j, ContantsValues.YES,"","","","",""));
        }


    }
        return validation;
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

    public String isRBCheckedThree(RadioGroup rg, RadioButton rb, TextView tv){

        if(rg.getCheckedRadioButtonId()==-1){
            tv.setError("Required");
            setFocuseable(tv.getX(),tv.getY());
            return "";
        }else {
            return  rb.getTag().toString();
        }
    }

    public String getEditText(RadioGroup rg, RadioButton rb, EditText editText , TextView tv, String id, String id2, String id3, String id4, String id5, String id6){

        if(rg.getCheckedRadioButtonId()==-1){
            setFocuseable(tv.getX(),tv.getY());
            tv.setError("Required");
            return "";
        }else {
            if(rb.getTag().toString().equals(id) || rb.getTag().toString().equals(id2) ||
                    rb.getTag().toString().equals(id3) || rb.getTag().toString().equals(id4) ||
                    rb.getTag().toString().equals(id5) || rb.getTag().toString().equals(id6)){

                if(editText.getText().toString().equals("") || editText.getText().toString().isEmpty()){
                    editText.setError("Enter Here");
                    setFocuseable(editText.getX(),editText.getY());
                    return "";
                }else {
                    return rb.getTag().toString()+":"+editText.getText().toString();
                }
            }else {

                return rb.getTag().toString();
            }

        }
    }

    public String getTextFromField(EditText et, TextView tv){

        if(et.getText().toString().equals("")){
            setFocuseable(et.getX(),et.getY());
            tv.setError("Required");
            et.setError("Required");
            return "";
        }else {
            return et.getText().toString();
        }
    }






}
