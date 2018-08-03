package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5a_fragment;


import java.text.SimpleDateFormat;

import android.app.DatePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments.Crf4aCounselingQ79;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class Crf5aQ26Fragment extends Fragment {

    double doseInml = 0;
    double doseInMiligram = 0;
    double weightInKg = 0;
    TextView tv_q54_kg, tv_q55_dose, tv_q56_ml,
                    tv_q26, tv_q27, tv_q28, tv_q29, tv_q30, tv_q31, tv_q32, tv_q33, tv_q34, tv_q35_a, tv_q35_b, tv_q35_c, tv_q35_d,
                    tv_q35_e, tv_q35_f, tv_q35_g, tv_q35_h, tv_q36, tv_q37_a, tv_q37_b, tv_q37_c, tv_q37_d, tv_q37_e, tv_q38_a,
                    tv_q38_b, tv_q38_c, tv_q38_d, tv_q38_e, tv_q38_f, tv_q38_g, tv_q38_h, tv_q38_i, tv_q38_j, tv_q39, tv_q40, tv_q41,
                    tv_q42, tv_q43, tv_q44, tv_q45, tv_q46, tv_q47, tv_q48, tv_q49, tv_q50, tv_q51, tv_q53, tv_q58, tv_q38_k, tv_q52_getdate;

    long diff;
    Button btn_next;
    EditText et_q54, et_q30, et_q31, et_q32, et_q33, et_q35_h, et_q37_e, et_q38_k, et_q47_a, et_q47_b, et_q47_c, et_q47_d,
             et_q47_e, et_q47_f, et_q48, et_q45_a, et_q45_b, et_q45_c, et_q45_d, et_q45_e, et_q45_f, et_q39;

    RadioButton rb_q26, rb_q28, rb_q34, rb_q35_a, rb_q35_b, rb_q35_c, rb_q35_d, rb_q35_e, rb_q35_f, rb_q35_g, rb_q35_h,
                rb_q36, rb_q37_a, rb_q37_b, rb_q37_c, rb_q37_d, rb_q37_e, rb_q38_a, rb_q38_b, rb_q38_c, rb_q38_d, rb_q38_e,
                rb_q38_f, rb_q38_g, rb_q38_h, rb_q38_i, rb_q38_j, rb_q40, rb_q41, rb_q42, rb_q43,  rb_q44,  rb_q46,
                rb_q48,  rb_q49,  rb_q50, rb_q51, rb_q53, rb_q58, rb_q38_k;

    RadioGroup rg_q26, rg_q28, rg_q34, rg_q35_a, rg_q35_b, rg_q35_c, rg_q35_d, rg_q35_e, rg_q35_f, rg_q35_g, rg_q35_h,
                rg_q36, rg_q37_a, rg_q37_b, rg_q37_c, rg_q37_d, rg_q37_e, rg_q38_a, rg_q38_b, rg_q38_c, rg_q38_d, rg_q38_e,
                rg_q38_f, rg_q38_g, rg_q38_h, rg_q38_i, rg_q38_j, rg_q40, rg_q41, rg_q42, rg_q43, rg_q44, rg_q46, rg_q48,
                rg_q49, rg_q50, rg_q51, rg_q53, rg_q58, rg_q38_k;

    ScrollView scrolView;

    int year, month, day, min, hour;

    LinearLayout ll_q35, ll_q37, ll_q38, ll_q41_q58, ll_q42_q58, ll_q44_q49, ll_q43_q58, ll_q45, ll_q47, ll_q37_q38;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf5a_q26, container, false);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);


        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        min = (calendar.get(Calendar.MINUTE));
        hour = (calendar.get(Calendar.HOUR_OF_DAY));



        tv_q54_kg = (TextView) view.findViewById(R.id.tv_q54_kg);
        tv_q55_dose = (TextView) view.findViewById(R.id.tv_q55_dose);
        tv_q56_ml = (TextView) view.findViewById(R.id.tv_q56_ml);


        et_q54 = (EditText) view.findViewById(R.id.et_q54);
        et_q33 = (EditText) view.findViewById(R.id.et_q33);
        et_q30 = (EditText) view.findViewById(R.id.et_q30);
        et_q31 = (EditText) view.findViewById(R.id.et_q31);
        et_q32 = (EditText) view.findViewById(R.id.et_q32);
        et_q35_h = (EditText) view.findViewById(R.id.et_q35_h);
        et_q37_e = (EditText) view.findViewById(R.id.et_q37_e);
        et_q38_k = (EditText) view.findViewById(R.id.et_q38_k);
        et_q39 = (EditText) view.findViewById(R.id.et_q39);
        et_q47_a = (EditText) view.findViewById(R.id.et_q47_a);
        et_q47_b = (EditText) view.findViewById(R.id.et_q47_b);
        et_q47_c = (EditText) view.findViewById(R.id.et_q47_c);
        et_q47_d = (EditText) view.findViewById(R.id.et_q47_d);
        et_q47_e = (EditText) view.findViewById(R.id.et_q47_e);
        et_q47_f = (EditText) view.findViewById(R.id.et_q47_f);
        et_q48 = (EditText) view.findViewById(R.id.et_q48);
        et_q45_a = (EditText) view.findViewById(R.id.et_q45_a);
        et_q45_b = (EditText) view.findViewById(R.id.et_q45_b);
        et_q45_c = (EditText) view.findViewById(R.id.et_q45_c);
        et_q45_d = (EditText) view.findViewById(R.id.et_q45_d);
        et_q45_e = (EditText) view.findViewById(R.id.et_q45_e);
        et_q45_f = (EditText) view.findViewById(R.id.et_q45_f);


        tv_q54_kg = (TextView) view.findViewById(R.id.tv_q54_kg);
        tv_q55_dose = (TextView) view.findViewById(R.id.tv_q55_dose);
        tv_q56_ml = (TextView) view.findViewById(R.id.tv_q56_ml);
        tv_q26 = (TextView) view.findViewById(R.id.tv_q26);
        tv_q27 = (TextView) view.findViewById(R.id.tv_q27);
        tv_q28 = (TextView) view.findViewById(R.id.tv_q28);
        tv_q29 = (TextView) view.findViewById(R.id.tv_q29);
        tv_q30 = (TextView) view.findViewById(R.id.tv_q30);
        tv_q31 = (TextView) view.findViewById(R.id.tv_q31);
        tv_q32 = (TextView) view.findViewById(R.id.tv_q32);
        tv_q33 = (TextView) view.findViewById(R.id.tv_q33);
        tv_q34 = (TextView) view.findViewById(R.id.tv_q24);
        tv_q35_a = (TextView) view.findViewById(R.id.tv_q35_a);
        tv_q35_b = (TextView) view.findViewById(R.id.tv_q35_b);
        tv_q35_c = (TextView) view.findViewById(R.id.tv_q35_c);
        tv_q35_d = (TextView) view.findViewById(R.id.tv_q35_d);
        tv_q35_e = (TextView) view.findViewById(R.id.tv_q35_e);
        tv_q35_f = (TextView) view.findViewById(R.id.tv_q35_f);
        tv_q35_g = (TextView) view.findViewById(R.id.tv_q35_g);
        tv_q35_h = (TextView) view.findViewById(R.id.tv_q35_h);
        tv_q36 = (TextView) view.findViewById(R.id.tv_q36);
        tv_q37_a = (TextView) view.findViewById(R.id.tv_q37_a);
        tv_q37_b = (TextView) view.findViewById(R.id.tv_q37_b);
        tv_q37_c = (TextView) view.findViewById(R.id.tv_q37_c);
        tv_q37_d = (TextView) view.findViewById(R.id.tv_q37_d);
        tv_q37_e = (TextView) view.findViewById(R.id.tv_q37_e);
        tv_q38_a = (TextView) view.findViewById(R.id.tv_q38_a);
        tv_q38_b = (TextView) view.findViewById(R.id.tv_q38_b);
        tv_q38_c = (TextView) view.findViewById(R.id.tv_q38_c);
        tv_q38_d = (TextView) view.findViewById(R.id.tv_q38_d);
        tv_q38_e = (TextView) view.findViewById(R.id.tv_q38_e);
        tv_q38_f = (TextView) view.findViewById(R.id.tv_q38_f);
        tv_q38_g = (TextView) view.findViewById(R.id.tv_q38_g);
        tv_q38_h = (TextView) view.findViewById(R.id.tv_q38_h);
        tv_q38_i = (TextView) view.findViewById(R.id.tv_q38_i);
        tv_q38_j = (TextView) view.findViewById(R.id.tv_q38_j);
        tv_q38_k = (TextView) view.findViewById(R.id.tv_q38_k);
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
        tv_q53 = (TextView) view.findViewById(R.id.tv_q53);
        tv_q58 = (TextView) view.findViewById(R.id.tv_q58);
        tv_q52_getdate = (TextView) view.findViewById(R.id.tv_q52_getdate);


        rg_q26 = (RadioGroup) view.findViewById(R.id.rg_q26);
        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);
        rg_q34 = (RadioGroup) view.findViewById(R.id.rg_q34);
        rg_q35_a = (RadioGroup) view.findViewById(R.id.rg_q35_a);
        rg_q35_b = (RadioGroup) view.findViewById(R.id.rg_q35_b);
        rg_q35_c = (RadioGroup) view.findViewById(R.id.rg_q35_c);
        rg_q35_d = (RadioGroup) view.findViewById(R.id.rg_q35_d);
        rg_q35_e = (RadioGroup) view.findViewById(R.id.rg_q35_e);
        rg_q35_f = (RadioGroup) view.findViewById(R.id.rg_q35_f);
        rg_q35_g = (RadioGroup) view.findViewById(R.id.rg_q35_g);
        rg_q35_h = (RadioGroup) view.findViewById(R.id.rg_q35_h);
        rg_q36 = (RadioGroup) view.findViewById(R.id.rg_q36);
        rg_q37_a = (RadioGroup) view.findViewById(R.id.rg_q37_a);
        rg_q37_b = (RadioGroup) view.findViewById(R.id.rg_q37_b);
        rg_q37_c = (RadioGroup) view.findViewById(R.id.rg_q37_c);
        rg_q37_d = (RadioGroup) view.findViewById(R.id.rg_q37_d);
        rg_q37_e = (RadioGroup) view.findViewById(R.id.rg_q37_e);
        rg_q38_a = (RadioGroup) view.findViewById(R.id.rg_q38_a);
        rg_q38_b = (RadioGroup) view.findViewById(R.id.rg_q38_b);
        rg_q38_c = (RadioGroup) view.findViewById(R.id.rg_q38_c);
        rg_q38_d = (RadioGroup) view.findViewById(R.id.rg_q38_d);
        rg_q38_e = (RadioGroup) view.findViewById(R.id.rg_q38_e);
        rg_q38_f = (RadioGroup) view.findViewById(R.id.rg_q38_f);
        rg_q38_g = (RadioGroup) view.findViewById(R.id.rg_q38_g);
        rg_q38_h = (RadioGroup) view.findViewById(R.id.rg_q38_h);
        rg_q38_i = (RadioGroup) view.findViewById(R.id.rg_q38_i);
        rg_q38_j = (RadioGroup) view.findViewById(R.id.rg_q38_j);
        rg_q38_k = (RadioGroup) view.findViewById(R.id.rg_q38_k);
        rg_q40 = (RadioGroup) view.findViewById(R.id.rg_q40);
        rg_q41 = (RadioGroup) view.findViewById(R.id.rg_q41);
        rg_q42 = (RadioGroup) view.findViewById(R.id.rg_q42);
        rg_q43 = (RadioGroup) view.findViewById(R.id.rg_q43);
        rg_q44 = (RadioGroup) view.findViewById(R.id.rg_q44);
        rg_q46 = (RadioGroup) view.findViewById(R.id.rg_q46);
        rg_q48 = (RadioGroup) view.findViewById(R.id.rg_q48);
        rg_q49 = (RadioGroup) view.findViewById(R.id.rg_q49);
        rg_q50 = (RadioGroup) view.findViewById(R.id.rg_q50);
        rg_q51 = (RadioGroup) view.findViewById(R.id.rg_q51);
        rg_q53 = (RadioGroup) view.findViewById(R.id.rg_q53);
        rg_q58 = (RadioGroup) view.findViewById(R.id.rg_q58);


        ll_q35 = (LinearLayout) view.findViewById(R.id.ll_q35);
        ll_q37 = (LinearLayout) view.findViewById(R.id.ll_q37);
        ll_q38 = (LinearLayout) view.findViewById(R.id.ll_q38);
        ll_q41_q58 = (LinearLayout) view.findViewById(R.id.ll_q41_q58);
        ll_q42_q58 = (LinearLayout) view.findViewById(R.id.ll_q42_q58);
        ll_q44_q49 = (LinearLayout) view.findViewById(R.id.ll_q44_q49);
        ll_q43_q58 = (LinearLayout) view.findViewById(R.id.ll_q43_q58);
        ll_q45 = (LinearLayout) view.findViewById(R.id.ll_q45);
        ll_q47 = (LinearLayout) view.findViewById(R.id.ll_q47);
        ll_q37_q38 = (LinearLayout) view.findViewById(R.id.ll_q37_q38);


        if(CRF4aActivity.followupDetails.getLastVisit().equalsIgnoreCase("error") &&
                !CRF4aActivity.followupDetails.getLastVisit().isEmpty()){


            try{

                SimpleDateFormat sdf = new SimpleDateFormat(ContantsValues.DATEFORMAT);

                Date lastDate = sdf.parse(CRF4aActivity.followupDetails.getLastVisit());

                Date today = sdf.parse(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

                tv_q27.setText(CRF4aActivity.followupDetails.getLastVisit());

                long diffInMillies = Math.abs(today.getTime() - lastDate.getTime());

                diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.DAYS);

                tv_q28.setText(diff+"");
                tv_q29.setText((diff*2)+"");

            }catch (Exception e) {

            }

        }else {


        }


        tv_q52_getdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        //  new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().setTime(new Date(dayOfMonth,monthOfYear,year)););

                        tv_q52_getdate.setText(dayOfMonth + "-" + monthOfYear + "-" + year);

                    }
                }, year, month, day);
                mdiDialog.getDatePicker();
                mdiDialog.show();



            }
        });



        et_q54.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {


                if(!et_q54.getText().toString().equals("")){

                    weightInKg = Double.parseDouble( new DecimalFormat("##.##").format(Double.parseDouble(et_q54.getText().toString())/1000));

                    tv_q54_kg.setText(weightInKg+" KG");

                    doseInMiligram = Double.parseDouble(new DecimalFormat("##.##").format(weightInKg*20));

                    tv_q55_dose.setText(doseInMiligram+" MilliGrams");
                    doseInml = Double.parseDouble(new DecimalFormat("##.#").format((0.025)*doseInMiligram));
                    tv_q56_ml.setText(doseInml+" MilliLitter");

                }
            }
        });


        btn_next = (Button) view.findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    Crf4aCounselingQ79 fragment = new Crf4aCounselingQ79();
                    //Crf5aQ59Counseling fragment = new Crf5aQ59Counseling();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                    fragmentTransaction.commit();

                }

            }
        });


        rg_q38_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q38_k = (RadioButton) view.findViewById(rg_q38_k.getCheckedRadioButtonId());

                if(rb_q38_k.getTag().toString().equals("2")){

                    et_q38_k.setVisibility(View.GONE);
                }else {

                    et_q38_k.setVisibility(View.VISIBLE);

                }

            }
        });


        rg_q26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q26 = (RadioButton) view.findViewById(rg_q26.getCheckedRadioButtonId());
            }
        });

       /* rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());
            }
        });*/


        rg_q34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q34 = (RadioButton) view.findViewById(rg_q34.getCheckedRadioButtonId());

                if(rb_q34.getTag().toString().equals("2")){

                    ll_q35.setVisibility(View.GONE);
                }else {
                    ll_q35.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q35_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q35_a = (RadioButton) view.findViewById(rg_q35_a.getCheckedRadioButtonId());
            }
        });

        rg_q35_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q35_b = (RadioButton) view.findViewById(rg_q35_b.getCheckedRadioButtonId());
            }
        });

        rg_q35_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q35_c = (RadioButton) view.findViewById(rg_q35_c.getCheckedRadioButtonId());

            }
        });

        rg_q35_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q35_d = (RadioButton) view.findViewById(rg_q35_d.getCheckedRadioButtonId());
            }
        });

        rg_q35_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q35_e = (RadioButton) view.findViewById(rg_q35_e.getCheckedRadioButtonId());
            }
        });

        rg_q35_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q35_f = (RadioButton) view.findViewById(rg_q35_f.getCheckedRadioButtonId());
            }
        });

        rg_q35_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q35_g = (RadioButton) view.findViewById(rg_q35_g.getCheckedRadioButtonId());
            }
        });

        rg_q35_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q35_h = (RadioButton) view.findViewById(rg_q35_h.getCheckedRadioButtonId());
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

        rg_q37_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q37_a = (RadioButton) view.findViewById(rg_q37_a.getCheckedRadioButtonId());
            }
        });

        rg_q37_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q37_b = (RadioButton) view.findViewById(rg_q37_b.getCheckedRadioButtonId());
            }
        });

        rg_q37_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q37_c = (RadioButton) view.findViewById(rg_q37_c.getCheckedRadioButtonId());
            }
        });

        rg_q37_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q37_d = (RadioButton) view.findViewById(rg_q37_d.getCheckedRadioButtonId());
            }
        });

        rg_q37_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q37_e = (RadioButton) view.findViewById(rg_q37_e.getCheckedRadioButtonId());
            }
        });

        rg_q38_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q38_a = (RadioButton) view.findViewById(rg_q38_a.getCheckedRadioButtonId());
            }
        });

        rg_q38_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q38_b = (RadioButton) view.findViewById(rg_q38_b.getCheckedRadioButtonId());
            }
        });

        rg_q38_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q38_c = (RadioButton) view.findViewById(rg_q38_c.getCheckedRadioButtonId());
            }
        });


        rg_q38_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q38_d = (RadioButton) view.findViewById(rg_q38_d.getCheckedRadioButtonId());
            }
        });

        rg_q38_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q38_e = (RadioButton) view.findViewById(rg_q38_e.getCheckedRadioButtonId());
            }
        });

        rg_q38_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q38_f = (RadioButton) view.findViewById(rg_q38_f.getCheckedRadioButtonId());
            }
        });

        rg_q38_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q38_g = (RadioButton) view.findViewById(rg_q38_g.getCheckedRadioButtonId());
            }
        });

        rg_q38_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q38_h = (RadioButton) view.findViewById(rg_q38_h.getCheckedRadioButtonId());
            }
        });

        rg_q38_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q38_i = (RadioButton) view.findViewById(rg_q38_i.getCheckedRadioButtonId());
            }
        });

        rg_q38_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q38_j = (RadioButton) view.findViewById(rg_q38_j.getCheckedRadioButtonId());
            }
        });


        rg_q40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40 = (RadioButton) view.findViewById(rg_q40.getCheckedRadioButtonId());

                if(rb_q40.getTag().equals("2")){

                    ll_q41_q58.setVisibility(View.GONE);

                }else {
                    ll_q41_q58.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q41 = (RadioButton) view.findViewById(rg_q41.getCheckedRadioButtonId());

                if(rb_q41.getTag().equals("2")){

                    ll_q42_q58.setVisibility(View.GONE);

                }else {
                    ll_q42_q58.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q42 = (RadioButton) view.findViewById(rg_q42.getCheckedRadioButtonId());

                if(rb_q42.getTag().toString().equals("2")){

                    ll_q43_q58.setVisibility(View.GONE);

                }else {
                    ll_q43_q58.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q43 = (RadioButton) view.findViewById(rg_q43.getCheckedRadioButtonId());

                if(rb_q43.getTag().toString().equals("2")){

                    ll_q44_q49.setVisibility(View.GONE);
                }else {
                    ll_q44_q49.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q44 = (RadioButton) view.findViewById(rg_q44.getCheckedRadioButtonId());

                if(rb_q44.getTag().toString().equals("2")){
                    ll_q45.setVisibility(View.GONE);
                }else {
                    ll_q45.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q46 = (RadioButton) view.findViewById(rg_q46.getCheckedRadioButtonId());

                if(rb_q46.getTag().toString().equals("2")){

                    ll_q47.setVisibility(View.GONE);
                }else {

                    ll_q47.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q48 = (RadioButton) view.findViewById(rg_q48.getCheckedRadioButtonId());
            }
        });

        rg_q49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q49 = (RadioButton) view.findViewById(rg_q49.getCheckedRadioButtonId());
            }
        });

        rg_q50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q49 = (RadioButton) view.findViewById(rg_q49.getCheckedRadioButtonId());
            }
        });

        rg_q51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q51 = (RadioButton) view.findViewById(rg_q51.getCheckedRadioButtonId());
            }
        });

       rg_q53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {

               rb_q53 = (RadioButton) view.findViewById(rg_q53.getCheckedRadioButtonId());
           }
       });

        rg_q58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q58 = (RadioButton) view.findViewById(rg_q58.getCheckedRadioButtonId());
            }
        });

        return view;
    }

    public boolean validation(){

        boolean validation = true;

        if (isRBCheckedThree(rg_q26, rb_q26, tv_q26).equals("")) {
            validation = false;
        } else {

            CRF4aActivity.formCrf5a.setQ26(isRBCheckedThree(rg_q26, rb_q26, tv_q26));
        }


        if(getTextFromField(et_q30,tv_q30).equals("")){
            validation = false;
        }else {

            CRF4aActivity.formCrf5a.setQ30(getTextFromField(et_q30, tv_q30));
        }

        if(getTextFromField(et_q31,tv_q31).equals("")){
            validation = false;
        }else {

            CRF4aActivity.formCrf5a.setQ31(getTextFromField(et_q31, tv_q31));
        }


        if(getTextFromField(et_q32,tv_q32).equals("")){
            validation = false;
        }else {

            CRF4aActivity.formCrf5a.setQ32(getTextFromField(et_q32, tv_q32));
        }


        if (isRBCheckedThree(rg_q34, rb_q34, tv_q34).equals("")) {
            validation = false;
        } else {

            CRF4aActivity.formCrf5a.setQ34(isRBCheckedThree(rg_q34, rb_q34, tv_q34));
        }

        if(ll_q35.getVisibility()==View.VISIBLE){


            if (isRBCheckedThree(rg_q35_a, rb_q35_a, tv_q35_a).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ35a(isRBCheckedThree(rg_q35_a, rb_q35_a, tv_q35_a));
            }

            if (isRBCheckedThree(rg_q35_b, rb_q35_b, tv_q35_b).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ35b(isRBCheckedThree(rg_q35_b, rb_q35_b, tv_q35_b));
            }

            if (isRBCheckedThree(rg_q35_c, rb_q35_c, tv_q35_c).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ35c(isRBCheckedThree(rg_q35_c, rb_q35_c, tv_q35_c));
            }

            if (isRBCheckedThree(rg_q35_d, rb_q35_d, tv_q35_d).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ35d(isRBCheckedThree(rg_q35_d, rb_q35_d, tv_q35_d));
            }

            if (isRBCheckedThree(rg_q35_e, rb_q35_e, tv_q35_e).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ35e(isRBCheckedThree(rg_q35_d, rb_q35_d, tv_q35_d));
            }

            if (isRBCheckedThree(rg_q35_f, rb_q35_f, tv_q35_f).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ35f(isRBCheckedThree(rg_q35_f, rb_q35_f, tv_q35_f));
            }

            if (isRBCheckedThree(rg_q35_g, rb_q35_g, tv_q35_g).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ35g(isRBCheckedThree(rg_q35_g, rb_q35_g, tv_q35_g));
            }

            if (getEditText(rg_q35_h, rb_q35_h, et_q35_h, tv_q35_h, ContantsValues.YES,"","","").equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf5a.setQ35h(getEditText(rg_q35_h, rb_q35_h, et_q35_h, tv_q35_h, ContantsValues.YES,"","",""));
            }


        }


        if (isRBCheckedThree(rg_q36, rb_q36, tv_q36).equals("")) {
            validation = false;
        } else {

            CRF4aActivity.formCrf5a.setQ36(isRBCheckedThree(rg_q36, rb_q36, tv_q36));
        }

        if(ll_q37.getVisibility()==View.VISIBLE) {


            if (isRBCheckedThree(rg_q37_a, rb_q37_a, tv_q37_a).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ37a(isRBCheckedThree(rg_q37_a, rb_q37_a, tv_q37_a));
            }

            if (isRBCheckedThree(rg_q37_b, rb_q37_b, tv_q37_b).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ37b(isRBCheckedThree(rg_q37_b, rb_q37_b, tv_q37_b));
            }


            if (isRBCheckedThree(rg_q37_c, rb_q37_c, tv_q37_c).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ37c(isRBCheckedThree(rg_q37_c, rb_q37_c, tv_q37_c));
            }

            if (isRBCheckedThree(rg_q37_d, rb_q37_d, tv_q37_d).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ37d(isRBCheckedThree(rg_q37_d, rb_q37_d, tv_q37_d));
            }


            if (isRBCheckedThree(rg_q38_a, rb_q38_a, tv_q38_a).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38a(isRBCheckedThree(rg_q38_a, rb_q38_a, tv_q38_a));
            }

            if (isRBCheckedThree(rg_q38_b, rb_q38_b, tv_q38_b).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38b(isRBCheckedThree(rg_q38_b, rb_q38_b, tv_q38_b));
            }

        }

            if (isRBCheckedThree(rg_q38_c, rb_q38_c, tv_q38_c).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38c(isRBCheckedThree(rg_q38_c, rb_q38_c, tv_q38_c));
            }

            if (isRBCheckedThree(rg_q38_d, rb_q38_d, tv_q38_d).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38d(isRBCheckedThree(rg_q38_d, rb_q38_d, tv_q38_d));
            }

            if (isRBCheckedThree(rg_q38_e, rb_q38_e, tv_q38_e).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38e(isRBCheckedThree(rg_q38_e, rb_q38_e, tv_q38_e));
            }

            if (isRBCheckedThree(rg_q38_f, rb_q38_f, tv_q38_f).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38f(isRBCheckedThree(rg_q38_f, rb_q38_f, tv_q38_f));
            }

            if (isRBCheckedThree(rg_q38_g, rb_q38_g, tv_q38_g).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38g(isRBCheckedThree(rg_q38_g, rb_q38_g, tv_q38_g));
            }

            if (isRBCheckedThree(rg_q38_h, rb_q38_h, tv_q38_h).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38h(isRBCheckedThree(rg_q38_h, rb_q38_h, tv_q38_h));
            }

            if (isRBCheckedThree(rg_q38_i, rb_q38_i, tv_q38_i).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38i(isRBCheckedThree(rg_q38_i, rb_q38_i, tv_q38_i));
            }


            if (isRBCheckedThree(rg_q38_j, rb_q38_j, tv_q38_j).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ38j(isRBCheckedThree(rg_q38_j, rb_q38_j, tv_q38_j));
            }


            if (getEditText(rg_q38_k, rb_q38_k, et_q38_k, tv_q38_k, ContantsValues.YES,"","","").equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf5a.setQ38k(getEditText(rg_q38_k, rb_q38_k, et_q38_k, tv_q38_k, ContantsValues.YES,"","",""));
            }



        if(getTextFromField(et_q39,tv_q39).equals("")){
            validation = false;
        }else {

            CRF4aActivity.formCrf5a.setQ39(getTextFromField(et_q39, tv_q39));
        }


        if (isRBCheckedThree(rg_q40, rb_q40, tv_q40).equals("")) {
            validation = false;
        } else {

            CRF4aActivity.formCrf5a.setQ40(isRBCheckedThree(rg_q40, rb_q40, tv_q40));
        }

        if(ll_q41_q58.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q41, rb_q41, tv_q41).equals("")) {
                validation = false;
            } else {

                CRF4aActivity.formCrf5a.setQ41(isRBCheckedThree(rg_q41, rb_q41, tv_q41));
            }

        if(ll_q42_q58.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q42, rb_q42, tv_q42).equals("")) {
                    validation = false;
                } else {

                    CRF4aActivity.formCrf5a.setQ42(isRBCheckedThree(rg_q42, rb_q42, tv_q42));
                }

         if(ll_q43_q58.getVisibility()==View.VISIBLE){



             if (isRBCheckedThree(rg_q43, rb_q43, tv_q43).equals("")) {
                 validation = false;
             } else {

                 CRF4aActivity.formCrf5a.setQ43(isRBCheckedThree(rg_q43, rb_q43, tv_q43));
             }

             if(ll_q44_q49.getVisibility()==View.VISIBLE){


                 if (isRBCheckedThree(rg_q44, rb_q44, tv_q44).equals("")) {
                     validation = false;
                 } else {

                     CRF4aActivity.formCrf5a.setQ44(isRBCheckedThree(rg_q44, rb_q44, tv_q44));
                 }

                 if(ll_q45.getVisibility()==View.VISIBLE){



                     if(getTextFromField(et_q45_a,tv_q45).equals("")){
                         validation = false;
                     }else {

                         CRF4aActivity.formCrf5a.setQ45a(getTextFromField(et_q45_a,tv_q45));

                         if(et_q45_b.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ45b(et_q45_b.getText().toString());
                         }
                         if(et_q45_c.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ45c(et_q45_c.getText().toString());
                         }
                         if(et_q45_d.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ45d(et_q45_d.getText().toString());
                         }
                         if(et_q45_e.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ45e(et_q45_e.getText().toString());
                         }

                         if(et_q45_f.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ45f(et_q45_f.getText().toString());
                         }
                     }

                 }


                 if (isRBCheckedThree(rg_q46, rb_q46, tv_q46).equals("")) {
                     validation = false;
                 } else {

                     CRF4aActivity.formCrf5a.setQ46(isRBCheckedThree(rg_q46, rb_q46, tv_q46));
                 }

                 if(ll_q47.getVisibility()==View.VISIBLE){

                     if(getTextFromField(et_q47_a,tv_q47).equals("")){
                         validation = false;
                     }else {

                         CRF4aActivity.formCrf5a.setQ47a(getTextFromField(et_q47_a,tv_q47));

                         if(et_q47_b.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ47b(et_q47_b.getText().toString());
                         }
                         if(et_q47_c.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ47c(et_q47_c.getText().toString());
                         }
                         if(et_q47_d.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ47d(et_q47_d.getText().toString());
                         }
                         if(et_q47_e.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ47e(et_q47_e.getText().toString());
                         }

                         if(et_q47_f.getText().toString().equals("")){

                         }else {
                             CRF4aActivity.formCrf5a.setQ47f(et_q47_f.getText().toString());
                         }

                     }


                 }

                 if(getTextFromField(et_q48,tv_q48).equals("")){
                     validation = false;
                 }else {

                     CRF4aActivity.formCrf5a.setQ48(getTextFromField(et_q48, tv_q48));
                 }


                 if (isRBCheckedThree(rg_q49, rb_q49, tv_q49).equals("")) {
                     validation = false;
                 } else {

                     CRF4aActivity.formCrf5a.setQ49(isRBCheckedThree(rg_q49, rb_q49, tv_q49));
                 }

             }


             if (isRBCheckedThree(rg_q50, rb_q50, tv_q50).equals("")) {
                 validation = false;
             } else {

                 CRF4aActivity.formCrf5a.setQ50(isRBCheckedThree(rg_q50, rb_q50, tv_q50));
             }

             if (isRBCheckedThree(rg_q51, rb_q51, tv_q51).equals("")) {
                 validation = false;
             } else {

                 CRF4aActivity.formCrf5a.setQ51(isRBCheckedThree(rg_q51, rb_q51, tv_q51));
             }

             if(tv_q52_getdate.getText().toString().isEmpty()){

                 tv_q52_getdate.setError("Required");
             }else {

                 CRF4aActivity.formCrf5a.setQ52(tv_q52_getdate.getText().toString());
             }

             if (isRBCheckedThree(rg_q53, rb_q53, tv_q53).equals("")) {
                 validation = false;
             } else {

                 CRF4aActivity.formCrf5a.setQ53(isRBCheckedThree(rg_q53, rb_q53, tv_q53));
             }


             if (isRBCheckedThree(rg_q58, rb_q58, tv_q58).equals("")) {
                 validation = false;
             } else {

                 CRF4aActivity.formCrf5a.setQ58(isRBCheckedThree(rg_q58, rb_q58, tv_q58));
             }
         }

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

    public String getEditText(RadioGroup rg, RadioButton rb, EditText editText ,TextView tv, String id, String id2, String id3, String id4){

        if(rg.getCheckedRadioButtonId()==-1){
            setFocuseable(tv.getX(),tv.getY());
            tv.setError("Required");
            return "";
        }else {
            if(rb.getTag().toString().equals(id) || rb.getTag().toString().equals(id2) ||
                    rb.getTag().toString().equals(id3) || rb.getTag().toString().equals(id4)){

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
