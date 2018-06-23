package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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

public class Crf3bQ29Fragment extends Fragment {

    int x,y;

    ScrollView scrolView;

    Button btn_submit;

    String q29_a = "";
    String q29_b = "";
    String q29_c = "";
    String q29_d = "";
    String q29_e = "";
    String q30 = "";

    String q36_a = "";
    String q36_b = "";
    String q36_c = "";
    String q36_d = "";
    String q36_e = "";
    String q36_f = "";
    String q36_g = "";
    String q36_h = "";
    String q36_i = "";
    String q36_j = "";
    String q36_k = "";
    String q36_l = "";
    String q36_m = "";
    String q36_n = "";
    String q36_o = "";
    String q36_p = "";
    String q36_q = "";
    String q36_r = "";
    String q36_s = "";
    String q36_t = "";
    String q36_u = "";
    String q36_v = "";
    String q36_w = "";
    String q36_x = "";
    String q36_y = "";
    String q39_a = "";
    String q39_b = "";
    String q39_c = "";
    String q39_d = "";
    String q39_e = "";
    String q39_f = "";
    String q39_g = "";
    String q39_h = "";
    String q39_i = "";
    String q39_j = "";

    String q40_a = "";
    String q40_b = "";
    String q40_c = "";
    String q40_d = "";
    String q40_e = "";
    String q40_f = "";
    String q40_g = "";
    String q40_h = "";
    String q40_i = "";
    String q40_j = "";
    String q40_k = "";
    String q40_l = "";
    String q40_m = "";
    String q40_n = "";
    String q40_o = "";
    String q40_p = "";
    String q40_q = "";
    String q40_r = "";

    String q31 = "";
    String q34 = "";
    String q37 = "";
    String q38 = "";
    String q39 = "";
    String q41 = "";
    String q42 = "";
    String q43 = "";

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
            ,tv_q40_n, tv_q40_o, tv_q40_p, tv_q40_q, tv_q40_r, tv_q41, tv_q42;

    LinearLayout ll_q31_q33, ll_q38_q39, ll_q39;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       final View view =  inflater.inflate(R.layout.fragment_crf3bq29, container, false);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        ll_q31_q33 = (LinearLayout) view.findViewById(R.id.ll_q31_q33);
        ll_q38_q39 = (LinearLayout) view.findViewById(R.id.ll_q38_q39);
        ll_q39 = (LinearLayout) view.findViewById(R.id.ll_q39);

        tv_q29_a = (TextView) view.findViewById(R.id.tv_q29_a);
        tv_q29_b = (TextView) view.findViewById(R.id.tv_q29_b);
        tv_q29_c = (TextView) view.findViewById(R.id.tv_q29_c);
        tv_q29_d = (TextView) view.findViewById(R.id.tv_q29_d);
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

                    Crf3bQ44Fragment crf3bQ44Fragment = new Crf3bQ44Fragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf3b, crf3bQ44Fragment);
                    fragmentTransaction.commit();

                }


               /* if(q39.equalsIgnoreCase("y")){
                    CRF3bActivity.formCrf3bDTO.setQ39j(et_q39_j.getText().toString());
                }*/

               /* if(q40.equalsIgnoreCase("y")){
                    CRF3bActivity.formCrf3bDTO.setQ40r(et_q40_r.getText().toString());
                }*/
               /* if(q31.equalsIgnoreCase("8")){
                    CRF3bActivity.formCrf3bDTO.setQ31(et_q31.getText().toString());
                }*/
              /*  if(q42.equalsIgnoreCase("8")){
                    CRF3bActivity.formCrf3bDTO.setQ42(et_q42.getText().toString());
                }
                if(q38.equalsIgnoreCase("8")){
                    CRF3bActivity.formCrf3bDTO.setQ38(et_q38.getText().toString());
                }
                if(q43.equalsIgnoreCase("y")){
                    CRF3bActivity.formCrf3bDTO.setQ43k(et_q43_k.getText().toString());
                }
*/

  /*              CRF3bActivity.formCrf3bDTO.setQ32(et_q32.getText().toString());
                CRF3bActivity.formCrf3bDTO.setQ32(et_q33.getText().toString());
                CRF3bActivity.formCrf3bDTO.setQ35(et_q35.getText().toString());


*/

            }
        });


        rg_q29_a = (RadioGroup) view.findViewById(R.id.rg_q29_a);
        rg_q29_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_a = (RadioButton) view.findViewById(rg_q29_a.getCheckedRadioButtonId());
                q29_a = rb_q29_a.getTag().toString();
                tv_q29_a.setError(null);
            }
        });

        rg_q29_b = (RadioGroup) view.findViewById(R.id.rg_q29_b);
        rg_q29_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_b = (RadioButton) view.findViewById(rg_q29_b.getCheckedRadioButtonId());
                q29_b = rb_q29_b.getTag().toString();
                tv_q29_b.setError(null);
            }
        });

        rg_q29_c = (RadioGroup) view.findViewById(R.id.rg_q29_c);
        rg_q29_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_c = (RadioButton) view.findViewById(rg_q29_c.getCheckedRadioButtonId());
                q29_c = rb_q29_c.getTag().toString();
                tv_q29_c.setError(null);
            }
        });

        rg_q29_d = (RadioGroup) view.findViewById(R.id.rg_q29_d);
        rg_q29_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_d = (RadioButton) view.findViewById(rg_q29_d.getCheckedRadioButtonId());
                q29_d = rb_q29_d.getTag().toString();
                tv_q29_d.setError(null);
            }
        });

        rg_q29_e = (RadioGroup) view.findViewById(R.id.rg_q29_e);
        rg_q29_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q29_e = (RadioButton) view.findViewById(rg_q29_e.getCheckedRadioButtonId());
                et_q29_e.setError(null);
                //tv_q2.setError(null);
                if(rb_q29_e.getTag().toString().equalsIgnoreCase("y")){
                    et_q29_e.setVisibility(View.VISIBLE);
                    q29_e = rb_q29_e.getTag().toString();

                }else {
                    q29_e = rb_q29_e.getTag().toString();
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
                q30 = rb_q30.getTag().toString();
                ll_q31_q33.setVisibility(View.VISIBLE);

                if(q30.equalsIgnoreCase("n") || q30.equalsIgnoreCase("dk")){
                    ll_q31_q33.setVisibility(View.GONE);
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
                if(rb_q31.getTag().toString().equalsIgnoreCase("8")){
                    et_q31.setVisibility(View.VISIBLE);
                    q31 = rb_q31.getTag().toString();

                }else {
                    q31 = rb_q31.getTag().toString();
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
                q34 = rb_q34.getTag().toString();
            }
        });

        rg_q36_a = (RadioGroup) view.findViewById(R.id.rg_q36_a);
        rg_q36_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_a = (RadioButton) view.findViewById(rg_q36_a.getCheckedRadioButtonId());
                q36_a = rb_q36_a.getTag().toString();
                tv_q36_a.setError(null);            }
        });

        rg_q36_b = (RadioGroup) view.findViewById(R.id.rg_q36_b);
        rg_q36_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_b = (RadioButton) view.findViewById(rg_q36_b.getCheckedRadioButtonId());
                q36_b = rb_q36_b.getTag().toString();
                tv_q36_b.setError(null);
            }
        });

        rg_q36_c = (RadioGroup) view.findViewById(R.id.rg_q36_c);
        rg_q36_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_c = (RadioButton) view.findViewById(rg_q36_c.getCheckedRadioButtonId());
                q36_c = rb_q36_c.getTag().toString();
                tv_q36_c.setError(null);
            }
        });

        rg_q36_d = (RadioGroup) view.findViewById(R.id.rg_q36_d);
        rg_q36_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_d = (RadioButton) view.findViewById(rg_q36_d.getCheckedRadioButtonId());
                q36_d = rb_q36_d.getTag().toString();
                tv_q36_d.setError(null);
            }
        });

        rg_q36_e = (RadioGroup) view.findViewById(R.id.rg_q36_e);
        rg_q36_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_e = (RadioButton) view.findViewById(rg_q36_e.getCheckedRadioButtonId());
                q36_e = rb_q36_e.getTag().toString();
                tv_q36_e.setError(null);
            }
        });

        rg_q36_f = (RadioGroup) view.findViewById(R.id.rg_q36_f);
        rg_q36_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_f = (RadioButton) view.findViewById(rg_q36_f.getCheckedRadioButtonId());
                q36_f = rb_q36_f.getTag().toString();
                tv_q36_f.setError(null);
            }
        });

        rg_q36_g = (RadioGroup) view.findViewById(R.id.rg_q36_g);
        rg_q36_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_g = (RadioButton) view.findViewById(rg_q36_g.getCheckedRadioButtonId());
                q36_g = rb_q36_g.getTag().toString();
                tv_q36_g.setError(null);
            }
        });

        rg_q36_h = (RadioGroup) view.findViewById(R.id.rg_q36_h);
        rg_q36_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_h = (RadioButton) view.findViewById(rg_q36_h.getCheckedRadioButtonId());
                q36_h = rb_q36_h.getTag().toString();
                tv_q36_h.setError(null);
            }
        });

        rg_q36_i = (RadioGroup) view.findViewById(R.id.rg_q36_i);
        rg_q36_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_i = (RadioButton) view.findViewById(rg_q36_i.getCheckedRadioButtonId());
                q36_i = rb_q36_i.getTag().toString();
                tv_q36_i.setError(null);
            }
        });

        rg_q36_j = (RadioGroup) view.findViewById(R.id.rg_q36_j);
        rg_q36_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_j = (RadioButton) view.findViewById(rg_q36_j.getCheckedRadioButtonId());
                q36_j = rb_q36_j.getTag().toString();
                tv_q36_j.setError(null);
            }
        });

        rg_q36_k = (RadioGroup) view.findViewById(R.id.rg_q36_k);
        rg_q36_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_k = (RadioButton) view.findViewById(rg_q36_k.getCheckedRadioButtonId());
                q36_k = rb_q36_k.getTag().toString();
                tv_q36_k.setError(null);
            }
        });

        rg_q36_l = (RadioGroup) view.findViewById(R.id.rg_q36_l);
        rg_q36_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_l = (RadioButton) view.findViewById(rg_q36_l.getCheckedRadioButtonId());
                q36_l = rb_q36_l.getTag().toString();
                tv_q36_l.setError(null);
            }
        });

        rg_q36_m = (RadioGroup) view.findViewById(R.id.rg_q36_m);
        rg_q36_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_m = (RadioButton) view.findViewById(rg_q36_m.getCheckedRadioButtonId());
                q36_m = rb_q36_m.getTag().toString();
                tv_q36_m.setError(null);
            }
        });

        rg_q36_n = (RadioGroup) view.findViewById(R.id.rg_q36_n);
        rg_q36_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_n = (RadioButton) view.findViewById(rg_q36_n.getCheckedRadioButtonId());
                q36_n = rb_q36_n.getTag().toString();
                tv_q36_n.setError(null);
            }
        });

        rg_q36_o = (RadioGroup) view.findViewById(R.id.rg_q36_o);
        rg_q36_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_o = (RadioButton) view.findViewById(rg_q36_o.getCheckedRadioButtonId());
                q36_o = rb_q36_o.getTag().toString();
                tv_q36_o.setError(null);
            }
        });

        rg_q36_p = (RadioGroup) view.findViewById(R.id.rg_q36_p);
        rg_q36_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_p = (RadioButton) view.findViewById(rg_q36_p.getCheckedRadioButtonId());
                q36_p = rb_q36_p.getTag().toString();
                tv_q36_p.setError(null);
            }
        });

        rg_q36_q = (RadioGroup) view.findViewById(R.id.rg_q36_q);
        rg_q36_q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_q = (RadioButton) view.findViewById(rg_q36_q.getCheckedRadioButtonId());
                q36_q = rb_q36_q.getTag().toString();
                tv_q36_q.setError(null);
            }
        });

        rg_q36_r = (RadioGroup) view.findViewById(R.id.rg_q36_r);
        rg_q36_r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_r = (RadioButton) view.findViewById(rg_q36_r.getCheckedRadioButtonId());
                q36_r = rb_q36_r.getTag().toString();
                tv_q36_r.setError(null);
            }
        });

        rg_q36_s = (RadioGroup) view.findViewById(R.id.rg_q36_s);
        rg_q36_s.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_s = (RadioButton) view.findViewById(rg_q36_s.getCheckedRadioButtonId());
                q36_s = rb_q36_s.getTag().toString();
                tv_q36_s.setError(null);
            }
        });

        rg_q36_t = (RadioGroup) view.findViewById(R.id.rg_q36_t);
        rg_q36_t.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_t = (RadioButton) view.findViewById(rg_q36_t.getCheckedRadioButtonId());
                q36_t = rb_q36_t.getTag().toString();
                tv_q36_t.setError(null);
            }
        });

        rg_q36_u = (RadioGroup) view.findViewById(R.id.rg_q36_u);
        rg_q36_u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_u = (RadioButton) view.findViewById(rg_q36_u.getCheckedRadioButtonId());
                q36_u = rb_q36_u.getTag().toString();
                tv_q36_u.setError(null);
            }
        });

        rg_q36_v = (RadioGroup) view.findViewById(R.id.rg_q36_v);
        rg_q36_v.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_v = (RadioButton) view.findViewById(rg_q36_v.getCheckedRadioButtonId());
                q36_v = rb_q36_v.getTag().toString();
                tv_q36_v.setError(null);            }
        });

        rg_q36_w = (RadioGroup) view.findViewById(R.id.rg_q36_w);
        rg_q36_w.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_w = (RadioButton) view.findViewById(rg_q36_w.getCheckedRadioButtonId());
                q36_w = rb_q36_w.getTag().toString();
                tv_q36_w.setError(null);
            }
        });

        rg_q36_x = (RadioGroup) view.findViewById(R.id.rg_q36_x);
        rg_q36_x.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_x = (RadioButton) view.findViewById(rg_q36_x.getCheckedRadioButtonId());
                q36_x = rb_q36_x.getTag().toString();
                tv_q36_x.setError(null);
            }
        });

        rg_q36_y = (RadioGroup) view.findViewById(R.id.rg_q36_y);
        rg_q36_y.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q36_y = (RadioButton) view.findViewById(rg_q36_y.getCheckedRadioButtonId());

                if(rb_q36_y.getTag().toString().equalsIgnoreCase("y")){
                    et_q36_y.setVisibility(View.VISIBLE);
                    q36_y = rb_q36_y.getTag().toString();

                }else {
                    et_q36_y.setVisibility(View.GONE);
                    q36_y = rb_q36_y.getTag().toString();
                    //CRF3bActivity.formCrf3bDTO.setQ36y(rb_q36_y.getTag().toString());
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
                        || rb_q37.getTag().toString().equals("4")){
                    ll_q38_q39.setVisibility(View.GONE);
                    q37 = rb_q37.getTag().toString();

                }else {
                    q37 = rb_q37.getTag().toString();
                    ll_q38_q39.setVisibility(View.VISIBLE);
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

                ll_q39.setVisibility(View.GONE);

                if(rb_q38.getTag().toString().equals("6") || rb_q38.getTag().toString().equals("7") || rb_q38.getTag().toString().equals("9")){
                         ll_q39.setVisibility(View.GONE);

                    if(rb_q38.getTag().toString().equalsIgnoreCase("8")){

                        et_q38.setVisibility(View.VISIBLE);
                        q38 = rb_q38.getTag().toString();
                    }

                }
                else {
                    ll_q39.setVisibility(View.VISIBLE);
                    q38 = rb_q38.getTag().toString();
                    et_q38.setVisibility(View.GONE);
                }

            }
        });


        rg_q39_a = (RadioGroup) view.findViewById(R.id.rg_q39_a);
        rg_q39_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_a = (RadioButton) view.findViewById(rg_q39_a.getCheckedRadioButtonId());
                q39_a = rb_q39_a.getTag().toString();
                tv_q39_a.setError(null);            }
        });

        rg_q39_b = (RadioGroup) view.findViewById(R.id.rg_q39_b);
        rg_q39_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_b = (RadioButton) view.findViewById(rg_q39_b.getCheckedRadioButtonId());
                q39_b = rb_q39_b.getTag().toString();
                tv_q39_b.setError(null);
            }
        });

        rg_q39_c = (RadioGroup) view.findViewById(R.id.rg_q39_c);
        rg_q39_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_c = (RadioButton) view.findViewById(rg_q39_c.getCheckedRadioButtonId());
                q39_c = rb_q39_c.getTag().toString();
                tv_q39_c.setError(null);
            }
        });

        rg_q39_d = (RadioGroup) view.findViewById(R.id.rg_q39_d);
        rg_q39_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_d = (RadioButton) view.findViewById(rg_q39_d.getCheckedRadioButtonId());
                q39_d = rb_q39_d.getTag().toString();
                tv_q39_d.setError(null);
            }
        });

        rg_q39_e = (RadioGroup) view.findViewById(R.id.rg_q39_e);
        rg_q39_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_e = (RadioButton) view.findViewById(rg_q39_e.getCheckedRadioButtonId());
                q39_e = rb_q39_e.getTag().toString();
                tv_q39_e.setError(null);
            }
        });

        rg_q39_f = (RadioGroup) view.findViewById(R.id.rg_q39_f);
        rg_q39_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_f = (RadioButton) view.findViewById(rg_q39_f.getCheckedRadioButtonId());
                q39_f = rb_q39_f.getTag().toString();
                tv_q39_f.setError(null);
            }
        });

        rg_q39_g = (RadioGroup) view.findViewById(R.id.rg_q39_g);
        rg_q39_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_g = (RadioButton) view.findViewById(rg_q39_g.getCheckedRadioButtonId());
                q39_g = rb_q39_g.getTag().toString();
                tv_q39_g.setError(null);
            }
        });

        rg_q39_h = (RadioGroup) view.findViewById(R.id.rg_q39_h);
        rg_q39_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_h = (RadioButton) view.findViewById(rg_q39_h.getCheckedRadioButtonId());
                q39_h = rb_q39_h.getTag().toString();
                tv_q39_h.setError(null);
            }
        });

        rg_q39_i = (RadioGroup) view.findViewById(R.id.rg_q39_i);
        rg_q39_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_i = (RadioButton) view.findViewById(rg_q39_i.getCheckedRadioButtonId());
                q39_i = rb_q39_i.getTag().toString();
                tv_q39_i.setError(null);
            }
        });




        rg_q39_j = (RadioGroup) view.findViewById(R.id.rg_q39_j);
        rg_q39_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39_j = (RadioButton) view.findViewById(rg_q39_j.getCheckedRadioButtonId());

                if(rb_q39_j.getTag().toString().equalsIgnoreCase("y")){
                    et_q39_j.setVisibility(View.VISIBLE);
                    q39 = rb_q39_j.getTag().toString();

                }else {
                    et_q39_j.setVisibility(View.GONE);
                    CRF3bActivity.formCrf3bDTO.setQ39j(rb_q39_j.getTag().toString());
                }

            }
        });




        rg_q40_a = (RadioGroup) view.findViewById(R.id.rg_q40_a);
        rg_q40_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_a = (RadioButton) view.findViewById(rg_q40_a.getCheckedRadioButtonId());
                q40_a = rb_q40_a.getTag().toString();
                tv_q40_a.setError(null);            }
        });

        rg_q40_b = (RadioGroup) view.findViewById(R.id.rg_q40_b);
        rg_q40_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_b = (RadioButton) view.findViewById(rg_q40_b.getCheckedRadioButtonId());
                q40_b = rb_q40_b.getTag().toString();
                tv_q40_b.setError(null);
            }
        });

        rg_q40_c = (RadioGroup) view.findViewById(R.id.rg_q40_c);
        rg_q40_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_c = (RadioButton) view.findViewById(rg_q40_c.getCheckedRadioButtonId());
                q40_c = rb_q40_c.getTag().toString();
                tv_q40_c.setError(null);
            }
        });

        rg_q40_d = (RadioGroup) view.findViewById(R.id.rg_q40_d);
        rg_q40_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_d = (RadioButton) view.findViewById(rg_q40_d.getCheckedRadioButtonId());
                q40_d = rb_q40_d.getTag().toString();
                tv_q40_d.setError(null);
            }
        });

        rg_q40_e = (RadioGroup) view.findViewById(R.id.rg_q40_e);
        rg_q40_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_e = (RadioButton) view.findViewById(rg_q40_e.getCheckedRadioButtonId());
                q40_e = rb_q40_e.getTag().toString();
                tv_q40_e.setError(null);
            }
        });

        rg_q40_f = (RadioGroup) view.findViewById(R.id.rg_q40_f);
        rg_q40_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_f = (RadioButton) view.findViewById(rg_q40_f.getCheckedRadioButtonId());
                q40_f = rb_q40_f.getTag().toString();
                tv_q40_f.setError(null);
            }
        });

        rg_q40_g = (RadioGroup) view.findViewById(R.id.rg_q40_g);
        rg_q40_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_g = (RadioButton) view.findViewById(rg_q40_g.getCheckedRadioButtonId());
                q40_g = rb_q40_g.getTag().toString();
                tv_q40_g.setError(null);
            }
        });

        rg_q40_h = (RadioGroup) view.findViewById(R.id.rg_q40_h);
        rg_q40_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_h = (RadioButton) view.findViewById(rg_q40_h.getCheckedRadioButtonId());
                q40_h = rb_q40_h.getTag().toString();
                tv_q40_h.setError(null);
            }
        });

        rg_q40_i = (RadioGroup) view.findViewById(R.id.rg_q40_i);
        rg_q40_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_i = (RadioButton) view.findViewById(rg_q40_i.getCheckedRadioButtonId());
                q40_i = rb_q40_i.getTag().toString();
                tv_q40_i.setError(null);
            }
        });

        rg_q40_j = (RadioGroup) view.findViewById(R.id.rg_q40_j);
        rg_q40_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_j = (RadioButton) view.findViewById(rg_q40_j.getCheckedRadioButtonId());
                q40_j = rb_q40_j.getTag().toString();
                tv_q40_j.setError(null);
            }
        });

        rg_q40_k = (RadioGroup) view.findViewById(R.id.rg_q40_k);
        rg_q40_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_k = (RadioButton) view.findViewById(rg_q40_k.getCheckedRadioButtonId());
                q40_k = rb_q40_k.getTag().toString();
                tv_q40_k.setError(null);
            }
        });

        rg_q40_l = (RadioGroup) view.findViewById(R.id.rg_q40_l);
        rg_q40_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_l = (RadioButton) view.findViewById(rg_q40_l.getCheckedRadioButtonId());
                q40_l = rb_q40_l.getTag().toString();
                tv_q40_l.setError(null);
            }
        });

        rg_q40_m = (RadioGroup) view.findViewById(R.id.rg_q40_m);
        rg_q40_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_m = (RadioButton) view.findViewById(rg_q40_m.getCheckedRadioButtonId());
                q40_m = rb_q40_m.getTag().toString();
                tv_q40_m.setError(null);
            }
        });

        rg_q40_n = (RadioGroup) view.findViewById(R.id.rg_q40_n);
        rg_q40_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_n = (RadioButton) view.findViewById(rg_q40_n.getCheckedRadioButtonId());
                q40_n = rb_q40_n.getTag().toString();
                tv_q40_n.setError(null);
            }
        });

        rg_q40_o = (RadioGroup) view.findViewById(R.id.rg_q40_o);
        rg_q40_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_o = (RadioButton) view.findViewById(rg_q40_o.getCheckedRadioButtonId());
                q40_o = rb_q40_o.getTag().toString();
                tv_q40_o.setError(null);
            }
        });

        rg_q40_p = (RadioGroup) view.findViewById(R.id.rg_q40_p);
        rg_q40_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_p = (RadioButton) view.findViewById(rg_q40_p.getCheckedRadioButtonId());
                q40_p = rb_q40_p.getTag().toString();
                tv_q40_p.setError(null);
            }
        });

        rg_q40_q = (RadioGroup) view.findViewById(R.id.rg_q40_q);
        rg_q40_q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_q = (RadioButton) view.findViewById(rg_q40_q.getCheckedRadioButtonId());
                q40_q = rb_q40_q.getTag().toString();
                tv_q40_q.setError(null);
            }
        });




        rg_q40_r = (RadioGroup) view.findViewById(R.id.rg_q40_r);
        rg_q40_r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q40_r = (RadioButton) view.findViewById(rg_q40_r.getCheckedRadioButtonId());

                if(rb_q40_r.getTag().toString().equalsIgnoreCase("y")){
                    et_q40_r.setVisibility(View.VISIBLE);
                    q40_r = rb_q40_r.getTag().toString();

                }else {
                    et_q40_r.setVisibility(View.GONE);
                    q40_r = rb_q40_r.getTag().toString();
                    //CRF3bActivity.formCrf3bDTO.setQ36y(rb_q36_y.getTag().toString());
                }



            }
        });

        rg_q41 = (RadioGroup) view.findViewById(R.id.rg_q41);
        rg_q41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q41 = (RadioButton) view.findViewById(rg_q41.getCheckedRadioButtonId());
                q41 = rb_q41.getTag().toString();
                tv_q41.setError(null);

            }
        });

        rg_q42 = (RadioGroup) view.findViewById(R.id.rg_q42);
        rg_q42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q42 = (RadioButton) view.findViewById(rg_q42.getCheckedRadioButtonId());

                if(rb_q42.getTag().toString().equals("6") || rb_q42.getTag().toString().equals("7") ||
                            rb_q42.getTag().toString().equals("8")){

                    if(rb_q42.getTag().toString().equals("8")){

                        et_q42.setVisibility(View.VISIBLE);
                        q42 = rb_q42.getTag().toString();

                    }

                }else {
                    et_q42.setVisibility(View.GONE);
                    q42 = rb_q42.getTag().toString();
                    //CRF3bActivity.formCrf3bDTO.setQ36y(rb_q36_y.getTag().toString());
                }
            }
        });



        rg_q43_a = (RadioGroup) view.findViewById(R.id.rg_q43_a);
        rg_q43_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_a = (RadioButton) view.findViewById(rg_q43_a.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43a(rb_q43_a.getTag().toString());
            }
        });

        rg_q43_b = (RadioGroup) view.findViewById(R.id.rg_q43_b);
        rg_q43_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_b = (RadioButton) view.findViewById(rg_q43_b.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43b(rb_q43_b.getTag().toString());
            }
        });

        rg_q43_c = (RadioGroup) view.findViewById(R.id.rg_q43_c);
        rg_q43_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_c = (RadioButton) view.findViewById(rg_q43_c.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43c(rb_q43_c.getTag().toString());
            }
        });

        rg_q43_d = (RadioGroup) view.findViewById(R.id.rg_q43_d);
        rg_q43_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_d = (RadioButton) view.findViewById(rg_q43_d.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43d(rb_q43_d.getTag().toString());
            }
        });

        rg_q43_e = (RadioGroup) view.findViewById(R.id.rg_q43_e);
        rg_q43_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_e = (RadioButton) view.findViewById(rg_q43_e.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43e(rb_q43_e.getTag().toString());
            }
        });

        rg_q43_f = (RadioGroup) view.findViewById(R.id.rg_q43_f);
        rg_q43_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_f = (RadioButton) view.findViewById(rg_q43_f.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43f(rb_q43_f.getTag().toString());
            }
        });

        rg_q43_g = (RadioGroup) view.findViewById(R.id.rg_q43_g);
        rg_q43_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_g = (RadioButton) view.findViewById(rg_q43_g.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43g(rb_q43_g.getTag().toString());
            }
        });

        rg_q43_h = (RadioGroup) view.findViewById(R.id.rg_q43_h);
        rg_q43_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_h = (RadioButton) view.findViewById(rg_q43_h.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43h(rb_q43_h.getTag().toString());
            }
        });

        rg_q43_i = (RadioGroup) view.findViewById(R.id.rg_q43_i);
        rg_q43_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_i = (RadioButton) view.findViewById(rg_q43_i.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43i(rb_q43_i.getTag().toString());
            }
        });

        rg_q43_j = (RadioGroup) view.findViewById(R.id.rg_q43_j);
        rg_q43_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_j = (RadioButton) view.findViewById(rg_q43_j.getCheckedRadioButtonId());

                CRF3bActivity.formCrf3bDTO.setQ43j(rb_q43_j.getTag().toString());
            }
        });

        rg_q43_k = (RadioGroup) view.findViewById(R.id.rg_q43_k);
        rg_q43_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q43_k = (RadioButton) view.findViewById(rg_q43_k.getCheckedRadioButtonId());

                if(rb_q43_k.getTag().toString().equalsIgnoreCase("y")){
                    et_q43_k.setVisibility(View.VISIBLE);
                    q43 = rb_q43_k.getTag().toString();

                }else {
                    CRF3bActivity.formCrf3bDTO.setQ43k(rb_q43_k.getTag().toString());
                    et_q43_k.setVisibility(View.GONE);
                }

            }
        });



        return view;
    }


    public boolean validation(){
        boolean validation = true;

        if(rg_q29_a.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q29_a.getX(),rg_q29_a.getY());
            validation = false;
            tv_q29_a.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ29a(q29_a);
        }

        if(rg_q29_b.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q29_b.getX(),rg_q29_b.getY());
            validation = false;
            tv_q29_b.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ29b(q29_b);
        }

        if(rg_q29_c.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q29_c.getX(),rg_q29_c.getY());
            validation = false;
            tv_q29_c.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ29c(q29_c);
        }

        if(rg_q29_d.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q29_d.getX(),rg_q29_d.getY());
            validation = false;
            tv_q29_d.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ29d(q29_d);
        }

        if(rg_q29_e.getCheckedRadioButtonId()!=-1){

            if(q29_e.equals("y")){

                if(et_q29_e.getText().toString().isEmpty()){

                    setFocuseable(et_q29_e.getX(),et_q29_e.getY());
                    et_q29_e.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ29e(et_q29_e.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ29e(q29_e);
            }

        }else {
            setFocuseable(et_q29_e.getX(),et_q29_e.getY());
            et_q29_e.setError("Enter");
            validation = false;
        }

        if(rg_q30.getCheckedRadioButtonId()==-1){
            setFocuseable(tv_q30.getX(),tv_q30.getY());
            validation = false;
            tv_q30.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ3(q30);
        }


        if(ll_q31_q33.getVisibility()==View.VISIBLE){

            if(rg_q31.getCheckedRadioButtonId()!=-1){

                if(q31.equals("8")){

                    if(et_q31.getText().toString().isEmpty()){

                        setFocuseable(tv_q31.getX(),tv_q31.getY());
                        et_q31.setError("Enter Here");
                        validation = false;
                    }else {

                        CRF3bActivity.formCrf3bDTO.setQ31(et_q31.getText().toString());
                    }
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ31(q31);
                }

            }else {
                setFocuseable(tv_q31.getX(),tv_q31.getY());
                tv_q31.setError("select One");
                validation = false;
            }


            if(et_q32.getText().toString().equals(null) || et_q32.getText().toString().isEmpty()){
                setFocuseable(et_q32.getX(),et_q32.getY());
                validation = false;
                et_q32.setError("Required");
            }else {
                CRF3bActivity.formCrf3bDTO.setQ32(et_q32.getText().toString());
            }

            if(et_q33.getText().toString().equals(null) || et_q33.getText().toString().isEmpty()){
                setFocuseable(et_q33.getX(),et_q33.getY());
                validation = false;
                et_q33.setError("Required");
            }else {
                CRF3bActivity.formCrf3bDTO.setQ33(et_q33.getText().toString());
            }

        }

        if(rg_q34.getCheckedRadioButtonId()==-1){
            setFocuseable(tv_q34.getX(),tv_q34.getY());
            validation = false;
            tv_q34.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ34(q34);
        }

        if(et_q35.getText().toString().equals(null) || et_q35.getText().toString().isEmpty()){
            setFocuseable(et_q35.getX(),et_q35.getY());
            validation = false;
            et_q35.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ35(et_q35.getText().toString());
        }

        if(rg_q36_a.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_a.getX(),rg_q36_a.getY());
            validation = false;
            tv_q36_a.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36a(q36_a);
        }

        if(rg_q36_b.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_b.getX(),rg_q36_b.getY());
            validation = false;
            tv_q36_b.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36b(q36_b);
        }

        if(rg_q36_c.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_c.getX(),rg_q36_c.getY());
            validation = false;
            tv_q36_c.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36c(q36_c);
        }

        if(rg_q36_d.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_d.getX(),rg_q36_d.getY());
            validation = false;
            tv_q36_d.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36d(q36_d);
        }


        if(rg_q36_e.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_e.getX(),rg_q36_e.getY());
            validation = false;
            tv_q36_e.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36e(q36_e);
        }


        if(rg_q36_f.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_f.getX(),rg_q36_f.getY());
            validation = false;
            tv_q36_f.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36f(q36_f);
        }

        if(rg_q36_g.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_g.getX(),rg_q36_g.getY());
            validation = false;
            tv_q36_g.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36g(q36_g);
        }


        if(rg_q36_h.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_h.getX(),rg_q36_h.getY());
            validation = false;
            tv_q36_h.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36h(q36_h);
        }


        if(rg_q36_i.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_i.getX(),rg_q36_i.getY());
            validation = false;
            tv_q36_i.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36i(q36_i);
        }

        if(rg_q36_j.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_j.getX(),rg_q36_j.getY());
            validation = false;
            tv_q36_j.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36j(q36_j);
        }


        if(rg_q36_k.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_k.getX(),rg_q36_k.getY());
            validation = false;
            tv_q36_k.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36k(q36_k);
        }


        if(rg_q36_l.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_l.getX(),rg_q36_l.getY());
            validation = false;
            tv_q36_l.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36l(q36_l);
        }


        if(rg_q36_m.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_m.getX(),rg_q36_m.getY());
            validation = false;
            tv_q36_m.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36m(q36_a);
        }


        if(rg_q36_n.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_n.getX(),rg_q36_n.getY());
            validation = false;
            tv_q36_n.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36n(q36_n);
        }

        if(rg_q36_o.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_o.getX(),rg_q36_o.getY());
            validation = false;
            tv_q36_o.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36o(q36_o);
        }

        if(rg_q36_p.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_p.getX(),rg_q36_p.getY());
            validation = false;
            tv_q36_p.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36p(q36_p);
        }


        if(rg_q36_q.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_q.getX(),rg_q36_q.getY());
            validation = false;
            tv_q36_q.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36q(q36_q);
        }

        if(rg_q36_r.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_r.getX(),rg_q36_r.getY());
            validation = false;
            tv_q36_r.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36r(q36_r);
        }

        if(rg_q36_s.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_s.getX(),rg_q36_s.getY());
            validation = false;
            tv_q36_s.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36s(q36_s);
        }

        if(rg_q36_t.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_t.getX(),rg_q36_t.getY());
            validation = false;
            tv_q36_t.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36t(q36_t);
        }

        if(rg_q36_u.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_u.getX(),rg_q36_u.getY());
            validation = false;
            tv_q36_u.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36u(q36_u);
        }

        if(rg_q36_v.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_v.getX(),rg_q36_v.getY());
            validation = false;
            tv_q36_v.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36v(q36_v);
        }

        if(rg_q36_w.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_w.getX(),rg_q36_w.getY());
            validation = false;
            tv_q36_w.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36w(q36_w);
        }

        if(rg_q36_x.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q36_x.getX(),rg_q36_x.getY());
            validation = false;
            tv_q36_x.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ36x(q36_x);
        }


        if(rg_q36_y.getCheckedRadioButtonId()!=-1){

            if(q36_y.equals("8")){

                if(et_q36_y.getText().toString().isEmpty()){

                    setFocuseable(tv_q36_y.getX(),tv_q36_y.getY());
                    et_q36_y.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ36y(et_q36_y.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ36y(q36_y);
            }

        }else {
            setFocuseable(tv_q36_y.getX(),tv_q36_y.getY());
            tv_q36_y.setError("select One");
            validation = false;
        }

        if(rg_q37.getCheckedRadioButtonId()==-1){

            setFocuseable(rg_q37.getX(),rg_q37.getY());
            validation = false;
            tv_q37.setError("Required");

        }else {

            CRF3bActivity.formCrf3bDTO.setQ37(q37);
        }

        if(ll_q38_q39.getVisibility()==View.VISIBLE) {

            if (rg_q38.getCheckedRadioButtonId() != -1) {

                if (q38.equals("8")) {

                    if (et_q38.getText().toString().isEmpty()) {

                        setFocuseable(et_q38.getX(), et_q38.getY());
                        et_q38.setError("Enter Here");
                        validation = false;
                    } else {
                        CRF3bActivity.formCrf3bDTO.setQ38(et_q38.getText().toString());
                    }
                } else {
                    CRF3bActivity.formCrf3bDTO.setQ38(q38);
                }
            }


            if(ll_q39.getVisibility()==View.VISIBLE){


                if(rg_q39_a.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_a.getX(),rg_q39_a.getY());
                    validation = false;
                    tv_q39_a.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39a(q39_a);
                }

                if(rg_q39_b.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_b.getX(),rg_q39_b.getY());
                    validation = false;
                    tv_q39_b.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39b(q39_b);
                }

                if(rg_q39_c.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_c.getX(),rg_q39_c.getY());
                    validation = false;
                    tv_q39_c.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39c(q39_c);
                }

                if(rg_q39_d.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_d.getX(),rg_q39_d.getY());
                    validation = false;
                    tv_q39_d.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39d(q39_d);
                }


                if(rg_q39_e.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_e.getX(),rg_q39_e.getY());
                    validation = false;
                    tv_q39_e.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39e(q39_e);
                }


                if(rg_q39_f.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_f.getX(),rg_q39_f.getY());
                    validation = false;
                    tv_q39_f.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39f(q39_f);
                }

                if(rg_q39_g.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_g.getX(),rg_q39_g.getY());
                    validation = false;
                    tv_q39_g.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39g(q39_g);
                }


                if(rg_q39_h.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_h.getX(),rg_q39_h.getY());
                    validation = false;
                    tv_q39_h.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39h(q39_h);
                }


                if(rg_q39_i.getCheckedRadioButtonId()==-1){
                    setFocuseable(rg_q39_i.getX(),rg_q39_i.getY());
                    validation = false;
                    tv_q39_i.setError("Required");
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ39i(q39_i);
                }


                if(rg_q39_j.getCheckedRadioButtonId()!=-1){

                    if(q39_j.equals("y")){

                        if(et_q39_j.getText().toString().isEmpty()){

                            setFocuseable(tv_q39_j.getX(),tv_q39_j.getY());
                            et_q39_j.setError("Enter Here");
                            validation = false;
                        }else {

                            CRF3bActivity.formCrf3bDTO.setQ39j(et_q39_j.getText().toString());
                        }
                    }else {
                        CRF3bActivity.formCrf3bDTO.setQ39j(q39_j);
                    }

                }else {
                    setFocuseable(tv_q39_j.getX(),tv_q39_j.getY());
                    tv_q39_j.setError("select One");
                    validation = false;
                }

            }

        }

        if(rg_q40_a.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_a.getX(),rg_q40_a.getY());
            validation = false;
            tv_q40_a.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40a(q40_a);
        }

        if(rg_q40_b.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_b.getX(),rg_q40_b.getY());
            validation = false;
            tv_q40_b.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40b(q40_b);
        }

        if(rg_q40_c.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_c.getX(),rg_q40_c.getY());
            validation = false;
            tv_q40_c.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40c(q40_c);
        }

        if(rg_q40_d.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_d.getX(),rg_q40_d.getY());
            validation = false;
            tv_q40_d.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40d(q40_d);
        }


        if(rg_q40_e.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_e.getX(),rg_q40_e.getY());
            validation = false;
            tv_q40_e.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40e(q40_e);
        }


        if(rg_q40_f.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_f.getX(),rg_q40_f.getY());
            validation = false;
            tv_q40_f.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40f(q40_f);
        }

        if(rg_q40_g.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_g.getX(),rg_q40_g.getY());
            validation = false;
            tv_q40_g.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40g(q40_g);
        }


        if(rg_q40_h.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_h.getX(),rg_q40_h.getY());
            validation = false;
            tv_q40_h.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40h(q40_h);
        }


        if(rg_q40_i.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_i.getX(),rg_q40_i.getY());
            validation = false;
            tv_q40_i.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40i(q40_i);
        }

        if(rg_q40_j.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_j.getX(),rg_q40_j.getY());
            validation = false;
            tv_q40_j.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40j(q40_j);
        }


        if(rg_q40_k.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_k.getX(),rg_q40_k.getY());
            validation = false;
            tv_q40_k.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40k(q40_k);
        }


        if(rg_q40_l.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_l.getX(),rg_q40_l.getY());
            validation = false;
            tv_q40_l.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40l(q40_l);
        }


        if(rg_q40_m.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_m.getX(),rg_q40_m.getY());
            validation = false;
            tv_q40_m.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40m(q40_a);
        }


        if(rg_q40_n.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_n.getX(),rg_q40_n.getY());
            validation = false;
            tv_q40_n.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40n(q40_n);
        }

        if(rg_q40_o.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_o.getX(),rg_q40_o.getY());
            validation = false;
            tv_q40_o.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40o(q40_o);
        }

        if(rg_q40_p.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_p.getX(),rg_q40_p.getY());
            validation = false;
            tv_q40_p.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40p(q40_p);
        }


        if(rg_q40_q.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q40_q.getX(),rg_q40_q.getY());
            validation = false;
            tv_q40_q.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ40q(q40_q);
        }

        if(rg_q40_r.getCheckedRadioButtonId()!=-1){

            if(q40_r.equals("8")){

                if(et_q40_r.getText().toString().isEmpty()){

                    setFocuseable(tv_q40_r.getX(),tv_q40_r.getY());
                    et_q40_r.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ40r(et_q40_r.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ40r(q40_r);
            }

        }else {
            setFocuseable(tv_q40_r.getX(),tv_q40_r.getY());
            tv_q40_r.setError("select One");
            validation = false;
        }


        if(rg_q41.getCheckedRadioButtonId()==-1){
            setFocuseable(rg_q41.getX(),rg_q41.getY());
            validation = false;
            tv_q41.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ41(q41);
        }
        //////

        if(rg_q42.getCheckedRadioButtonId()!=-1){

            if(q42.equals("8")){

                if(et_q42.getText().toString().isEmpty()){

                    setFocuseable(tv_q42.getX(),tv_q42.getY());
                    et_q42.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ42(et_q42.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ42(q42);
            }

        }else {
            setFocuseable(tv_q42.getX(),tv_q42.getY());
            tv_q42.setError("select One");
            validation = false;
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

}
