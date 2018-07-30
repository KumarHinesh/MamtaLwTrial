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
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class Crf3b80Fragment extends Fragment {

    ScrollView scrolView;

    boolean q88 = false;
    boolean a = false;
    boolean b = false;
    boolean c = false;
    boolean d = false;

    LinearLayout ll_q103_105, ll_q98, ll_q99,ll_q100, ll_q101, ll_q89, ll_q90, ll_q91, ll_q92, ll_q88_b, ll_q102 ;

    Button btnConform, btnCancel;
    TextView tv_engText,tv_RomanEngText, tv_q80, tv_q81,  tv_q82, tv_q83, tv_q84, tv_q85, tv_q86, tv_q87, tv_q88_a
                ,tv_q88_b_a, tv_q88_b_b, tv_q88_b_c, tv_q88_b_d, tv_q89, tv_q90, tv_q91, tv_q92, tv_q93, tv_q94, tv_q95
                 ,tv_q96_a, tv_q96_b, tv_q96_c, tv_q96_d, tv_q96_e, tv_q96_f, tv_q96_g, tv_q96_h, tv_q96_i,tv_q96_j, tv_q96_k
                  ,  tv_q96_l, tv_q96_m, tv_q96_n, tv_q96_o, tv_q96_p, tv_q97, tv_q98, tv_q99, tv_q100, tv_q101_a, tv_q101_b,
              tv_q101_c, tv_q101_d,  tv_q101_e, tv_q101_f, tv_q101_g, tv_q101_h, tv_q101_i, tv_q101_j, tv_q101_k, tv_q101_l,
                tv_q102, tv_q103, tv_q104, tv_q105;

    Dialog dialog;



    EditText et_q96_p, et_q101_l, et_q80_a, et_q80_b, et_q83_a, et_q83_b, et_q103, et_q104_a, et_q104_b, et_q104_c,
                et_q105_a, et_q105_b, et_q105_c, et_q105_d;

    RadioGroup rg_q81, rg_q82, rg_q84, rg_q85, rg_q86, rg_q87, rg_q88_a, rg_q88_b_a, rg_q88_b_b, rg_q88_b_c, rg_q88_b_d,
                rg_q89 , rg_q90, rg_q91, rg_q92, rg_q93, rg_q94, rg_q95,rg_q96_a, rg_q96_b, rg_q96_c, rg_q96_d, rg_q96_e, rg_q96_f
                    , rg_q96_g, rg_q96_h, rg_q96_i,rg_q96_j, rg_q96_k
                  ,  rg_q96_l, rg_q96_m, rg_q96_n, rg_q96_o, rg_q96_p,  rg_q97, rg_q98, rg_q99, rg_q100, rg_q101_a, rg_q101_b,
                rg_q101_c, rg_q101_d,  rg_q101_e, rg_q101_f, rg_q101_g, rg_q101_h, rg_q101_i, rg_q101_j, rg_q101_k ,rg_q101_l, rg_q102;

    RadioButton rb_q81, rb_q82, rb_q84, rb_q85,rb_q86, rb_q87, rb_q88_a, rb_q88_b_a, rb_q88_b_b, rb_q88_b_c, rb_q88_b_d,
                rb_q89 , rb_q90, rb_q91, rb_q92, rb_q93, rb_q94, rb_q95,rb_q96_a, rb_q96_b, rb_q96_c, rb_q96_d, rb_q96_e,
                    rb_q96_f, rb_q96_g, rb_q96_h, rb_q96_i, rb_q96_j, rb_q96_k
                  ,  rb_q96_l, rb_q96_m, rb_q96_n, rb_q96_o, rb_q96_p,rb_q97, rb_q98, rb_q99, rb_q100, rb_q101_a, rb_q101_b,
    rb_q101_c, rb_q101_d,  rb_q101_e, rb_q101_f, rb_q101_g, rb_q101_h, rb_q101_i, rb_q101_j, rb_q101_k, rb_q101_l, rb_q102;

    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf3b80, container, false);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        ll_q103_105 = (LinearLayout) view.findViewById(R.id.ll_q103_105);
        ll_q98 = (LinearLayout) view.findViewById(R.id.ll_q98);
        ll_q99 = (LinearLayout) view.findViewById(R.id.ll_q99);
        ll_q100 = (LinearLayout) view.findViewById(R.id.ll_q100);
        ll_q101 = (LinearLayout) view.findViewById(R.id.ll_q101);
        ll_q89 = (LinearLayout) view.findViewById(R.id.ll_q89);
        ll_q90 = (LinearLayout) view.findViewById(R.id.ll_q90);
        ll_q91 = (LinearLayout) view.findViewById(R.id.ll_q91);
        ll_q92 = (LinearLayout) view.findViewById(R.id.ll_q92);
        ll_q88_b = (LinearLayout) view.findViewById(R.id.ll_q88b);
        ll_q102 = (LinearLayout) view.findViewById(R.id.ll_q102);


        tv_q80 = (TextView) view.findViewById(R.id.tv_q80);
        tv_q81 = (TextView) view.findViewById(R.id.tv_q81);
        tv_q82 = (TextView) view.findViewById(R.id.tv_q82);
        tv_q83 = (TextView) view.findViewById(R.id.tv_q83);
        tv_q84 = (TextView) view.findViewById(R.id.tv_q84);
        tv_q85 = (TextView) view.findViewById(R.id.tv_q85);
        tv_q86 = (TextView) view.findViewById(R.id.tv_q86);
        tv_q87 = (TextView) view.findViewById(R.id.tv_q87);
        tv_q88_a = (TextView) view.findViewById(R.id.tv_q88_a);
        tv_q88_b_a = (TextView) view.findViewById(R.id.tv_q88_b_a);
        tv_q88_b_b = (TextView) view.findViewById(R.id.tv_q88_b_b);
        tv_q88_b_c = (TextView) view.findViewById(R.id.tv_q88_b_c);
        tv_q88_b_d = (TextView) view.findViewById(R.id.tv_q88_b_d);
        tv_q89 = (TextView) view.findViewById(R.id.tv_q89);
        tv_q90 = (TextView) view.findViewById(R.id.tv_q90);
        tv_q91 = (TextView) view.findViewById(R.id.tv_q91);
        tv_q92 = (TextView) view.findViewById(R.id.tv_q92);
        tv_q93 = (TextView) view.findViewById(R.id.tv_q93);
        tv_q94 = (TextView) view.findViewById(R.id.tv_q94);
        tv_q95 = (TextView) view.findViewById(R.id.tv_q95);

        tv_q96_a = (TextView) view.findViewById(R.id.tv_q96_a);
        tv_q96_b = (TextView) view.findViewById(R.id.tv_q96_b);
        tv_q96_c = (TextView) view.findViewById(R.id.tv_q96_c);
        tv_q96_d = (TextView) view.findViewById(R.id.tv_q96_d);
        tv_q96_e = (TextView) view.findViewById(R.id.tv_q96_e);
        tv_q96_f = (TextView) view.findViewById(R.id.tv_q96_f);
        tv_q96_g = (TextView) view.findViewById(R.id.tv_q96_g);
        tv_q96_h = (TextView) view.findViewById(R.id.tv_q96_h);
        tv_q96_i = (TextView) view.findViewById(R.id.tv_q96_i);
        tv_q96_j = (TextView) view.findViewById(R.id.tv_q96_j);
        tv_q96_k = (TextView) view.findViewById(R.id.tv_q96_k);
        tv_q96_l = (TextView) view.findViewById(R.id.tv_q96_l);
        tv_q96_m = (TextView) view.findViewById(R.id.tv_q96_m);
        tv_q96_n = (TextView) view.findViewById(R.id.tv_q96_n);
        tv_q96_o = (TextView) view.findViewById(R.id.tv_q96_o);
        tv_q96_p = (TextView) view.findViewById(R.id.tv_q96_p);
        tv_q97 = (TextView) view.findViewById(R.id.tv_q97);
        tv_q98 = (TextView) view.findViewById(R.id.tv_q98);
        tv_q99 = (TextView) view.findViewById(R.id.tv_q99);
        tv_q100 = (TextView) view.findViewById(R.id.tv_q100);
        tv_q101_a = (TextView) view.findViewById(R.id.tv_q101_a);
        tv_q101_b = (TextView) view.findViewById(R.id.tv_q101_b);
        tv_q101_c = (TextView) view.findViewById(R.id.tv_q101_c);
        tv_q101_d = (TextView) view.findViewById(R.id.tv_q101_d);
        tv_q101_e = (TextView) view.findViewById(R.id.tv_q101_e);
        tv_q101_f = (TextView) view.findViewById(R.id.tv_q101_f);
        tv_q101_g = (TextView) view.findViewById(R.id.tv_q101_g);
        tv_q101_h = (TextView) view.findViewById(R.id.tv_q101_h);
        tv_q101_i = (TextView) view.findViewById(R.id.tv_q101_i);
        tv_q101_j = (TextView) view.findViewById(R.id.tv_q101_j);
        tv_q101_k = (TextView) view.findViewById(R.id.tv_q101_k);
        tv_q101_l = (TextView) view.findViewById(R.id.tv_q101_l);
        tv_q102 = (TextView) view.findViewById(R.id.tv_q102);
        tv_q103 = (TextView) view.findViewById(R.id.tv_q103);
        tv_q104 = (TextView) view.findViewById(R.id.tv_q104);
        tv_q105 = (TextView) view.findViewById(R.id.tv_q105);

        et_q80_a = (EditText) view.findViewById(R.id.et_q80_a);
        et_q80_b = (EditText) view.findViewById(R.id.et_q80_b);
        et_q83_a = (EditText) view.findViewById(R.id.et_q83_a);
        et_q83_b = (EditText) view.findViewById(R.id.et_q83_b);


        et_q96_p = (EditText) view.findViewById(R.id.et_q96_p);
        et_q101_l = (EditText) view.findViewById(R.id.et_q101_l);
        et_q103 = (EditText) view.findViewById(R.id.et_q103);
        et_q104_a = (EditText) view.findViewById(R.id.et_q104_a);
        et_q104_b = (EditText) view.findViewById(R.id.et_q104_b);
        et_q104_c = (EditText) view.findViewById(R.id.et_q104_c);

        et_q105_a = (EditText) view.findViewById(R.id.et_q105_a);
        et_q105_b = (EditText) view.findViewById(R.id.et_q105_b);
        et_q105_c = (EditText) view.findViewById(R.id.et_q105_c);
        et_q105_d = (EditText) view.findViewById(R.id.et_q105_d);

        rg_q81 = (RadioGroup) view.findViewById(R.id.rg_q81);
        rg_q81.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               tv_q81.setError(null);
                rb_q81 = (RadioButton) view.findViewById(rg_q81.getCheckedRadioButtonId());

            }
        });

        rg_q82 = (RadioGroup) view.findViewById(R.id.rg_q82);
        rg_q82.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q82.setError(null);
                rb_q82 = (RadioButton) view.findViewById(rg_q82.getCheckedRadioButtonId());

            }
        });

        rg_q84 = (RadioGroup) view.findViewById(R.id.rg_q84);
        rg_q84.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q84.setError(null);
                rb_q84 = (RadioButton) view.findViewById(rg_q84.getCheckedRadioButtonId());

            }
        });

        rg_q85 = (RadioGroup) view.findViewById(R.id.rg_q85);
        rg_q85.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q85.setError(null);
                rb_q85 = (RadioButton) view.findViewById(rg_q85.getCheckedRadioButtonId());

            }
        });

        rg_q86 = (RadioGroup) view.findViewById(R.id.rg_q86);
        rg_q86.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q86.setError(null);
                rb_q86 = (RadioButton) view.findViewById(rg_q86.getCheckedRadioButtonId());

            }
        });

        rg_q87 = (RadioGroup) view.findViewById(R.id.rg_q87);
        rg_q87.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q87.setError(null);
                rb_q87 = (RadioButton) view.findViewById(rg_q87.getCheckedRadioButtonId());

            }
        });

        rg_q88_a = (RadioGroup) view.findViewById(R.id.rg_q88_a);
        rg_q88_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q88_a.setError(null);
                rb_q88_a = (RadioButton) view.findViewById(rg_q88_a.getCheckedRadioButtonId());

                if(rb_q88_a.getTag().toString().equalsIgnoreCase("4")){

                    ll_q88_b.setVisibility(View.GONE);
                    ll_q89.setVisibility(View.GONE);
                    ll_q90.setVisibility(View.GONE);
                    ll_q91.setVisibility(View.GONE);
                    ll_q92.setVisibility(View.GONE);


                }else {

                    ll_q88_b.setVisibility(View.VISIBLE);
                    ll_q89.setVisibility(View.GONE);
                    ll_q90.setVisibility(View.GONE);
                    ll_q91.setVisibility(View.VISIBLE);
                    ll_q92.setVisibility(View.VISIBLE);


                }



            }
        });

        rg_q88_b_a = (RadioGroup) view.findViewById(R.id.rg_q88_b_a);
        rg_q88_b_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q88_b_a.setError(null);
                rb_q88_b_a = (RadioButton) view.findViewById(rg_q88_b_a.getCheckedRadioButtonId());

                if(rb_q88_b_a.getTag().toString().equalsIgnoreCase("2")){
                    ll_q89.setVisibility(View.VISIBLE);
                }else {
                    ll_q89.setVisibility(View.GONE);
                }

                if(rb_q88_b_a.getTag().toString().equalsIgnoreCase("2") ||
                        rb_q88_b_a.getTag().toString().equalsIgnoreCase("3") ){
                    a = true;

                }else {
                    a = false;
                }

            }
        });

        rg_q88_b_b = (RadioGroup) view.findViewById(R.id.rg_q88_b_b);
        rg_q88_b_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q88_b_b.setError(null);
                rb_q88_b_b = (RadioButton) view.findViewById(rg_q88_b_b.getCheckedRadioButtonId());

                if(rb_q88_b_b.getTag().toString().equalsIgnoreCase("2")){
                    ll_q90.setVisibility(View.VISIBLE);
                }else {
                    ll_q90.setVisibility(View.GONE);
                }

                if(rb_q88_b_b.getTag().toString().equalsIgnoreCase("2") ||
                        rb_q88_b_b.getTag().toString().equalsIgnoreCase("3") ){
                    b = true;

                }else {
                    b = false;
                }

            }
        });

        rg_q88_b_c = (RadioGroup) view.findViewById(R.id.rg_q88_b_c);
        rg_q88_b_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q88_b_c.setError(null);
                rb_q88_b_c = (RadioButton) view.findViewById(rg_q88_b_c.getCheckedRadioButtonId());

                if(rb_q88_b_c.getTag().toString().equalsIgnoreCase("2") ||
                        rb_q88_b_c.getTag().toString().equalsIgnoreCase("3") ){

                            ll_q91.setVisibility(View.VISIBLE);
                        q88 = true;
                }else {

                    q88 = false;
                            ll_q91.setVisibility(View.GONE);
                }

                if(rb_q88_b_c.getTag().toString().equalsIgnoreCase("2") ||
                        rb_q88_b_c.getTag().toString().equalsIgnoreCase("3") ){
                    c = true;

                }else {
                    c = false;
                }


            }
        });

        rg_q88_b_d = (RadioGroup) view.findViewById(R.id.rg_q88_b_d);
        rg_q88_b_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q88_b_d.setError(null);
                rb_q88_b_d = (RadioButton) view.findViewById(rg_q88_b_d.getCheckedRadioButtonId());

                if(rb_q88_b_d.getTag().toString().equalsIgnoreCase("2") ||
                        rb_q88_b_d.getTag().toString().equalsIgnoreCase("3") ){
                    d = true;

                }else {
                    d = false;
                }

                if((rb_q88_b_d.getTag().toString().equalsIgnoreCase("2") ||
                rb_q88_b_c.getTag().toString().equalsIgnoreCase("3")) && q88){

                    ll_q91.setVisibility(View.VISIBLE);
                }else {
                    ll_q91.setVisibility(View.GONE);
                }

                if(a && b && c && d){
                    ll_q92.setVisibility(View.VISIBLE);
                }else {
                    ll_q92.setVisibility(View.GONE);
                }

            }
        });

        if(ll_q89.getVisibility()==View.VISIBLE){

            rg_q89 = (RadioGroup) view.findViewById(R.id.rg_q89);
            rg_q89.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    tv_q89.setError(null);
                    rb_q89 = (RadioButton) view.findViewById(rg_q89.getCheckedRadioButtonId());

                }
            });

        }


        rg_q90 = (RadioGroup) view.findViewById(R.id.rg_q90);
        rg_q90.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q90.setError(null);
                rb_q90 = (RadioButton) view.findViewById(rg_q90.getCheckedRadioButtonId());

            }
        });

        rg_q91 = (RadioGroup) view.findViewById(R.id.rg_q91);
        rg_q91.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q91.setError(null);
                rb_q91 = (RadioButton) view.findViewById(rg_q91.getCheckedRadioButtonId());

            }
        });

        rg_q92 = (RadioGroup) view.findViewById(R.id.rg_q92);
        rg_q92.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q92.setError(null);
                rb_q92 = (RadioButton) view.findViewById(rg_q92.getCheckedRadioButtonId());

            }
        });

        rg_q93 = (RadioGroup) view.findViewById(R.id.rg_q93);
        rg_q93.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q93.setError(null);
                rb_q93 = (RadioButton) view.findViewById(rg_q93.getCheckedRadioButtonId());

            }
        });

        rg_q94 = (RadioGroup) view.findViewById(R.id.rg_q94);
        rg_q94.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q94.setError(null);
                rb_q94 = (RadioButton) view.findViewById(rg_q94.getCheckedRadioButtonId());

            }
        });

        rg_q95 = (RadioGroup) view.findViewById(R.id.rg_q95);
        rg_q95.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q95.setError(null);
                rb_q95 = (RadioButton) view.findViewById(rg_q95.getCheckedRadioButtonId());

            }
        });

        rg_q96_a = (RadioGroup) view.findViewById(R.id.rg_q96_a);
        rg_q96_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_a.setError(null);
                rb_q96_a = (RadioButton) view.findViewById(rg_q96_a.getCheckedRadioButtonId());

            }
        });


        rg_q96_b = (RadioGroup) view.findViewById(R.id.rg_q96_b);
        rg_q96_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_b.setError(null);
                rb_q96_b = (RadioButton) view.findViewById(rg_q96_b.getCheckedRadioButtonId());

            }
        });


        rg_q96_c = (RadioGroup) view.findViewById(R.id.rg_q96_c);
        rg_q96_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_c.setError(null);
                rb_q96_c = (RadioButton) view.findViewById(rg_q96_c.getCheckedRadioButtonId());

            }
        });


        rg_q96_d = (RadioGroup) view.findViewById(R.id.rg_q96_d);
        rg_q96_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_d.setError(null);
                rb_q96_d = (RadioButton) view.findViewById(rg_q96_d.getCheckedRadioButtonId());

            }
        });


        rg_q96_e = (RadioGroup) view.findViewById(R.id.rg_q96_e);
        rg_q96_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_e.setError(null);
                rb_q96_e = (RadioButton) view.findViewById(rg_q96_e.getCheckedRadioButtonId());

            }
        });

        rg_q96_f = (RadioGroup) view.findViewById(R.id.rg_q96_f);
        rg_q96_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_f.setError(null);
                rb_q96_f = (RadioButton) view.findViewById(rg_q96_f.getCheckedRadioButtonId());

            }
        });


        rg_q96_g = (RadioGroup) view.findViewById(R.id.rg_q96_g);
        rg_q96_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_g.setError(null);
                rb_q96_g = (RadioButton) view.findViewById(rg_q96_g.getCheckedRadioButtonId());

            }
        });


        rg_q96_h = (RadioGroup) view.findViewById(R.id.rg_q96_h);
        rg_q96_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_h.setError(null);
                rb_q96_h = (RadioButton) view.findViewById(rg_q96_h.getCheckedRadioButtonId());

            }
        });


        rg_q96_i = (RadioGroup) view.findViewById(R.id.rg_q96_i);
        rg_q96_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_i.setError(null);
                rb_q96_i = (RadioButton) view.findViewById(rg_q96_i.getCheckedRadioButtonId());

            }
        });


        rg_q96_j = (RadioGroup) view.findViewById(R.id.rg_q96_j);
        rg_q96_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_j.setError(null);
                rb_q96_j = (RadioButton) view.findViewById(rg_q96_j.getCheckedRadioButtonId());

            }
        });


        rg_q96_k = (RadioGroup) view.findViewById(R.id.rg_q96_k);
        rg_q96_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_k.setError(null);
                rb_q96_k = (RadioButton) view.findViewById(rg_q96_k.getCheckedRadioButtonId());

            }
        });


        rg_q96_l = (RadioGroup) view.findViewById(R.id.rg_q96_l);
        rg_q96_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_l.setError(null);
                rb_q96_l = (RadioButton) view.findViewById(rg_q96_l.getCheckedRadioButtonId());

            }
        });

        rg_q96_m = (RadioGroup) view.findViewById(R.id.rg_q96_m);
        rg_q96_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_m.setError(null);
                rb_q96_m = (RadioButton) view.findViewById(rg_q96_m.getCheckedRadioButtonId());

            }
        });


        rg_q96_n = (RadioGroup) view.findViewById(R.id.rg_q96_n);
        rg_q96_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_n.setError(null);
                rb_q96_n = (RadioButton) view.findViewById(rg_q96_n.getCheckedRadioButtonId());

            }
        });


        rg_q96_o = (RadioGroup) view.findViewById(R.id.rg_q96_o);
        rg_q96_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_o.setError(null);
                rb_q96_o = (RadioButton) view.findViewById(rg_q96_o.getCheckedRadioButtonId());

            }
        });


        rg_q96_p = (RadioGroup) view.findViewById(R.id.rg_q96_p);
        rg_q96_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q96_p.setError(null);
                et_q96_p.setError(null);
                rb_q96_p = (RadioButton) view.findViewById(rg_q96_p.getCheckedRadioButtonId());

                if(rb_q96_p.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                    et_q96_p.setVisibility(View.VISIBLE);

                }else {

                    et_q96_p.setVisibility(View.GONE);
                }

            }
        });


        rg_q97 = (RadioGroup) view.findViewById(R.id.rg_q97);
        rg_q97.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q97.setError(null);
                rb_q97 = (RadioButton) view.findViewById(rg_q97.getCheckedRadioButtonId());

                if(rb_q97.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                    ll_q98.setVisibility(View.GONE);
                    ll_q99.setVisibility(View.GONE);

                }else {

                    ll_q98.setVisibility(View.VISIBLE);
                    ll_q99.setVisibility(View.VISIBLE);
                }

            }
        });


        rg_q98 = (RadioGroup) view.findViewById(R.id.rg_q98);
        rg_q98.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q98.setError(null);
                rb_q98 = (RadioButton) view.findViewById(rg_q98.getCheckedRadioButtonId());

                if(rb_q98.getTag().toString().equalsIgnoreCase(ContantsValues.NO)){
                    ll_q99.setVisibility(View.GONE);
                    ll_q100.setVisibility(View.GONE);
                    ll_q101.setVisibility(View.GONE);
                }else {

                    ll_q99.setVisibility(View.VISIBLE);
                    ll_q100.setVisibility(View.VISIBLE);
                    ll_q101.setVisibility(View.VISIBLE);

                }


            }
        });


        rg_q99 = (RadioGroup) view.findViewById(R.id.rg_q99);
        rg_q99.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q99.setError(null);
                rb_q99 = (RadioButton) view.findViewById(rg_q99.getCheckedRadioButtonId());


                ll_q100.setVisibility(View.GONE);
                ll_q101.setVisibility(View.GONE);
              /*
                if(rb_q99.getTag().toString().equalsIgnoreCase("n")){


                }else {


                    ll_q100.setVisibility(View.VISIBLE);
                    ll_q101.setVisibility(View.VISIBLE);

                }
*/

            }
        });

        rg_q100 = (RadioGroup) view.findViewById(R.id.rg_q100);
        rg_q100.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q100.setError(null);
                rb_q100 = (RadioButton) view.findViewById(rg_q100.getCheckedRadioButtonId());

                if(rb_q100.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                    ll_q101.setVisibility(View.GONE);
                }else {
                    ll_q101.setVisibility(View.VISIBLE);

                }

            }
        });



        rg_q101_a = (RadioGroup) view.findViewById(R.id.rg_q101_a);
        rg_q101_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_a.setError(null);
                rb_q101_a = (RadioButton) view.findViewById(rg_q101_a.getCheckedRadioButtonId());

            }
        });

        rg_q101_b = (RadioGroup) view.findViewById(R.id.rg_q101_b);
        rg_q101_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_b.setError(null);
                rb_q101_b = (RadioButton) view.findViewById(rg_q101_b.getCheckedRadioButtonId());

            }
        });


        rg_q101_c = (RadioGroup) view.findViewById(R.id.rg_q101_c);
        rg_q101_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_c.setError(null);
                rb_q101_c = (RadioButton) view.findViewById(rg_q101_c.getCheckedRadioButtonId());

            }
        });


        rg_q101_d = (RadioGroup) view.findViewById(R.id.rg_q101_d);
        rg_q101_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_d.setError(null);
                rb_q101_d = (RadioButton) view.findViewById(rg_q101_d.getCheckedRadioButtonId());

            }
        });



        rg_q101_e = (RadioGroup) view.findViewById(R.id.rg_q101_e);
        rg_q101_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_e.setError(null);
                rb_q101_e = (RadioButton) view.findViewById(rg_q101_e.getCheckedRadioButtonId());

            }
        });


        rg_q101_f = (RadioGroup) view.findViewById(R.id.rg_q101_f);
        rg_q101_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_f.setError(null);
                rb_q101_f = (RadioButton) view.findViewById(rg_q101_f.getCheckedRadioButtonId());

            }
        });



        rg_q101_g = (RadioGroup) view.findViewById(R.id.rg_q101_g);
        rg_q101_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_g.setError(null);
                rb_q101_g = (RadioButton) view.findViewById(rg_q101_g.getCheckedRadioButtonId());

            }
        });



        rg_q101_h = (RadioGroup) view.findViewById(R.id.rg_q101_h);
        rg_q101_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_h.setError(null);
                rb_q101_h = (RadioButton) view.findViewById(rg_q101_h.getCheckedRadioButtonId());

            }
        });



        rg_q101_i = (RadioGroup) view.findViewById(R.id.rg_q101_i);
        rg_q101_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_i.setError(null);
                rb_q101_i = (RadioButton) view.findViewById(rg_q101_i.getCheckedRadioButtonId());

            }
        });



        rg_q101_j = (RadioGroup) view.findViewById(R.id.rg_q101_j);
        rg_q101_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_j.setError(null);
                rb_q101_j = (RadioButton) view.findViewById(rg_q101_j.getCheckedRadioButtonId());

            }
        });

        rg_q101_k = (RadioGroup) view.findViewById(R.id.rg_q101_k);
        rg_q101_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_k.setError(null);
                rb_q101_k = (RadioButton) view.findViewById(rg_q101_k.getCheckedRadioButtonId());

            }
        });

        rg_q101_l = (RadioGroup) view.findViewById(R.id.rg_q101_l);
        rg_q101_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q101_l.setError(null);
                et_q101_l.setError(null);
                rb_q101_l = (RadioButton) view.findViewById(rg_q101_l.getCheckedRadioButtonId());

                if(rb_q101_l.getTag().toString().equalsIgnoreCase("yes")){

                    et_q101_l.setVisibility(View.VISIBLE);

                }else {

                    et_q101_l.setVisibility(View.GONE);
                }

            }
        });

        rg_q102 = (RadioGroup) view.findViewById(R.id.rg_q102);
        rg_q102.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q102.setError(null);
                rb_q102 = (RadioButton) view.findViewById(rg_q102.getCheckedRadioButtonId());

                if(rb_q102.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                    ll_q103_105.setVisibility(View.GONE);
                }else {
                    ll_q103_105.setVisibility(View.VISIBLE);
                }


            }
        });

        btn_submit = (Button) view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    myCustomeDialog();

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

        tv_engText.setText("You successfully filled CRF3B Now fill CRF3C");
        tv_RomanEngText.setText("Apny CRF3B bhar lia h ab ap CRF3c bharay");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               // SendDataToServer.sendCrf3bForm(CRF3bActivity.formCrf3bDTO);
            CRF3bActivity.formCrf3bDTO.setQ106(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
            CRF3bActivity.formsCrf2AndCrf3All.setCrf3bStatus(Constants.COMPLETED);
            CRF3bActivity.formsCrf2AndCrf3All.setFormCrf3bDTO(CRF3bActivity.formCrf3bDTO);
            //CRF3bActivity.formCrf3bDTO.getPregnantWoman().;

                startActivity(new Intent(getActivity(), CRF3cActivity.class).putExtra("forms",new Gson().toJson(CRF3bActivity.formsCrf2AndCrf3All)));
                getActivity().finish();

            }
        });

        dialog.show();

    }

    public boolean validation(){

      boolean  validation = true;

        if (getTextFromField(et_q80_a, tv_q80).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ80a(getTextFromField(et_q80_a, tv_q80));
        }

        if (getTextFromField(et_q80_b, tv_q80).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ80b(getTextFromField(et_q80_b, tv_q80));
        }

        if (isRBCheckedThree(rg_q81, rb_q81, tv_q81).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ81(isRBCheckedThree(rg_q81, rb_q81, tv_q81));
        }


        if (isRBCheckedThree(rg_q82, rb_q82, tv_q82).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ82(isRBCheckedThree(rg_q82, rb_q82, tv_q82));
        }

        if (getTextFromField(et_q83_a, tv_q83).equals("")) {

            validation = false;
        } else {
            if(getTextFromField(et_q83_a, tv_q83).contains(".")){
                CRF3bActivity.formCrf3bDTO.setQ83a(getTextFromField(et_q83_a, tv_q83));

            }else {
                et_q83_a.setError("Please enter decimal value");
                validation = false;

            }

        }

        if (getTextFromField(et_q83_b, tv_q83).equals("")) {
            validation = false;
        } else {
            if(getTextFromField(et_q83_b, tv_q83).contains(".")){
                CRF3bActivity.formCrf3bDTO.setQ83b(getTextFromField(et_q83_b, tv_q83));

            }else {
                et_q83_b.setError("Please enter decimal value");
                validation = false;

            }
        }

        if (isRBCheckedThree(rg_q84, rb_q84, tv_q84).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ84(isRBCheckedThree(rg_q84, rb_q84, tv_q84));
        }


        if (isRBCheckedThree(rg_q85, rb_q85, tv_q85).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ85(isRBCheckedThree(rg_q85, rb_q85, tv_q85));
        }

        if (isRBCheckedThree(rg_q86, rb_q86, tv_q86).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ86(isRBCheckedThree(rg_q86, rb_q86, tv_q86));
        }

        if (isRBCheckedThree(rg_q87, rb_q87, tv_q87).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ87(isRBCheckedThree(rg_q87, rb_q87, tv_q87));
        }


        if (isRBCheckedThree(rg_q88_a, rb_q88_a, tv_q88_a).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ88a(isRBCheckedThree(rg_q88_a, rb_q88_a, tv_q88_a));
        }

        if(ll_q88_b.getVisibility()==View.VISIBLE){


            if (isRBCheckedThree(rg_q88_b_a, rb_q88_b_a, tv_q88_b_a).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ88ba(isRBCheckedThree(rg_q88_b_a, rb_q88_b_a, tv_q88_b_a));
            }

            if (isRBCheckedThree(rg_q88_b_b, rb_q88_b_b, tv_q88_b_b).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ88bb(isRBCheckedThree(rg_q88_b_b, rb_q88_b_b, tv_q88_b_b));
            }

            if (isRBCheckedThree(rg_q88_b_c, rb_q88_b_c, tv_q88_b_c).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ88bc(isRBCheckedThree(rg_q88_b_c, rb_q88_b_c, tv_q88_b_c));
            }

            if (isRBCheckedThree(rg_q88_b_d, rb_q88_b_d, tv_q88_b_d).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ88bd(isRBCheckedThree(rg_q88_b_d, rb_q88_b_d, tv_q88_b_d));
            }
        }


        if(ll_q89.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q89, rb_q89, tv_q89).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ89(isRBCheckedThree(rg_q89, rb_q89, tv_q89));
            }

        }

        if(ll_q90.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q90, rb_q90, tv_q90).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ90(isRBCheckedThree(rg_q90, rb_q90, tv_q90));
            }
        }


        if(ll_q91.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q91, rb_q91, tv_q91).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ91(isRBCheckedThree(rg_q91, rb_q91, tv_q91));
            }
        }

        if(ll_q92.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q92, rb_q92, tv_q92).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ92(isRBCheckedThree(rg_q92, rb_q92, tv_q92));
            }
        }


        if (isRBCheckedThree(rg_q93, rb_q93, tv_q93).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ93(isRBCheckedThree(rg_q93, rb_q93, tv_q93));
        }

        if (isRBCheckedThree(rg_q94, rb_q94, tv_q94).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ94(isRBCheckedThree(rg_q94, rb_q94, tv_q94));
        }

        if (isRBCheckedThree(rg_q95, rb_q95, tv_q95).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ95(isRBCheckedThree(rg_q95, rb_q95, tv_q95));
        }

        if (isRBCheckedThree(rg_q96_a, rb_q96_a, tv_q96_a).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96a(isRBCheckedThree(rg_q96_a, rb_q96_a, tv_q96_a));
        }

        if (isRBCheckedThree(rg_q96_b, rb_q96_b, tv_q96_b).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96b(isRBCheckedThree(rg_q96_b, rb_q96_b, tv_q96_b));
        }

        if (isRBCheckedThree(rg_q96_c, rb_q96_c, tv_q96_c).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96c(isRBCheckedThree(rg_q96_c, rb_q96_c, tv_q96_c));
        }


        if (isRBCheckedThree(rg_q96_d, rb_q96_d, tv_q96_d).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96d(isRBCheckedThree(rg_q96_d, rb_q96_d, tv_q96_d));
        }


        if (isRBCheckedThree(rg_q96_e, rb_q96_e, tv_q96_e).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96e(isRBCheckedThree(rg_q96_e, rb_q96_e, tv_q96_e));
        }


        if (isRBCheckedThree(rg_q96_f, rb_q96_f, tv_q96_f).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96f(isRBCheckedThree(rg_q96_f, rb_q96_f, tv_q96_f));
        }


        if (isRBCheckedThree(rg_q96_g, rb_q96_g, tv_q96_g).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96g(isRBCheckedThree(rg_q96_g, rb_q96_g, tv_q96_g));
        }


        if (isRBCheckedThree(rg_q96_h, rb_q96_h, tv_q96_h).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96h(isRBCheckedThree(rg_q96_h, rb_q96_h, tv_q96_h));
        }

        if (isRBCheckedThree(rg_q96_i, rb_q96_i, tv_q96_i).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96i(isRBCheckedThree(rg_q96_i, rb_q96_i, tv_q96_i));
        }

        if (isRBCheckedThree(rg_q96_j, rb_q96_j, tv_q96_j).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96j(isRBCheckedThree(rg_q96_j, rb_q96_j, tv_q96_j));
        }

        if (isRBCheckedThree(rg_q96_k, rb_q96_k, tv_q96_k).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96k(isRBCheckedThree(rg_q96_k, rb_q96_k, tv_q96_k));
        }

        if (isRBCheckedThree(rg_q96_l, rb_q96_l, tv_q96_l).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96l(isRBCheckedThree(rg_q96_l, rb_q96_l, tv_q96_l));
        }

        if (isRBCheckedThree(rg_q96_m, rb_q96_m, tv_q96_m).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96m(isRBCheckedThree(rg_q96_m, rb_q96_m, tv_q96_m));
        }

        if (isRBCheckedThree(rg_q96_n, rb_q96_n, tv_q96_n).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96n(isRBCheckedThree(rg_q96_n, rb_q96_n, tv_q96_n));
        }

        if (isRBCheckedThree(rg_q96_o, rb_q96_o, tv_q96_o).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96o(isRBCheckedThree(rg_q96_o, rb_q96_o, tv_q96_o));
        }


        if (getEditText(rg_q96_p, rb_q96_p, et_q96_p, tv_q96_p, ContantsValues.YES,"","","").equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ96p(getEditText(rg_q96_p, rb_q96_p, et_q96_p, tv_q96_p, ContantsValues.YES,"","",""));
        }


        if (isRBCheckedThree(rg_q97, rb_q97, tv_q97).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ97(isRBCheckedThree(rg_q97, rb_q97, tv_q97));
        }

        if(ll_q98.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q98, rb_q98, tv_q98).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ98(isRBCheckedThree(rg_q98, rb_q98, tv_q98));
            }

        }


        if(ll_q99.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q99, rb_q99, tv_q99).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ99(isRBCheckedThree(rg_q99, rb_q99, tv_q99));
            }
        }

        if(ll_q100.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q100, rb_q100, tv_q100).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ100(isRBCheckedThree(rg_q100, rb_q100, tv_q100));
            }

        }

        if(ll_q101.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q101_a, rb_q101_a, tv_q101_a).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101a(isRBCheckedThree(rg_q101_a, rb_q101_a, tv_q101_a));
            }

            if (isRBCheckedThree(rg_q101_b, rb_q101_b, tv_q101_b).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101b(isRBCheckedThree(rg_q101_b, rb_q101_b, tv_q101_b));
            }

            if (isRBCheckedThree(rg_q101_c, rb_q101_c, tv_q101_c).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101c(isRBCheckedThree(rg_q101_c, rb_q101_c, tv_q101_c));
            }

            if (isRBCheckedThree(rg_q101_d, rb_q101_d, tv_q101_d).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101d(isRBCheckedThree(rg_q101_d, rb_q101_d, tv_q101_d));
            }

            if (isRBCheckedThree(rg_q101_e, rb_q101_e, tv_q101_e).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101e(isRBCheckedThree(rg_q101_e, rb_q101_e, tv_q101_e));
            }

            if (isRBCheckedThree(rg_q101_f, rb_q101_f, tv_q101_f).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101f(isRBCheckedThree(rg_q101_f, rb_q101_f, tv_q101_f));
            }

            if (isRBCheckedThree(rg_q101_g, rb_q101_g, tv_q101_g).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101g(isRBCheckedThree(rg_q101_g, rb_q101_g, tv_q101_g));
            }

            if (isRBCheckedThree(rg_q101_h, rb_q101_h, tv_q101_h).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101h(isRBCheckedThree(rg_q101_h, rb_q101_h, tv_q101_h));
            }

            if (isRBCheckedThree(rg_q101_i, rb_q101_i, tv_q101_i).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101i(isRBCheckedThree(rg_q101_i, rb_q101_i, tv_q101_i));
            }

            if (isRBCheckedThree(rg_q101_j, rb_q101_j, tv_q101_j).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101j(isRBCheckedThree(rg_q101_j, rb_q101_j, tv_q101_j));
            }

            if (isRBCheckedThree(rg_q101_k, rb_q101_k, tv_q101_k).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101k(isRBCheckedThree(rg_q101_k, rb_q101_k, tv_q101_k));
            }

            if (getEditText(rg_q101_l, rb_q101_l, et_q101_l, tv_q101_l, ContantsValues.YES,"","","").equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ101l(getEditText(rg_q101_l, rb_q101_l, et_q101_l, tv_q101_l, ContantsValues.YES,"","",""));
            }


        }



        if (isRBCheckedThree(rg_q102, rb_q102, tv_q102).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ102(isRBCheckedThree(rg_q102, rb_q102, tv_q102));
        }

        if(ll_q103_105.getVisibility()==View.VISIBLE){


            if (getTextFromField(et_q103, tv_q103).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ103(getTextFromField(et_q103, tv_q103));
            }


            if (getTextFromField(et_q104_a, tv_q104).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ104a(getTextFromField(et_q104_a, tv_q104));
            }

            if (getTextFromField(et_q104_b, tv_q104).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ104b(getTextFromField(et_q104_b, tv_q104));
            }

            if (getTextFromField(et_q104_c, tv_q104).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ104c(getTextFromField(et_q104_c, tv_q104));
            }

            if (getTextFromField(et_q105_a, tv_q105).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ105a(getTextFromField(et_q105_a, tv_q105));
            }

            if (getTextFromField(et_q105_b, tv_q105).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ105b(getTextFromField(et_q105_b, tv_q105));
            }

            if (getTextFromField(et_q105_c, tv_q105).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ105c(getTextFromField(et_q105_c, tv_q105));
            }

            if (getTextFromField(et_q105_d, tv_q105).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ105d(getTextFromField(et_q105_d, tv_q105));
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
