package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.AnthroDashBoard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.Crf6Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Vaccination;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VaccinationFragment extends Fragment {

    RadioButton rb_bcgo, rb_opv0, rb_opv1, rb_penta1, rb_pcv1, rb_rota1, rb_opv2, rb_penta2,
            rb_pcv2, rb_rota2, rb_opv3, rb_penta3, rb_pcv3, rb_ipv, rb_bcgo_prove, rb_bcgo_isVpt, rb_opv0_prove,
            rb_opv0_isVpt, rb_opv1_prove, rb_opv1_isVpt, rb_penta1_prove, rb_penta1_isVpt, rb_pcv1_prove, rb_pcv1_isVpt,
            rb_rota1_prove, rb_rota1_isVpt, rb_opv2_prove, rb_opv2_isVpt, rb_penta2_prove,
            rb_penta2_isVpt, rb_pcv2_prove, rb_pcv2_isVpt, rb_rota2_prove, rb_rota2_isVpt,
            rb_opv3_prove, rb_opv3_isVpt, rb_penta3_prove, rb_penta3_isVpt, rb_pcv3_prove,
            rb_pcv3_isVpt, rb_ipv_prove, rb_ipv_isVpt;

    RadioGroup rg_bcgo, rg_opv0, rg_opv1, rg_penta1, rg_pcv1, rg_rota1, rg_opv2, rg_penta2,
                    rg_pcv2, rg_rota2, rg_opv3, rg_penta3, rg_pcv3, rg_ipv, rg_bcgo_prove,
                    rg_bcgo_isVpt, rg_opv0_prove, rg_opv0_isVpt, rg_opv1_prove, rg_opv1_isVpt, rg_penta1_prove,
                    rg_penta1_isVpt, rg_pcv1_prove, rg_pcv1_isVpt, rg_rota1_prove, rg_rota1_isVpt, rg_opv2_prove,
                    rg_opv2_isVpt, rg_penta2_prove, rg_penta2_isVpt, rg_pcv2_prove, rg_pcv2_isVpt, rg_rota2_prove,
                    rg_rota2_isVpt, rg_opv3_prove, rg_opv3_isVpt, rg_penta3_prove, rg_penta3_isVpt, rg_pcv3_prove,
                    rg_pcv3_isVpt, rg_ipv_prove, rg_ipv_isVpt;

    TextView tv_bcgo_date, tv_opv0_date, tv_opv1_date, tv_penta1_date, tv_pcv1_date, tv_rota1_date, tv_opv2_date
               , tv_penta2_date, tv_pcv2_date, tv_rota2_date, tv_opv3_date, tv_penta3_date, tv_pcv3_date, tv_ipv_date;

    TextView tv_bcgo, tv_opv0, tv_opv1, tv_penta1, tv_pcv1, tv_rota1, tv_opv2, tv_penta2, tv_pcv2, tv_rota2
            , tv_opv3, tv_penta3, tv_pcv3, tv_ipv;

    TextView tv_bcgo_prove, tv_bcgo_isVpt, tv_opv0_prove, tv_opv0_isVpt, tv_opv1_prove, tv_opv1_isVpt,
            tv_penta1_prove, tv_penta1_isVpt, tv_pcv1_prove, tv_pcv1_isVpt, tv_rota1_prove, tv_rota1_isVpt,
            tv_opv2_prove, tv_opv2_isVpt, tv_penta2_prove, tv_penta2_isVpt, tv_pcv2_prove, tv_pcv2_isVpt,
            tv_rota2_prove, tv_rota2_isVpt, tv_opv3_prove, tv_opv3_isVpt, tv_penta3_prove, tv_penta3_isVpt,
            tv_pcv3_prove, tv_pcv3_isVpt, tv_ipv_prove, tv_ipv_isVpt;

    ScrollView scrolView;

    Calendar calendar;

    ProgressDialog progressDialog;

    LinearLayout ll_bcgo_prove, ll_bcgo_vpt, ll_opv0_prove, ll_opv0_vpt, ll_opv1_prove, ll_opv1_vpt, ll_penta1_prove
            , ll_penta1_vpt, ll_pcv1_prove, ll_pcv1_vpt, ll_rota1_prove, ll_rota1_vpt, ll_opv2_prove, ll_opv2_vpt,
            ll_penta2_prove, ll_penta2_vpt, ll_pcv2_prove, ll_pcv2_vpt, ll_rota2_prove, ll_rota2_vpt, ll_opv3_prove,
            ll_opv3_vpt, ll_penta3_prove, ll_penta3_vpt, ll_pcv3_prove, ll_pcv3_vpt, ll_ipv_prove, ll_ipv_vpt;

    LinearLayout ll_bcg0_show, ll_opv0_show, ll_opv1_show, ll_penta1_show, ll_pcv1_show, ll_rota1_show, ll_opv2_show,
                ll_penta2_show, ll_pcv2_show, ll_rota2_show, ll_opv3_show, ll_penta3_show, ll_pcv3_show, ll_ipv_show;

    TextView tv_bcg0_show, tv_bcg0_prove_show, tv_bcg0_isVpt_show, tv_opv0_show, tv_opv0_prove_show,
            tv_opv0_isVpt_show, tv_opv1_show, tv_opv1_prove_show, tv_opv1_isVpt_show, tv_penta1_show,
            tv_penta1_prove_show, tv_penta1_isVpt_show, tv_pcv1_show, tv_pcv1_prove_show, tv_pcv1_isVpt_show,
            tv_rota1_show, tv_rota1_prove_show, tv_rota1_isVpt_show, tv_opv2_show, tv_opv2_prove_show, tv_opv2_isVpt_show,
            tv_penta2_show, tv_penta2_prove_show, tv_penta2_isVpt_show, tv_pcv2_show, tv_pcv2_prove_show, tv_pcv2_isVpt_show,
            tv_rota2_show, tv_rota2_prove_show, tv_rota2_isVpt_show, tv_opv3_show, tv_opv3_prove_show, tv_opv3_isVpt_show,
            tv_penta3_show, tv_penta3_prove_show, tv_penta3_isVpt_show,
            tv_pcv3_show, tv_pcv3_prove_show, tv_pcv3_isVpt_show, tv_ipv_show, tv_ipv_prove_show, tv_ipv_isVpt_show;

    LinearLayout ll_bcg0, ll_opv0, ll_opv1, ll_penta1, ll_pcv1, ll_rota1, ll_opv2, ll_penta2, ll_pcv2,
            ll_rota2, ll_opv3, ll_penta3, ll_pcv3, ll_ipv;

    Vaccination vaccination;

    Button btn_submit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_vaccination, container, false);
        initializeView(view);
        putDataInFields();
        calendar = Calendar.getInstance();

        vaccination = new Vaccination();
        vaccination.setStudies(Crf6Activity.studiesDTO);



         rg_bcgo_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_bcgo_prove = (RadioButton) view.findViewById(rg_bcgo_prove.getCheckedRadioButtonId());


             }
         });

         rg_bcgo_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_bcgo_isVpt = (RadioButton) view.findViewById(rg_bcgo_isVpt.getCheckedRadioButtonId());


             }
         });

         rg_opv0_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_opv0_prove = (RadioButton) view.findViewById(rg_opv0_prove.getCheckedRadioButtonId());

             }
         });

         rg_opv0_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_opv0_isVpt = (RadioButton) view.findViewById(rg_opv0_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_opv1_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_opv1_prove = (RadioButton) view.findViewById(rg_opv1_prove.getCheckedRadioButtonId());

             }
         });

         rg_opv1_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_opv1_isVpt = (RadioButton) view.findViewById(rg_opv1_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_penta1_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_penta1_prove = (RadioButton) view.findViewById(rg_penta1_prove.getCheckedRadioButtonId());

             }
         });

         rg_penta1_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_penta1_isVpt = (RadioButton) view.findViewById(rg_penta1_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_pcv1_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_pcv1_prove = (RadioButton) view.findViewById(rg_pcv1_prove.getCheckedRadioButtonId());

             }
         });

         rg_pcv1_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_pcv1_isVpt = (RadioButton) view.findViewById(rg_pcv1_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_rota1_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_rota1_prove = (RadioButton) view.findViewById(rg_rota1_prove.getCheckedRadioButtonId());
             }
         });

         rg_rota1_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_rota1_isVpt = (RadioButton) view.findViewById(rg_rota1_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_opv2_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_opv2_prove = (RadioButton) view.findViewById(rg_opv2_prove.getCheckedRadioButtonId());
             }
         });

         rg_opv2_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_opv2_isVpt = (RadioButton) view.findViewById(rg_opv2_isVpt.getCheckedRadioButtonId());
             }
         });

         rg_penta2_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_penta2_prove = (RadioButton) view.findViewById(rg_penta2_prove.getCheckedRadioButtonId());

             }
         });

         rg_penta2_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_penta2_isVpt = (RadioButton) view.findViewById(rg_penta2_isVpt.getCheckedRadioButtonId());
             }
         });

         rg_pcv2_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_pcv2_prove = (RadioButton) view.findViewById(rg_pcv2_prove.getCheckedRadioButtonId());

             }
         });

         rg_pcv2_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_pcv2_isVpt = (RadioButton) view.findViewById(rg_pcv2_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_rota2_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_rota2_prove = (RadioButton) view.findViewById(rg_rota2_prove.getCheckedRadioButtonId());

             }
         });

         rg_rota2_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_rota2_isVpt = (RadioButton) view.findViewById(rg_rota2_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_opv3_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_opv3_prove = (RadioButton) view.findViewById(rg_opv3_prove.getCheckedRadioButtonId());

             }
         });

         rg_opv3_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_opv3_isVpt = (RadioButton) view.findViewById(rg_opv3_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_penta3_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_penta3_prove = (RadioButton) view.findViewById(rg_penta3_prove.getCheckedRadioButtonId());

             }
         });

         rg_penta3_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_penta3_isVpt = (RadioButton) view.findViewById(rg_penta3_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_pcv3_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_pcv3_prove = (RadioButton) view.findViewById(rg_pcv3_prove.getCheckedRadioButtonId());

             }
         });

         rg_pcv3_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_pcv3_isVpt = (RadioButton) view.findViewById(rg_pcv3_isVpt.getCheckedRadioButtonId());

             }
         });


         rg_ipv_prove.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_ipv_prove = (RadioButton) view.findViewById(rg_ipv_prove.getCheckedRadioButtonId());

             }
         });

         rg_ipv_isVpt.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {

                 rb_ipv_isVpt = (RadioButton) view.findViewById(rg_ipv_isVpt.getCheckedRadioButtonId());

             }
         });

         rg_bcgo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_bcgo = (RadioButton) view.findViewById(rg_bcgo.getCheckedRadioButtonId());

                if(rb_bcgo.getTag().equals("1")){
                    tv_bcgo_date.setEnabled(true);
                    tv_bcgo_date.setVisibility(View.VISIBLE);
                    ll_bcgo_prove.setVisibility(View.VISIBLE);
                    ll_bcgo_vpt.setVisibility(View.VISIBLE);
                }else if (rb_bcgo.getTag().equals("2")){
                    tv_bcgo_date.setVisibility(View.GONE);
                    ll_bcgo_prove.setVisibility(View.GONE);
                    ll_bcgo_vpt.setVisibility(View.GONE);
                }else if (rb_bcgo.getTag().equals("3")){
                    tv_bcgo_date.setEnabled(false);
                    ll_bcgo_prove.setVisibility(View.VISIBLE);
                    ll_bcgo_vpt.setVisibility(View.VISIBLE);
                    tv_bcgo_date.setText("99-9-9999");
                }

            }
        });

         rg_opv0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_opv0 = (RadioButton) view.findViewById(rg_opv0.getCheckedRadioButtonId());

                if(rb_opv0.getTag().equals("1")){
                    tv_opv0_date.setEnabled(true);
                    tv_opv0_date.setVisibility(View.VISIBLE);
                    ll_opv0_prove.setVisibility(View.VISIBLE);
                    ll_opv0_vpt.setVisibility(View.VISIBLE);
                }else if (rb_opv0.getTag().equals("2")){
                    ll_opv0_prove.setVisibility(View.GONE);
                    ll_opv0_vpt.setVisibility(View.GONE);
                    tv_opv0_date.setVisibility(View.GONE);
                }else if (rb_opv0.getTag().equals("3")){
                    tv_opv0_date.setEnabled(false);
                    ll_opv0_prove.setVisibility(View.VISIBLE);
                    ll_opv0_vpt.setVisibility(View.VISIBLE);
                    tv_opv0_date.setText("99-9-9999");
                }
            }
        });

         rg_opv1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_opv1 = (RadioButton) view.findViewById(rg_opv1.getCheckedRadioButtonId());

                if(rb_opv1.getTag().equals("1")){
                    ll_opv1_prove.setVisibility(View.VISIBLE);
                    ll_opv1_vpt.setVisibility(View.VISIBLE);
                    tv_opv1_date.setEnabled(true);
                    tv_opv1_date.setVisibility(View.VISIBLE);
                }else if (rb_opv1.getTag().equals("2")){
                    ll_opv1_prove.setVisibility(View.GONE);
                    ll_opv1_vpt.setVisibility(View.GONE);
                    tv_opv1_date.setVisibility(View.GONE);
                }else if (rb_opv1.getTag().equals("3")){
                    ll_opv1_prove.setVisibility(View.VISIBLE);
                    ll_opv1_vpt.setVisibility(View.VISIBLE);
                    tv_opv1_date.setEnabled(false);
                    tv_opv1_date.setText("99-9-9999");
                }
            }
        });

         rg_penta1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_penta1 = (RadioButton) view.findViewById(rg_penta1.getCheckedRadioButtonId());

                if(rb_penta1.getTag().equals("1")){
                    tv_penta1_date.setEnabled(true);
                    ll_penta1_prove.setVisibility(View.VISIBLE);
                    ll_penta1_vpt.setVisibility(View.VISIBLE);
                    tv_penta1_date.setVisibility(View.VISIBLE);
                }else if (rb_penta1.getTag().equals("2")){
                    ll_penta1_prove.setVisibility(View.GONE);
                    ll_penta1_vpt.setVisibility(View.GONE);
                    tv_penta1_date.setVisibility(View.GONE);
                }else if (rb_penta1.getTag().equals("3")){
                    tv_penta1_date.setEnabled(false);
                    ll_penta1_prove.setVisibility(View.VISIBLE);
                    ll_penta1_vpt.setVisibility(View.VISIBLE);
                    tv_penta1_date.setText("99-9-9999");
                }

            }
        });

        rg_pcv1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_pcv1 = (RadioButton) view.findViewById(rg_pcv1.getCheckedRadioButtonId());

                if(rb_pcv1.getTag().equals("1")){
                    tv_pcv1_date.setEnabled(true);
                    tv_pcv1_date.setVisibility(View.VISIBLE);
                    ll_pcv1_prove.setVisibility(View.VISIBLE);
                    ll_pcv1_vpt.setVisibility(View.VISIBLE);
                }else if (rb_pcv1.getTag().equals("2")){
                    ll_pcv1_prove.setVisibility(View.GONE);
                    ll_pcv1_vpt.setVisibility(View.GONE);
                    tv_pcv1_date.setVisibility(View.GONE);
                }else if (rb_pcv1.getTag().equals("3")){
                    tv_pcv1_date.setEnabled(false);
                    ll_pcv1_prove.setVisibility(View.VISIBLE);
                    ll_pcv1_vpt.setVisibility(View.VISIBLE);
                    tv_pcv1_date.setText("99-9-9999");
                }
            }
        });

        rg_rota1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_rota1 = (RadioButton) view.findViewById(rg_rota1.getCheckedRadioButtonId());

                if(rb_rota1.getTag().equals("1")){
                    tv_rota1_date.setEnabled(true);
                    ll_rota1_vpt.setVisibility(View.VISIBLE);
                    ll_rota1_prove.setVisibility(View.VISIBLE);
                    tv_rota1_date.setVisibility(View.VISIBLE);
                }else if (rb_rota1.getTag().equals("2")){
                    ll_rota1_vpt.setVisibility(View.GONE);
                    ll_rota1_prove.setVisibility(View.GONE);
                    tv_rota1_date.setVisibility(View.GONE);
                }else if (rb_rota1.getTag().equals("3")){
                    ll_rota1_vpt.setVisibility(View.VISIBLE);
                    tv_rota1_date.setEnabled(false);
                    ll_rota1_prove.setVisibility(View.VISIBLE);
                    tv_rota1_date.setText("99-9-9999");
                }
            }
        });

        rg_opv2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_opv2 = (RadioButton) view.findViewById(rg_opv2.getCheckedRadioButtonId());

                if(rb_opv2.getTag().equals("1")){
                    tv_opv2_date.setEnabled(true);
                    ll_opv2_prove.setVisibility(View.VISIBLE);
                    ll_opv2_vpt.setVisibility(View.VISIBLE);
                    tv_opv2_date.setVisibility(View.VISIBLE);
                }else if (rb_opv2.getTag().equals("2")){
                    ll_opv2_prove.setVisibility(View.GONE);
                    ll_opv2_vpt.setVisibility(View.GONE);
                    tv_opv2_date.setVisibility(View.GONE);
                }else if (rb_opv2.getTag().equals("3")){
                    tv_opv2_date.setEnabled(false);
                    ll_opv2_prove.setVisibility(View.VISIBLE);
                    ll_opv2_vpt.setVisibility(View.VISIBLE);
                    tv_opv1_date.setText("99-9-9999");
                }

            }
        });

        rg_penta2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_penta2 = (RadioButton) view.findViewById(rg_penta2.getCheckedRadioButtonId());

                if(rb_penta2.getTag().equals("1")){
                    tv_penta2_date.setEnabled(true);
                    ll_penta2_prove.setVisibility(View.VISIBLE);
                    ll_penta2_vpt.setVisibility(View.VISIBLE);
                    tv_penta2_date.setVisibility(View.VISIBLE);
                }else if (rb_penta2.getTag().equals("2")){
                    ll_penta2_prove.setVisibility(View.GONE);
                    ll_penta2_vpt.setVisibility(View.GONE);
                    tv_penta2_date.setVisibility(View.GONE);
                }else if (rb_penta2.getTag().equals("3")){
                    tv_penta2_date.setEnabled(true);
                    ll_penta2_prove.setVisibility(View.VISIBLE);
                    ll_penta2_vpt.setVisibility(View.VISIBLE);
                    tv_penta2_date.setText("99-9-9999");
                }

            }
        });

        rg_pcv2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_pcv2 = (RadioButton) view.findViewById(rg_pcv2.getCheckedRadioButtonId());

                if(rb_pcv2.getTag().equals("1")) {
                    tv_pcv2_date.setEnabled(true);
                    ll_pcv2_prove.setVisibility(View.VISIBLE);
                    ll_pcv2_vpt.setVisibility(View.VISIBLE);
                    tv_pcv2_date.setVisibility(View.VISIBLE);
                }else if (rb_pcv2.getTag().equals("2")){
                    tv_pcv2_date.setVisibility(View.GONE);
                    ll_pcv2_prove.setVisibility(View.GONE);
                    ll_pcv2_vpt.setVisibility(View.GONE);
                }else if (rb_pcv2.getTag().equals("3")){
                    tv_pcv2_date.setEnabled(false);
                    ll_pcv2_prove.setVisibility(View.VISIBLE);
                    ll_pcv2_vpt.setVisibility(View.VISIBLE);
                    tv_pcv2_date.setText("99-9-9999");
                }
            }
        });

        rg_rota2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_rota2 = (RadioButton) view.findViewById(rg_rota2.getCheckedRadioButtonId());

                if(rb_rota2.getTag().equals("1")){
                    tv_rota2_date.setEnabled(true);
                    ll_rota2_prove.setVisibility(View.VISIBLE);
                    ll_rota2_vpt.setVisibility(View.VISIBLE);
                    tv_rota2_date.setVisibility(View.VISIBLE);
                }else if (rb_rota2.getTag().equals("2")){
                    ll_rota2_prove.setVisibility(View.GONE);
                    ll_rota2_vpt.setVisibility(View.GONE);
                    tv_rota2_date.setVisibility(View.GONE);
                }else if (rb_rota2.getTag().equals("3")){
                    tv_rota2_date.setEnabled(false);
                    ll_rota2_prove.setVisibility(View.VISIBLE);
                    ll_rota2_vpt.setVisibility(View.VISIBLE);
                    tv_rota2_date.setText("99-9-9999");
                }
            }
        });

        rg_opv3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_opv3 = (RadioButton) view.findViewById(rg_opv3.getCheckedRadioButtonId());

                if(rb_opv3.getTag().equals("1")){
                    tv_bcgo_date.setEnabled(true);
                    ll_opv3_vpt.setVisibility(View.VISIBLE);
                    ll_opv3_prove.setVisibility(View.VISIBLE);
                    tv_opv3_date.setVisibility(View.VISIBLE);
                }else if (rb_opv3.getTag().equals("2")){
                    ll_opv3_vpt.setVisibility(View.GONE);
                    ll_opv3_prove.setVisibility(View.GONE);
                    tv_opv3_date.setVisibility(View.GONE);
                }else if (rb_opv3.getTag().equals("3")){
                    tv_bcgo_date.setEnabled(false);
                    ll_opv3_vpt.setVisibility(View.VISIBLE);
                    ll_opv3_prove.setVisibility(View.VISIBLE);
                    tv_opv3_date.setText("99-9-9999");
                }
            }
        });

        rg_penta3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_penta3 = (RadioButton) view.findViewById(rg_penta3.getCheckedRadioButtonId());

                if(rb_penta3.getTag().equals("1")){
                    tv_penta3_date.setEnabled(true);
                    ll_penta3_vpt.setVisibility(View.VISIBLE);
                    ll_penta3_prove.setVisibility(View.VISIBLE);
                    tv_penta3_date.setVisibility(View.VISIBLE);
                }else if (rb_penta3.getTag().equals("2")){
                    ll_penta3_vpt.setVisibility(View.GONE);
                    ll_penta3_prove.setVisibility(View.GONE);
                    tv_penta3_date.setVisibility(View.GONE);
                }else if (rb_penta3.getTag().equals("3")){
                    tv_penta3_date.setEnabled(false);
                    ll_penta3_vpt.setVisibility(View.VISIBLE);
                    ll_penta3_prove.setVisibility(View.VISIBLE);
                    tv_penta3_date.setText("99-9-9999");
                }
            }
        });

        rg_pcv3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_pcv3 = (RadioButton) view.findViewById(rg_pcv3.getCheckedRadioButtonId());

                if(rb_pcv3.getTag().equals("1")){
                    tv_pcv3_date.setEnabled(true);
                    ll_pcv3_vpt.setVisibility(View.VISIBLE);
                    ll_pcv3_prove.setVisibility(View.VISIBLE);
                    tv_pcv3_date.setVisibility(View.VISIBLE);
                }else if (rb_pcv3.getTag().equals("2")){
                    ll_pcv3_vpt.setVisibility(View.GONE);
                    ll_pcv3_prove.setVisibility(View.GONE);
                    tv_pcv3_date.setVisibility(View.GONE);
                }else if (rb_pcv3.getTag().equals("3")){
                    tv_pcv3_date.setEnabled(false);
                    ll_pcv3_vpt.setVisibility(View.VISIBLE);
                    ll_pcv3_prove.setVisibility(View.VISIBLE);
                    tv_pcv3_date.setText("99-9-9999");
                }

            }
        });

        rg_ipv.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_ipv = (RadioButton) view.findViewById(rg_ipv.getCheckedRadioButtonId());

                if(rb_ipv.getTag().equals("1")){
                    tv_ipv_date.setEnabled(true);
                    ll_ipv_vpt.setVisibility(View.VISIBLE);
                    ll_ipv_prove.setVisibility(View.VISIBLE);
                    tv_ipv_date.setVisibility(View.VISIBLE);
                }else if (rb_ipv.getTag().equals("2")){
                    ll_ipv_vpt.setVisibility(View.GONE);
                    ll_ipv_prove.setVisibility(View.GONE);
                    tv_ipv_date.setVisibility(View.GONE);
                }else if (rb_ipv.getTag().equals("3")){
                    tv_ipv_date.setEnabled(false);
                    ll_ipv_vpt.setVisibility(View.VISIBLE);
                    ll_ipv_prove.setVisibility(View.VISIBLE);
                    tv_ipv_date.setText("99-9-9999");
                }
            }
        });

        tv_bcgo_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_bcgo_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_bcgo_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_opv0_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_opv0_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_opv0_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_opv1_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_opv1_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_opv1_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_penta1_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_penta1_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_penta1_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_pcv1_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_pcv1_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_pcv1_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_rota1_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_rota1_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_rota1_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_opv2_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_opv2_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_opv2_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_penta2_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_penta2_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_penta2_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_pcv2_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_pcv2_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_pcv2_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_rota2_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_rota2_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_rota2_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_opv3_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_opv3_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_opv3_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_penta3_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_penta3_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_penta3_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_pcv3_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_pcv3_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_pcv3_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        tv_ipv_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_ipv_date.setError(null);
                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_ipv_date.setText(dayOfMonth+"-"+(monthOfYear+1)+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (validation()){

                    Crf6Activity.formCrf6.setVaccination(vaccination);

                    sendDataToServer();


                }

            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    public void initializeView(View view){

        btn_submit = (Button) view.findViewById(R.id.btn_submit);

        rg_bcgo = (RadioGroup)  view.findViewById(R.id.rg_bcgo);
        rg_opv0 = (RadioGroup)  view.findViewById(R.id.rg_opv0);
        rg_opv1 = (RadioGroup)  view.findViewById(R.id.rg_opv1);
        rg_penta1 = (RadioGroup)  view.findViewById(R.id.rg_penta1);
        rg_pcv1 = (RadioGroup)  view.findViewById(R.id.rg_pcv1);
        rg_rota1 = (RadioGroup)  view.findViewById(R.id.rg_rota1);
        rg_opv2 = (RadioGroup)  view.findViewById(R.id.rg_opv2);
        rg_penta2 = (RadioGroup)  view.findViewById(R.id.rg_penta2);
        rg_pcv2 = (RadioGroup)  view.findViewById(R.id.rg_pcv2);
        rg_rota2 = (RadioGroup)  view.findViewById(R.id.rg_rota2);
        rg_opv3 = (RadioGroup)  view.findViewById(R.id.rg_opv3);
        rg_penta3 = (RadioGroup)  view.findViewById(R.id.rg_penta3);
        rg_pcv3 = (RadioGroup)  view.findViewById(R.id.rg_pcv3);
        rg_ipv = (RadioGroup)  view.findViewById(R.id.rg_ipv);


        rg_bcgo_prove = (RadioGroup)  view.findViewById(R.id.rg_bcgo_prove);
        rg_bcgo_isVpt = (RadioGroup)  view.findViewById(R.id.rg_bcgo_isVpt);
        rg_opv0_prove = (RadioGroup)  view.findViewById(R.id.rg_opv0_prove);
        rg_opv0_isVpt = (RadioGroup)  view.findViewById(R.id.rg_opv0_isVpt);
        rg_opv1_prove = (RadioGroup)  view.findViewById(R.id.rg_opv1_prove);
        rg_opv1_isVpt = (RadioGroup)  view.findViewById(R.id.rg_opv1_isVpt);
        rg_penta1_prove = (RadioGroup)  view.findViewById(R.id.rg_penta1_prove);
        rg_penta1_isVpt = (RadioGroup)  view.findViewById(R.id.rg_penta1_isVpt);
        rg_pcv1_prove = (RadioGroup)  view.findViewById(R.id.rg_pcv1_prove);
        rg_pcv1_isVpt = (RadioGroup)  view.findViewById(R.id.rg_pcv1_isVpt);
        rg_rota1_prove = (RadioGroup)  view.findViewById(R.id.rg_rota1_prove);
        rg_rota1_isVpt = (RadioGroup)  view.findViewById(R.id.rg_rota1_isVpt);
        rg_opv2_prove = (RadioGroup)  view.findViewById(R.id.rg_opv2_prove);
        rg_opv2_isVpt = (RadioGroup)  view.findViewById(R.id.rg_opv2_isVpt);
        rg_penta2_prove = (RadioGroup)  view.findViewById(R.id.rg_penta2_prove);
        rg_penta2_isVpt = (RadioGroup)  view.findViewById(R.id.rg_penta2_isVpt);
        rg_pcv2_prove = (RadioGroup)  view.findViewById(R.id.rg_pcv2_prove);
        rg_pcv2_isVpt = (RadioGroup)  view.findViewById(R.id.rg_pcv2_isVpt);
        rg_rota2_prove = (RadioGroup)  view.findViewById(R.id.rg_rota2_prove);
        rg_rota2_isVpt = (RadioGroup)  view.findViewById(R.id.rg_rota2_isVpt);
        rg_opv3_prove = (RadioGroup)  view.findViewById(R.id.rg_opv3_prove);
        rg_opv3_isVpt = (RadioGroup)  view.findViewById(R.id.rg_opv3_isVpt);
        rg_penta3_prove = (RadioGroup)  view.findViewById(R.id.rg_penta3_prove);
        rg_penta3_isVpt = (RadioGroup)  view.findViewById(R.id.rg_penta3_isVpt);
        rg_pcv3_prove = (RadioGroup)  view.findViewById(R.id.rg_pcv3_prove);
        rg_pcv3_isVpt = (RadioGroup)  view.findViewById(R.id.rg_pcv3_isVpt);
        rg_ipv_prove = (RadioGroup)  view.findViewById(R.id.rg_ipv_prove);
        rg_ipv_isVpt = (RadioGroup)  view.findViewById(R.id.rg_ipv_isVpt);


        tv_bcgo_date = (TextView) view.findViewById(R.id.tv_bcgo_date);
        tv_opv0_date = (TextView) view.findViewById(R.id.tv_opv0_date);
        tv_opv1_date  = (TextView) view.findViewById(R.id.tv_opv1_date);
        tv_penta1_date = (TextView) view.findViewById(R.id.tv_penta1_date);
        tv_pcv1_date = (TextView) view.findViewById(R.id.tv_pcv1_date);
        tv_rota1_date = (TextView) view.findViewById(R.id.tv_rota1_date);
        tv_opv2_date = (TextView) view.findViewById(R.id.tv_opv2_date);
        tv_penta2_date = (TextView) view.findViewById(R.id.tv_penta2_date);
        tv_pcv2_date = (TextView) view.findViewById(R.id.tv_pcv2_date);
        tv_rota2_date = (TextView) view.findViewById(R.id.tv_rota2_date);
        tv_opv3_date = (TextView) view.findViewById(R.id.tv_opv3_date);
        tv_penta3_date = (TextView) view.findViewById(R.id.tv_penta3_date);
        tv_pcv3_date = (TextView) view.findViewById(R.id.tv_pcv3_date);
        tv_ipv_date = (TextView) view.findViewById(R.id.tv_ipv_date);
        tv_bcgo = (TextView) view.findViewById(R.id.tv_bcgo);

        tv_bcgo_prove = (TextView) view.findViewById(R.id.tv_bcgo_prove);
        tv_bcgo_isVpt = (TextView) view.findViewById(R.id.tv_bcgo_vpt);
        tv_opv0_prove = (TextView) view.findViewById(R.id.tv_opv0_prove);
        tv_opv0_isVpt = (TextView) view.findViewById(R.id.tv_opv0_vpt);
        tv_opv1_prove = (TextView) view.findViewById(R.id.tv_opv1_prove);
        tv_opv1_isVpt = (TextView) view.findViewById(R.id.tv_opv1_vpt);
        tv_penta1_prove = (TextView) view.findViewById(R.id.tv_penta1_prove);
        tv_penta1_isVpt = (TextView) view.findViewById(R.id.tv_penta1_vpt);
        tv_pcv1_prove = (TextView) view.findViewById(R.id.tv_pc1_prove);
        tv_pcv1_isVpt = (TextView) view.findViewById(R.id.tv_pc1_vpt);
        tv_rota1_prove = (TextView) view.findViewById(R.id.tv_rota1_prove);
        tv_rota1_isVpt = (TextView) view.findViewById(R.id.tv_rota1_vpt);
        tv_opv2_prove = (TextView) view.findViewById(R.id.tv_opv2_prove);
        tv_opv2_isVpt = (TextView) view.findViewById(R.id.tv_opv2_vpt);
        tv_penta2_prove = (TextView) view.findViewById(R.id.tv_penta2_prove);
        tv_penta2_isVpt = (TextView) view.findViewById(R.id.tv_penta2_vpt);
        tv_pcv2_prove = (TextView) view.findViewById(R.id.tv_pcv2_prove);
        tv_pcv2_isVpt = (TextView) view.findViewById(R.id.tv_pcv2_vpt);
        tv_rota2_prove = (TextView) view.findViewById(R.id.tv_rota2_prove);
        tv_rota2_isVpt = (TextView) view.findViewById(R.id.tv_rota2_vpt);
        tv_opv3_prove = (TextView) view.findViewById(R.id.tv_opv3_prove);
        tv_opv3_isVpt = (TextView) view.findViewById(R.id.tv_opv3_vpt);
        tv_penta3_prove = (TextView) view.findViewById(R.id.tv_penta3_prove);
        tv_penta3_isVpt = (TextView) view.findViewById(R.id.tv_penta3_vpt);
        tv_pcv3_prove = (TextView) view.findViewById(R.id.tv_pcv3_prove);
        tv_pcv3_isVpt = (TextView) view.findViewById(R.id.tv_pcv3_vpt);
        tv_ipv_prove = (TextView) view.findViewById(R.id.tv_ipv_prove);
        tv_ipv_isVpt = (TextView) view.findViewById(R.id.tv_ipv_vpt);

        tv_opv0 = (TextView) view.findViewById(R.id.tv_opv0);
        tv_opv1 = (TextView) view.findViewById(R.id.tv_opv1);
        tv_penta1 = (TextView) view.findViewById(R.id.tv_penta1);
        tv_pcv1 = (TextView) view.findViewById(R.id.tv_pcv1);
        tv_rota1 = (TextView) view.findViewById(R.id.tv_rota1);
        tv_opv2 = (TextView) view.findViewById(R.id.tv_opv2);
        tv_penta2 = (TextView) view.findViewById(R.id.tv_penta2);
        tv_pcv2 = (TextView) view.findViewById(R.id.tv_pcv2);
        tv_rota2 = (TextView) view.findViewById(R.id.tv_rota2);
        tv_opv3 = (TextView) view.findViewById(R.id.tv_opv3);
        tv_penta3 = (TextView) view.findViewById(R.id.tv_penta3);
        tv_pcv3 = (TextView) view.findViewById(R.id.tv_pcv3);
        tv_ipv = (TextView) view.findViewById(R.id.tv_ipv);

        ll_bcg0_show = (LinearLayout) view.findViewById(R.id.ll_bcg0_show);
        ll_opv0_show = (LinearLayout) view.findViewById(R.id.ll_opv0_show);
        ll_opv1_show = (LinearLayout) view.findViewById(R.id.ll_opv1_show);
        ll_penta1_show = (LinearLayout) view.findViewById(R.id.ll_penta1_show);
        ll_pcv1_show = (LinearLayout) view.findViewById(R.id.ll_pcv1_show);
        ll_rota1_show = (LinearLayout) view.findViewById(R.id.ll_rota1_show);
        ll_opv2_show = (LinearLayout) view.findViewById(R.id.ll_opv2_show);
        ll_penta2_show = (LinearLayout) view.findViewById(R.id.ll_penta2_show);
        ll_pcv2_show = (LinearLayout) view.findViewById(R.id.ll_pcv2_show);
        ll_rota2_show = (LinearLayout) view.findViewById(R.id.ll_rota2_show);
        ll_opv3_show = (LinearLayout) view.findViewById(R.id.ll_opv3_show);
        ll_penta3_show = (LinearLayout) view.findViewById(R.id.ll_penta3_show);
        ll_pcv3_show = (LinearLayout) view.findViewById(R.id.ll_pcv3_show);
        ll_ipv_show = (LinearLayout) view.findViewById(R.id.ll_ipv_show);


        tv_bcg0_show = (TextView) view.findViewById(R.id.tv_bcgo_show);
        tv_bcg0_prove_show = (TextView) view.findViewById(R.id.tv_bcgo_prove_show);
        tv_bcg0_isVpt_show = (TextView) view.findViewById(R.id.tv_bcgo_isVpt_show);
        tv_opv0_show = (TextView) view.findViewById(R.id.tv_opv0_show);
        tv_opv0_prove_show = (TextView) view.findViewById(R.id.tv_opv0_prove_show);
        tv_opv0_isVpt_show = (TextView) view.findViewById(R.id.tv_opv0_isVpt_show);
        tv_opv1_show = (TextView) view.findViewById(R.id.tv_opv1_show);
        tv_opv1_prove_show = (TextView) view.findViewById(R.id.tv_opv1_prove_show);
        tv_opv1_isVpt_show = (TextView) view.findViewById(R.id.tv_opv1_isVpt_show);
        tv_penta1_show = (TextView) view.findViewById(R.id.tv_penta1_show);
        tv_penta1_prove_show = (TextView) view.findViewById(R.id.tv_penta1_prove_show);
        tv_penta1_isVpt_show = (TextView) view.findViewById(R.id.tv_penta1_isVpt_show);
        tv_pcv1_show = (TextView) view.findViewById(R.id.tv_pcv1_show);
        tv_pcv1_prove_show = (TextView) view.findViewById(R.id.tv_pcv1_prove_show);
        tv_pcv1_isVpt_show = (TextView) view.findViewById(R.id.tv_pcv1_isVpt_show);
        tv_rota1_show = (TextView) view.findViewById(R.id.tv_rota1_show);
        tv_rota1_prove_show = (TextView) view.findViewById(R.id.tv_rota1_prove_show);
        tv_rota1_isVpt_show = (TextView) view.findViewById(R.id.tv_rota1_isVpt_show);
        tv_opv2_show = (TextView) view.findViewById(R.id.tv_opv2_show);
        tv_opv2_prove_show = (TextView) view.findViewById(R.id.tv_opv2_prove_show);
        tv_opv2_isVpt_show = (TextView) view.findViewById(R.id.tv_opv2_isVpt_show);
        tv_penta2_show = (TextView) view.findViewById(R.id.tv_penta2_show);
        tv_penta2_prove_show = (TextView) view.findViewById(R.id.tv_penta2_prove_show);
        tv_penta2_isVpt_show = (TextView) view.findViewById(R.id.tv_penta2_isVpt_show);
        tv_pcv2_show = (TextView) view.findViewById(R.id.tv_pcv2_show);
        tv_pcv2_prove_show = (TextView) view.findViewById(R.id.tv_pcv2_prove_show);
        tv_pcv2_isVpt_show = (TextView) view.findViewById(R.id.tv_pcv2_isVpt_show);
        tv_rota2_show = (TextView) view.findViewById(R.id.tv_rota2_show);
        tv_rota2_prove_show = (TextView) view.findViewById(R.id.tv_rota2_prove_show);
        tv_rota2_isVpt_show = (TextView) view.findViewById(R.id.tv_rota2_isVpt_show);
        tv_opv3_show = (TextView) view.findViewById(R.id.tv_opv3_show);
        tv_opv3_prove_show = (TextView) view.findViewById(R.id.tv_opv3_prove_show);
        tv_opv3_isVpt_show = (TextView) view.findViewById(R.id.tv_opv3_isVpt_show);
        tv_penta3_show = (TextView) view.findViewById(R.id.tv_penta3_show);
        tv_penta3_prove_show = (TextView) view.findViewById(R.id.tv_penta3_prove_show);
        tv_penta3_isVpt_show = (TextView) view.findViewById(R.id.tv_penta3_isVpt_show);
        tv_pcv3_show = (TextView) view.findViewById(R.id.tv_pcv3_show);
        tv_pcv3_prove_show = (TextView) view.findViewById(R.id.tv_pcv3_prove_show);
        tv_pcv3_isVpt_show = (TextView) view.findViewById(R.id.tv_pcv3_isVpt_show);
        tv_ipv_show = (TextView) view.findViewById(R.id.tv_ipv_show);
        tv_ipv_prove_show = (TextView) view.findViewById(R.id.tv_ipv_prove_show);
        tv_ipv_isVpt_show = (TextView) view.findViewById(R.id.tv_ipv_isVpt_show);



        ll_bcgo_prove = (LinearLayout) view.findViewById(R.id.ll_bcgo_prove);
        ll_bcgo_vpt = (LinearLayout) view.findViewById(R.id.ll_bcgo_vpt);
        ll_opv0_prove = (LinearLayout) view.findViewById(R.id.ll_opv0_prove);
        ll_opv0_vpt = (LinearLayout) view.findViewById(R.id.ll_opv0_vpt);

        ll_opv1_prove = (LinearLayout) view.findViewById(R.id.ll_opv1_prove);
        ll_opv1_vpt = (LinearLayout) view.findViewById(R.id.ll_opv1_vpt);
        ll_penta1_prove = (LinearLayout) view.findViewById(R.id.ll_penta1_prove);
        ll_penta1_vpt = (LinearLayout) view.findViewById(R.id.ll_penta1_vpt);
        ll_pcv1_prove = (LinearLayout) view.findViewById(R.id.ll_pcv1_prove);
        ll_pcv1_vpt = (LinearLayout) view.findViewById(R.id.ll_pcv1_vpt);
        ll_rota1_prove = (LinearLayout) view.findViewById(R.id.ll_rota1_prove);
        ll_rota1_vpt = (LinearLayout) view.findViewById(R.id.ll_rota1_vpt);
        ll_opv2_prove  = (LinearLayout) view.findViewById(R.id.ll_opv2_prove);
        ll_opv2_vpt = (LinearLayout) view.findViewById(R.id.ll_opv2_vpt);
        ll_penta2_prove = (LinearLayout) view.findViewById(R.id.ll_penta2_prove);
        ll_penta2_vpt = (LinearLayout) view.findViewById(R.id.ll_penta2_vpt);
        ll_pcv2_prove = (LinearLayout) view.findViewById(R.id.ll_pcv2_prove);
        ll_pcv2_vpt = (LinearLayout) view.findViewById(R.id.ll_pcv2_vpt);
        ll_rota2_prove = (LinearLayout) view.findViewById(R.id.ll_rota2_prove);
        ll_rota2_vpt = (LinearLayout) view.findViewById(R.id.ll_rota2_vpt);
        ll_opv3_prove = (LinearLayout) view.findViewById(R.id.ll_opv3_prove);
        ll_opv3_vpt = (LinearLayout) view.findViewById(R.id.ll_opv3_vpt);
        ll_penta3_prove = (LinearLayout) view.findViewById(R.id.ll_penta3_prove);
        ll_penta3_vpt = (LinearLayout) view.findViewById(R.id.ll_penta3_vpt);
        ll_pcv3_prove = (LinearLayout) view.findViewById(R.id.ll_pcv3_prove);
        ll_pcv3_vpt = (LinearLayout) view.findViewById(R.id.ll_pcv3_vpt);
        ll_ipv_prove = (LinearLayout) view.findViewById(R.id.ll_ipv_prove);
        ll_ipv_vpt = (LinearLayout) view.findViewById(R.id.ll_ipv_vpt);


        ll_bcg0 = (LinearLayout) view.findViewById(R.id.ll_bcg0);
        ll_opv0 = (LinearLayout) view.findViewById(R.id.ll_opv0);
        ll_opv1 = (LinearLayout) view.findViewById(R.id.ll_opv1);
        ll_penta1 = (LinearLayout) view.findViewById(R.id.ll_penta1);
        ll_pcv1 = (LinearLayout) view.findViewById(R.id.ll_pcv1);
        ll_rota1 = (LinearLayout) view.findViewById(R.id.ll_rota1);
        ll_opv2 = (LinearLayout) view.findViewById(R.id.ll_opv2);
        ll_penta2 = (LinearLayout) view.findViewById(R.id.ll_penta2);
        ll_pcv2 = (LinearLayout) view.findViewById(R.id.ll_pcv2);
        ll_rota2 = (LinearLayout) view.findViewById(R.id.ll_rota2);
        ll_opv3 = (LinearLayout) view.findViewById(R.id.ll_opv3);
        ll_penta3 = (LinearLayout) view.findViewById(R.id.ll_penta3);
        ll_pcv3 = (LinearLayout) view.findViewById(R.id.ll_pcv3);
        ll_ipv = (LinearLayout) view.findViewById(R.id.ll_ipv);


        scrolView = (ScrollView) view.findViewById(R.id.scrolView);





        progressDialog = new ProgressDialog(getContext());
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Wait");
        progressDialog.setMessage("Sending...");


    }

    public void openDatePopAndPopulate(final TextView textView){

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        textView.setText(dayOfMonth+"-"+monthOfYear+1+"-"+year);

                    }
                }, calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });

    }


    public boolean validation(){

        boolean validation = true;

        //BCGO

        if (ll_bcg0.getVisibility()==View.VISIBLE){

            if (checkDate(rg_bcgo, rb_bcgo, tv_bcgo, tv_bcgo_date) != null){
                vaccination.setbCG0Date(checkDate(rg_bcgo, rb_bcgo, tv_bcgo, tv_bcgo_date));
            }else if ((checkDate(rg_bcgo, rb_bcgo, tv_bcgo, tv_bcgo_date) == null &&
                    rb_bcgo == null) || (checkDate(rg_bcgo, rb_bcgo, tv_bcgo, tv_bcgo_date) == null && !rb_bcgo.getTag().equals("2"))){
                validation = false;
            }

            if (ll_bcgo_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_bcgo_prove, rb_bcgo_prove, tv_bcgo_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setbCG0CardOrHistory(isRBCheckedThree(rg_bcgo_prove, rb_bcgo_prove, tv_bcgo_prove));
                }

            }

            if (ll_bcgo_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_bcgo_isVpt, rb_bcgo_isVpt, tv_bcgo_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setbCG0FromAKUOrVPT(isRBCheckedThree(rg_bcgo_isVpt, rb_bcgo_isVpt, tv_bcgo_isVpt));
                }
            }


        }


//// opv0

        if (ll_opv0.getVisibility()==View.VISIBLE){

            if (checkDate(rg_opv0, rb_opv0, tv_opv0, tv_opv0_date) != null){
                vaccination.setoPV0Date(checkDate(rg_opv0, rb_opv0, tv_opv0, tv_opv0_date));
            }else if ((checkDate(rg_opv0, rb_opv0, tv_opv0, tv_opv0_date) == null && rb_opv0 == null) || (checkDate(rg_opv0, rb_opv0, tv_opv0, tv_opv0_date) == null && !rb_opv0.getTag().equals("2"))){
                validation = false;
            }

            if (ll_opv0_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_opv0_prove, rb_opv0_prove, tv_opv0_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setoPV0CardOrHistory(isRBCheckedThree(rg_opv0_prove, rb_opv0_prove, tv_opv0_prove));
                }
            }

            if (ll_opv0_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_opv0_isVpt, rb_opv0_isVpt, tv_opv0_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setoPV0FromAKUOrVPT(isRBCheckedThree(rg_opv0_isVpt, rb_opv0_isVpt, tv_opv0_isVpt));
                }
            }

        }

// opv1
        if (ll_opv1.getVisibility()==View.VISIBLE){

            if (checkDate(rg_opv1, rb_opv1, tv_opv1, tv_opv1_date) != null){
                vaccination.setoPV1Date(checkDate(rg_opv1, rb_opv1, tv_opv1, tv_opv1_date));
            }else if ((checkDate(rg_opv1, rb_opv1, tv_opv1, tv_opv1_date) == null && rb_opv1 == null) ||
                    (checkDate(rg_opv1, rb_opv1, tv_opv1, tv_opv1_date) == null && !rb_opv1.getTag().equals("2"))){
                validation = false;
            }

            if (ll_opv1_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_opv1_prove, rb_opv1_prove, tv_opv1_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setoPV1CardOrHistory(isRBCheckedThree(rg_opv1_prove, rb_opv1_prove, tv_opv1_prove));
                }

            }

            if (ll_opv1_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_opv1_isVpt, rb_opv1_isVpt, tv_opv1_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setoPV1FromAKUOrVPT(isRBCheckedThree(rg_opv1_isVpt, rb_opv1_isVpt, tv_opv1_isVpt));
                }
            }

        }



// penta1


        if (ll_penta1.getVisibility()==View.VISIBLE){

            if (checkDate(rg_penta1, rb_penta1, tv_penta1, tv_penta1_date) != null){
                vaccination.setpENTA1Date(checkDate(rg_penta1, rb_penta1, tv_penta1, tv_penta1_date));
            }else if ((checkDate(rg_penta1, rb_penta1, tv_penta1, tv_penta1_date) == null && rb_penta1 == null) ||
                    (checkDate(rg_penta1, rb_penta1, tv_penta1, tv_penta1_date) == null && !rb_penta1.getTag().equals("2"))){
                validation = false;
            }

            if (ll_penta1_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_penta1_prove, rb_penta1_prove, tv_penta1_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setpENTA1CardOrHistory(isRBCheckedThree(rg_penta1_prove, rb_penta1_prove, tv_penta1_prove));
                }

            }

            if (ll_penta1_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_penta1_isVpt, rb_penta1_isVpt, tv_penta1_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setpENTA1FromAKUOrVPT(isRBCheckedThree(rg_penta1_isVpt, rb_penta1_isVpt, tv_penta1_isVpt));
                }
            }

        }


       ///pcv1

        if (ll_pcv1.getVisibility()==View.VISIBLE){

            if (checkDate(rg_pcv1, rb_pcv1, tv_pcv1, tv_pcv1_date) != null){
                vaccination.setpCV1Date(checkDate(rg_pcv1, rb_pcv1, tv_pcv1, tv_pcv1_date));
            }else if ((checkDate(rg_pcv1, rb_pcv1, tv_pcv1, tv_pcv1_date) == null && rb_pcv1 == null) ||
                    (checkDate(rg_pcv1, rb_pcv1, tv_pcv1, tv_pcv1_date) == null && !rb_pcv1.getTag().equals("2"))){
                validation = false;
            }

            if (ll_pcv1_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_pcv1_prove, rb_pcv1_prove, tv_pcv1_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setpCV1CardOrHistory(isRBCheckedThree(rg_pcv1_prove, rb_pcv1_prove, tv_pcv1_prove));
                }

            }

            if (ll_pcv1_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_pcv1_isVpt, rb_pcv1_isVpt, tv_pcv1_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setpCV1FromAKUOrVPT(isRBCheckedThree(rg_pcv1_isVpt, rb_pcv1_isVpt, tv_pcv1_isVpt));
                }
            }

        }


        ///rota 1

        if (ll_rota1.getVisibility()==View.VISIBLE){

            if (checkDate(rg_rota1, rb_rota1, tv_rota1, tv_rota1_date) != null){
                vaccination.setrOTA1Date(checkDate(rg_rota1, rb_rota1, tv_rota1, tv_rota1_date));
            }else if ((checkDate(rg_rota1, rb_rota1, tv_rota1, tv_rota1_date) == null && rb_rota1 == null) ||
                    checkDate(rg_rota1, rb_rota1, tv_rota1, tv_rota1_date) == null && !rb_rota1.getTag().equals("2")){
                validation = false;
            }

            if (ll_rota1_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_rota1_prove, rb_rota1_prove, tv_rota1_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setrOTA1CardOrHistory(isRBCheckedThree(rg_rota1_prove, rb_rota1_prove, tv_rota1_prove));
                }

            }

            if (ll_rota1_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_rota1_isVpt, rb_rota1_isVpt, tv_rota1_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setrOTA1FromAKUOrVPT(isRBCheckedThree(rg_rota1_isVpt, rb_rota1_isVpt, tv_rota1_isVpt));
                }
            }

        }


        //OPV2

        if (ll_opv2.getVisibility()==View.VISIBLE){


            if (checkDate(rg_opv2, rb_opv2, tv_opv2, tv_opv2_date) != null){
                vaccination.setoPV2Date(checkDate(rg_opv2, rb_opv2, tv_opv2, tv_opv2_date));
            }else if ((checkDate(rg_opv2, rb_opv2, tv_opv2, tv_opv2_date) == null && rb_opv2 == null) ||
                    (checkDate(rg_opv2, rb_opv2, tv_opv2, tv_opv2_date) == null && !rb_opv2.getTag().equals("2"))){
                validation = false;
            }

            if (ll_opv2_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_opv2_prove, rb_opv2_prove, tv_opv2_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setoPV2CardOrHistory(isRBCheckedThree(rg_opv2_prove, rb_opv2_prove, tv_opv2_prove));
                }

            }

            if (ll_opv2_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_opv2_isVpt, rb_opv2_isVpt, tv_opv2_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setoPV2FromAKUOrVPT(isRBCheckedThree(rg_opv2_isVpt, rb_opv2_isVpt, tv_opv2_isVpt));
                }
            }

        }



        //PENTA2

        if (ll_penta2.getVisibility()==View.VISIBLE){

            if (checkDate(rg_penta2, rb_penta2, tv_penta2, tv_penta2_date) != null){
                vaccination.setpENTA2Date(checkDate(rg_penta2, rb_penta2, tv_penta2, tv_penta2_date));
            }else if ((checkDate(rg_penta2, rb_penta2, tv_penta2, tv_penta2_date) == null && rb_penta2 == null) ||
                    (checkDate(rg_penta2, rb_penta2, tv_penta2, tv_penta2_date) == null && !rb_penta2.getTag().equals("2")) ){
                validation = false;
            }

            if (ll_penta2_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_penta2_prove, rb_penta2_prove, tv_penta2_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setpENTA2CardOrHistory(isRBCheckedThree(rg_penta2_prove, rb_penta2_prove, tv_penta2_prove));
                }

            }

            if (ll_penta2_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_penta2_isVpt, rb_penta2_isVpt, tv_penta2_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setpENTA2FromAKUOrVPT(isRBCheckedThree(rg_penta2_isVpt, rb_penta2_isVpt, tv_penta2_isVpt));
                }
            }

        }



        //PCV2


        if (ll_pcv2.getVisibility()==View.VISIBLE){

            if (checkDate(rg_pcv2, rb_pcv2, tv_pcv2, tv_pcv2_date) != null){
                vaccination.setpCV2Date(checkDate(rg_pcv2, rb_pcv2, tv_pcv2, tv_pcv2_date));
            }else if ((checkDate(rg_pcv2, rb_pcv2, tv_pcv2, tv_pcv2_date) == null && rb_pcv2 == null) ||
                    (checkDate(rg_pcv2, rb_pcv2, tv_pcv2, tv_pcv2_date) == null && !rb_pcv2.getTag().equals("2")) ){
                validation = false;
            }

            if (ll_pcv2_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_pcv2_prove, rb_pcv2_prove, tv_pcv2_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setpCV2CardOrHistory(isRBCheckedThree(rg_pcv2_prove, rb_pcv2_prove, tv_pcv2_prove));
                }

            }

            if (ll_pcv2_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_pcv2_isVpt, rb_pcv2_isVpt, tv_pcv2_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setpCV2FromAKUOrVPT(isRBCheckedThree(rg_pcv2_isVpt, rb_pcv2_isVpt, tv_pcv2_isVpt));
                }
            }

        }



        //Rota 2
        if (ll_rota2.getVisibility()==View.VISIBLE){

            if (checkDate(rg_rota2, rb_rota2, tv_rota2, tv_rota2_date) != null){
                vaccination.setrOTA2Date(checkDate(rg_rota2, rb_rota2, tv_rota2, tv_rota2_date));
            }else if ((checkDate(rg_rota2, rb_rota2, tv_rota2, tv_rota2_date) == null && rb_rota2 == null) ||
                    (checkDate(rg_rota2, rb_rota2, tv_rota2, tv_rota2_date) == null && !rb_rota2.getTag().equals("2"))){
                validation = false;
            }

            if (ll_rota2_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_rota2_prove, rb_rota2_prove, tv_rota2_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setrOTA2CardOrHistory(isRBCheckedThree(rg_rota2_prove, rb_rota2_prove, tv_rota2_prove));
                }

            }

            if (ll_rota2_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_rota2_isVpt, rb_rota2_isVpt, tv_rota2_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setrOTA2FromAKUOrVPT(isRBCheckedThree(rg_rota2_isVpt, rb_rota2_isVpt, tv_rota2_isVpt));
                }
            }



        }




        //OPV3

        if (ll_opv3.getVisibility()==View.VISIBLE){

            if (checkDate(rg_opv3, rb_opv3, tv_opv3, tv_opv3_date) != null){
                vaccination.setoPV3Date(checkDate(rg_opv3, rb_opv3, tv_opv3, tv_opv3_date));
            }else if ((checkDate(rg_opv3, rb_opv3, tv_opv3, tv_opv3_date) == null && rb_opv3 == null) ||
                    (checkDate(rg_opv3, rb_opv3, tv_opv3, tv_opv3_date) == null && !rb_opv3.getTag().equals("2"))){
                validation = false;
            }

            if (ll_opv3_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_opv3_prove, rb_opv3_prove, tv_opv3_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setoPV3CardOrHistory(isRBCheckedThree(rg_opv3_prove, rb_opv3_prove, tv_opv3_prove));
                }

            }

            if (ll_opv3_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_opv3_isVpt, rb_opv3_isVpt, tv_opv3_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setoPV3FromAKUOrVPT(isRBCheckedThree(rg_opv3_isVpt, rb_opv3_isVpt, tv_opv3_isVpt));
                }
            }

        }


        //PENTA3

        if (ll_penta3.getVisibility()==View.VISIBLE){

            if (checkDate(rg_penta3, rb_penta3, tv_penta3, tv_penta3_date) != null){
                vaccination.setpENTA3Date(checkDate(rg_penta3, rb_penta3, tv_penta3, tv_penta3_date));
            }else if ((checkDate(rg_penta3, rb_penta3, tv_penta3, tv_penta3_date) == null && rb_penta3 == null) ||
                    (checkDate(rg_penta3, rb_penta3, tv_penta3, tv_penta3_date) == null && !rb_penta3.getTag().equals("2"))){
                validation = false;
            }

            if (ll_penta3_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_penta3_prove, rb_penta3_prove, tv_penta3_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setpENTA3CardOrHistory(isRBCheckedThree(rg_penta3_prove, rb_penta3_prove, tv_penta3_prove));
                }

            }

            if (ll_penta3_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_penta3_isVpt, rb_penta3_isVpt, tv_penta3_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setpENTA3FromAKUOrVPT(isRBCheckedThree(rg_penta3_isVpt, rb_penta3_isVpt, tv_penta3_isVpt));
                }
            }

        }


        //PCV3

        if (ll_pcv3.getVisibility()==View.VISIBLE){

            if (checkDate(rg_pcv3, rb_pcv3, tv_pcv3, tv_pcv3_date) != null){
                vaccination.setpCV3Date(checkDate(rg_pcv3, rb_pcv3, tv_pcv3, tv_pcv3_date));
            }else if ((checkDate(rg_pcv3, rb_pcv3, tv_pcv3, tv_pcv3_date) == null && rb_pcv3 == null) ||
                    (checkDate(rg_pcv3, rb_pcv3, tv_pcv3, tv_pcv3_date) == null && !rb_pcv3.getTag().equals("2"))){
                validation = false;
            }

            if (ll_pcv3_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_pcv3_prove, rb_pcv3_prove, tv_pcv3_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setpCV3CardOrHistory(isRBCheckedThree(rg_pcv3_prove, rb_pcv3_prove, tv_pcv3_prove));
                }
            }

            if (ll_pcv3_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_pcv3_isVpt, rb_pcv3_isVpt, tv_pcv3_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setpCV3FromAKUOrVPT(isRBCheckedThree(rg_pcv3_isVpt, rb_pcv3_isVpt, tv_pcv3_isVpt));
                }
            }

        }




        //IPV

        if (ll_ipv.getVisibility()==View.VISIBLE){

            if (checkDate(rg_ipv, rb_ipv, tv_ipv, tv_ipv_date) != null){
                vaccination.setiPVDate(checkDate(rg_ipv, rb_ipv, tv_ipv, tv_ipv_date));
            }else if ((checkDate(rg_ipv, rb_ipv, tv_ipv, tv_ipv_date) == null && rb_ipv == null) ||
                    (checkDate(rg_ipv, rb_ipv, tv_ipv, tv_ipv_date) == null && !rb_ipv.getTag().equals("2"))){
                validation = false;
            }

            if (ll_ipv_prove.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_ipv_prove, rb_ipv_prove, tv_ipv_prove)==-1){
                    validation = false;
                }else {
                    vaccination.setiPVCardOrHistory(isRBCheckedThree(rg_ipv_prove, rb_ipv_prove, tv_ipv_prove));
                }

            }

            if (ll_ipv_vpt.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_ipv_isVpt, rb_ipv_isVpt, tv_ipv_isVpt)==-1){
                    validation = false;
                }else {
                    vaccination.setiPVFromAKUOrVPT(isRBCheckedThree(rg_ipv_isVpt, rb_ipv_isVpt, tv_ipv_isVpt));
                }
            }

        }


        return validation;
    }




    public void checkFields(View view, TextView tv_vac, TextView tv_vac_date, TextView tv_prove, TextView tv_vptAku,
                            RadioGroup rg_vac, RadioGroup rg_prove, RadioGroup rg_vptAku){
        RadioButton radioButton;
        boolean result = true;

      /*  if(rg_vac.getCheckedRadioButtonId() != -1){
            radioButton = (RadioButton) view.findViewById(rg_vac.getCheckedRadioButtonId());

            if(radioButton.getTag().equals("1")){

                if (rg_prove.getCheckedRadioButtonId() != -1){


                }else {
                    tv_prove.setError("");
                }


            }else if(radioButton.getTag().equals("2")){

                if (){


                }

            }else if (radioButton.getTag().equals("3")){



            }else {

                tv_vac.setError("");

            }

            tv_bcgo.setError("");
            result = false;
        }*/
        if(rg_prove.getCheckedRadioButtonId() != -1){

           /* radioButton = (RadioButton)

            if (){

            }*/


        }




    }

    public Integer isRBCheckedThree(RadioGroup rg, RadioButton rb, TextView tv){

        if(rg.getCheckedRadioButtonId()==-1){
            tv.setError("Required");
            setFocuseable(tv.getX(),tv.getY());
            return -1;
        }else {
            return  Integer.parseInt(rb.getTag().toString());
        }
    }

    private String checkDate(RadioGroup radioGroup, RadioButton radioButton, TextView textView, TextView textViewDate){

        String check = "";
        if (radioGroup.getCheckedRadioButtonId() != -1){
            if (radioButton.getTag().equals("1")){
                if (!textViewDate.getText().toString().equals("99-9-9999") && !textViewDate.getText().toString().equals("")){
                    check = textViewDate.getText().toString();
                } else {
                    check = null;
                    setFocuseable(textView.getX(), textView.getY());
                    textViewDate.setError("enter");
                }
            }else if(radioButton.getTag().equals("2")){
                check = null;
            }else if (radioButton.getTag().equals("3")){
               check = "99-9-9999";
            }
        }
        return check;
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


    public void putDataInFields(){

        if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination() != null){

            //BCG0
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getbCG0Date() != null){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getbCG0Date().equals("")){

                    ll_bcg0.setVisibility(View.GONE);
                    ll_bcg0_show.setVisibility(View.VISIBLE);
                    tv_bcg0_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getbCG0FromAKUOrVPT()+"");
                    tv_bcg0_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getbCG0Date()+"");
                    tv_bcg0_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getbCG0CardOrHistory()+"");
                }

            }

            //OPV0
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV0Date() != null){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV0Date().equals("")){
                    ll_opv0.setVisibility(View.GONE);
                    ll_opv0_show.setVisibility(View.VISIBLE);
                    tv_opv0_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV0FromAKUOrVPT()+"");
                    tv_opv0_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV0Date()+"");
                    tv_opv0_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV0CardOrHistory()+"");

                }

            }

            //OPV1
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV1Date() != null){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV1Date().equals("")){

                    ll_opv1.setVisibility(View.GONE);
                    ll_opv1_show.setVisibility(View.VISIBLE);
                    tv_opv1_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV1FromAKUOrVPT()+"");
                    tv_opv1_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV1Date()+"");
                    tv_opv1_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV1CardOrHistory()+"");

                }

            }

            //PENTA1
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA1Date() != null){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA1Date().equals("")){

                    ll_penta1_show.setVisibility(View.VISIBLE);
                    ll_penta1.setVisibility(View.GONE);
                    tv_penta1_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA1FromAKUOrVPT()+"");
                    tv_penta1_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA1Date()+"");
                    tv_penta1_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA1CardOrHistory()+"");

                }


            }


            //PCV1
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV1Date() != null ){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV1Date().equals("")){

                    ll_pcv1.setVisibility(View.GONE);
                    ll_opv1_show.setVisibility(View.VISIBLE);
                    tv_pcv1_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV1FromAKUOrVPT()+"");
                    tv_pcv1_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV1Date()+"");
                    tv_pcv1_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV1CardOrHistory()+"");
                }

            }

            //Rota 1
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA1Date() != null ){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA1Date().equals("")){
                    ll_rota1_show.setVisibility(View.VISIBLE);
                    ll_rota1.setVisibility(View.GONE);
                    tv_rota1_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA1FromAKUOrVPT()+"");
                    tv_rota1_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA1Date()+"");
                    tv_rota1_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA1CardOrHistory()+"");

                }

            }

            //OPV2
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV2Date() != null ){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV2Date().equals("")){

                    ll_opv2_show.setVisibility(View.VISIBLE);
                    ll_opv2.setVisibility(View.GONE);
                    tv_opv2_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV2FromAKUOrVPT()+"");
                    tv_opv2_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV2Date()+"");
                    tv_opv2_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV2CardOrHistory()+"");

                }


            }

            //PENTA2
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA2Date() != null ){
                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA2Date().equals("")){

                    ll_penta2_show.setVisibility(View.VISIBLE);
                    ll_penta2.setVisibility(View.GONE);
                    tv_penta2_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA2FromAKUOrVPT()+"");
                    tv_penta2_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA2Date()+"");
                    tv_penta2_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA2CardOrHistory()+"");

                }


            }

            //PCV2
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV2Date() != null){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV2Date().equals("")) {

                    ll_pcv2_show.setVisibility(View.VISIBLE);
                    ll_pcv2.setVisibility(View.GONE);
                    tv_pcv2_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV2FromAKUOrVPT()+"");
                    tv_pcv2_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV2Date()+"");
                    tv_pcv2_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV2CardOrHistory()+"");
                }
            }

            //Rota 2
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA2Date() != null){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA2Date().equals("")){

                    ll_rota2_show.setVisibility(View.VISIBLE);
                    ll_rota2.setVisibility(View.GONE);
                    tv_rota2_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA2FromAKUOrVPT()+"");
                    tv_rota2_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA2Date()+"");
                    tv_rota2_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getrOTA2CardOrHistory()+"");

                }
            }

            //OPV3
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV3Date() != null){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV3Date().equals("")){

                    ll_opv3_show.setVisibility(View.VISIBLE);
                    ll_opv3.setVisibility(View.GONE);
                    tv_opv3_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV3FromAKUOrVPT()+"");
                    tv_opv3_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV3Date()+"");
                    tv_opv3_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getoPV3CardOrHistory()+"");

                }
            }

            //PENTA3
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA3Date() != null){
                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA3Date().equals("")){

                    ll_penta3_show.setVisibility(View.VISIBLE);
                    ll_penta3.setVisibility(View.GONE);
                    tv_penta3_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA3FromAKUOrVPT()+"");
                    tv_penta3_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA3Date()+"");
                    tv_penta3_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpENTA3CardOrHistory()+"");

                }

            }

            //PCV3
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV3Date() != null) {
                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV3Date().equals("")) {

                    ll_pcv3_show.setVisibility(View.VISIBLE);
                    ll_pcv3.setVisibility(View.GONE);
                    tv_pcv3_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV3FromAKUOrVPT()+"");
                    tv_pcv3_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV3Date()+"");
                    tv_pcv3_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getpCV3CardOrHistory()+"");
                }
            }

            //IPV
            if (Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getiPVDate() != null  ){

                if (!Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getiPVDate().equals("")){

                    ll_ipv.setVisibility(View.VISIBLE);
                    ll_ipv.setVisibility(View.GONE);
                    tv_ipv_isVpt_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getiPVFromAKUOrVPT()+"");
                    tv_ipv_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getiPVDate()+"");
                    tv_ipv_prove_show.setText(Crf6Activity.followupsDTO.getFollowupDetails().getVaccination().getiPVCardOrHistory()+"");

                }
            }

        }

    }

    public void checkDataFromFields(RadioGroup rg_btn, RadioButton rb_btn, TextView tv_date){


    }


    public void sendDataToServer(){

        progressDialog.show();
        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf6(Crf6Activity.formCrf6).enqueue(new Callback<FormCrf6>() {
            @Override
            public void onResponse(Call<FormCrf6> call, Response<FormCrf6> response) {

                if (response.code()==200){
                    SaveAndReadInternalData.deleteFollowUpsByIndex(getContext(), Crf6Activity.selectedPosition);
                    progressDialog.dismiss();
                    startActivity(new Intent(getContext(), AnthroDashBoard.class));
                    getActivity().finish();
                    Log.d("data sended", "Congrats man");

                }else {
                    SaveAndReadInternalData.deleteFollowUpsByIndex(getContext(), Crf6Activity.selectedPosition);
                    SaveAndReadInternalData.saveCrf6FormInternal(getContext(), Crf6Activity.formCrf6);
                    progressDialog.dismiss();
                    startActivity(new Intent(getContext(), AnthroDashBoard.class));
                    getActivity().finish();
                    Log.d("server Error", "sorry bhai error h");
                }
            }

            @Override
            public void onFailure(Call<FormCrf6> call, Throwable t) {
                SaveAndReadInternalData.deleteFollowUpsByIndex(getContext(), Crf6Activity.selectedPosition);
                SaveAndReadInternalData.saveCrf6FormInternal(getContext(), Crf6Activity.formCrf6);
                progressDialog.dismiss();
                startActivity(new Intent(getContext(), AnthroDashBoard.class));
                getActivity().finish();

            }
        });

    }

}
