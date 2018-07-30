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
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class Crf3bQ44Fragment extends Fragment {

    Button btn_submit;

    LinearLayout ll_q47, ll_q65_q66, ll_q65, ll_q66, ll_q70, ll_q71, ll_q68;

    ScrollView scrollview;

    TextView tv_gender, tv_q45, tv_q46, tv_q47, tv_q48, tv_q49, tv_q50, tv_q51, tv_q52, tv_q53, tv_q54, tv_q55, tv_q56
               ,tv_q57, tv_q58, tv_q59, tv_q60, tv_q61, tv_q62, tv_q63, tv_q64, tv_q65_a, tv_q65_b, tv_q65_c, tv_q65_d
               ,tv_q65_e, tv_q65_f, tv_q65_g, tv_q65_h, tv_q65_i, tv_q65_j, tv_q65_k, tv_q65_l, tv_q65_m, tv_q66, tv_q67, tv_q68, tv_q69,
                tv_q70_a, tv_q70_b, tv_q70_c, tv_q70_d, tv_q70_e, tv_q70_f, tv_q70_g, tv_q70_h, tv_q70_i, tv_q70_j, tv_q70_k, tv_q70_l,
                tv_q70_m, tv_q70_n, tv_q70_o, tv_q71_a, tv_q71_b, tv_q71_c, tv_q71_d, tv_q71_e, tv_q71_f, tv_q71_g, tv_q71_h, tv_q71_i,
                        tv_q71_j, tv_q71_k, tv_q71_l ;

    EditText et_q48, et_q51, et_q45, et_q60, et_q62, et_q65, et_q70_o, et_q71_l, et_q47, et_q50, et_q58, et_q59, et_q66_a, et_q66_b, et_q66_c, et_q68_a, et_q68_b, et_q68_c;

    RadioGroup rg_gender, rg_q46, rg_q48, rg_q49, rg_q51, rg_q52, rg_q45, rg_q60, rg_q61, rg_q62, rg_q63, rg_q64, rg_q65_a, rg_q65_b, rg_q65_c,
                rg_q65_d, rg_q65_e, rg_q65_f, rg_q65_g, rg_q65_h, rg_q65_i,rg_q65_j,rg_q65_k,rg_q65_l,rg_q65_m, rg_q71_l
               ,rg_q53, rg_q54, rg_q55,rg_q56, rg_q57, rg_q67, rg_q69, rg_q70_a, rg_q70_b, rg_q70_c, rg_q70_d, rg_q70_e, rg_q70_f
               , rg_q70_g, rg_q70_h, rg_q70_i, rg_q70_j, rg_q70_k, rg_q70_l, rg_q70_m, rg_q70_n, rg_q70_o,rg_q71_a, rg_q71_b, rg_q71_c, rg_q71_d, rg_q71_e, rg_q71_f
               , rg_q71_g, rg_q71_h, rg_q71_i, rg_q71_j, rg_q71_k ;

    RadioButton rb_gender,rb_q46, rb_q48, rb_q49,rb_q51, rb_q52, rb_q45, rb_q60, rb_q61, rb_q62, rb_q63, rb_q64, rb_q65_a, rb_q65_b,rb_q65_c,
                  rb_q65_d,rb_q65_e, rb_q65_f,rb_q65_g,rb_q65_h,rb_q65_i,rb_q65_j, rb_q65_k,rb_q65_l,rb_q65_m,
                  rb_q70_o, rb_q71_l, rb_q53, rb_q54, rb_q55, rb_q56,rb_q57, rb_q67,rb_q69, rb_q70_a, rb_q70_b, rb_q70_c,
                  rb_q70_d, rb_q70_e, rb_q70_f , rb_q70_g, rb_q70_h, rb_q70_i, rb_q70_j, rb_q70_k, rb_q70_l, rb_q70_m, rb_q70_n, rb_q71_a, rb_q71_b, rb_q71_c, rb_q71_d, rb_q71_e, rb_q71_f
                , rb_q71_g, rb_q71_h, rb_q71_i, rb_q71_j, rb_q71_k;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf3b_q44, container, false);

        scrollview = (ScrollView) view.findViewById(R.id.scrolView);

        tv_gender =  (TextView) view.findViewById(R.id.tv_gender);
        tv_q45 =  (TextView) view.findViewById(R.id.tv_q45);
        tv_q46 =  (TextView) view.findViewById(R.id.tv_q46);
        tv_q47 =  (TextView) view.findViewById(R.id.tv_q47);
        tv_q48 =  (TextView) view.findViewById(R.id.tv_q48);
        tv_q49 =  (TextView) view.findViewById(R.id.tv_q49);
        tv_q50 =  (TextView) view.findViewById(R.id.tv_q50);
        tv_q51 =  (TextView) view.findViewById(R.id.tv_q51);
        tv_q52 =  (TextView) view.findViewById(R.id.tv_q52);
        tv_q53 =  (TextView) view.findViewById(R.id.tv_q53);
        tv_q54 =  (TextView) view.findViewById(R.id.tv_q54);
        tv_q55 =  (TextView) view.findViewById(R.id.tv_q55);
        tv_q56 =  (TextView) view.findViewById(R.id.tv_q56);
        tv_q57 =  (TextView) view.findViewById(R.id.tv_q57);
        tv_q58 =  (TextView) view.findViewById(R.id.tv_q58);
        tv_q59 =  (TextView) view.findViewById(R.id.tv_q59);
        tv_q60 =  (TextView) view.findViewById(R.id.tv_q60);
        tv_q61 =  (TextView) view.findViewById(R.id.tv_q61);
        tv_q62 =  (TextView) view.findViewById(R.id.tv_q62);
        tv_q63 =  (TextView) view.findViewById(R.id.tv_q63);
        tv_q64 =  (TextView) view.findViewById(R.id.tv_q64);
        tv_q65_a =  (TextView) view.findViewById(R.id.tv_q65_a);
        tv_q65_b =  (TextView) view.findViewById(R.id.tv_q65_b);
        tv_q65_c =  (TextView) view.findViewById(R.id.tv_q65_c);
        tv_q65_d =  (TextView) view.findViewById(R.id.tv_q65_d);
        tv_q65_e =  (TextView) view.findViewById(R.id.tv_q65_e);
        tv_q65_f =  (TextView) view.findViewById(R.id.tv_q65_f);
        tv_q65_g =  (TextView) view.findViewById(R.id.tv_q65_g);
        tv_q65_h =  (TextView) view.findViewById(R.id.tv_q65_h);
        tv_q65_i =  (TextView) view.findViewById(R.id.tv_q65_i);
        tv_q65_j =  (TextView) view.findViewById(R.id.tv_q65_j);
        tv_q65_k =  (TextView) view.findViewById(R.id.tv_q65_k);
        tv_q65_l =  (TextView) view.findViewById(R.id.tv_q65_l);
        tv_q65_m =  (TextView) view.findViewById(R.id.tv_q65_m);
        tv_q66 =  (TextView) view.findViewById(R.id.tv_q66);
        tv_q67 =  (TextView) view.findViewById(R.id.tv_q67);
        tv_q68 =  (TextView) view.findViewById(R.id.tv_q68);
        tv_q69 =  (TextView) view.findViewById(R.id.tv_q69);
        tv_q70_a =  (TextView) view.findViewById(R.id.tv_q70_a);
        tv_q70_b =  (TextView) view.findViewById(R.id.tv_q70_b);
        tv_q70_c =  (TextView) view.findViewById(R.id.tv_q70_c);
        tv_q70_d =  (TextView) view.findViewById(R.id.tv_q70_d);
        tv_q70_e =  (TextView) view.findViewById(R.id.tv_q70_e);
        tv_q70_f =  (TextView) view.findViewById(R.id.tv_q70_f);
        tv_q70_g =  (TextView) view.findViewById(R.id.tv_q70_g);
        tv_q70_h =  (TextView) view.findViewById(R.id.tv_q70_h);
        tv_q70_i =  (TextView) view.findViewById(R.id.tv_q70_i);
        tv_q70_j =  (TextView) view.findViewById(R.id.tv_q70_j);
        tv_q70_k =  (TextView) view.findViewById(R.id.tv_q70_k);
        tv_q70_l =  (TextView) view.findViewById(R.id.tv_q70_l);
        tv_q70_m =  (TextView) view.findViewById(R.id.tv_q70_m);
        tv_q70_n =  (TextView) view.findViewById(R.id.tv_q70_n);
        tv_q70_o =  (TextView) view.findViewById(R.id.tv_q70_o);

        tv_q71_a =  (TextView) view.findViewById(R.id.tv_q71_a);
        tv_q71_b =  (TextView) view.findViewById(R.id.tv_q71_b);
        tv_q71_c =  (TextView) view.findViewById(R.id.tv_q71_c);
        tv_q71_d =  (TextView) view.findViewById(R.id.tv_q71_d);
        tv_q71_e =  (TextView) view.findViewById(R.id.tv_q71_e);
        tv_q71_f =  (TextView) view.findViewById(R.id.tv_q71_f);
        tv_q71_g =  (TextView) view.findViewById(R.id.tv_q71_g);
        tv_q71_h =  (TextView) view.findViewById(R.id.tv_q71_h);
        tv_q71_i =  (TextView) view.findViewById(R.id.tv_q71_i);
        tv_q71_j =  (TextView) view.findViewById(R.id.tv_q71_j);
        tv_q71_k =  (TextView) view.findViewById(R.id.tv_q71_k);
        tv_q71_l =  (TextView) view.findViewById(R.id.tv_q71_l);

        ll_q47 = (LinearLayout) view.findViewById(R.id.ll_q47);
        ll_q65_q66 = (LinearLayout) view.findViewById(R.id.ll_q65_q66);
        ll_q65 = (LinearLayout) view.findViewById(R.id.ll_q65);
        ll_q66 = (LinearLayout) view.findViewById(R.id.ll_q66);
        ll_q70 = (LinearLayout) view.findViewById(R.id.ll_q70);
        ll_q68 = (LinearLayout) view.findViewById(R.id.ll_q68);
        ll_q71 = (LinearLayout) view.findViewById(R.id.ll_q71);




            et_q47 = (EditText) view.findViewById(R.id.et_q47);
            et_q48 = (EditText) view.findViewById(R.id.et_q48);
            et_q50 = (EditText) view.findViewById(R.id.et_q50);
            et_q51 = (EditText) view.findViewById(R.id.et_q51);
            et_q58 = (EditText) view.findViewById(R.id.et_q58);
            et_q59 = (EditText) view.findViewById(R.id.et_q59);
            et_q45 = (EditText) view.findViewById(R.id.et_q45);
            et_q60 = (EditText) view.findViewById(R.id.et_q60);
            et_q62 = (EditText) view.findViewById(R.id.et_q62);
            et_q65 = (EditText) view.findViewById(R.id.et_q65);
            et_q66_a = (EditText) view.findViewById(R.id.et_q66_a);
            et_q66_b = (EditText) view.findViewById(R.id.et_q66_b);
            et_q66_c = (EditText) view.findViewById(R.id.et_q66_c);
            et_q68_a = (EditText) view.findViewById(R.id.et_q68_a);
            et_q68_b = (EditText) view.findViewById(R.id.et_q68_b);
            et_q68_c = (EditText) view.findViewById(R.id.et_q68_c);
            et_q70_o = (EditText) view.findViewById(R.id.et_q70_o);
            et_q71_l = (EditText) view.findViewById(R.id.et_q71_l);



            btn_submit = (Button) view.findViewById(R.id.btn_submit);

            btn_submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

               if(checkValidation()){

                   Crf3bQ72Fragment crf3bQ72Fragment = new Crf3bQ72Fragment();
                   FragmentManager fragmentManager = getFragmentManager();
                   FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                   fragmentTransaction.replace(R.id.frame_layout_crf3b, crf3bQ72Fragment);
                   fragmentTransaction.commit();


                    }


                }
            });

            rg_gender = (RadioGroup) view.findViewById(R.id.rg_gender);
            rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rb_gender = (RadioButton) view.findViewById(rg_gender.getCheckedRadioButtonId());


                }
            });


            rg_q46 = (RadioGroup) view.findViewById(R.id.rg_q46);
            rg_q46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    tv_q46.setError(null);
                    rb_q46 = (RadioButton) view.findViewById(rg_q46.getCheckedRadioButtonId());

                 if(rb_q46.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                     ll_q47.setVisibility(View.VISIBLE);

                    }else {

                     ll_q47.setVisibility(View.GONE);
                 }

                }
            });


            rg_q48 = (RadioGroup) view.findViewById(R.id.rg_q48);
            rg_q48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    rb_q48 = (RadioButton) view.findViewById(rg_q48.getCheckedRadioButtonId());

                    if(rb_q48.getTag().toString().equalsIgnoreCase("3")){

                        et_q48.setVisibility(View.VISIBLE);

                    }else {

                        et_q48.setVisibility(View.GONE);
                     //   CRF3bActivity.formCrf3bDTO.setQ48(rb_q48.getTag().toString());
                    }

                }
            });

        rg_q49 = (RadioGroup) view.findViewById(R.id.rg_q49);
        rg_q49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q49 = (RadioButton) view.findViewById(rg_q49.getCheckedRadioButtonId());



            }
        });

        rg_q51 = (RadioGroup) view.findViewById(R.id.rg_q51);
        rg_q51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q51 = (RadioButton) view.findViewById(rg_q51.getCheckedRadioButtonId());

                if(rb_q51.getTag().toString().equalsIgnoreCase("7")){

                    et_q51.setVisibility(View.VISIBLE);
                }else {
                   // CRF3bActivity.formCrf3bDTO.setQ51(rb_q51.getTag().toString());
                    et_q51.setVisibility(View.GONE);
                }


            }
        });

        rg_q52 = (RadioGroup) view.findViewById(R.id.rg_q52);
        rg_q52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q52 = (RadioButton) view.findViewById(rg_q52.getCheckedRadioButtonId());

            }
        });

        rg_q53 = (RadioGroup) view.findViewById(R.id.rg_q53);
        rg_q53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q53.setError(null);
                rb_q53 = (RadioButton) view.findViewById(rg_q53.getCheckedRadioButtonId());

            }
        });

        rg_q54 = (RadioGroup) view.findViewById(R.id.rg_q54);
        rg_q54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q54.setError(null);
                rb_q54 = (RadioButton) view.findViewById(rg_q54.getCheckedRadioButtonId());

            }
        });

        rg_q55 = (RadioGroup) view.findViewById(R.id.rg_q55);
        rg_q55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q55.setError(null);
                rb_q55 = (RadioButton) view.findViewById(rg_q55.getCheckedRadioButtonId());

            }
        });

        rg_q56 = (RadioGroup) view.findViewById(R.id.rg_q56);
        rg_q56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q56.setError(null);
                rb_q56 = (RadioButton) view.findViewById(rg_q56.getCheckedRadioButtonId());

            }
        });

        rg_q57 = (RadioGroup) view.findViewById(R.id.rg_q57);
        rg_q57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q57.setError(null);
                rb_q57 = (RadioButton) view.findViewById(rg_q57.getCheckedRadioButtonId());

            }
        });


        rg_q65_a = (RadioGroup) view.findViewById(R.id.rg_q65_a);
        rg_q65_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_a.setError(null);
                rb_q65_a = (RadioButton) view.findViewById(rg_q65_a.getCheckedRadioButtonId());
            }
        });


        rg_q65_b = (RadioGroup) view.findViewById(R.id.rg_q65_b);
        rg_q65_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_b.setError(null);
                rb_q65_b = (RadioButton) view.findViewById(rg_q65_b.getCheckedRadioButtonId());

            }
        });


        rg_q65_c = (RadioGroup) view.findViewById(R.id.rg_q65_c);
        rg_q65_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_c.setError(null);
                rb_q65_c = (RadioButton) view.findViewById(rg_q65_c.getCheckedRadioButtonId());

            }
        });

        rg_q65_d = (RadioGroup) view.findViewById(R.id.rg_q65_d);
        rg_q65_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_d.setError(null);
                rb_q65_d = (RadioButton) view.findViewById(rg_q65_d.getCheckedRadioButtonId());

            }
        });


        rg_q65_e = (RadioGroup) view.findViewById(R.id.rg_q65_e);
        rg_q65_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_e.setError(null);
                rb_q65_e = (RadioButton) view.findViewById(rg_q65_e.getCheckedRadioButtonId());
            }
        });

        rg_q65_f = (RadioGroup) view.findViewById(R.id.rg_q65_f);
        rg_q65_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_f.setError(null);
                rb_q65_f = (RadioButton) view.findViewById(rg_q65_f.getCheckedRadioButtonId());

            }
        });
        rg_q65_g = (RadioGroup) view.findViewById(R.id.rg_q65_g);
        rg_q65_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_g.setError(null);
                rb_q65_g = (RadioButton) view.findViewById(rg_q65_g.getCheckedRadioButtonId());

            }
        });
        rg_q65_h = (RadioGroup) view.findViewById(R.id.rg_q65_h);
        rg_q65_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_h.setError(null);
                rb_q65_h = (RadioButton) view.findViewById(rg_q65_h.getCheckedRadioButtonId());

            }
        });

        rg_q65_i = (RadioGroup) view.findViewById(R.id.rg_q65_i);
        rg_q65_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_i.setError(null);
                rb_q65_i = (RadioButton) view.findViewById(rg_q65_i.getCheckedRadioButtonId());

            }
        });

        rg_q65_j = (RadioGroup) view.findViewById(R.id.rg_q65_j);
        rg_q65_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_j.setError(null);
                rb_q65_j = (RadioButton) view.findViewById(rg_q65_j.getCheckedRadioButtonId());

            }
        });

        rg_q65_k = (RadioGroup) view.findViewById(R.id.rg_q65_k);
        rg_q65_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_k.setError(null);
                rb_q65_k = (RadioButton) view.findViewById(rg_q65_k.getCheckedRadioButtonId());

            }
        });

        rg_q65_l = (RadioGroup) view.findViewById(R.id.rg_q65_l);
        rg_q65_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_l.setError(null);
                rb_q65_l = (RadioButton) view.findViewById(rg_q65_l.getCheckedRadioButtonId());

            }
        });

        rg_q65_m = (RadioGroup) view.findViewById(R.id.rg_q65_m);
        rg_q65_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q65_m.setError(null);
                rb_q65_m = (RadioButton) view.findViewById(rg_q65_m.getCheckedRadioButtonId());

                if(rb_q65_m.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                    et_q65.setVisibility(View.VISIBLE);

                }else {

                    et_q65.setVisibility(View.GONE);
                }

            }
        });



        rg_q45 = (RadioGroup) view.findViewById(R.id.rg_q45);
        rg_q45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q45.setError(null);
                rb_q45 = (RadioButton) view.findViewById(rg_q45.getCheckedRadioButtonId());

                if(rb_q45.getTag().toString().equalsIgnoreCase("5") ||
                        rb_q45.getTag().toString().equalsIgnoreCase("6") ||
                        rb_q45.getTag().toString().equalsIgnoreCase("7")||
                        rb_q45.getTag().toString().equalsIgnoreCase("8") ||
                        rb_q45.getTag().toString().equalsIgnoreCase("10")||
                        rb_q45.getTag().toString().equalsIgnoreCase("11")){

                    et_q45.setVisibility(View.VISIBLE);

                }else {
                    et_q45.setVisibility(View.GONE);

                }


            }
        });


        rg_q60 = (RadioGroup) view.findViewById(R.id.rg_q60);
        rg_q60.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q60.setError(null);
                rb_q60 = (RadioButton) view.findViewById(rg_q60.getCheckedRadioButtonId());

                if(rb_q60.getTag().toString().equalsIgnoreCase("7")){

                    et_q60.setVisibility(View.VISIBLE);
                }else {
                    et_q60.setVisibility(View.GONE);

                }


            }
        });

        rg_q61 = (RadioGroup) view.findViewById(R.id.rg_q61);
        rg_q61.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q61.setError(null);
                rb_q61 = (RadioButton) view.findViewById(rg_q61.getCheckedRadioButtonId());

            }
        });

        rg_q62 = (RadioGroup) view.findViewById(R.id.rg_q62);
        rg_q62.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q62.setError(null);
                rb_q62 = (RadioButton) view.findViewById(rg_q62.getCheckedRadioButtonId());

                if(rb_q62.getTag().toString().equalsIgnoreCase("7")){

                    et_q62.setVisibility(View.VISIBLE);
                }else {
                    et_q62.setVisibility(View.GONE);
                    CRF3bActivity.formCrf3bDTO.setQ62(rb_q62.getTag().toString());

                }

            }
        });

        rg_q63 = (RadioGroup) view.findViewById(R.id.rg_q63);
        rg_q63.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q63.setError(null);
                rb_q63 = (RadioButton) view.findViewById(rg_q63.getCheckedRadioButtonId());

            }
        });

        rg_q64 = (RadioGroup) view.findViewById(R.id.rg_q64);
        rg_q64.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q64.setError(null);
                rb_q64 = (RadioButton) view.findViewById(rg_q64.getCheckedRadioButtonId());



                if(rb_q64.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                    ll_q66.setVisibility(View.VISIBLE);
                    ll_q65.setVisibility(View.GONE);

               }else if( rb_q64.getTag().toString().equalsIgnoreCase(ContantsValues.DONTKNOW)) {

                    ll_q66.setVisibility(View.GONE);
                    ll_q65.setVisibility(View.GONE);

                }else {

                    ll_q66.setVisibility(View.VISIBLE);
                    ll_q65.setVisibility(View.VISIBLE);

                }



            }
        });

        rg_q67 = (RadioGroup) view.findViewById(R.id.rg_q67);
        rg_q67.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q67.setError(null);
                rb_q67 = (RadioButton) view.findViewById(rg_q67.getCheckedRadioButtonId());

                if(rb_q67.getTag().toString().equalsIgnoreCase(ContantsValues.NO)){

                    ll_q68.setVisibility(View.GONE);
                }else {

                    ll_q68.setVisibility(View.VISIBLE);
                }

            }
        });


        rg_q69 = (RadioGroup) view.findViewById(R.id.rg_q69);
        rg_q69.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q69 = (RadioButton) view.findViewById(rg_q69.getCheckedRadioButtonId());
                tv_q69.setError(null);

                if(rb_q69.getTag().toString().equalsIgnoreCase(ContantsValues.NO) ||
                        rb_q69.getTag().toString().equalsIgnoreCase(ContantsValues.DONTKNOW)){

                    ll_q70.setVisibility(View.GONE);
                    ll_q71.setVisibility(View.GONE);

                }else {

                    ll_q70.setVisibility(View.VISIBLE);
                    ll_q71.setVisibility(View.VISIBLE);

                }


            }
        });


        rg_q70_a = (RadioGroup) view.findViewById(R.id.rg_q70_a);
        rg_q70_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_a = (RadioButton) view.findViewById(rg_q70_a.getCheckedRadioButtonId());

            }
        });

        rg_q70_b = (RadioGroup) view.findViewById(R.id.rg_q70_b);
        rg_q70_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_b = (RadioButton) view.findViewById(rg_q70_b.getCheckedRadioButtonId());

            }
        });

        rg_q70_c = (RadioGroup) view.findViewById(R.id.rg_q70_c);
        rg_q70_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_c = (RadioButton) view.findViewById(rg_q70_c.getCheckedRadioButtonId());

            }
        });

        rg_q70_d = (RadioGroup) view.findViewById(R.id.rg_q70_d);
        rg_q70_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_d = (RadioButton) view.findViewById(rg_q70_d.getCheckedRadioButtonId());

            }
        });

        rg_q70_e = (RadioGroup) view.findViewById(R.id.rg_q70_e);
        rg_q70_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_e = (RadioButton) view.findViewById(rg_q70_e.getCheckedRadioButtonId());

            }
        });


        rg_q70_f = (RadioGroup) view.findViewById(R.id.rg_q70_f);
        rg_q70_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_f = (RadioButton) view.findViewById(rg_q70_f.getCheckedRadioButtonId());

            }
        });


        rg_q70_g = (RadioGroup) view.findViewById(R.id.rg_q70_g);
        rg_q70_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_g = (RadioButton) view.findViewById(rg_q70_g.getCheckedRadioButtonId());

            }
        });

        rg_q70_h = (RadioGroup) view.findViewById(R.id.rg_q70_h);
        rg_q70_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_h = (RadioButton) view.findViewById(rg_q70_h.getCheckedRadioButtonId());

            }
        });


        rg_q70_i = (RadioGroup) view.findViewById(R.id.rg_q70_i);
        rg_q70_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_i = (RadioButton) view.findViewById(rg_q70_i.getCheckedRadioButtonId());

            }
        });

        rg_q70_j = (RadioGroup) view.findViewById(R.id.rg_q70_j);
        rg_q70_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_j = (RadioButton) view.findViewById(rg_q70_j.getCheckedRadioButtonId());

            }
        });

        rg_q70_k = (RadioGroup) view.findViewById(R.id.rg_q70_k);
        rg_q70_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_k = (RadioButton) view.findViewById(rg_q70_k.getCheckedRadioButtonId());

            }
        });

        rg_q70_l = (RadioGroup) view.findViewById(R.id.rg_q70_l);
        rg_q70_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_l = (RadioButton) view.findViewById(rg_q70_l.getCheckedRadioButtonId());

            }
        });


        rg_q70_m = (RadioGroup) view.findViewById(R.id.rg_q70_m);
        rg_q70_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_m = (RadioButton) view.findViewById(rg_q70_m.getCheckedRadioButtonId());

            }
        });

        rg_q70_n = (RadioGroup) view.findViewById(R.id.rg_q70_n);
        rg_q70_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q70_n = (RadioButton) view.findViewById(rg_q70_n.getCheckedRadioButtonId());

            }
        });



        rg_q70_o = (RadioGroup) view.findViewById(R.id.rg_q70_o);
        rg_q70_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q70_o = (RadioButton) view.findViewById(rg_q70_o.getCheckedRadioButtonId());

                if(rb_q70_o.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                    et_q70_o.setVisibility(View.VISIBLE);
                }else {
                    et_q70_o.setVisibility(View.GONE);
                }

            }
        });

        rg_q71_a = (RadioGroup) view.findViewById(R.id.rg_q71_a);
        rg_q71_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_a = (RadioButton) view.findViewById(rg_q71_a.getCheckedRadioButtonId());

            }
        });


        rg_q71_b = (RadioGroup) view.findViewById(R.id.rg_q71_b);
        rg_q71_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_b = (RadioButton) view.findViewById(rg_q71_b.getCheckedRadioButtonId());

            }
        });

        rg_q71_c = (RadioGroup) view.findViewById(R.id.rg_q71_c);
        rg_q71_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_c = (RadioButton) view.findViewById(rg_q71_c.getCheckedRadioButtonId());

            }
        });

        rg_q71_d = (RadioGroup) view.findViewById(R.id.rg_q71_d);
        rg_q71_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_d = (RadioButton) view.findViewById(rg_q71_d.getCheckedRadioButtonId());

            }
        });

        rg_q71_e = (RadioGroup) view.findViewById(R.id.rg_q71_e);
        rg_q71_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_e = (RadioButton) view.findViewById(rg_q71_e.getCheckedRadioButtonId());

            }
        });

        rg_q71_f = (RadioGroup) view.findViewById(R.id.rg_q71_f);
        rg_q71_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_f = (RadioButton) view.findViewById(rg_q71_f.getCheckedRadioButtonId());

            }
        });


        rg_q71_g = (RadioGroup) view.findViewById(R.id.rg_q71_g);
        rg_q71_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_g = (RadioButton) view.findViewById(rg_q71_g.getCheckedRadioButtonId());

            }
        });

        rg_q71_h = (RadioGroup) view.findViewById(R.id.rg_q71_h);
        rg_q71_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_h = (RadioButton) view.findViewById(rg_q71_h.getCheckedRadioButtonId());

            }
        });

        rg_q71_i = (RadioGroup) view.findViewById(R.id.rg_q71_i);
        rg_q71_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_i = (RadioButton) view.findViewById(rg_q71_i.getCheckedRadioButtonId());

            }
        });

        rg_q71_j = (RadioGroup) view.findViewById(R.id.rg_q71_j);
        rg_q71_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_j = (RadioButton) view.findViewById(rg_q71_j.getCheckedRadioButtonId());

            }
        });

        rg_q71_k = (RadioGroup) view.findViewById(R.id.rg_q71_k);
        rg_q71_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q71_k = (RadioButton) view.findViewById(rg_q71_k.getCheckedRadioButtonId());

            }
        });

        rg_q71_l = (RadioGroup) view.findViewById(R.id.rg_q71_l);
        rg_q71_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q71_l = (RadioButton) view.findViewById(rg_q71_l.getCheckedRadioButtonId());

                if(rb_q71_l.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){
                    et_q71_l.setVisibility(View.VISIBLE);
                }else {
                    et_q71_l.setVisibility(View.GONE);
                }

            }
        });

        return view;
    }

    public boolean checkValidation(){

        boolean validation = true;

        if (isRBCheckedThree(rg_gender, rb_gender, tv_gender).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ44(isRBCheckedThree(rg_gender, rb_gender, tv_gender));
        }


/*
        if(rg_q45.getCheckedRadioButtonId()==-1){
            setFocuseable(tv_q45.getX(),tv_q45.getY());
            tv_q45.setError("Required");
            validation = false;

        }else {
            if(rb_q45.getTag().toString().equals("6") || rb_q45.getTag().toString().equals("7") ||
                    rb_q45.getTag().toString().equals("8") || rb_q45.getTag().toString().equals("9") ||
                    rb_q45.getTag().toString().equals("10") || rb_q45.getTag().toString().equals("12")){

                if(et_q45.getText().toString().equals("") || et_q45.getText().toString().isEmpty()){
                    et_q45.setError("Enter Here");
                    setFocuseable(et_q45.getX(),et_q45.getY());

                }else {
                    CRF3bActivity.formCrf3bDTO.setQ45(rb_q45.getTag().toString()+":"+et_q45.getText().toString());
                }
            }else {

                CRF3bActivity.formCrf3bDTO.setQ45(rb_q45.getTag().toString());
            }

        }

*/




        if(getEditText(rg_q45,rb_q45,et_q45,tv_q45,"5","6","7","8","10","11").equals("")){
            validation = false;
        }else {
            CRF3bActivity.formCrf3bDTO.setQ45(getEditText(rg_q45,rb_q45,et_q45,tv_q45,"5","6","7","8","10","11"));
        }


        if (isRBCheckedThree(rg_q46, rb_q46, tv_q46).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ46(isRBCheckedThree(rg_q46, rb_q46, tv_q46));
        }

        if(ll_q47.getVisibility()==View.VISIBLE){

            if (getTextFromField(et_q47, tv_q47).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ47(getTextFromField(et_q47, tv_q47));
            }

        }



   /*     if(rg_q48.getCheckedRadioButtonId()==-1){
            setFocuseable(tv_q48.getX(),tv_q48.getY());
            tv_q48.setError("Required");
            validation = false;

        }else {
            if(rb_q48.getTag().toString().equals("4")){

                if(et_q48.getText().toString().equals("") || et_q48.getText().toString().isEmpty()){
                    et_q48.setError("Enter Here");
                    setFocuseable(et_q48.getX(),et_q48.getY());

                }else {
                    CRF3bActivity.formCrf3bDTO.setQ48(rb_q48.getTag().toString()+":"+et_q48.getText().toString());
                }
            }else {

                CRF3bActivity.formCrf3bDTO.setQ48(rb_q48.getTag().toString());
            }

        }
*/




        if(getEditText(rg_q48,rb_q48,et_q48,tv_q48,"4","","","","","").equals("")){
            validation = false;
        }else {
            CRF3bActivity.formCrf3bDTO.setQ48(getEditText(rg_q48,rb_q48,et_q48,tv_q48,"4","","","","",""));
        }



        if (isRBCheckedThree(rg_q49, rb_q49, tv_q49).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ49(isRBCheckedThree(rg_q49, rb_q49, tv_q49));
        }

        if (getTextFromField(et_q50, tv_q50).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ50(getTextFromField(et_q50, tv_q50));
        }


        if(getEditText(rg_q51,rb_q51,et_q51,tv_q51,"8","","","","","").equals("")){
            validation = false;
        }else {
            CRF3bActivity.formCrf3bDTO.setQ51(getEditText(rg_q51,rb_q51,et_q51,tv_q51,"8","","","","",""));
        }

        if (isRBCheckedThree(rg_q52, rb_q52, tv_q52).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ52(isRBCheckedThree(rg_q52, rb_q52, tv_q52));
        }

        if (isRBCheckedThree(rg_q53, rb_q53, tv_q53).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ53(isRBCheckedThree(rg_q53, rb_q53, tv_q53));
        }

        if (isRBCheckedThree(rg_q54, rb_q54, tv_q54).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ54(isRBCheckedThree(rg_q54, rb_q54, tv_q54));
        }

        if (isRBCheckedThree(rg_q55, rb_q55, tv_q55).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ55(isRBCheckedThree(rg_q55, rb_q55, tv_q55));
        }

        if (isRBCheckedThree(rg_q56, rb_q56, tv_q56).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ56(isRBCheckedThree(rg_q56, rb_q56, tv_q56));
        }

        if (isRBCheckedThree(rg_q57, rb_q57, tv_q57).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ57(isRBCheckedThree(rg_q57, rb_q57, tv_q57));
        }

        if (getTextFromField(et_q58, tv_q58).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ58(getTextFromField(et_q58, tv_q58));
        }

        if (getTextFromField(et_q59, tv_q59).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ59(getTextFromField(et_q59, tv_q59));
        }

        if(getEditText(rg_q60,rb_q60,et_q60,tv_q60,"8","","","","","").equals("")){
            validation = false;
        }else {
            CRF3bActivity.formCrf3bDTO.setQ60(getEditText(rg_q60,rb_q60,et_q60,tv_q60,"8","","","","",""));
        }


        if (isRBCheckedThree(rg_q61, rb_q61, tv_q61).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ61(isRBCheckedThree(rg_q61, rb_q61, tv_q61));
        }

        if(getEditText(rg_q62,rb_q62,et_q62,tv_q62,"7","","","","","").equals("")){
            validation = false;
        }else {
            CRF3bActivity.formCrf3bDTO.setQ62(getEditText(rg_q62,rb_q62,et_q62,tv_q62,"7","","","","",""));
        }

        if (isRBCheckedThree(rg_q63, rb_q63, tv_q63).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ63(isRBCheckedThree(rg_q63, rb_q63, tv_q63));
        }

        if (isRBCheckedThree(rg_q64, rb_q64, tv_q64).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ64(isRBCheckedThree(rg_q64, rb_q64, tv_q64));
        }

        if(ll_q65.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q65_a, rb_q65_a, tv_q65_a).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65a(isRBCheckedThree(rg_q65_a, rb_q65_a, tv_q65_a));
            }


            if (isRBCheckedThree(rg_q65_b, rb_q65_b, tv_q65_b).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65b(isRBCheckedThree(rg_q65_b, rb_q65_b, tv_q65_b));
            }

            if (isRBCheckedThree(rg_q65_c, rb_q65_c, tv_q65_c).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65c(isRBCheckedThree(rg_q65_c, rb_q65_c, tv_q65_c));
            }


            if (isRBCheckedThree(rg_q65_d, rb_q65_d, tv_q65_d).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65d(isRBCheckedThree(rg_q65_d, rb_q65_d, tv_q65_d));
            }

            if (isRBCheckedThree(rg_q65_e, rb_q65_e, tv_q65_e).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65e(isRBCheckedThree(rg_q65_e, rb_q65_e, tv_q65_e));
            }

            if (isRBCheckedThree(rg_q65_f, rb_q65_f, tv_q65_f).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65f(isRBCheckedThree(rg_q65_f, rb_q65_f, tv_q65_f));
            }

            if (isRBCheckedThree(rg_q65_g, rb_q65_g, tv_q65_g).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65g(isRBCheckedThree(rg_q65_g, rb_q65_g, tv_q65_g));
            }


            if (isRBCheckedThree(rg_q65_h, rb_q65_h, tv_q65_h).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65h(isRBCheckedThree(rg_q65_h, rb_q65_h, tv_q65_h));
            }

            if (isRBCheckedThree(rg_q65_i, rb_q65_i, tv_q65_i).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65i(isRBCheckedThree(rg_q65_i, rb_q65_i, tv_q65_i));
            }

            if (isRBCheckedThree(rg_q65_j, rb_q65_j, tv_q65_j).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65j(isRBCheckedThree(rg_q65_j, rb_q65_j, tv_q65_j));
            }

            if (isRBCheckedThree(rg_q65_k, rb_q65_k, tv_q65_k).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65k(isRBCheckedThree(rg_q65_k, rb_q65_k, tv_q65_k));
            }

            if (isRBCheckedThree(rg_q65_l, rb_q65_l, tv_q65_l).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ65l(isRBCheckedThree(rg_q65_l, rb_q65_l, tv_q65_l));
            }

            if(getEditText(rg_q65_m,rb_q65_m,et_q65,tv_q65_m,ContantsValues.YES,"","","","","").equals("")){
                validation = false;
            }else {
                CRF3bActivity.formCrf3bDTO.setQ65m(getEditText(rg_q65_m,rb_q65_m,et_q65,tv_q65_m,ContantsValues.YES,"","","","",""));
            }

            }


        if(ll_q66.getVisibility()==View.VISIBLE){

            if (getTextFromField(et_q66_a, tv_q66).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ66a(getTextFromField(et_q66_a, tv_q66));
            }

            if (getTextFromField(et_q66_b, tv_q66).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ66b(getTextFromField(et_q66_b, tv_q66));
            }

            if (getTextFromField(et_q66_c, tv_q66).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ66c(getTextFromField(et_q66_c, tv_q66));
            }

        }



        if (isRBCheckedThree(rg_q67, rb_q67, tv_q67).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ67(isRBCheckedThree(rg_q67, rb_q67, tv_q67));
        }


        if(ll_q68.getVisibility()==View.VISIBLE){

            if (getTextFromField(et_q68_a, tv_q68).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ68a(getTextFromField(et_q68_a, tv_q68));
            }


            if (getTextFromField(et_q68_b, tv_q68).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ68b(getTextFromField(et_q68_b, tv_q68));
            }

            if (getTextFromField(et_q68_c, tv_q68).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ68c(getTextFromField(et_q68_c, tv_q68));
            }


        }





        if (isRBCheckedThree(rg_q69, rb_q69, tv_q69).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formCrf3bDTO.setQ69(isRBCheckedThree(rg_q69, rb_q69, tv_q69));
        }


        if(ll_q70.getVisibility()==View.VISIBLE){


            if (isRBCheckedThree(rg_q70_a, rb_q70_a, tv_q70_a).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70a(isRBCheckedThree(rg_q70_a, rb_q70_a, tv_q70_a));
            }

            if (isRBCheckedThree(rg_q70_b, rb_q70_b, tv_q70_b).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70b(isRBCheckedThree(rg_q70_b, rb_q70_b, tv_q70_b));
            }

            if (isRBCheckedThree(rg_q70_c, rb_q70_c, tv_q70_c).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70c(isRBCheckedThree(rg_q70_c, rb_q70_c, tv_q70_c));
            }


            if (isRBCheckedThree(rg_q70_d, rb_q70_d, tv_q70_d).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70d(isRBCheckedThree(rg_q70_d, rb_q70_d, tv_q70_d));
            }


            if (isRBCheckedThree(rg_q70_e, rb_q70_e, tv_q70_e).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70e(isRBCheckedThree(rg_q70_e, rb_q70_e, tv_q70_e));
            }


            if (isRBCheckedThree(rg_q70_f, rb_q70_f, tv_q70_f).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70f(isRBCheckedThree(rg_q70_f, rb_q70_f, tv_q70_f));
            }


            if (isRBCheckedThree(rg_q70_g, rb_q70_g, tv_q70_g).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70g(isRBCheckedThree(rg_q70_g, rb_q70_g, tv_q70_g));
            }


            if (isRBCheckedThree(rg_q70_h, rb_q70_h, tv_q70_h).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70h(isRBCheckedThree(rg_q70_h, rb_q70_h, tv_q70_h));
            }


            if (isRBCheckedThree(rg_q70_i, rb_q70_i, tv_q70_i).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70i(isRBCheckedThree(rg_q70_i, rb_q70_i, tv_q70_i));
            }


            if (isRBCheckedThree(rg_q70_j, rb_q70_j, tv_q70_j).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70j(isRBCheckedThree(rg_q70_j, rb_q70_j, tv_q70_j));
            }


            if (isRBCheckedThree(rg_q70_k, rb_q70_k, tv_q70_k).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70k(isRBCheckedThree(rg_q70_k, rb_q70_k, tv_q70_k));
            }


            if (isRBCheckedThree(rg_q70_l, rb_q70_l, tv_q70_l).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70l(isRBCheckedThree(rg_q70_l, rb_q70_l, tv_q70_l));
            }


            if (isRBCheckedThree(rg_q70_m, rb_q70_m, tv_q70_m).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70m(isRBCheckedThree(rg_q70_m, rb_q70_m, tv_q70_m));
            }

            if (isRBCheckedThree(rg_q70_n, rb_q70_n, tv_q70_n).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ70n(isRBCheckedThree(rg_q70_n, rb_q70_n, tv_q70_n));
            }

            if(getEditText(rg_q70_o, rb_q70_o,et_q70_o,tv_q70_o,ContantsValues.YES,"","","","","").equals("")){
                validation = false;
            }else {
                CRF3bActivity.formCrf3bDTO.setQ70o(getEditText(rg_q70_o, rb_q70_o,et_q70_o,tv_q70_o,ContantsValues.YES,"","","","",""));
            }


        }


        if(ll_q71.getVisibility()==View.VISIBLE){



            if (isRBCheckedThree(rg_q71_a, rb_q71_a, tv_q71_a).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71a(isRBCheckedThree(rg_q71_a, rb_q71_a, tv_q71_a));
            }

            if (isRBCheckedThree(rg_q71_b, rb_q71_b, tv_q71_b).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71b(isRBCheckedThree(rg_q71_b, rb_q71_b, tv_q71_b));
            }

            if (isRBCheckedThree(rg_q71_c, rb_q71_c, tv_q71_c).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71c(isRBCheckedThree(rg_q71_c, rb_q71_c, tv_q71_c));
            }

            if (isRBCheckedThree(rg_q71_d, rb_q71_d, tv_q71_d).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71d(isRBCheckedThree(rg_q71_d, rb_q71_d, tv_q71_d));
            }

            if (isRBCheckedThree(rg_q71_e, rb_q71_e, tv_q71_e).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71e(isRBCheckedThree(rg_q71_e, rb_q71_e, tv_q71_e));
            }


            if (isRBCheckedThree(rg_q71_f, rb_q71_f, tv_q71_f).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71f(isRBCheckedThree(rg_q71_f, rb_q71_f, tv_q71_f));
            }

            if (isRBCheckedThree(rg_q71_g, rb_q71_g, tv_q71_g).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71g(isRBCheckedThree(rg_q71_g, rb_q71_g, tv_q71_g));
            }

            if (isRBCheckedThree(rg_q71_h, rb_q71_h, tv_q71_h).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71h(isRBCheckedThree(rg_q71_h, rb_q71_h, tv_q71_h));
            }

            if (isRBCheckedThree(rg_q71_i, rb_q71_i, tv_q71_i).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71i(isRBCheckedThree(rg_q71_i, rb_q71_i, tv_q71_i));
            }

            if (isRBCheckedThree(rg_q71_j, rb_q71_j, tv_q71_j).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71j(isRBCheckedThree(rg_q71_j, rb_q71_j, tv_q71_j));
            }

            if (isRBCheckedThree(rg_q71_k, rb_q71_k, tv_q71_k).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formCrf3bDTO.setQ71k(isRBCheckedThree(rg_q71_k, rb_q71_k, tv_q71_k));
            }

            if(getEditText(rg_q71_l, rb_q71_l,et_q71_l,tv_q71_l,ContantsValues.YES,"","","","","").equals("")){
                validation = false;
            }else {
                CRF3bActivity.formCrf3bDTO.setQ71l(getEditText(rg_q71_l, rb_q71_l,et_q71_l,tv_q71_l,ContantsValues.YES,"","","","",""));
            }

        }


        return validation;
    }

    int x,y;
    public void setFocuseable(float x1, float y1){

        x = (int) x1;
        y = (int) y1;

        scrollview.post(new Runnable() {
            public void run() {
                scrollview.scrollTo(x,y); // these are your x and y coordinates
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

    public String getEditText(RadioGroup rg, RadioButton rb, EditText editText ,TextView tv, String id, String id2, String id3, String id4, String id5, String id6){

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
