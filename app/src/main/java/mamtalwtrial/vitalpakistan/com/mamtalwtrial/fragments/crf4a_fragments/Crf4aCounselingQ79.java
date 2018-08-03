package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments;

import android.content.Context;
import android.content.Intent;


import java.text.SimpleDateFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4And5Dashboard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4b_fragments.Crf4bQ20Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5a_fragment.Crf5aQ59Counseling;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.Crf4Complete;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Crf4aCounselingQ79 extends Fragment {

    int[] radioGroupIds;
    int[] textViewIds;
    Button btn_submit;
    boolean validation;
    ScrollView scrollView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf4a_counseling_q79, container, false);


        scrollView = (ScrollView) view.findViewById(R.id.scrollView);


        radioGroupIds = new int[]{R.id.rg_q79_a, R.id.rg_q79_b,  R.id.rg_q79_c,  R.id.rg_q79_d,  R.id.rg_q79_e,  R.id.rg_q79_f,  R.id.rg_q79_g
                ,  R.id.rg_q79_h,  R.id.rg_q79_i,  R.id.rg_q79_j,  R.id.rg_q79_k,  R.id.rg_q79_l,  R.id.rg_q79_m,  R.id.rg_q79_n,  R.id.rg_q79_o
                ,  R.id.rg_q79_p,  R.id.rg_q79_q, R.id.rg_q80_a, R.id.rg_q80_b, R.id.rg_q80_c, R.id.rg_q81_a, R.id.rg_q81_b, R.id.rg_q81_c
                , R.id.rg_q81_d, R.id.rg_q81_e, R.id.rg_q81_f, R.id.rg_q81_g, R.id.rg_q82_a, R.id.rg_q82_b, R.id.rg_q82_c, R.id.rg_q82_d
                , R.id.rg_q82_e, R.id.rg_q82_f, R.id.rg_q82_g, R.id.rg_q82_h, R.id.rg_q82_i, R.id.rg_q83_a, R.id.rg_q83_b, R.id.rg_q83_c
                , R.id.rg_q83_d, R.id.rg_q83_e, R.id.rg_q83_f};


        textViewIds = new int[]{R.id.tv_q79_a, R.id.tv_q79_b, R.id.tv_q79_c, R.id.tv_q79_d, R.id.tv_q79_e, R.id.tv_q79_f, R.id.tv_q79_g
                , R.id.tv_q79_h, R.id.tv_q79_i, R.id.tv_q79_j, R.id.tv_q79_k, R.id.tv_q79_l, R.id.tv_q79_m, R.id.tv_q79_n
                , R.id.tv_q79_o, R.id.tv_q79_p, R.id.tv_q79_q, R.id.tv_q80_a, R.id.tv_q80_b, R.id.tv_q80_c, R.id.tv_q81_a, R.id.tv_q81_b
                , R.id.tv_q81_c, R.id.tv_q81_d, R.id.tv_q81_e, R.id.tv_q81_f, R.id.tv_q81_g, R.id.tv_q82_a, R.id.tv_q82_b, R.id.tv_q82_c
                , R.id.tv_q82_d, R.id.tv_q82_e, R.id.tv_q82_f, R.id.tv_q82_g, R.id.tv_q82_h, R.id.tv_q82_i, R.id.tv_q83_a, R.id.tv_q83_b
                , R.id.tv_q83_c, R.id.tv_q83_d, R.id.tv_q83_e, R.id.tv_q83_f};

        CRF4aActivity.formCrf4aDTO.setCounsilStartTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance()));


        btn_submit = (Button) view.findViewById(R.id.btn_submit);

                btn_submit.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.N)
                    @Override
                    public void onClick(View v) {

                    validation = true;

                        for(int i = 0; i<radioGroupIds.length; i++){

                            RadioGroup radioGroup = (RadioGroup) view.findViewById(radioGroupIds[i]);
                            TextView textView = (TextView) view.findViewById(textViewIds[i]);


                            if(radioGroup.getCheckedRadioButtonId()==-1){

                                textView.setError("Required");
                                validation = false;
                                setFocuseable(textView.getX(), textView.getY());

                            }else {

                                textView.setError(null);
                            }

                        }

                        if(validation){

//                            CRF4aActivity.formCrf4aDTO.setCounsilEndTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance()));

                            if(!CRF4aActivity.followupDetails.getArm().equals("a")){


                                Crf5aQ59Counseling fragment = new Crf5aQ59Counseling();
                                FragmentManager fragmentManager = getFragmentManager();
                                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                                fragmentTransaction.commit();

                                //startActivity(new Intent(getActivity(), CRF4And5Dashboard.class));
                               // getActivity().finish();


                            }else {


                                final APIService mAPIService = ApiUtils.getAPIService();

                                // CRF4aActivity.formCrf4bDTO.set(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance()));

                                  CRF4aActivity.formCrf4aDTO.setCounsilEndTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance()));


                                CRF4aActivity.formCrf4bDTO.setTeam(CRF4aActivity.formCrf4aDTO.getTeam());
                                CRF4aActivity.formCrf4bDTO.setPregnantWoman(CRF4aActivity.formCrf4aDTO.getPregnantWoman());
                                Crf4Complete crf4Complete = new Crf4Complete();



                                crf4Complete.setFormCrf4a(CRF4aActivity.formCrf4aDTO);
                                crf4Complete.setFormCrf4b(CRF4aActivity.formCrf4bDTO);



                                mAPIService.postCrf4Complete(crf4Complete).enqueue(new Callback<Crf4Complete>() {
                                    @Override
                                    public void onResponse(Call<Crf4Complete> call, Response<Crf4Complete> response) {

                                        startActivity(new Intent(getActivity(), CRF4And5Dashboard.class));
                                        getActivity().finish();

                                    }

                                    @Override
                                    public void onFailure(Call<Crf4Complete> call, Throwable t) {

                                        startActivity(new Intent(getActivity(), CRF4And5Dashboard.class));
                                        getActivity().finish();

                                    }
                                });

                            }

                            Toast.makeText(getContext(),"Done",Toast.LENGTH_LONG).show();

                        }


                    }
                });



        return view;
    }


    int x,y;
    public void setFocuseable(float x1, float y1){

        x = (int) x1;
        y = (int) y1;

        scrollView.post(new Runnable() {
            public void run() {
                scrollView.scrollTo(x,y); // these are your x and y coordinates
            }
        });
    }


}
