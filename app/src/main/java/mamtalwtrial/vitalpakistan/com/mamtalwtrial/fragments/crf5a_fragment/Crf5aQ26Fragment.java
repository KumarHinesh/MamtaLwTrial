package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5a_fragment;

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
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.text.DecimalFormat;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;

public class Crf5aQ26Fragment extends Fragment {

    double doseInml = 0;
    double doseInMiligram = 0;
    double weightInKg = 0;
    TextView tv_q54_kg, tv_q55_dose, tv_q56_ml,
                    tv_q26, tv_q27, tv_q28, tv_q29, tv_q30, tv_q31, tv_q32, tv_q33, tv_q34, tv_q35_a, tv_q35_b, tv_q35_c, tv_q35_d,
                    tv_q35_e, tv_q35_f, tv_q35_g, tv_q35_h, tv_q36, tv_q37_a, tv_q37_b, tv_q37_c, tv_q37_d, tv_q37_e, tv_q38_a,
                    tv_q38_b, tv_q38_c, tv_q38_d, tv_q38_e, tv_q38_f, tv_q38_g, tv_q38_h, tv_q38_i, tv_q38_j, tv_q40, tv_q41,
                    tv_q42, tv_q43, tv_q44, tv_q46, tv_q48, tv_q49, tv_q50, tv_q51, tv_q53, tv_q58;

    Button btn_next;
    EditText et_q54, et_q30, et_q31, et_q32, et_q33, et_q35_h;

    RadioButton rb_q26, rb_q28, rb_q34, rb_q35_a, rb_q35_b, rb_q35_c, rb_q35_d, rb_q35_e, rb_q35_f, rb_q35_g, rb_q35_h,
                rb_q36, rb_q37_a, rb_q37_b, rb_q37_c, rb_q37_d, rb_q37_e, rb_q38_a, rb_q38_b, rb_q38_c, rb_q38_d, rb_q38_e,
                rb_q38_f, rb_q38_g, rb_q38_h, rb_q38_i, rb_q38_j, rb_q40, rb_q41, rb_q42, rb_q43,  rb_q44,  rb_q46,
                rb_q48,  rb_q49,  rb_q50, rb_q51, rb_q53, rb_q58;

    RadioGroup rg_q26, rg_q28, rg_q34, rg_q35_a, rg_q35_b, rg_q35_c, rg_q35_d, rg_q35_e, rg_q35_f, rg_q35_g, rg_q35_h,
                rg_q36, rg_q37_a, rg_q37_b, rg_q37_c, rg_q37_d, rg_q37_e, rg_q38_a, rg_q38_b, rg_q38_c, rg_q38_d, rg_q38_e,
                rg_q38_f, rg_q38_g, rg_q38_h, rg_q38_i, rg_q38_j, rg_q40, rg_q41, rg_q42, rg_q43, rg_q44, rg_q46, rg_q48,
                rg_q49, rg_q50, rg_q51, rg_q53, rg_q58;

    ScrollView scrolView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf5a_q26, container, false);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        tv_q54_kg = (TextView) view.findViewById(R.id.tv_q54_kg);
        tv_q55_dose = (TextView) view.findViewById(R.id.tv_q55_dose);
        tv_q56_ml = (TextView) view.findViewById(R.id.tv_q56_ml);



        et_q54 = (EditText) view.findViewById(R.id.et_q54);
        et_q33 = (EditText) view.findViewById(R.id.et_q33);
        et_q35_h = (EditText) view.findViewById(R.id.et_q35_h);



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
        tv_q40 = (TextView) view.findViewById(R.id.tv_q40);
        tv_q41 = (TextView) view.findViewById(R.id.tv_q41);
        tv_q42 = (TextView) view.findViewById(R.id.tv_q42);
        tv_q43 = (TextView) view.findViewById(R.id.tv_q43);
        tv_q44 = (TextView) view.findViewById(R.id.tv_q44);
        tv_q46 = (TextView) view.findViewById(R.id.tv_q46);
        tv_q48 = (TextView) view.findViewById(R.id.tv_q48);
        tv_q49 = (TextView) view.findViewById(R.id.tv_q49);
        tv_q50 = (TextView) view.findViewById(R.id.tv_q50);
        tv_q51 = (TextView) view.findViewById(R.id.tv_q51);
        tv_q53 = (TextView) view.findViewById(R.id.tv_q53);
        tv_q58 = (TextView) view.findViewById(R.id.tv_q58);




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

                Crf5aQ59Counseling fragment = new Crf5aQ59Counseling();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                fragmentTransaction.commit();

            }
        });


        rg_q26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q26 = (RadioButton) view.findViewById(rg_q26.getCheckedRadioButtonId());
            }
        });

        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());
            }
        });


        rg_q34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q34 = (RadioButton) view.findViewById(rg_q34.getCheckedRadioButtonId());
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
            }
        });

        rg_q41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q41 = (RadioButton) view.findViewById(rg_q41.getCheckedRadioButtonId());
            }
        });

        rg_q42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q42 = (RadioButton) view.findViewById(rg_q42.getCheckedRadioButtonId());
            }
        });

        rg_q43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q43 = (RadioButton) view.findViewById(rg_q43.getCheckedRadioButtonId());
            }
        });

        rg_q44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q44 = (RadioButton) view.findViewById(rg_q44.getCheckedRadioButtonId());
            }
        });

        rg_q46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q46 = (RadioButton) view.findViewById(rg_q46.getCheckedRadioButtonId());
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

        if (isRBCheckedThree(rg_q34, rb_q34, tv_q34).equals("")) {
            validation = false;
        } else {

            CRF4aActivity.formCrf5a.setQ34(isRBCheckedThree(rg_q34, rb_q34, tv_q34));
        }

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
