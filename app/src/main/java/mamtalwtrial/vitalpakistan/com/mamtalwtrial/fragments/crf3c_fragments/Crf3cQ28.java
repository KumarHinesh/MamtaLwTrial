package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3c_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;


public class Crf3cQ28 extends Fragment {

    String q28 = "";
    String q31_a = "";
    String q31_b = "";
    String q31_c = "";
    String q31_d = "";
    String q31_e = "";
    String q31_f = "";
    String q31_g = "";
    String q31_h = "";
    String q31_i = "";
    String q31_j = "";
    String q31_k = "";
    String q31_l = "";
    String q32 = "";
    String q33 = "";
    EditText et_q29, et_q30;

    Button btn_submit;

    RadioGroup rg_q28, rg_q31_a, rg_q31_b, rg_q31_c, rg_q31_d, rg_q31_e, rg_q31_f, rg_q31_g, rg_q31_h, rg_q31_i, rg_q31_j,
               rg_q31_k, rg_q31_l, rg_q32, rg_q33;
    RadioButton rb_q28, rb_q31_a, rb_q31_b, rb_q31_c, rb_q31_d, rb_q31_e, rb_q31_f, rb_q31_g, rb_q31_h, rb_q31_i, rb_q31_j,
               rb_q31_k, rb_q31_l, rb_q32, rb_q33;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf3c_q28, container, false);

        et_q29 = (EditText) view.findViewById(R.id.et_q29);
        et_q30 = (EditText) view.findViewById(R.id.et_q30);

        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);

        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());
                q28 = rb_q28.getTag().toString();

            }
        });

        rg_q31_a = (RadioGroup) view.findViewById(R.id.rg_q31_a);
        rg_q31_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_a = (RadioButton) view.findViewById(rg_q31_a.getCheckedRadioButtonId());
                q31_a = rb_q31_a.getTag().toString();
            }
        });

        rg_q31_b = (RadioGroup) view.findViewById(R.id.rg_q31_b);
        rg_q31_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_b = (RadioButton) view.findViewById(rg_q31_b.getCheckedRadioButtonId());
                q31_b = rb_q31_b.getTag().toString();
            }
        });

        rg_q31_c = (RadioGroup) view.findViewById(R.id.rg_q31_c);
        rg_q31_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_c = (RadioButton) view.findViewById(rg_q31_c.getCheckedRadioButtonId());
                q31_c = rb_q31_c.getTag().toString();
            }
        });

        rg_q31_d = (RadioGroup) view.findViewById(R.id.rg_q31_d);
        rg_q31_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_d = (RadioButton) view.findViewById(rg_q31_d.getCheckedRadioButtonId());
                q31_d = rb_q31_d.getTag().toString();
            }
        });


        rg_q31_e = (RadioGroup) view.findViewById(R.id.rg_q31_e);
        rg_q31_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_e = (RadioButton) view.findViewById(rg_q31_e.getCheckedRadioButtonId());
                q31_e = rb_q31_e.getTag().toString();
            }
        });

        rg_q31_f = (RadioGroup) view.findViewById(R.id.rg_q31_f);
        rg_q31_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_f = (RadioButton) view.findViewById(rg_q31_f.getCheckedRadioButtonId());
                q31_f = rb_q31_f.getTag().toString();
            }
        });


        rg_q31_g = (RadioGroup) view.findViewById(R.id.rg_q31_g);
        rg_q31_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_g = (RadioButton) view.findViewById(rg_q31_g.getCheckedRadioButtonId());
                q31_g = rb_q31_g.getTag().toString();
            }
        });

        rg_q31_h = (RadioGroup) view.findViewById(R.id.rg_q31_h);
        rg_q31_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_h = (RadioButton) view.findViewById(rg_q31_h.getCheckedRadioButtonId());
                q31_h = rb_q31_h.getTag().toString();
            }
        });


        rg_q31_i = (RadioGroup) view.findViewById(R.id.rg_q31_i);
        rg_q31_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_i = (RadioButton) view.findViewById(rg_q31_i.getCheckedRadioButtonId());
                q31_i = rb_q31_i.getTag().toString();
            }
        });

        rg_q31_j = (RadioGroup) view.findViewById(R.id.rg_q31_j);
        rg_q31_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_j = (RadioButton) view.findViewById(rg_q31_j.getCheckedRadioButtonId());
                q31_j = rb_q31_j.getTag().toString();
            }
        });


        rg_q31_k = (RadioGroup) view.findViewById(R.id.rg_q31_k);
        rg_q31_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_k = (RadioButton) view.findViewById(rg_q31_k.getCheckedRadioButtonId());
                q31_k = rb_q31_k.getTag().toString();
            }
        });

        rg_q31_l = (RadioGroup) view.findViewById(R.id.rg_q31_l);
        rg_q31_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31_l = (RadioButton) view.findViewById(rg_q31_l.getCheckedRadioButtonId());
                q31_l = rb_q31_l.getTag().toString();
            }
        });

        rg_q32 = (RadioGroup) view.findViewById(R.id.rg_q32);
        rg_q32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q32 = (RadioButton) view.findViewById(rg_q32.getCheckedRadioButtonId());
                q32 = rb_q32.getTag().toString();
            }
        });

        rg_q33 = (RadioGroup) view.findViewById(R.id.rg_q33);
        rg_q33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q33 = (RadioButton) view.findViewById(rg_q33.getCheckedRadioButtonId());
                q33 = rb_q33.getTag().toString();
            }
        });


        btn_submit = (Button) view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insertedData();

                Crf3cQ34 crf3cQ34 = new Crf3cQ34();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout_crf3c, crf3cQ34);
                fragmentTransaction.commit();


            }
        });

        return view;
    }


    public void insertedData(){

        CRF3cActivity.formCrf3cDTO.setQ28(q28);
        CRF3cActivity.formCrf3cDTO.setQ31a(q31_a);
        CRF3cActivity.formCrf3cDTO.setQ31b(q31_b);
        CRF3cActivity.formCrf3cDTO.setQ31c(q31_c);
        CRF3cActivity.formCrf3cDTO.setQ31d(q31_d);
        CRF3cActivity.formCrf3cDTO.setQ31e(q31_e);
        CRF3cActivity.formCrf3cDTO.setQ31f(q31_f);
        CRF3cActivity.formCrf3cDTO.setQ31g(q31_g);
        CRF3cActivity.formCrf3cDTO.setQ31h(q31_h);
        CRF3cActivity.formCrf3cDTO.setQ31i(q31_i);
        CRF3cActivity.formCrf3cDTO.setQ31j(q31_j);
        CRF3cActivity.formCrf3cDTO.setQ31k(q31_k);
        CRF3cActivity.formCrf3cDTO.setQ31l(q31_l);
        CRF3cActivity.formCrf3cDTO.setQ32(q32);
        CRF3cActivity.formCrf3cDTO.setQ33(q33);


        if(TextUtils.isEmpty(et_q29.getText().toString())){

            et_q29.setError("Required");

        }

        if(TextUtils.isEmpty(et_q30.getText().toString())){

            et_q30.setError("Required");

        }

    }



}
