package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments;

import android.opengl.Visibility;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class Crf3bQ29Fragment extends Fragment {

    int x,y;

    ScrollView scrolView;

    Button btn_submit;

    LinearLayout ll_q35;

    RadioGroup rg_q29_a, rg_q29_b, rg_q29_c, rg_q29_d, rg_q29_e , rg_q30, rg_q31, rg_q34, rg_q36_a, rg_q36_b, rg_q36_c,
               rg_q36_d, rg_q36_e, rg_q36_f, rg_q36_g, rg_q36_h, rg_q36_i,rg_q36_j, rg_q36_k, rg_q36_l, rg_q36_m, rg_q36_n,
               rg_q36_o, rg_q36_p, rg_q36_q, rg_q36_r, rg_q36_s, rg_q36_t, rg_q36_u, rg_q36_v, rg_q36_w, rg_q36_x, rg_q36_y,
               rg_q37, rg_q38 , rg_q39_a, rg_q39_b, rg_q39_c, rg_q39_d, rg_q39_e, rg_q39_f, rg_q39_g, rg_q39_h, rg_q39_i,rg_q39_j,
               rg_q40_a, rg_q40_b, rg_q40_c, rg_q40_d, rg_q40_e, rg_q40_f, rg_q40_g, rg_q40_h, rg_q40_i,rg_q40_j, rg_q40_k, rg_q40_l,
               rg_q40_m, rg_q40_n, rg_q40_o, rg_q40_p, rg_q40_q, rg_q40_r, rg_q41, rg_q42, rg_q43_a, rg_q43_b, rg_q43_c,
               rg_q43_d, rg_q43_e, rg_q43_f, rg_q43_g, rg_q43_h, rg_q43_i, rg_q43_j, rg_q43_k;


    RadioButton rb_q29_a, rb_q29_b, rb_q29_c, rb_q29_d, rb_q29_e, rb_q30, rb_q31, rb_q34, rb_q36_a, rb_q36_b, rb_q36_c,
                rb_q36_d, rb_q36_e, rb_q36_f, rb_q36_g, rb_q36_h, rb_q36_i,rb_q36_j, rb_q36_k, rb_q36_l, rb_q36_m, rb_q36_n,
                rb_q36_o, rb_q36_p, rb_q36_q, rb_q36_r, rb_q36_s, rb_q36_t, rb_q36_u, rb_q36_v, rb_q36_w, rb_q36_x, rb_q36_y,
                rb_q37, rb_q38, rb_q39_a, rb_q39_b, rb_q39_c, rb_q39_d, rb_q39_e, rb_q39_f, rb_q39_g, rb_q39_h, rb_q39_i,rb_q39_j,
                rb_q40_a, rb_q40_b, rb_q40_c, rb_q40_d, rb_q40_e, rb_q40_f, rb_q40_g, rb_q40_h, rb_q40_i,rb_q40_j, rb_q40_k, rb_q40_l,
                rb_q40_m, rb_q40_n, rb_q40_o, rb_q40_p, rb_q40_q, rb_q40_r, rb_q41, rb_q42, rb_q43_a, rb_q43_b, rb_q43_c,
                rb_q43_d, rb_q43_e, rb_q43_f, rb_q43_g, rb_q43_h, rb_q43_i, rb_q43_j, rb_q43_k;

    EditText  et_q29_e, et_q31, et_q32, et_q33, et_q35, et_q36_y, et_q38, et_q39_j, et_q40_r, et_q42, et_q43_k;


    TextView tv_q29_a, tv_q29_b, tv_q29_c, tv_q29_d, tv_q29_e, tv_q30, tv_q31, tv_q32, tv_q34, tv_q36_a
            , tv_q36_b, tv_q36_c, tv_q36_d, tv_q36_e, tv_q36_f, tv_q36_g, tv_q36_h, tv_q36_i, tv_q36_j, tv_q36_k, tv_q36_l, tv_q36_m
            ,tv_q36_n, tv_q36_o, tv_q36_p, tv_q36_q, tv_q36_r, tv_q36_s, tv_q36_t, tv_q36_u, tv_q36_v, tv_q36_w, tv_q36_x, tv_q36_y
            , tv_q37, tv_q38, tv_q39_a
            , tv_q39_b, tv_q39_c, tv_q39_d, tv_q39_e, tv_q39_f, tv_q39_g, tv_q39_h, tv_q39_i, tv_q39_j, tv_q40_a
            , tv_q40_b, tv_q40_c, tv_q40_d, tv_q40_e, tv_q40_f, tv_q40_g, tv_q40_h, tv_q40_i, tv_q40_j, tv_q40_k, tv_q40_l, tv_q40_m
            ,tv_q40_n, tv_q40_o, tv_q40_p, tv_q40_q, tv_q40_r, tv_q41, tv_q42, tv_q43_a
            , tv_q43_b, tv_q43_c, tv_q43_d, tv_q43_e, tv_q43_f, tv_q43_g, tv_q43_h, tv_q43_i, tv_q43_j, tv_q43_k;

    LinearLayout ll_q31_q33, ll_q38, ll_q39, ll_q31, ll_q32, ll_q33, ll_q42, ll_q43;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       final View view =  inflater.inflate(R.layout.fragment_crf3bq29, container, false);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        ll_q31_q33 = (LinearLayout) view.findViewById(R.id.ll_q31_q33);
        ll_q38 = (LinearLayout) view.findViewById(R.id.ll_q38);
        ll_q39 = (LinearLayout) view.findViewById(R.id.ll_q39);
        ll_q31 = (LinearLayout) view.findViewById(R.id.ll_q31);
        ll_q32 = (LinearLayout) view.findViewById(R.id.ll_q32);
        ll_q33 = (LinearLayout) view.findViewById(R.id.ll_q33);
        ll_q35 = (LinearLayout) view.findViewById(R.id.ll_q35);
        ll_q42 = (LinearLayout) view.findViewById(R.id.ll_q42);
        ll_q43 = (LinearLayout) view.findViewById(R.id.ll_q43);


        tv_q29_a = (TextView) view.findViewById(R.id.tv_q29_a);
        tv_q29_b = (TextView) view.findViewById(R.id.tv_q29_b);
        tv_q29_c = (TextView) view.findViewById(R.id.tv_q29_c);
        tv_q29_d = (TextView) view.findViewById(R.id.tv_q29_d);
        tv_q29_e = (TextView) view.findViewById(R.id.tv_q29_e);
        tv_q30 = (TextView) view.findViewById(R.id.tv_q30);
        tv_q31 = (TextView) view.findViewById(R.id.tv_q31);
        tv_q32 = (TextView) view.findViewById(R.id.tv_q32);
        tv_q34 = (TextView) view.findViewById(R.id.tv_q34);
        tv_q36_a = (TextView) view.findViewById(R.id.tv_q36_a);
        tv_q36_b = (TextView) view.findViewById(R.id.tv_q36_b);
        tv_q36_c = (TextView) view.findViewById(R.id.tv_q36_c);
        tv_q36_d = (TextView) view.findViewById(R.id.tv_q36_d);
        tv_q36_e = (TextView) view.findViewById(R.id.tv_q36_e);
        tv_q36_f = (TextView) view.findViewById(R.id.tv_q36_f);
        tv_q36_g = (TextView) view.findViewById(R.id.tv_q36_g);
        tv_q36_h = (TextView) view.findViewById(R.id.tv_q36_h);
        tv_q36_i = (TextView) view.findViewById(R.id.tv_q36_i);
        tv_q36_j = (TextView) view.findViewById(R.id.tv_q36_j);
        tv_q36_k = (TextView) view.findViewById(R.id.tv_q36_k);
        tv_q36_l = (TextView) view.findViewById(R.id.tv_q36_l);
        tv_q36_m = (TextView) view.findViewById(R.id.tv_q36_m);
        tv_q36_n = (TextView) view.findViewById(R.id.tv_q36_n);
        tv_q36_o = (TextView) view.findViewById(R.id.tv_q36_o);
        tv_q36_p = (TextView) view.findViewById(R.id.tv_q36_p);
        tv_q36_q = (TextView) view.findViewById(R.id.tv_q36_q);
        tv_q36_r = (TextView) view.findViewById(R.id.tv_q36_r);
        tv_q36_s = (TextView) view.findViewById(R.id.tv_q36_s);
        tv_q36_t = (TextView) view.findViewById(R.id.tv_q36_t);
        tv_q36_u = (TextView) view.findViewById(R.id.tv_q36_u);
        tv_q36_v = (TextView) view.findViewById(R.id.tv_q36_v);
        tv_q36_w = (TextView) view.findViewById(R.id.tv_q36_w);
        tv_q36_x = (TextView) view.findViewById(R.id.tv_q36_x);
        tv_q36_y = (TextView) view.findViewById(R.id.tv_q36_y);
        tv_q37 = (TextView) view.findViewById(R.id.tv_q37);
        tv_q38 = (TextView) view.findViewById(R.id.tv_q38);
        tv_q39_a = (TextView) view.findViewById(R.id.tv_q39_a);
        tv_q39_b = (TextView) view.findViewById(R.id.tv_q39_b);
        tv_q39_c = (TextView) view.findViewById(R.id.tv_q39_c);
        tv_q39_d = (TextView) view.findViewById(R.id.tv_q39_d);
        tv_q39_e = (TextView) view.findViewById(R.id.tv_q39_e);
        tv_q39_f = (TextView) view.findViewById(R.id.tv_q39_f);
        tv_q39_g = (TextView) view.findViewById(R.id.tv_q39_g);
        tv_q39_h = (TextView) view.findViewById(R.id.tv_q39_h);
        tv_q39_i = (TextView) view.findViewById(R.id.tv_q39_i);
        tv_q39_j = (TextView) view.findViewById(R.id.tv_q39_j);

        tv_q40_a = (TextView) view.findViewById(R.id.tv_q40_a);
        tv_q40_b = (TextView) view.findViewById(R.id.tv_q40_b);
        tv_q40_c = (TextView) view.findViewById(R.id.tv_q40_c);
        tv_q40_d = (TextView) view.findViewById(R.id.tv_q40_d);
        tv_q40_e = (TextView) view.findViewById(R.id.tv_q40_e);
        tv_q40_f = (TextView) view.findViewById(R.id.tv_q40_f);
        tv_q40_g = (TextView) view.findViewById(R.id.tv_q40_g);
        tv_q40_h = (TextView) view.findViewById(R.id.tv_q40_h);
        tv_q40_i = (TextView) view.findViewById(R.id.tv_q40_i);
        tv_q40_j = (TextView) view.findViewById(R.id.tv_q40_j);
        tv_q40_k = (TextView) view.findViewById(R.id.tv_q40_k);
        tv_q40_l = (TextView) view.findViewById(R.id.tv_q40_l);
        tv_q40_m = (TextView) view.findViewById(R.id.tv_q40_m);
        tv_q40_n = (TextView) view.findViewById(R.id.tv_q40_n);
        tv_q40_o = (TextView) view.findViewById(R.id.tv_q40_o);
        tv_q40_p = (TextView) view.findViewById(R.id.tv_q40_p);
        tv_q40_q = (TextView) view.findViewById(R.id.tv_q40_q);
        tv_q40_r = (TextView) view.findViewById(R.id.tv_q40_r);
        tv_q41 = (TextView) view.findViewById(R.id.tv_q41);
        tv_q42 = (TextView) view.findViewById(R.id.tv_q42);


        tv_q43_a = (TextView) view.findViewById(R.id.tv_q43_a);
        tv_q43_b = (TextView) view.findViewById(R.id.tv_q43_b);
        tv_q43_c = (TextView) view.findViewById(R.id.tv_q43_c);
        tv_q43_d = (TextView) view.findViewById(R.id.tv_q43_d);
        tv_q43_e = (TextView) view.findViewById(R.id.tv_q43_e);
        tv_q43_f = (TextView) view.findViewById(R.id.tv_q43_f);
        tv_q43_g = (TextView) view.findViewById(R.id.tv_q43_g);
        tv_q43_h = (TextView) view.findViewById(R.id.tv_q43_h);
        tv_q43_i = (TextView) view.findViewById(R.id.tv_q43_i);
        tv_q43_j = (TextView) view.findViewById(R.id.tv_q43_j);
        tv_q43_k = (TextView) view.findViewById(R.id.tv_q43_k);

        et_q29_e = (EditText) view.findViewById(R.id.et_q29_e);
        et_q39_j = (EditText) view.findViewById(R.id.et_q39_j);
        et_q31 = (EditText) view.findViewById(R.id.et_q31);
        et_q32 = (EditText) view.findViewById(R.id.et_q32);
        et_q33 = (EditText) view.findViewById(R.id.et_q33);
        et_q35 = (EditText) view.findViewById(R.id.et_q35);
        et_q36_y = (EditText) view.findViewById(R.id.et_q36_y);
        et_q38 = (EditText) view.findViewById(R.id.et_q38);
        et_q40_r = (EditText) view.findViewById(R.id.et_q40_r);
        et_q42 = (EditText) view.findViewById(R.id.et_q42);
        et_q43_k = (EditText) view.findViewById(R.id.et_q43_k);


        btn_submit = (Button) view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                  //  SendDataToServer.sendCrf3bForm(CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO());

                    Crf3bQ44Fragment crf3bQ44Fragment = new Crf3bQ44Fragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf3b, crf3bQ44Fragment);
                    fragmentTransaction.commit();

                }

            }
        });


        rg_q29_a = (RadioGroup) view.findViewById(R.id.rg_q29_a);
        rg_q29_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_a = (RadioButton) view.findViewById(rg_q29_a.getCheckedRadioButtonId());
                tv_q29_a.setError(null);
            }
        });

        rg_q29_b = (RadioGroup) view.findViewById(R.id.rg_q29_b);
        rg_q29_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_b = (RadioButton) view.findViewById(rg_q29_b.getCheckedRadioButtonId());
                tv_q29_b.setError(null);
            }
        });

        rg_q29_c = (RadioGroup) view.findViewById(R.id.rg_q29_c);
        rg_q29_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_c = (RadioButton) view.findViewById(rg_q29_c.getCheckedRadioButtonId());
                tv_q29_c.setError(null);
            }
        });

        rg_q29_d = (RadioGroup) view.findViewById(R.id.rg_q29_d);
        rg_q29_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_d = (RadioButton) view.findViewById(rg_q29_d.getCheckedRadioButtonId());
                tv_q29_d.setError(null);
            }
        });

        rg_q29_e = (RadioGroup) view.findViewById(R.id.rg_q29_e);
        rg_q29_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_e = (RadioButton) view.findViewById(rg_q29_e.getCheckedRadioButtonId());
                et_q29_e.setError(null);
                tv_q29_e.setError(null);
                if(rb_q29_e.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){
                    et_q29_e.setVisibility(View.VISIBLE);

                }else {

                    et_q29_e.setVisibility(View.GONE);
                }

            }
        });

        rg_q30 = (RadioGroup) view.findViewById(R.id.rg_q30);
        rg_q30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q30 = (RadioButton) view.findViewById(rg_q30.getCheckedRadioButtonId());
                tv_q30.setError(null);

                if(rb_q30.getTag().toString().equals(ContantsValues.NO) || rb_q30.getTag().toString().equals(ContantsValues.DONTKNOW)){

                    ll_q31.setVisibility(View.GONE);
                    ll_q32.setVisibility(View.GONE);
                    ll_q33.setVisibility(View.GONE);


                }else {
                    ll_q31.setVisibility(View.VISIBLE);
                    ll_q32.setVisibility(View.VISIBLE);
                    ll_q33.setVisibility(View.VISIBLE);

                }
            }
        });


        rg_q31 = (RadioGroup) view.findViewById(R.id.rg_q31);
        rg_q31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q31 = (RadioButton) view.findViewById(rg_q31.getCheckedRadioButtonId());
                et_q31.setError(null);
                tv_q31.setError(null);

                if(rb_q31.getTag().toString().equals("6") || rb_q31.getTag().toString().equals("7")
                                            || rb_q31.getTag().toString().equals("9")){

                    ll_q32.setVisibility(View.GONE);
                    ll_q33.setVisibility(View.GONE);

                }else {

                    ll_q32.setVisibility(View.VISIBLE);
                    ll_q33.setVisibility(View.VISIBLE);
                }

                if(rb_q31.getTag().toString().equalsIgnoreCase("7")){
                    et_q31.setVisibility(View.VISIBLE);

                }else {
                    et_q31.setVisibility(View.GONE);
                }


            }
        });

        rg_q34 = (RadioGroup) view.findViewById(R.id.rg_q34);
        rg_q34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q34 = (RadioButton) view.findViewById(rg_q34.getCheckedRadioButtonId());
                tv_q34.setError(null);

                if(rb_q34.getTag().toString().equalsIgnoreCase(ContantsValues.NO) ||
                        rb_q34.getTag().toString().equalsIgnoreCase(ContantsValues.DONTKNOW)){

                    ll_q35.setVisibility(View.GONE);

                }else {
                    ll_q35.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q36_a = (RadioGroup) view.findViewById(R.id.rg_q36_a);
        rg_q36_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_a = (RadioButton) view.findViewById(rg_q36_a.getCheckedRadioButtonId());
                tv_q36_a.setError(null);            }
        });

        rg_q36_b = (RadioGroup) view.findViewById(R.id.rg_q36_b);
        rg_q36_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_b = (RadioButton) view.findViewById(rg_q36_b.getCheckedRadioButtonId());
                tv_q36_b.setError(null);
            }
        });

        rg_q36_c = (RadioGroup) view.findViewById(R.id.rg_q36_c);
        rg_q36_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_c = (RadioButton) view.findViewById(rg_q36_c.getCheckedRadioButtonId());
                tv_q36_c.setError(null);
            }
        });

        rg_q36_d = (RadioGroup) view.findViewById(R.id.rg_q36_d);
        rg_q36_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_d = (RadioButton) view.findViewById(rg_q36_d.getCheckedRadioButtonId());
                tv_q36_d.setError(null);
            }
        });

        rg_q36_e = (RadioGroup) view.findViewById(R.id.rg_q36_e);
        rg_q36_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_e = (RadioButton) view.findViewById(rg_q36_e.getCheckedRadioButtonId());
                tv_q36_e.setError(null);
            }
        });

        rg_q36_f = (RadioGroup) view.findViewById(R.id.rg_q36_f);
        rg_q36_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_f = (RadioButton) view.findViewById(rg_q36_f.getCheckedRadioButtonId());
                tv_q36_f.setError(null);
            }
        });

        rg_q36_g = (RadioGroup) view.findViewById(R.id.rg_q36_g);
        rg_q36_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_g = (RadioButton) view.findViewById(rg_q36_g.getCheckedRadioButtonId());
                tv_q36_g.setError(null);
            }
        });

        rg_q36_h = (RadioGroup) view.findViewById(R.id.rg_q36_h);
        rg_q36_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_h = (RadioButton) view.findViewById(rg_q36_h.getCheckedRadioButtonId());
                tv_q36_h.setError(null);
            }
        });

        rg_q36_i = (RadioGroup) view.findViewById(R.id.rg_q36_i);
        rg_q36_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_i = (RadioButton) view.findViewById(rg_q36_i.getCheckedRadioButtonId());
                tv_q36_i.setError(null);
            }
        });

        rg_q36_j = (RadioGroup) view.findViewById(R.id.rg_q36_j);
        rg_q36_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_j = (RadioButton) view.findViewById(rg_q36_j.getCheckedRadioButtonId());
                tv_q36_j.setError(null);
            }
        });

        rg_q36_k = (RadioGroup) view.findViewById(R.id.rg_q36_k);
        rg_q36_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_k = (RadioButton) view.findViewById(rg_q36_k.getCheckedRadioButtonId());
                tv_q36_k.setError(null);
            }
        });

        rg_q36_l = (RadioGroup) view.findViewById(R.id.rg_q36_l);
        rg_q36_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_l = (RadioButton) view.findViewById(rg_q36_l.getCheckedRadioButtonId());
                tv_q36_l.setError(null);
            }
        });

        rg_q36_m = (RadioGroup) view.findViewById(R.id.rg_q36_m);
        rg_q36_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_m = (RadioButton) view.findViewById(rg_q36_m.getCheckedRadioButtonId());
                tv_q36_m.setError(null);
            }
        });

        rg_q36_n = (RadioGroup) view.findViewById(R.id.rg_q36_n);
        rg_q36_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_n = (RadioButton) view.findViewById(rg_q36_n.getCheckedRadioButtonId());
                tv_q36_n.setError(null);
            }
        });

        rg_q36_o = (RadioGroup) view.findViewById(R.id.rg_q36_o);
        rg_q36_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_o = (RadioButton) view.findViewById(rg_q36_o.getCheckedRadioButtonId());
                tv_q36_o.setError(null);
            }
        });

        rg_q36_p = (RadioGroup) view.findViewById(R.id.rg_q36_p);
        rg_q36_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_p = (RadioButton) view.findViewById(rg_q36_p.getCheckedRadioButtonId());
                tv_q36_p.setError(null);
            }
        });

        rg_q36_q = (RadioGroup) view.findViewById(R.id.rg_q36_q);
        rg_q36_q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_q = (RadioButton) view.findViewById(rg_q36_q.getCheckedRadioButtonId());
                tv_q36_q.setError(null);
            }
        });

        rg_q36_r = (RadioGroup) view.findViewById(R.id.rg_q36_r);
        rg_q36_r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_r = (RadioButton) view.findViewById(rg_q36_r.getCheckedRadioButtonId());
                tv_q36_r.setError(null);
            }
        });

        rg_q36_s = (RadioGroup) view.findViewById(R.id.rg_q36_s);
        rg_q36_s.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_s = (RadioButton) view.findViewById(rg_q36_s.getCheckedRadioButtonId());
                tv_q36_s.setError(null);
            }
        });

        rg_q36_t = (RadioGroup) view.findViewById(R.id.rg_q36_t);
        rg_q36_t.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_t = (RadioButton) view.findViewById(rg_q36_t.getCheckedRadioButtonId());
                tv_q36_t.setError(null);
            }
        });

        rg_q36_u = (RadioGroup) view.findViewById(R.id.rg_q36_u);
        rg_q36_u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_u = (RadioButton) view.findViewById(rg_q36_u.getCheckedRadioButtonId());
                tv_q36_u.setError(null);
            }
        });

        rg_q36_v = (RadioGroup) view.findViewById(R.id.rg_q36_v);
        rg_q36_v.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_v = (RadioButton) view.findViewById(rg_q36_v.getCheckedRadioButtonId());
                tv_q36_v.setError(null);            }
        });

        rg_q36_w = (RadioGroup) view.findViewById(R.id.rg_q36_w);
        rg_q36_w.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_w = (RadioButton) view.findViewById(rg_q36_w.getCheckedRadioButtonId());
                tv_q36_w.setError(null);
            }
        });

        rg_q36_x = (RadioGroup) view.findViewById(R.id.rg_q36_x);
        rg_q36_x.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_x = (RadioButton) view.findViewById(rg_q36_x.getCheckedRadioButtonId());
                tv_q36_x.setError(null);
            }
        });

        rg_q36_y = (RadioGroup) view.findViewById(R.id.rg_q36_y);
        rg_q36_y.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_y = (RadioButton) view.findViewById(rg_q36_y.getCheckedRadioButtonId());
                tv_q36_y.setError(null);
                et_q36_y.setError(null);
                if(rb_q36_y.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){
                    et_q36_y.setVisibility(View.VISIBLE);

                }else {
                    et_q36_y.setVisibility(View.GONE);
                    //CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36y(rb_q36_y.getTag().toString());
                }

            }
        });


        rg_q37 = (RadioGroup) view.findViewById(R.id.rg_q37);
        rg_q37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q37 = (RadioButton) view.findViewById(rg_q37.getCheckedRadioButtonId());
                tv_q37.setError(null);

                if(rb_q37.getTag().toString().equals("2") || rb_q37.getTag().toString().equals("3")
                        || rb_q37.getTag().toString().equals("9")){
                    ll_q38.setVisibility(View.GONE);
                    ll_q39.setVisibility(View.GONE);
                }else {
                    ll_q38.setVisibility(View.VISIBLE);
                    ll_q39.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q38 = (RadioGroup) view.findViewById(R.id.rg_q38);
        rg_q38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q38 = (RadioButton) view.findViewById(rg_q38.getCheckedRadioButtonId());
                et_q38.setError(null);
                tv_q38.setError(null);


                    if(rb_q38.getTag().toString().equals("6") || rb_q38.getTag().toString().equals("7") || rb_q38.getTag().toString().equals("9")){

                            ll_q39.setVisibility(View.GONE);

                    if(rb_q38.getTag().toString().equalsIgnoreCase("7")){
                        et_q38.setVisibility(View.VISIBLE);
                    }else {
                        et_q38.setVisibility(View.GONE);
                    }
                }
                else {
                    ll_q39.setVisibility(View.VISIBLE);
                }

            }
        });


        rg_q39_a = (RadioGroup) view.findViewById(R.id.rg_q39_a);
        rg_q39_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_a = (RadioButton) view.findViewById(rg_q39_a.getCheckedRadioButtonId());

                tv_q39_a.setError(null);            }
        });

        rg_q39_b = (RadioGroup) view.findViewById(R.id.rg_q39_b);
        rg_q39_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_b = (RadioButton) view.findViewById(rg_q39_b.getCheckedRadioButtonId());
                tv_q39_b.setError(null);
            }
        });

        rg_q39_c = (RadioGroup) view.findViewById(R.id.rg_q39_c);
        rg_q39_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_c = (RadioButton) view.findViewById(rg_q39_c.getCheckedRadioButtonId());
                tv_q39_c.setError(null);
            }
        });

        rg_q39_d = (RadioGroup) view.findViewById(R.id.rg_q39_d);
        rg_q39_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_d = (RadioButton) view.findViewById(rg_q39_d.getCheckedRadioButtonId());
                tv_q39_d.setError(null);
            }
        });

        rg_q39_e = (RadioGroup) view.findViewById(R.id.rg_q39_e);
        rg_q39_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_e = (RadioButton) view.findViewById(rg_q39_e.getCheckedRadioButtonId());
                tv_q39_e.setError(null);
            }
        });

        rg_q39_f = (RadioGroup) view.findViewById(R.id.rg_q39_f);
        rg_q39_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_f = (RadioButton) view.findViewById(rg_q39_f.getCheckedRadioButtonId());
                tv_q39_f.setError(null);
            }
        });

        rg_q39_g = (RadioGroup) view.findViewById(R.id.rg_q39_g);
        rg_q39_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_g = (RadioButton) view.findViewById(rg_q39_g.getCheckedRadioButtonId());
                tv_q39_g.setError(null);
            }
        });

        rg_q39_h = (RadioGroup) view.findViewById(R.id.rg_q39_h);
        rg_q39_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_h = (RadioButton) view.findViewById(rg_q39_h.getCheckedRadioButtonId());
                tv_q39_h.setError(null);
            }
        });

        rg_q39_i = (RadioGroup) view.findViewById(R.id.rg_q39_i);
        rg_q39_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_i = (RadioButton) view.findViewById(rg_q39_i.getCheckedRadioButtonId());
                tv_q39_i.setError(null);
            }
        });


        rg_q39_j = (RadioGroup) view.findViewById(R.id.rg_q39_j);
        rg_q39_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_j = (RadioButton) view.findViewById(rg_q39_j.getCheckedRadioButtonId());

                if(rb_q39_j.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){
                    et_q39_j.setVisibility(View.VISIBLE);

                }else {
                    et_q39_j.setVisibility(View.GONE);
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39j(rb_q39_j.getTag().toString());
                }

            }
        });




        rg_q40_a = (RadioGroup) view.findViewById(R.id.rg_q40_a);
        rg_q40_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_a = (RadioButton) view.findViewById(rg_q40_a.getCheckedRadioButtonId());

                tv_q40_a.setError(null);            }
        });

        rg_q40_b = (RadioGroup) view.findViewById(R.id.rg_q40_b);
        rg_q40_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_b = (RadioButton) view.findViewById(rg_q40_b.getCheckedRadioButtonId());

                tv_q40_b.setError(null);
            }
        });

        rg_q40_c = (RadioGroup) view.findViewById(R.id.rg_q40_c);
        rg_q40_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_c = (RadioButton) view.findViewById(rg_q40_c.getCheckedRadioButtonId());
                tv_q40_c.setError(null);
            }
        });

        rg_q40_d = (RadioGroup) view.findViewById(R.id.rg_q40_d);
        rg_q40_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_d = (RadioButton) view.findViewById(rg_q40_d.getCheckedRadioButtonId());
                tv_q40_d.setError(null);
            }
        });

        rg_q40_e = (RadioGroup) view.findViewById(R.id.rg_q40_e);
        rg_q40_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_e = (RadioButton) view.findViewById(rg_q40_e.getCheckedRadioButtonId());

                tv_q40_e.setError(null);
            }
        });

        rg_q40_f = (RadioGroup) view.findViewById(R.id.rg_q40_f);
        rg_q40_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_f = (RadioButton) view.findViewById(rg_q40_f.getCheckedRadioButtonId());

                tv_q40_f.setError(null);
            }
        });

        rg_q40_g = (RadioGroup) view.findViewById(R.id.rg_q40_g);
        rg_q40_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_g = (RadioButton) view.findViewById(rg_q40_g.getCheckedRadioButtonId());

                tv_q40_g.setError(null);
            }
        });

        rg_q40_h = (RadioGroup) view.findViewById(R.id.rg_q40_h);
        rg_q40_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_h = (RadioButton) view.findViewById(rg_q40_h.getCheckedRadioButtonId());

                tv_q40_h.setError(null);
            }
        });

        rg_q40_i = (RadioGroup) view.findViewById(R.id.rg_q40_i);
        rg_q40_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_i = (RadioButton) view.findViewById(rg_q40_i.getCheckedRadioButtonId());

                tv_q40_i.setError(null);
            }
        });

        rg_q40_j = (RadioGroup) view.findViewById(R.id.rg_q40_j);
        rg_q40_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_j = (RadioButton) view.findViewById(rg_q40_j.getCheckedRadioButtonId());

                tv_q40_j.setError(null);
            }
        });

        rg_q40_k = (RadioGroup) view.findViewById(R.id.rg_q40_k);
        rg_q40_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_k = (RadioButton) view.findViewById(rg_q40_k.getCheckedRadioButtonId());
                tv_q40_k.setError(null);
            }
        });

        rg_q40_l = (RadioGroup) view.findViewById(R.id.rg_q40_l);
        rg_q40_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_l = (RadioButton) view.findViewById(rg_q40_l.getCheckedRadioButtonId());

                tv_q40_l.setError(null);
            }
        });

        rg_q40_m = (RadioGroup) view.findViewById(R.id.rg_q40_m);
        rg_q40_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_m = (RadioButton) view.findViewById(rg_q40_m.getCheckedRadioButtonId());
                tv_q40_m.setError(null);
            }
        });

        rg_q40_n = (RadioGroup) view.findViewById(R.id.rg_q40_n);
        rg_q40_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_n = (RadioButton) view.findViewById(rg_q40_n.getCheckedRadioButtonId());

                tv_q40_n.setError(null);
            }
        });

        rg_q40_o = (RadioGroup) view.findViewById(R.id.rg_q40_o);
        rg_q40_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_o = (RadioButton) view.findViewById(rg_q40_o.getCheckedRadioButtonId());

                tv_q40_o.setError(null);
            }
        });

        rg_q40_p = (RadioGroup) view.findViewById(R.id.rg_q40_p);
        rg_q40_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_p = (RadioButton) view.findViewById(rg_q40_p.getCheckedRadioButtonId());

                tv_q40_p.setError(null);
            }
        });

        rg_q40_q = (RadioGroup) view.findViewById(R.id.rg_q40_q);
        rg_q40_q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_q = (RadioButton) view.findViewById(rg_q40_q.getCheckedRadioButtonId());

                tv_q40_q.setError(null);
            }
        });




        rg_q40_r = (RadioGroup) view.findViewById(R.id.rg_q40_r);
        rg_q40_r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_r = (RadioButton) view.findViewById(rg_q40_r.getCheckedRadioButtonId());

                rb_q40_r.setError(null);
                et_q40_r.setError(null);

                if(rb_q40_r.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){
                    et_q40_r.setVisibility(View.VISIBLE);

                }else {
                    et_q40_r.setVisibility(View.GONE);
                    //CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36y(rb_q36_y.getTag().toString());
                }



            }
        });

        rg_q41 = (RadioGroup) view.findViewById(R.id.rg_q41);
        rg_q41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q41 = (RadioButton) view.findViewById(rg_q41.getCheckedRadioButtonId());
                tv_q41.setError(null);

                if(rb_q41.getTag().toString().equals("1")){

                    ll_q42.setVisibility(View.VISIBLE);
                    ll_q43.setVisibility(View.VISIBLE);

                }else {

                    ll_q42.setVisibility(View.GONE);
                    ll_q43.setVisibility(View.GONE);

                }


            }
        });

        rg_q42 = (RadioGroup) view.findViewById(R.id.rg_q42);
        rg_q42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q42 = (RadioButton) view.findViewById(rg_q42.getCheckedRadioButtonId());
                tv_q42.setError(null);
                et_q42.setError(null);
                et_q42.setVisibility(View.GONE);
                if(rb_q42.getTag().toString().equals("6") || rb_q42.getTag().toString().equals("7") ||
                            rb_q42.getTag().toString().equals("9")){

                    ll_q43.setVisibility(View.GONE);

                    if(rb_q42.getTag().toString().equals("7")){

                        et_q42.setVisibility(View.VISIBLE);

                    }else {
                        et_q42.setVisibility(View.GONE);
                    }

                }else {

                    ll_q43.setVisibility(View.VISIBLE);
                    //CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36y(rb_q36_y.getTag().toString());
                }
            }
        });



        rg_q43_a = (RadioGroup) view.findViewById(R.id.rg_q43_a);
        rg_q43_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_a = (RadioButton) view.findViewById(rg_q43_a.getCheckedRadioButtonId());
                tv_q43_a.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43a(rb_q43_a.getTag().toString());
            }
        });

        rg_q43_b = (RadioGroup) view.findViewById(R.id.rg_q43_b);
        rg_q43_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_b = (RadioButton) view.findViewById(rg_q43_b.getCheckedRadioButtonId());
                tv_q43_b.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43b(rb_q43_b.getTag().toString());
            }
        });

        rg_q43_c = (RadioGroup) view.findViewById(R.id.rg_q43_c);
        rg_q43_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_c = (RadioButton) view.findViewById(rg_q43_c.getCheckedRadioButtonId());
                tv_q43_c.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43c(rb_q43_c.getTag().toString());
            }
        });

        rg_q43_d = (RadioGroup) view.findViewById(R.id.rg_q43_d);
        rg_q43_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_d = (RadioButton) view.findViewById(rg_q43_d.getCheckedRadioButtonId());
                tv_q43_d.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43d(rb_q43_d.getTag().toString());
            }
        });

        rg_q43_e = (RadioGroup) view.findViewById(R.id.rg_q43_e);
        rg_q43_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_e = (RadioButton) view.findViewById(rg_q43_e.getCheckedRadioButtonId());
                tv_q43_e.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43e(rb_q43_e.getTag().toString());
            }
        });

        rg_q43_f = (RadioGroup) view.findViewById(R.id.rg_q43_f);
        rg_q43_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_f = (RadioButton) view.findViewById(rg_q43_f.getCheckedRadioButtonId());
                tv_q43_f.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43f(rb_q43_f.getTag().toString());
            }
        });

        rg_q43_g = (RadioGroup) view.findViewById(R.id.rg_q43_g);
        rg_q43_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_g = (RadioButton) view.findViewById(rg_q43_g.getCheckedRadioButtonId());
                tv_q43_g.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43g(rb_q43_g.getTag().toString());
            }
        });

        rg_q43_h = (RadioGroup) view.findViewById(R.id.rg_q43_h);
        rg_q43_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_h = (RadioButton) view.findViewById(rg_q43_h.getCheckedRadioButtonId());
                tv_q43_h.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43h(rb_q43_h.getTag().toString());
            }
        });

        rg_q43_i = (RadioGroup) view.findViewById(R.id.rg_q43_i);
        rg_q43_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_i = (RadioButton) view.findViewById(rg_q43_i.getCheckedRadioButtonId());
                tv_q43_i.setError(null);
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43i(rb_q43_i.getTag().toString());
            }
        });

        rg_q43_j = (RadioGroup) view.findViewById(R.id.rg_q43_j);
        rg_q43_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_j = (RadioButton) view.findViewById(rg_q43_j.getCheckedRadioButtonId());
                tv_q43_j.setError(null);
            }
        });

        rg_q43_k = (RadioGroup) view.findViewById(R.id.rg_q43_k);
        rg_q43_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                et_q43_k.setError(null);
                tv_q43_k.setError(null);
                rb_q43_k = (RadioButton) view.findViewById(rg_q43_k.getCheckedRadioButtonId());
                if(rb_q43_k.getTag().toString().equals(ContantsValues.YES)){

                    et_q43_k.setVisibility(View.VISIBLE);
                }else {
                    et_q43_k.setVisibility(View.GONE);
                }

            }
        });



        return view;
    }


    public boolean validation(){
        boolean validation = true;

        if (isRBCheckedThree(rg_q29_a, rb_q29_a, tv_q29_a).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ29a(isRBCheckedThree(rg_q29_a, rb_q29_a, tv_q29_a));
        }

        if (isRBCheckedThree(rg_q29_b, rb_q29_b, tv_q29_b).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ29b(isRBCheckedThree(rg_q29_b, rb_q29_b, tv_q29_b));
        }

        if (isRBCheckedThree(rg_q29_c, rb_q29_c, tv_q29_c).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ29c(isRBCheckedThree(rg_q29_c, rb_q29_c, tv_q29_c));
        }

        if (isRBCheckedThree(rg_q29_d, rb_q29_d, tv_q29_d).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ29d(isRBCheckedThree(rg_q29_d, rb_q29_d, tv_q29_d));
        }

        if(getEditText(rg_q29_e,rb_q29_e,et_q29_e,tv_q29_e,ContantsValues.YES,"","","").equals("")){
            validation = false;
        }else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ29e(getEditText(rg_q29_e,rb_q29_e,et_q29_e,tv_q29_e,ContantsValues.YES,"","",""));
        }


        if (isRBCheckedThree(rg_q30, rb_q30, tv_q30).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ30(isRBCheckedThree(rg_q30, rb_q30, tv_q30));
        }

        if(ll_q31.getVisibility()==View.VISIBLE){


            if(getEditText(rg_q31,rb_q31,et_q31,tv_q31,"6","7","9","").equals("")){
                validation = false;
            }else {
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ31(getEditText(rg_q31,rb_q31,et_q31,tv_q31,"6","7","9",""));
            }
        }

        if(ll_q32.getVisibility()==View.VISIBLE){

                if(getTextFromField(et_q32).equals("")){
                    validation = false;
                }else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ32(getTextFromField(et_q32));
                }

                if(getTextFromField(et_q33).equals("")){
                    validation = false;
                }else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ33(getTextFromField(et_q33));
                }

        }


        if (isRBCheckedThree(rg_q34, rb_q34, tv_q34).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ34(isRBCheckedThree(rg_q34, rb_q34, tv_q34));
        }

        if(ll_q35.getVisibility()==View.VISIBLE){


            if(getTextFromField(et_q35).equals("")){
                validation = false;
            }else {
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ35(getTextFromField(et_q35));
            }

        }


        if (isRBCheckedThree(rg_q36_a, rb_q36_a, tv_q36_a).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36a(isRBCheckedThree(rg_q36_a, rb_q36_a, tv_q36_a));
        }

        if (isRBCheckedThree(rg_q36_b, rb_q36_b, tv_q36_b).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36b(isRBCheckedThree(rg_q36_b, rb_q36_b, tv_q36_b));
        }

        if (isRBCheckedThree(rg_q36_c, rb_q36_c, tv_q36_c).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36c(isRBCheckedThree(rg_q36_c, rb_q36_c, tv_q36_c));
        }

        if (isRBCheckedThree(rg_q36_d, rb_q36_d, tv_q36_d).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36d(isRBCheckedThree(rg_q36_d, rb_q36_d, tv_q36_d));
        }


        if (isRBCheckedThree(rg_q36_e, rb_q36_e, tv_q36_e).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36e(isRBCheckedThree(rg_q36_e, rb_q36_e, tv_q36_e));
        }


        if (isRBCheckedThree(rg_q36_f, rb_q36_f, tv_q36_f).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36f(isRBCheckedThree(rg_q36_f, rb_q36_f, tv_q36_f));
        }

        if (isRBCheckedThree(rg_q36_g, rb_q36_g, tv_q36_g).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36g(isRBCheckedThree(rg_q36_g, rb_q36_g, tv_q36_g));
        }

        if (isRBCheckedThree(rg_q36_h, rb_q36_h, tv_q36_h).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36h(isRBCheckedThree(rg_q36_h, rb_q36_h, tv_q36_h));
        }

        if (isRBCheckedThree(rg_q36_i, rb_q36_i, tv_q36_i).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36i(isRBCheckedThree(rg_q36_i, rb_q36_i, tv_q36_i));
        }

        if (isRBCheckedThree(rg_q36_j, rb_q36_j, tv_q36_j).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36j(isRBCheckedThree(rg_q36_j, rb_q36_j, tv_q36_j));
        }

        if (isRBCheckedThree(rg_q36_k, rb_q36_k, tv_q36_k).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36k(isRBCheckedThree(rg_q36_k, rb_q36_k, tv_q36_k));
        }

        if (isRBCheckedThree(rg_q36_l, rb_q36_l, tv_q36_l).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36l(isRBCheckedThree(rg_q36_l, rb_q36_l, tv_q36_l));
        }

        if (isRBCheckedThree(rg_q36_m, rb_q36_m, tv_q36_m).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36m(isRBCheckedThree(rg_q36_m, rb_q36_m, tv_q36_m));
        }

        if (isRBCheckedThree(rg_q36_n, rb_q36_n, tv_q36_n).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36n(isRBCheckedThree(rg_q36_n, rb_q36_n, tv_q36_n));
        }

        if (isRBCheckedThree(rg_q36_o, rb_q36_o, tv_q36_o).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36o(isRBCheckedThree(rg_q36_o, rb_q36_o, tv_q36_o));
        }

        if (isRBCheckedThree(rg_q36_p, rb_q36_p, tv_q36_p).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36p(isRBCheckedThree(rg_q36_p, rb_q36_p, tv_q36_p));
        }

        if (isRBCheckedThree(rg_q36_q, rb_q36_q, tv_q36_q).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36q(isRBCheckedThree(rg_q36_q, rb_q36_q, tv_q36_q));
        }

        if (isRBCheckedThree(rg_q36_r, rb_q36_r, tv_q36_r).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36r(isRBCheckedThree(rg_q36_r, rb_q36_r, tv_q36_r));
        }

        if (isRBCheckedThree(rg_q36_s, rb_q36_s, tv_q36_s).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36s(isRBCheckedThree(rg_q36_s, rb_q36_s, tv_q36_s));
        }


        if (isRBCheckedThree(rg_q36_t, rb_q36_t, tv_q36_t).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36t(isRBCheckedThree(rg_q36_t, rb_q36_t, tv_q36_t));
        }

        if (isRBCheckedThree(rg_q36_u, rb_q36_u, tv_q36_u).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36u(isRBCheckedThree(rg_q36_u, rb_q36_u, tv_q36_u));
        }


        if (isRBCheckedThree(rg_q36_v, rb_q36_v, tv_q36_v).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36v(isRBCheckedThree(rg_q36_v, rb_q36_v, tv_q36_v));
        }


        if (isRBCheckedThree(rg_q36_w, rb_q36_w, tv_q36_w).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36w(isRBCheckedThree(rg_q36_w, rb_q36_w, tv_q36_w));
        }

        if (isRBCheckedThree(rg_q36_x, rb_q36_x, tv_q36_x).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36x(isRBCheckedThree(rg_q36_x, rb_q36_x, tv_q36_x));
        }

        if(getEditText(rg_q36_y,rb_q36_y,et_q36_y,tv_q36_y,ContantsValues.YES,"","","").equals("")){
            validation = false;
        }else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ36y(getEditText(rg_q36_y,rb_q36_y,et_q36_y,tv_q36_y,ContantsValues.YES,"","",""));
        }

        if (isRBCheckedThree(rg_q37, rb_q37, tv_q37).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ37(isRBCheckedThree(rg_q37, rb_q37, tv_q37));
        }



       if(ll_q38.getVisibility()==View.VISIBLE){

           if(getEditText(rg_q38,rb_q38,et_q38,tv_q38,"6","7","8","").equals("")){
               validation = false;
           }else {
               CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ38(getEditText(rg_q38,rb_q38,et_q38,tv_q38,"6","7","8",""));
           }

           if(ll_q39.getVisibility()==View.VISIBLE){

               if (isRBCheckedThree(rg_q39_a, rb_q39_a, tv_q39_a).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39a(isRBCheckedThree(rg_q39_a, rb_q39_a, tv_q39_a));
               }

               if (isRBCheckedThree(rg_q39_b, rb_q39_b, tv_q39_b).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39b(isRBCheckedThree(rg_q39_b, rb_q39_b, tv_q39_b));
               }

               if (isRBCheckedThree(rg_q39_c, rb_q39_c, tv_q39_c).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39c(isRBCheckedThree(rg_q39_c, rb_q39_c, tv_q39_c));
               }

               if (isRBCheckedThree(rg_q39_d, rb_q39_d, tv_q39_d).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39d(isRBCheckedThree(rg_q39_d, rb_q39_d, tv_q39_d));
               }


               if (isRBCheckedThree(rg_q39_e, rb_q39_e, tv_q39_e).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39e(isRBCheckedThree(rg_q39_e, rb_q39_e, tv_q39_e));
               }


               if (isRBCheckedThree(rg_q39_f, rb_q39_f, tv_q39_f).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39f(isRBCheckedThree(rg_q39_f, rb_q39_f, tv_q39_f));
               }

               if (isRBCheckedThree(rg_q39_g, rb_q39_g, tv_q39_g).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39g(isRBCheckedThree(rg_q39_g, rb_q39_g, tv_q39_g));
               }

               if (isRBCheckedThree(rg_q39_h, rb_q39_h, tv_q39_h).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39h(isRBCheckedThree(rg_q39_h, rb_q39_h, tv_q39_h));
               }

               if (isRBCheckedThree(rg_q39_i, rb_q39_i, tv_q39_i).equals("")) {
                   validation = false;
               } else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39i(isRBCheckedThree(rg_q39_i, rb_q39_i, tv_q39_i));
               }

               if(getEditText(rg_q39_j,rb_q39_j,et_q39_j,tv_q39_j,ContantsValues.YES,"","","").equals("")){
                   validation = false;
               }else {
                   CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ39j(getEditText(rg_q36_y,rb_q36_y,et_q36_y,tv_q36_y,ContantsValues.YES,"","",""));
               }

           }

       }


        if (isRBCheckedThree(rg_q40_a, rb_q40_a, tv_q40_a).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40a(isRBCheckedThree(rg_q40_a, rb_q40_a, tv_q40_a));
        }

        if (isRBCheckedThree(rg_q40_b, rb_q40_b, tv_q40_b).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40b(isRBCheckedThree(rg_q40_b, rb_q40_b, tv_q40_b));
        }

        if (isRBCheckedThree(rg_q40_c, rb_q40_c, tv_q40_c).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40c(isRBCheckedThree(rg_q40_c, rb_q40_c, tv_q40_c));
        }

        if (isRBCheckedThree(rg_q40_d, rb_q40_d, tv_q40_d).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40d(isRBCheckedThree(rg_q40_d, rb_q40_d, tv_q40_d));
        }


        if (isRBCheckedThree(rg_q40_e, rb_q40_e, tv_q40_e).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40e(isRBCheckedThree(rg_q40_e, rb_q40_e, tv_q40_e));
        }


        if (isRBCheckedThree(rg_q40_f, rb_q40_f, tv_q40_f).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40f(isRBCheckedThree(rg_q40_f, rb_q40_f, tv_q40_f));
        }

        if (isRBCheckedThree(rg_q40_g, rb_q40_g, tv_q40_g).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40g(isRBCheckedThree(rg_q40_g, rb_q40_g, tv_q40_g));
        }

        if (isRBCheckedThree(rg_q40_h, rb_q40_h, tv_q40_h).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40h(isRBCheckedThree(rg_q40_h, rb_q40_h, tv_q40_h));
        }

        if (isRBCheckedThree(rg_q40_i, rb_q40_i, tv_q40_i).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40i(isRBCheckedThree(rg_q40_i, rb_q40_i, tv_q40_i));
        }

        if (isRBCheckedThree(rg_q40_j, rb_q40_j, tv_q40_j).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40j(isRBCheckedThree(rg_q40_j, rb_q40_j, tv_q40_j));
        }

        if (isRBCheckedThree(rg_q40_k, rb_q40_k, tv_q40_k).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40k(isRBCheckedThree(rg_q40_k, rb_q40_k, tv_q40_k));
        }

        if (isRBCheckedThree(rg_q40_l, rb_q40_l, tv_q40_l).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40l(isRBCheckedThree(rg_q40_l, rb_q40_l, tv_q40_l));
        }

        if (isRBCheckedThree(rg_q40_m, rb_q40_m, tv_q40_m).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40m(isRBCheckedThree(rg_q40_m, rb_q40_m, tv_q40_m));
        }

        if (isRBCheckedThree(rg_q40_n, rb_q40_n, tv_q40_n).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40n(isRBCheckedThree(rg_q40_n, rb_q40_n, tv_q40_n));
        }

        if (isRBCheckedThree(rg_q40_o, rb_q40_o, tv_q40_o).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40o(isRBCheckedThree(rg_q40_o, rb_q40_o, tv_q40_o));
        }

        if (isRBCheckedThree(rg_q40_p, rb_q40_p, tv_q40_p).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40p(isRBCheckedThree(rg_q40_p, rb_q40_p, tv_q40_p));
        }

        if (isRBCheckedThree(rg_q40_q, rb_q40_q, tv_q40_q).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40q(isRBCheckedThree(rg_q40_q, rb_q40_q, tv_q40_q));
        }

        if(getEditText(rg_q40_r,rb_q40_r,et_q40_r,tv_q40_r,ContantsValues.YES,"","","").equals("")){
            validation = false;
        }else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ40r(getEditText(rg_q40_r,rb_q40_r,et_q40_r,tv_q40_r,ContantsValues.YES,"","",""));
        }

        if (isRBCheckedThree(rg_q41, rb_q41, tv_q41).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ41(isRBCheckedThree(rg_q41, rb_q41, tv_q41));
        }


        if(ll_q42.getVisibility()==View.VISIBLE){


            if(getEditText(rg_q42,rb_q42,et_q42,tv_q42,"6","7","8","").equals("")){
                validation = false;
            }else {
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ42(getEditText(rg_q42,rb_q42,et_q42,tv_q42,"6","7","8",""));
            }

            if(ll_q43.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q43_a, rb_q43_a, tv_q43_a).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43a(isRBCheckedThree(rg_q43_a, rb_q43_a, tv_q43_a));
                }


                if (isRBCheckedThree(rg_q43_b, rb_q43_b, tv_q43_b).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43b(isRBCheckedThree(rg_q43_b, rb_q43_b, tv_q43_b));
                }

                if (isRBCheckedThree(rg_q43_c, rb_q43_c, tv_q43_c).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43c(isRBCheckedThree(rg_q43_c, rb_q43_c, tv_q43_c));
                }

                if (isRBCheckedThree(rg_q43_d, rb_q43_d, tv_q43_d).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43d(isRBCheckedThree(rg_q43_d, rb_q43_d, tv_q43_d));
                }


                if (isRBCheckedThree(rg_q43_e, rb_q43_e, tv_q43_e).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43e(isRBCheckedThree(rg_q43_e, rb_q43_e, tv_q43_e));
                }


                if (isRBCheckedThree(rg_q43_f, rb_q43_f, tv_q43_f).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43f(isRBCheckedThree(rg_q43_f, rb_q43_f, tv_q43_f));
                }

                if (isRBCheckedThree(rg_q43_g, rb_q43_g, tv_q43_g).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43g(isRBCheckedThree(rg_q43_g, rb_q43_g, tv_q43_g));
                }

                if (isRBCheckedThree(rg_q43_h, rb_q43_h, tv_q43_h).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43h(isRBCheckedThree(rg_q43_h, rb_q43_h, tv_q43_h));
                }

                if (isRBCheckedThree(rg_q43_i, rb_q43_i, tv_q43_i).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43i(isRBCheckedThree(rg_q43_i, rb_q43_i, tv_q43_i));
                }

                if (isRBCheckedThree(rg_q43_j, rb_q43_j, tv_q43_j).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43j(isRBCheckedThree(rg_q43_j, rb_q43_j, tv_q43_j));
                }

                if(getEditText(rg_q43_k,rb_q43_k,et_q43_k,tv_q43_k,ContantsValues.YES,"","","").equals("")){
                    validation = false;
                }else {
                    CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ43k(getEditText(rg_q43_k,rb_q43_k,et_q43_k,tv_q43_k,ContantsValues.YES,"","",""));
                }



            }

        }


        return validation;
    }

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

        Log.d("00007","00000000000007");
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

    public String getTextFromField(EditText et){

        if(et.getText().toString().equals("")){
            setFocuseable(et.getX(),et.getY());
            et.setError("Required");
            return "";
        }else {
            return et.getText().toString();
        }
    }

}
