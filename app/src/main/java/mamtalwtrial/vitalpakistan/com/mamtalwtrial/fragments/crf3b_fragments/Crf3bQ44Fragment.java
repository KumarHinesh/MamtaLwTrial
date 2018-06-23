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
import android.widget.RadioButton;
import android.widget.RadioGroup;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;

public class Crf3bQ44Fragment extends Fragment {

    Button btn_submit;
    String q44 = "";
    String q45 = "";
    String q46 = "";
    String q48 = "";
    String q49 = "";
    String q51 = "";
    String q52 = "";
    String q53 = "";
    String q54 = "";
    String q55 = "";
    String q56 = "";
    String q57 = "";
    String q60 = "";
    String q61 = "";
    String q62 = "";
    String q63 = "";
    String q64 = "";

    String q65a = "";
    String q65b = "";
    String q65c = "";
    String q65d = "";
    String q65e = "";
    String q65f = "";
    String q65g = "";
    String q65h = "";
    String q65i = "";
    String q65j = "";
    String q65k = "";
    String q65l = "";
    String q65m = "";
    String q69 = "";



    EditText et_q48, et_q51, et_q45, et_q60, et_q62, et_q70_o, et_q71_l, et_q47, et_q50, et_q58, et_q59, et_q66_a, et_q66_b, et_q66_c, et_q68_a, et_q68_b, et_q68_c;

    RadioGroup rg_gender, rg_q46, rg_q48, rg_q49, rg_q51, rg_q52, rg_q45, rg_q60, rg_q61, rg_q62, rg_q63, rg_q64, rg_q65_a, rg_q65_b, rg_q65_c,
                rg_q65_d, rg_q65_e, rg_q65_f, rg_q65_g, rg_q65_h, rg_q65_i,rg_q65_j,rg_q65_k,rg_q65_l,rg_q65_m,rg_q70_o, rg_q71_l
               ,rg_q53, rg_q54, rg_q55,rg_q56, rg_q57, rg_q69 ;

    RadioButton rb_gender,rb_q46, rb_q48, rb_q49,rb_q51, rb_q52, rb_q45, rb_q60, rb_q61, rb_q62, rb_q63, rb_q64, rb_q65_a, rb_q65_b,rb_q65_c,
                  rb_q65_d,rb_q65_e, rb_q65_f,rb_q65_g,rb_q65_h,rb_q65_i,rb_q65_j, rb_q65_k,rb_q65_l,rb_q65_m,
                    rb_q70_o, rb_q71_l, rb_q53, rb_q54, rb_q55, rb_q56,rb_q57, rb_q69;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf3b_q44, container, false);

            et_q47 = (EditText) view.findViewById(R.id.et_q47);
            et_q48 = (EditText) view.findViewById(R.id.et_q48);
            et_q50 = (EditText) view.findViewById(R.id.et_q50);
            et_q51 = (EditText) view.findViewById(R.id.et_q51);
            et_q58 = (EditText) view.findViewById(R.id.et_q58);
            et_q59 = (EditText) view.findViewById(R.id.et_q59);
            et_q45 = (EditText) view.findViewById(R.id.et_q45);
            et_q60 = (EditText) view.findViewById(R.id.et_q60);
            et_q62 = (EditText) view.findViewById(R.id.et_q62);
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

                    Crf3bQ72Fragment crf3bQ72Fragment = new Crf3bQ72Fragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf3b, crf3bQ72Fragment);
                    fragmentTransaction.commit();

                }
            });

            rg_gender = (RadioGroup) view.findViewById(R.id.rg_gender);
            rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    rb_gender = (RadioButton) view.findViewById(rg_gender.getCheckedRadioButtonId());
                    q44 = rb_gender.getText().toString();

                }
            });


            rg_q46 = (RadioGroup) view.findViewById(R.id.rg_q46);
            rg_q46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    rb_q46 = (RadioButton) view.findViewById(rg_q46.getCheckedRadioButtonId());
                    q46 = rb_q46.getTag().toString();

                }
            });


            rg_q48 = (RadioGroup) view.findViewById(R.id.rg_q48);
            rg_q48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    rb_q48 = (RadioButton) view.findViewById(rg_q48.getCheckedRadioButtonId());

                    if(rb_q48.getTag().toString().equalsIgnoreCase("4")){
                        q48 = "4";
                        et_q48.setVisibility(View.VISIBLE);

                    }else {

                        et_q48.setVisibility(View.GONE);
                        CRF3bActivity.formCrf3bDTO.setQ48(rb_q48.getTag().toString());
                    }

                }
            });

        rg_q49 = (RadioGroup) view.findViewById(R.id.rg_q49);
        rg_q49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q49 = (RadioButton) view.findViewById(rg_q49.getCheckedRadioButtonId());

                q49 = rb_q49.getTag().toString();

            }
        });

        rg_q51 = (RadioGroup) view.findViewById(R.id.rg_q51);
        rg_q51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q51 = (RadioButton) view.findViewById(rg_q51.getCheckedRadioButtonId());

                if(rb_q51.getTag().toString().equalsIgnoreCase("8")){
                    q51 = rb_q51.getTag().toString();
                    et_q51.setVisibility(View.VISIBLE);
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ51(rb_q51.getTag().toString());
                    et_q51.setVisibility(View.GONE);
                }


            }
        });

        rg_q52 = (RadioGroup) view.findViewById(R.id.rg_q52);
        rg_q52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q52 = (RadioButton) view.findViewById(rg_q52.getCheckedRadioButtonId());
                q52 = rb_q52.getTag().toString();
            }
        });

        rg_q53 = (RadioGroup) view.findViewById(R.id.rg_q53);
        rg_q53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q53 = (RadioButton) view.findViewById(rg_q53.getCheckedRadioButtonId());
                q53 = rb_q53.getTag().toString();
            }
        });

        rg_q54 = (RadioGroup) view.findViewById(R.id.rg_q54);
        rg_q54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q54 = (RadioButton) view.findViewById(rg_q54.getCheckedRadioButtonId());
                q54 = rb_q54.getTag().toString();
            }
        });

        rg_q55 = (RadioGroup) view.findViewById(R.id.rg_q55);
        rg_q55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q55 = (RadioButton) view.findViewById(rg_q55.getCheckedRadioButtonId());
                q55 = rb_q55.getTag().toString();
            }
        });

        rg_q56 = (RadioGroup) view.findViewById(R.id.rg_q56);
        rg_q56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q56 = (RadioButton) view.findViewById(rg_q56.getCheckedRadioButtonId());
                q56 = rb_q56.getTag().toString();
            }
        });

        rg_q57 = (RadioGroup) view.findViewById(R.id.rg_q57);
        rg_q57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q57 = (RadioButton) view.findViewById(rg_q57.getCheckedRadioButtonId());
                q57 = rb_q57.getTag().toString();
            }
        });


        rg_q65_a = (RadioGroup) view.findViewById(R.id.rg_q65_a);
        rg_q65_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_a = (RadioButton) view.findViewById(rg_q65_a.getCheckedRadioButtonId());
                q65a = rb_q65_a.getTag().toString();
            }
        });


        rg_q65_b = (RadioGroup) view.findViewById(R.id.rg_q65_b);
        rg_q65_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_b = (RadioButton) view.findViewById(rg_q65_b.getCheckedRadioButtonId());
                q65b = rb_q65_b.getTag().toString();
            }
        });


        rg_q65_c = (RadioGroup) view.findViewById(R.id.rg_q65_c);
        rg_q65_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_c = (RadioButton) view.findViewById(rg_q65_c.getCheckedRadioButtonId());
                q65c = rb_q65_c.getTag().toString();
            }
        });

        rg_q65_d = (RadioGroup) view.findViewById(R.id.rg_q65_d);
        rg_q65_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_d = (RadioButton) view.findViewById(rg_q65_d.getCheckedRadioButtonId());
                q65d = rb_q65_d.getTag().toString();
            }
        });


        rg_q65_e = (RadioGroup) view.findViewById(R.id.rg_q65_e);
        rg_q65_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_e = (RadioButton) view.findViewById(rg_q65_e.getCheckedRadioButtonId());
                q65e = rb_q65_e.getTag().toString();
            }
        });

        rg_q65_f = (RadioGroup) view.findViewById(R.id.rg_q65_f);
        rg_q65_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_f = (RadioButton) view.findViewById(rg_q65_f.getCheckedRadioButtonId());
                q65f = rb_q65_f.getTag().toString();
            }
        });
        rg_q65_g = (RadioGroup) view.findViewById(R.id.rg_q65_g);
        rg_q65_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_g = (RadioButton) view.findViewById(rg_q65_g.getCheckedRadioButtonId());
                q65g = rb_q65_g.getTag().toString();
            }
        });
        rg_q65_h = (RadioGroup) view.findViewById(R.id.rg_q65_h);
        rg_q65_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_h = (RadioButton) view.findViewById(rg_q65_h.getCheckedRadioButtonId());
                q65h = rb_q65_h.getTag().toString();
            }
        });

        rg_q65_i = (RadioGroup) view.findViewById(R.id.rg_q65_i);
        rg_q65_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_i = (RadioButton) view.findViewById(rg_q65_i.getCheckedRadioButtonId());
                q65i = rb_q65_i.getTag().toString();
            }
        });

        rg_q65_j = (RadioGroup) view.findViewById(R.id.rg_q65_j);
        rg_q65_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_j = (RadioButton) view.findViewById(rg_q65_j.getCheckedRadioButtonId());
                q65j = rb_q65_j.getTag().toString();
            }
        });

        rg_q65_k = (RadioGroup) view.findViewById(R.id.rg_q65_k);
        rg_q65_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_k = (RadioButton) view.findViewById(rg_q65_k.getCheckedRadioButtonId());
                q65k = rb_q65_k.getTag().toString();
            }
        });

        rg_q65_l = (RadioGroup) view.findViewById(R.id.rg_q65_l);
        rg_q65_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_l = (RadioButton) view.findViewById(rg_q65_l.getCheckedRadioButtonId());
                q65l = rb_q65_l.getTag().toString();
            }
        });

        rg_q65_m = (RadioGroup) view.findViewById(R.id.rg_q65_m);
        rg_q65_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q65_m = (RadioButton) view.findViewById(rg_q65_m.getCheckedRadioButtonId());
                q65m = rb_q65_m.getTag().toString();
            }
        });



        rg_q45 = (RadioGroup) view.findViewById(R.id.rg_q45);
        rg_q45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q45 = (RadioButton) view.findViewById(rg_q45.getCheckedRadioButtonId());

                if(rb_q45.getTag().toString().equalsIgnoreCase("11")){
                    q45 =  "y";
                    et_q51.setVisibility(View.VISIBLE);

                }else {
                    et_q51.setVisibility(View.GONE);
                    q45 = "n";
                }


            }
        });


        rg_q60 = (RadioGroup) view.findViewById(R.id.rg_q60);
        rg_q60.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q60 = (RadioButton) view.findViewById(rg_q60.getCheckedRadioButtonId());

                if(rb_q60.getTag().toString().equalsIgnoreCase("8")){
                    q60 = "8";
                    et_q60.setVisibility(View.VISIBLE);
                }else {
                    et_q60.setVisibility(View.GONE);
                    q60 = rb_q60.getTag().toString();
                }


            }
        });

        rg_q61 = (RadioGroup) view.findViewById(R.id.rg_q61);
        rg_q61.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q61 = (RadioButton) view.findViewById(rg_q61.getCheckedRadioButtonId());
                q61 = rb_q61.getTag().toString();
            }
        });

        rg_q62 = (RadioGroup) view.findViewById(R.id.rg_q62);
        rg_q62.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q62 = (RadioButton) view.findViewById(rg_q62.getCheckedRadioButtonId());

                if(rb_q62.getTag().toString().equalsIgnoreCase("7")){

                    q62 = rb_q62.getTag().toString();
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
                rb_q63 = (RadioButton) view.findViewById(rg_q63.getCheckedRadioButtonId());
                q63 = rb_q63.getTag().toString();
            }
        });

        rg_q64 = (RadioGroup) view.findViewById(R.id.rg_q64);
        rg_q64.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q64 = (RadioButton) view.findViewById(rg_q64.getCheckedRadioButtonId());
                q64 = rb_q64.getTag().toString();
            }
        });

        rg_q69 = (RadioGroup) view.findViewById(R.id.rg_q69);
        rg_q69.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q69 = (RadioButton) view.findViewById(rg_q69.getCheckedRadioButtonId());
                q69 = rb_q69.getTag().toString();
            }
        });



        rg_q70_o = (RadioGroup) view.findViewById(R.id.rg_q70_o);
        rg_q70_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q70_o = (RadioButton) view.findViewById(rg_q70_o.getCheckedRadioButtonId());

                if(rb_q70_o.getTag().toString().equalsIgnoreCase("yes")){

                    et_q70_o.setVisibility(View.VISIBLE);
                }else {
                    et_q70_o.setVisibility(View.GONE);
                }

            }
        });


        rg_q71_l = (RadioGroup) view.findViewById(R.id.rg_q71_l);
        rg_q71_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q71_l = (RadioButton) view.findViewById(rg_q71_l.getCheckedRadioButtonId());

                if(rb_q71_l.getTag().toString().equalsIgnoreCase("yes")){

                    et_q71_l.setVisibility(View.VISIBLE);
                }else {
                    et_q71_l.setVisibility(View.GONE);
                }

            }
        });

        return view;
    }

    public void insertValues(){

        CRF3bActivity.formCrf3bDTO.setQ44(q44);
        CRF3bActivity.formCrf3bDTO.setQ49(q49);
        CRF3bActivity.formCrf3bDTO.setQ52(q52);
        CRF3bActivity.formCrf3bDTO.setQ53(q53);
        CRF3bActivity.formCrf3bDTO.setQ54(q54);
        CRF3bActivity.formCrf3bDTO.setQ55(q55);
        CRF3bActivity.formCrf3bDTO.setQ58(et_q58.getText().toString());
        CRF3bActivity.formCrf3bDTO.setQ59(et_q59.getText().toString());
        CRF3bActivity.formCrf3bDTO.setQ63(q63);
        CRF3bActivity.formCrf3bDTO.setQ63(q64);
        CRF3bActivity.formCrf3bDTO.setQ65a(q65a);
        CRF3bActivity.formCrf3bDTO.setQ65b(q65b);
        CRF3bActivity.formCrf3bDTO.setQ65c(q65c);
        CRF3bActivity.formCrf3bDTO.setQ65d(q65d);
        CRF3bActivity.formCrf3bDTO.setQ65e(q65e);
        CRF3bActivity.formCrf3bDTO.setQ65f(q65f);
        CRF3bActivity.formCrf3bDTO.setQ65g(q65g);
        CRF3bActivity.formCrf3bDTO.setQ65h(q65h);
        CRF3bActivity.formCrf3bDTO.setQ65i(q65i);
        CRF3bActivity.formCrf3bDTO.setQ65j(q65j);
        CRF3bActivity.formCrf3bDTO.setQ65k(q65k);
        CRF3bActivity.formCrf3bDTO.setQ65l(q65l);
        CRF3bActivity.formCrf3bDTO.setQ65m(q65m);
        CRF3bActivity.formCrf3bDTO.setQ69(q69);



        if(!et_q66_a.getText().toString().equalsIgnoreCase("")){

             CRF3bActivity.formCrf3bDTO.setQ66a(et_q66_a.getText().toString());
        }else {et_q66_a.setError("Required");  }

        if(!et_q66_b.getText().toString().equalsIgnoreCase("")){
            CRF3bActivity.formCrf3bDTO.setQ66b(et_q66_b.getText().toString());
        }else {et_q66_b.setError("Required");  }

        if(!et_q66_c.getText().toString().equalsIgnoreCase("")){
            CRF3bActivity.formCrf3bDTO.setQ66c(et_q66_c.getText().toString());
        }else {et_q66_c.setError("Required");  }


        if(!et_q68_a.getText().toString().equalsIgnoreCase("")){

            CRF3bActivity.formCrf3bDTO.setQ68a(et_q68_a.getText().toString());
        }else {et_q68_a.setError("Required");  }

        if(!et_q68_b.getText().toString().equalsIgnoreCase("")){
            CRF3bActivity.formCrf3bDTO.setQ68b(et_q68_b.getText().toString());
        }else {et_q68_b.setError("Required");  }

        if(!et_q68_c.getText().toString().equalsIgnoreCase("")){
            CRF3bActivity.formCrf3bDTO.setQ68c(et_q68_c.getText().toString());
        }else {et_q68_c.setError("Required");  }



        if(et_q47.getText().toString().isEmpty()){ et_q47.setError("Required");}
        else { CRF3bActivity.formCrf3bDTO.setQ47(et_q47.getText().toString()); }

        if(et_q50.getText().toString().isEmpty()){ et_q50.setError("Required");}
        else { CRF3bActivity.formCrf3bDTO.setQ50(et_q50.getText().toString()); }

        if(q48.equalsIgnoreCase("4")){ CRF3bActivity.formCrf3bDTO.setQ48( et_q48.getText().toString()); }
        if(q51.equalsIgnoreCase("8")){ CRF3bActivity.formCrf3bDTO.setQ51( et_q51.getText().toString()); }


        if(q45.equalsIgnoreCase("y")){

            CRF3bActivity.formCrf3bDTO.setQ45(et_q45.getText().toString());
        }

        if(q60.equalsIgnoreCase("8")){

            CRF3bActivity.formCrf3bDTO.setQ60(et_q60.getText().toString());
        }

        if(q62.equalsIgnoreCase("7")){

            CRF3bActivity.formCrf3bDTO.setQ62(et_q62.getText().toString());
        }

    }



}
