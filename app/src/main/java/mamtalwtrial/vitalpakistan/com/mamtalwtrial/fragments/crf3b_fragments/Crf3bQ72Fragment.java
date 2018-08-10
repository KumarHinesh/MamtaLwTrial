package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;

public class Crf3bQ72Fragment extends Fragment {

    LinearLayout ll_q73, ll_q75, ll_q76, ll_q77_q78;

    TextView tv_q72, tv_q73_a, tv_q73_b, tv_q73_c, tv_q73_d, tv_q73_e, tv_q73_f, tv_q73_g, tv_q73_h,
                tv_q73_i, tv_q73_j, tv_q73_k, tv_q73_l, tv_q73_m, tv_q73_n, tv_q73_o, tv_q73_p, tv_q73_q, tv_q73_r,
                 tv_q73_s, tv_q73_t, tv_q73_u, tv_q73_v, tv_q73_w, tv_q73_x, tv_q73_y, tv_q73_z, tv_q74, tv_q75_a, tv_q75_b, tv_q75_c,
                    tv_q75_d, tv_q75_e, tv_q75_f, tv_q75_g, tv_q75_h, tv_q75_i, tv_q75_j, tv_q75_k, tv_q75_l, tv_q75_m , tv_q76,
            tv_q77_a, tv_q77_b, tv_q77_c, tv_q77_d, tv_q77_e, tv_q77_f, tv_q77_g, tv_q77_h,
            tv_q77_i, tv_q78, tv_q79;


    EditText et_q73_z, et_q77_i, et_q78_a, et_q78_b;
    RadioGroup  rg_q73_a, rg_q73_b, rg_q73_c, rg_q73_d, rg_q73_e, rg_q73_f, rg_q73_g, rg_q73_h,
                rg_q73_i, rg_q73_j, rg_q73_k, rg_q73_l, rg_q73_m, rg_q73_n, rg_q73_o, rg_q73_p, rg_q73_q, rg_q73_r,
                rg_q73_s, rg_q73_t, rg_q73_u, rg_q73_v, rg_q73_w, rg_q73_x, rg_q73_y, rg_q73_z, rg_q77_i, rg_q72, rg_q74,
                rg_q75_a, rg_q75_b, rg_q75_c, rg_q75_d, rg_q75_e, rg_q75_f, rg_q75_g, rg_q75_h,
                rg_q75_i, rg_q75_j, rg_q75_k, rg_q75_l, rg_q75_m, rg_q76, rg_q77_a, rg_q77_b, rg_q77_c, rg_q77_d, rg_q77_e, rg_q77_f,
                    rg_q77_g, rg_q77_h, rg_q79;

    RadioButton rb_q72, rb_q73_a, rb_q73_b, rb_q73_c, rb_q73_d, rb_q73_e, rb_q73_f, rb_q73_g, rb_q73_h,
                rb_q73_i, rb_q73_j, rb_q73_k, rb_q73_l, rb_q73_m, rb_q73_n, rb_q73_o, rb_q73_p, rb_q73_q, rb_q73_r,
                rb_q73_s, rb_q73_t, rb_q73_u, rb_q73_v, rb_q73_w, rb_q73_x, rb_q73_y, rb_q73_z, rb_q74 ,rb_q77_i, rb_q75_a,
                rb_q75_b, rb_q75_c, rb_q75_d, rb_q75_e, rb_q75_f, rb_q75_g, rb_q75_h, rb_q75_i, rb_q75_j, rb_q75_k, rb_q75_l
            , rb_q75_m, rb_q76, rb_q77_a, rb_q77_b, rb_q77_c, rb_q77_d, rb_q77_e, rb_q77_f, rb_q77_g, rb_q77_h, rb_q79;

    Button btn_submit;

    ScrollView scrolView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         final View view = inflater.inflate(R.layout.fragment_crf3b_q72, container, false);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        et_q78_a = (EditText) view.findViewById(R.id.et_q78_a);
        et_q78_b = (EditText) view.findViewById(R.id.et_q78_b);

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
        tv_q73_k = (TextView) view.findViewById(R.id.tv_q73_k);
        tv_q73_l = (TextView) view.findViewById(R.id.tv_q73_l);
        tv_q73_m = (TextView) view.findViewById(R.id.tv_q73_m);
        tv_q73_n = (TextView) view.findViewById(R.id.tv_q73_n);
        tv_q73_o = (TextView) view.findViewById(R.id.tv_q73_o);
        tv_q73_p = (TextView) view.findViewById(R.id.tv_q73_p);
        tv_q73_q = (TextView) view.findViewById(R.id.tv_q73_q);
        tv_q73_r = (TextView) view.findViewById(R.id.tv_q73_r);
        tv_q73_s = (TextView) view.findViewById(R.id.tv_q73_s);
        tv_q73_t = (TextView) view.findViewById(R.id.tv_q73_t);
        tv_q73_u = (TextView) view.findViewById(R.id.tv_q73_u);
        tv_q73_v = (TextView) view.findViewById(R.id.tv_q73_v);
        tv_q73_w = (TextView) view.findViewById(R.id.tv_q73_w);
        tv_q73_x = (TextView) view.findViewById(R.id.tv_q73_x);
        tv_q73_y = (TextView) view.findViewById(R.id.tv_q73_y);
        tv_q73_z = (TextView) view.findViewById(R.id.tv_q73_z);
        tv_q74 = (TextView) view.findViewById(R.id.tv_q74);

        tv_q75_a = (TextView) view.findViewById(R.id.tv_q75_a);
        tv_q75_b = (TextView) view.findViewById(R.id.tv_q75_b);
        tv_q75_c = (TextView) view.findViewById(R.id.tv_q75_c);
        tv_q75_d = (TextView) view.findViewById(R.id.tv_q75_d);
        tv_q75_e = (TextView) view.findViewById(R.id.tv_q75_e);
        tv_q75_f = (TextView) view.findViewById(R.id.tv_q75_f);
        tv_q75_g = (TextView) view.findViewById(R.id.tv_q75_g);
        tv_q75_h = (TextView) view.findViewById(R.id.tv_q75_h);
        tv_q75_i = (TextView) view.findViewById(R.id.tv_q75_i);
        tv_q75_j = (TextView) view.findViewById(R.id.tv_q75_j);
        tv_q75_k = (TextView) view.findViewById(R.id.tv_q75_k);
        tv_q75_l = (TextView) view.findViewById(R.id.tv_q75_l);
        tv_q75_m = (TextView) view.findViewById(R.id.tv_q75_m);
        tv_q76 = (TextView) view.findViewById(R.id.tv_q76);
        tv_q77_a = (TextView) view.findViewById(R.id.tv_q77_a);
        tv_q77_b = (TextView) view.findViewById(R.id.tv_q77_b);
        tv_q77_c = (TextView) view.findViewById(R.id.tv_q77_c);
        tv_q77_d = (TextView) view.findViewById(R.id.tv_q77_d);
        tv_q77_e = (TextView) view.findViewById(R.id.tv_q77_e);
        tv_q77_f = (TextView) view.findViewById(R.id.tv_q77_f);
        tv_q77_g = (TextView) view.findViewById(R.id.tv_q77_g);
        tv_q77_h = (TextView) view.findViewById(R.id.tv_q77_h);
        tv_q77_i = (TextView) view.findViewById(R.id.tv_q77_i);
        tv_q78 = (TextView) view.findViewById(R.id.tv_q78);
        tv_q79 = (TextView) view.findViewById(R.id.tv_q79);



        ll_q73 = (LinearLayout) view.findViewById(R.id.ll_q73);
        ll_q75 = (LinearLayout) view.findViewById(R.id.ll_q75);
        ll_q76 = (LinearLayout) view.findViewById(R.id.ll_q76);
        ll_q77_q78 = (LinearLayout) view.findViewById(R.id.ll_q77_q78);



        rg_q72 = (RadioGroup) view.findViewById(R.id.rg_q72);
        rg_q72.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q72 = (RadioButton) view.findViewById(rg_q72.getCheckedRadioButtonId());
                tv_q72.setError(null);

                if(rb_q72.getTag().toString().equals("2") || rb_q72.getTag().toString().equals("9") )
                    ll_q73.setVisibility(View.GONE);
                else
                    ll_q73.setVisibility(View.VISIBLE);
            }
        });


        rg_q73_a = (RadioGroup) view.findViewById(R.id.rg_q73_a);
        rg_q73_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_a.setError(null);
                rb_q73_a = (RadioButton) view.findViewById(rg_q73_a.getCheckedRadioButtonId());
            }
        });

        rg_q73_b = (RadioGroup) view.findViewById(R.id.rg_q73_b);
        rg_q73_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_b.setError(null);
                rb_q73_b = (RadioButton) view.findViewById(rg_q73_b.getCheckedRadioButtonId());

            }
        });

        rg_q73_c = (RadioGroup) view.findViewById(R.id.rg_q73_c);
        rg_q73_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_c.setError(null);
                rb_q73_c = (RadioButton) view.findViewById(rg_q73_c.getCheckedRadioButtonId());
            }
        });

        rg_q73_d = (RadioGroup) view.findViewById(R.id.rg_q73_d);
        rg_q73_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_d.setError(null);
                rb_q73_d = (RadioButton) view.findViewById(rg_q73_d.getCheckedRadioButtonId());
            }
        });

        rg_q73_e = (RadioGroup) view.findViewById(R.id.rg_q73_e);
        rg_q73_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_e.setError(null);
                rb_q73_e = (RadioButton) view.findViewById(rg_q73_e.getCheckedRadioButtonId());
            }
        });

        rg_q73_f = (RadioGroup) view.findViewById(R.id.rg_q73_f);
        rg_q73_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_f.setError(null);
                rb_q73_f = (RadioButton) view.findViewById(rg_q73_f.getCheckedRadioButtonId());
            }
        });

        rg_q73_g = (RadioGroup) view.findViewById(R.id.rg_q73_g);
        rg_q73_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_g.setError(null);
                rb_q73_g = (RadioButton) view.findViewById(rg_q73_g.getCheckedRadioButtonId());
            }
        });

        rg_q73_h = (RadioGroup) view.findViewById(R.id.rg_q73_h);
        rg_q73_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_h.setError(null);
                rb_q73_h = (RadioButton) view.findViewById(rg_q73_h.getCheckedRadioButtonId());
            }
        });

        rg_q73_i = (RadioGroup) view.findViewById(R.id.rg_q73_i);
        rg_q73_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_i.setError(null);
                rb_q73_i = (RadioButton) view.findViewById(rg_q73_i.getCheckedRadioButtonId());
            }
        });

        rg_q73_j = (RadioGroup) view.findViewById(R.id.rg_q73_j);
        rg_q73_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_j.setError(null);
                rb_q73_j = (RadioButton) view.findViewById(rg_q73_j.getCheckedRadioButtonId());
            }
        });

        rg_q73_k = (RadioGroup) view.findViewById(R.id.rg_q73_k);
        rg_q73_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_k.setError(null);
                rb_q73_k = (RadioButton) view.findViewById(rg_q73_k.getCheckedRadioButtonId());
            }
        });

        rg_q73_l = (RadioGroup) view.findViewById(R.id.rg_q73_l);
        rg_q73_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_l.setError(null);
                rb_q73_l = (RadioButton) view.findViewById(rg_q73_l.getCheckedRadioButtonId());
            }
        });

        rg_q73_m = (RadioGroup) view.findViewById(R.id.rg_q73_m);
        rg_q73_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_m.setError(null);
                rb_q73_m = (RadioButton) view.findViewById(rg_q73_m.getCheckedRadioButtonId());
            }
        });

        rg_q73_n = (RadioGroup) view.findViewById(R.id.rg_q73_n);
        rg_q73_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_n.setError(null);
                rb_q73_n = (RadioButton) view.findViewById(rg_q73_n.getCheckedRadioButtonId());
            }
        });

        rg_q73_o = (RadioGroup) view.findViewById(R.id.rg_q73_o);
        rg_q73_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_o.setError(null);
                rb_q73_o = (RadioButton) view.findViewById(rg_q73_o.getCheckedRadioButtonId());
            }
        });

        rg_q73_p = (RadioGroup) view.findViewById(R.id.rg_q73_p);
        rg_q73_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_p.setError(null);
                rb_q73_p = (RadioButton) view.findViewById(rg_q73_p.getCheckedRadioButtonId());
            }
        });

        rg_q73_q = (RadioGroup) view.findViewById(R.id.rg_q73_q);
        rg_q73_q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_q.setError(null);
                rb_q73_q = (RadioButton) view.findViewById(rg_q73_q.getCheckedRadioButtonId());
            }
        });

        rg_q73_r = (RadioGroup) view.findViewById(R.id.rg_q73_r);
        rg_q73_r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_r.setError(null);
                rb_q73_r = (RadioButton) view.findViewById(rg_q73_r.getCheckedRadioButtonId());
            }
        });

        rg_q73_s = (RadioGroup) view.findViewById(R.id.rg_q73_s);
        rg_q73_s.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_s.setError(null);
                rb_q73_s = (RadioButton) view.findViewById(rg_q73_s.getCheckedRadioButtonId());
            }
        });

        rg_q73_t = (RadioGroup) view.findViewById(R.id.rg_q73_t);
        rg_q73_t.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_t.setError(null);
                rb_q73_t = (RadioButton) view.findViewById(rg_q73_t.getCheckedRadioButtonId());
            }
        });

        rg_q73_u = (RadioGroup) view.findViewById(R.id.rg_q73_u);
        rg_q73_u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_u.setError(null);
                rb_q73_u = (RadioButton) view.findViewById(rg_q73_u.getCheckedRadioButtonId());
            }
        });

        rg_q73_v = (RadioGroup) view.findViewById(R.id.rg_q73_v);
        rg_q73_v.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_v.setError(null);
                rb_q73_v = (RadioButton) view.findViewById(rg_q73_v.getCheckedRadioButtonId());
            }
        });

        rg_q73_w = (RadioGroup) view.findViewById(R.id.rg_q73_w);
        rg_q73_w.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_w.setError(null);
                rb_q73_w = (RadioButton) view.findViewById(rg_q73_w.getCheckedRadioButtonId());
            }
        });

        rg_q73_x = (RadioGroup) view.findViewById(R.id.rg_q73_x);
        rg_q73_x.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_x.setError(null);
                rb_q73_x = (RadioButton) view.findViewById(rg_q73_x.getCheckedRadioButtonId());
            }
        });

        rg_q73_y = (RadioGroup) view.findViewById(R.id.rg_q73_y);
        rg_q73_y.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_y.setError(null);
                rb_q73_y = (RadioButton) view.findViewById(rg_q73_y.getCheckedRadioButtonId());
            }
        });


        et_q73_z = (EditText) view.findViewById(R.id.et_q73_z);
        et_q77_i = (EditText) view.findViewById(R.id.et_q77_i);

        rg_q73_z = (RadioGroup) view.findViewById(R.id.rg_q73_z);
        rg_q73_z.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q73_z.setError(null);
                rb_q73_z = (RadioButton) view.findViewById(rg_q73_z.getCheckedRadioButtonId());

                if(rb_q73_z.getTag().toString().equalsIgnoreCase("1")){
                    et_q73_z.setVisibility(View.VISIBLE);
                }else {
                    et_q73_z.setVisibility(View.INVISIBLE);
                }
            }
        });


        rg_q74 = (RadioGroup) view.findViewById(R.id.rg_q74);
        rg_q74.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q74 = (RadioButton) view.findViewById(rg_q74.getCheckedRadioButtonId());
                tv_q74.setError(null);

                if(rb_q74.getTag().toString().equals("2") || rb_q74.getTag().toString().equals("un") ){

                    ll_q75.setVisibility(View.GONE);
                    ll_q76.setVisibility(View.GONE);
                    ll_q77_q78.setVisibility(View.GONE);
                }

                else{
                    ll_q75.setVisibility(View.VISIBLE);
                    ll_q76.setVisibility(View.VISIBLE);
                    ll_q77_q78.setVisibility(View.VISIBLE);
                }
            }
        });


        rg_q75_a = (RadioGroup) view.findViewById(R.id.rg_q75_a);
        rg_q75_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_a.setError(null);
                rb_q75_a = (RadioButton) view.findViewById(rg_q75_a.getCheckedRadioButtonId());
            }
        });

    rg_q75_b = (RadioGroup) view.findViewById(R.id.rg_q75_b);
        rg_q75_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_b.setError(null);
                rb_q75_b = (RadioButton) view.findViewById(rg_q75_b.getCheckedRadioButtonId());

            }
        });

        rg_q75_c = (RadioGroup) view.findViewById(R.id.rg_q75_c);
        rg_q75_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_c.setError(null);
                rb_q75_c = (RadioButton) view.findViewById(rg_q75_c.getCheckedRadioButtonId());
            }
        });

        rg_q75_d = (RadioGroup) view.findViewById(R.id.rg_q75_d);
        rg_q75_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_d.setError(null);
                rb_q75_d = (RadioButton) view.findViewById(rg_q75_d.getCheckedRadioButtonId());
            }
        });

        rg_q75_e = (RadioGroup) view.findViewById(R.id.rg_q75_e);
        rg_q75_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_e.setError(null);
                rb_q75_e = (RadioButton) view.findViewById(rg_q75_e.getCheckedRadioButtonId());
            }
        });

        rg_q75_f = (RadioGroup) view.findViewById(R.id.rg_q75_f);
        rg_q75_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_f.setError(null);
                rb_q75_f = (RadioButton) view.findViewById(rg_q75_f.getCheckedRadioButtonId());
            }
        });

        rg_q75_g = (RadioGroup) view.findViewById(R.id.rg_q75_g);
        rg_q75_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_g.setError(null);
                rb_q75_g = (RadioButton) view.findViewById(rg_q75_g.getCheckedRadioButtonId());
            }
        });

        rg_q75_h = (RadioGroup) view.findViewById(R.id.rg_q75_h);
        rg_q75_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_h.setError(null);
                rb_q75_h = (RadioButton) view.findViewById(rg_q75_h.getCheckedRadioButtonId());
            }
        });

        rg_q75_i = (RadioGroup) view.findViewById(R.id.rg_q75_i);
        rg_q75_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_i.setError(null);
                rb_q75_i = (RadioButton) view.findViewById(rg_q75_i.getCheckedRadioButtonId());
            }
        });

        rg_q75_j = (RadioGroup) view.findViewById(R.id.rg_q75_j);
        rg_q75_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_j.setError(null);
                rb_q75_j = (RadioButton) view.findViewById(rg_q75_j.getCheckedRadioButtonId());
            }
        });

        rg_q75_k = (RadioGroup) view.findViewById(R.id.rg_q75_k);
        rg_q75_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_k.setError(null);
                rb_q75_k = (RadioButton) view.findViewById(rg_q75_k.getCheckedRadioButtonId());
            }
        });

        rg_q75_l = (RadioGroup) view.findViewById(R.id.rg_q75_l);
        rg_q75_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_l.setError(null);
                rb_q75_l = (RadioButton) view.findViewById(rg_q75_l.getCheckedRadioButtonId());
            }
        });

        rg_q75_m = (RadioGroup) view.findViewById(R.id.rg_q75_m);
        rg_q75_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q75_m.setError(null);
                rb_q75_m = (RadioButton) view.findViewById(rg_q75_m.getCheckedRadioButtonId());
            }
        });


        rg_q76 = (RadioGroup) view.findViewById(R.id.rg_q76);
        rg_q76.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q76.setError(null);
                rb_q76 = (RadioButton) view.findViewById(rg_q76.getCheckedRadioButtonId());

                if(rb_q76.getTag().toString().equalsIgnoreCase("2") || rb_q76.getTag().toString().equalsIgnoreCase("9")){

                    ll_q77_q78.setVisibility(View.GONE);

                }else {

                    ll_q77_q78.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q77_a = (RadioGroup) view.findViewById(R.id.rg_q77_a);
        rg_q77_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q77_a.setError(null);
                rb_q77_a = (RadioButton) view.findViewById(rg_q77_a.getCheckedRadioButtonId());

            }
        });

        rg_q77_b = (RadioGroup) view.findViewById(R.id.rg_q77_b);
        rg_q77_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q77_b.setError(null);
                rb_q77_b = (RadioButton) view.findViewById(rg_q77_b.getCheckedRadioButtonId());

            }
        });


        rg_q77_c = (RadioGroup) view.findViewById(R.id.rg_q77_c);
        rg_q77_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q77_c.setError(null);
                rb_q77_c = (RadioButton) view.findViewById(rg_q77_c.getCheckedRadioButtonId());

            }
        });


        rg_q77_d = (RadioGroup) view.findViewById(R.id.rg_q77_d);
        rg_q77_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q77_d.setError(null);
                rb_q77_d = (RadioButton) view.findViewById(rg_q77_d.getCheckedRadioButtonId());

            }
        });


        rg_q77_e = (RadioGroup) view.findViewById(R.id.rg_q77_e);
        rg_q77_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q77_e.setError(null);
                rb_q77_e = (RadioButton) view.findViewById(rg_q77_e.getCheckedRadioButtonId());

            }
        });


        rg_q77_f = (RadioGroup) view.findViewById(R.id.rg_q77_f);
        rg_q77_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q77_f.setError(null);
                rb_q77_f = (RadioButton) view.findViewById(rg_q77_f.getCheckedRadioButtonId());

            }
        });


        rg_q77_g = (RadioGroup) view.findViewById(R.id.rg_q77_g);
        rg_q77_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q77_g.setError(null);
                rb_q77_g = (RadioButton) view.findViewById(rg_q77_g.getCheckedRadioButtonId());

            }
        });

        rg_q77_h = (RadioGroup) view.findViewById(R.id.rg_q77_h);
        rg_q77_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q77_h.setError(null);
                rb_q77_h = (RadioButton) view.findViewById(rg_q77_h.getCheckedRadioButtonId());

            }
        });


        rg_q77_i = (RadioGroup) view.findViewById(R.id.rg_q77_i);
        rg_q77_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q77_i = (RadioButton) view.findViewById(rg_q77_i.getCheckedRadioButtonId());

                if(rb_q77_i.getTag().toString().equalsIgnoreCase("1")){
                    et_q77_i.setVisibility(View.VISIBLE);
                }else {
                    et_q77_i.setVisibility(View.INVISIBLE);
                }
            }
        });


        rg_q79 = (RadioGroup) view.findViewById(R.id.rg_q79);
        rg_q79.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q79.setError(null);
                rb_q79 = (RadioButton) view.findViewById(rg_q79.getCheckedRadioButtonId());

            }
        });


        btn_submit = (Button) view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(checkValidation()){


                    Crf3b80Fragment crf3b80Fragment = new Crf3b80Fragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf3b, crf3b80Fragment);
                    fragmentTransaction.commit();

                }


            }
        });
        return view;
    }


    public boolean checkValidation() {
        boolean validation = true;

        if (isRBCheckedThree(rg_q72, rb_q72, tv_q72).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ72(isRBCheckedThree(rg_q72, rb_q72, tv_q72));
        }

        if(ll_q73.getVisibility()==View.VISIBLE) {

            if (isRBCheckedThree(rg_q73_a, rb_q73_a, tv_q73_a).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73a(isRBCheckedThree(rg_q73_a, rb_q73_a, tv_q73_a));
            }

            if (isRBCheckedThree(rg_q73_b, rb_q73_b, tv_q73_b).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73b(isRBCheckedThree(rg_q73_b, rb_q73_b, tv_q73_b));
            }

            if (isRBCheckedThree(rg_q73_c, rb_q73_c, tv_q73_c).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73c(isRBCheckedThree(rg_q73_c, rb_q73_c, tv_q73_c));
            }

            if (isRBCheckedThree(rg_q73_d, rb_q73_d, tv_q73_d).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73d(isRBCheckedThree(rg_q73_d, rb_q73_d, tv_q73_d));
            }

            if (isRBCheckedThree(rg_q73_e, rb_q73_e, tv_q73_e).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73e(isRBCheckedThree(rg_q73_e, rb_q73_e, tv_q73_e));
            }

            if (isRBCheckedThree(rg_q73_f, rb_q73_f, tv_q73_f).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73f(isRBCheckedThree(rg_q73_f, rb_q73_f, tv_q73_f));
            }

            if (isRBCheckedThree(rg_q73_g, rb_q73_g, tv_q73_g).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73g(isRBCheckedThree(rg_q73_g, rb_q73_g, tv_q73_g));
            }

            if (isRBCheckedThree(rg_q73_h, rb_q73_h, tv_q73_h).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73h(isRBCheckedThree(rg_q73_h, rb_q73_h, tv_q73_h));
            }

            if (isRBCheckedThree(rg_q73_i, rb_q73_i, tv_q73_i).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73i(isRBCheckedThree(rg_q73_i, rb_q73_i, tv_q73_i));
            }

            if (isRBCheckedThree(rg_q73_j, rb_q73_j, tv_q73_j).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73j(isRBCheckedThree(rg_q73_j, rb_q73_j, tv_q73_j));
            }

            if (isRBCheckedThree(rg_q73_k, rb_q73_k, tv_q73_k).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73k(isRBCheckedThree(rg_q73_k, rb_q73_k, tv_q73_k));
            }

            if (isRBCheckedThree(rg_q73_l, rb_q73_l, tv_q73_l).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73l(isRBCheckedThree(rg_q73_l, rb_q73_l, tv_q73_l));
            }

            if (isRBCheckedThree(rg_q73_m, rb_q73_m, tv_q73_m).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73m(isRBCheckedThree(rg_q73_m, rb_q73_m, tv_q73_m));
            }

            if (isRBCheckedThree(rg_q73_n, rb_q73_n, tv_q73_n).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73n(isRBCheckedThree(rg_q73_n, rb_q73_n, tv_q73_n));
            }

            if (isRBCheckedThree(rg_q73_o, rb_q73_o, tv_q73_o).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73o(isRBCheckedThree(rg_q73_o, rb_q73_o, tv_q73_o));
            }


            if (isRBCheckedThree(rg_q73_p, rb_q73_p, tv_q73_p).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73p(isRBCheckedThree(rg_q73_p, rb_q73_p, tv_q73_p));
            }

            if (isRBCheckedThree(rg_q73_q, rb_q73_q, tv_q73_q).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73q(isRBCheckedThree(rg_q73_q, rb_q73_q, tv_q73_q));
            }

            if (isRBCheckedThree(rg_q73_r, rb_q73_r, tv_q73_r).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73r(isRBCheckedThree(rg_q73_r, rb_q73_r, tv_q73_r));
            }

            if (isRBCheckedThree(rg_q73_s, rb_q73_s, tv_q73_s).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73s(isRBCheckedThree(rg_q73_s, rb_q73_s, tv_q73_s));
            }

            if (isRBCheckedThree(rg_q73_t, rb_q73_t, tv_q73_t).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73t(isRBCheckedThree(rg_q73_t, rb_q73_t, tv_q73_t));
            }

            if (isRBCheckedThree(rg_q73_u, rb_q73_u, tv_q73_u).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73u(isRBCheckedThree(rg_q73_u, rb_q73_u, tv_q73_u));
            }

            if (isRBCheckedThree(rg_q73_v, rb_q73_v, tv_q73_v).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73v(isRBCheckedThree(rg_q73_v, rb_q73_v, tv_q73_v));
            }

            if (isRBCheckedThree(rg_q73_w, rb_q73_w, tv_q73_w).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73w(isRBCheckedThree(rg_q73_w, rb_q73_w, tv_q73_w));
            }

            if (isRBCheckedThree(rg_q73_x, rb_q73_x, tv_q73_x).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73x(isRBCheckedThree(rg_q73_x, rb_q73_x, tv_q73_x));
            }

            if (isRBCheckedThree(rg_q73_y, rb_q73_y, tv_q73_y).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73y(isRBCheckedThree(rg_q73_y, rb_q73_y, tv_q73_y));
            }

           if (getEditText(rg_q73_z, rb_q73_z, et_q73_z, tv_q73_z, "1","","","").equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ73z(getEditText(rg_q73_z, rb_q73_z, et_q73_z, tv_q73_z, "1","","",""));
            }
        }
            if (isRBCheckedThree(rg_q74, rb_q74, tv_q74).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ74(isRBCheckedThree(rg_q74, rb_q74, tv_q74));
            }

        if(ll_q75.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q75_a, rb_q75_a, tv_q75_a).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75a(isRBCheckedThree(rg_q75_a, rb_q75_a, tv_q75_a));
                }

                if (isRBCheckedThree(rg_q75_b, rb_q75_b, tv_q75_b).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75b(isRBCheckedThree(rg_q75_b, rb_q75_b, tv_q75_b));
                }

                if (isRBCheckedThree(rg_q75_c, rb_q75_c, tv_q75_c).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75c(isRBCheckedThree(rg_q75_c, rb_q75_c, tv_q75_c));
                }

                if (isRBCheckedThree(rg_q75_d, rb_q75_d, tv_q75_d).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75d(isRBCheckedThree(rg_q75_d, rb_q75_d, tv_q75_d));
                }

                if (isRBCheckedThree(rg_q75_e, rb_q75_e, tv_q75_e).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75e(isRBCheckedThree(rg_q75_e, rb_q75_e, tv_q75_e));
                }

                if (isRBCheckedThree(rg_q75_f, rb_q75_f, tv_q75_f).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75f(isRBCheckedThree(rg_q75_f, rb_q75_f, tv_q75_f));
                }

                if (isRBCheckedThree(rg_q75_g, rb_q75_g, tv_q75_g).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75g(isRBCheckedThree(rg_q75_g, rb_q75_g, tv_q75_g));
                }

                if (isRBCheckedThree(rg_q75_h, rb_q75_h, tv_q75_h).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75h(isRBCheckedThree(rg_q75_h, rb_q75_h, tv_q75_h));
                }

                if (isRBCheckedThree(rg_q75_i, rb_q75_i, tv_q75_i).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75i(isRBCheckedThree(rg_q75_i, rb_q75_i, tv_q75_i));
                }

                if (isRBCheckedThree(rg_q75_j, rb_q75_j, tv_q75_j).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75j(isRBCheckedThree(rg_q75_j, rb_q75_j, tv_q75_j));
                }

                if (isRBCheckedThree(rg_q75_k, rb_q75_k, tv_q75_k).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75k(isRBCheckedThree(rg_q75_k, rb_q75_k, tv_q75_k));
                }

                if (isRBCheckedThree(rg_q75_l, rb_q75_l, tv_q75_l).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75l(isRBCheckedThree(rg_q75_l, rb_q75_l, tv_q75_l));
                }

                if (isRBCheckedThree(rg_q75_m, rb_q75_m, tv_q75_m).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ75m(isRBCheckedThree(rg_q75_m, rb_q75_m, tv_q75_m));
                }


            }

            if(ll_q76.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q76, rb_q76, tv_q76).equals("")) {
                    validation = false;
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ76(isRBCheckedThree(rg_q76, rb_q76, tv_q76));
                }

            }

       if(ll_q77_q78.getVisibility()==View.VISIBLE){

           if (isRBCheckedThree(rg_q77_a, rb_q77_a, tv_q77_a).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77a(isRBCheckedThree(rg_q77_a, rb_q77_a, tv_q77_a));
           }

           if (isRBCheckedThree(rg_q77_b, rb_q77_b, tv_q77_b).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77b(isRBCheckedThree(rg_q77_b, rb_q77_b, tv_q77_b));
           }

           if (isRBCheckedThree(rg_q77_c, rb_q77_c, tv_q77_c).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77c(isRBCheckedThree(rg_q77_c, rb_q77_c, tv_q77_c));
           }

           if (isRBCheckedThree(rg_q77_d, rb_q77_d, tv_q77_d).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77d(isRBCheckedThree(rg_q77_d, rb_q77_d, tv_q77_d));
           }

           if (isRBCheckedThree(rg_q77_e, rb_q77_e, tv_q77_e).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77e(isRBCheckedThree(rg_q77_e, rb_q77_e, tv_q77_e));
           }

           if (isRBCheckedThree(rg_q77_f, rb_q77_f, tv_q77_f).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77f(isRBCheckedThree(rg_q77_f, rb_q77_f, tv_q77_f));
           }

           if (isRBCheckedThree(rg_q77_g, rb_q77_g, tv_q77_g).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77g(isRBCheckedThree(rg_q77_g, rb_q77_g, tv_q77_g));
           }

           if (isRBCheckedThree(rg_q77_h, rb_q77_h, tv_q77_h).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77h(isRBCheckedThree(rg_q77_h, rb_q77_h, tv_q77_h));
           }

           if (getEditText(rg_q77_i, rb_q77_i, et_q77_i, tv_q77_i, "1","","","").equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ77i(getEditText(rg_q77_i, rb_q77_i, et_q77_i, tv_q77_i, "1","","",""));
           }

           if (getTextFromField(et_q78_a, tv_q78).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ78a(getTextFromField(et_q78_a, tv_q78));
           }

           if (getTextFromField(et_q78_b, tv_q78).equals("")) {
               validation = false;
           } else {
               CRF3bActivity.formCrf3bDTO.setQ78b(getTextFromField(et_q78_b, tv_q78));
           }


       }



        if (isRBCheckedThree(rg_q79, rb_q79, tv_q79).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ79(isRBCheckedThree(rg_q79, rb_q79, tv_q79));
        }

     return validation;
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
                    return editText.getText().toString();
                }
            }else {

                return rb.getTag().toString();
            }

        }
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
