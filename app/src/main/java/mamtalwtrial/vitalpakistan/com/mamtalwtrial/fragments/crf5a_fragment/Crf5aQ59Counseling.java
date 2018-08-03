package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5a_fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4And5Dashboard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments.Crf4aCounselingQ79;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment.Crf5bQ25Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.Crf4Complete;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Crf5aQ59Counseling extends Fragment {

    ScrollView scrolView;
    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_crf5a_q59_counseling, container, false);


        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        btn_submit = (Button) view.findViewById(R.id.btn_submit);


        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               final APIService mAPIService = ApiUtils.getAPIService();

                // CRF4aActivity.formCrf4bDTO.set(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance()));

                //  CRF4aActivity.formCrf4aDTO.setCounsilEndTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance()));


                Crf4Complete crf4Complete = new Crf4Complete();

                crf4Complete.setFormCrf4a(CRF4aActivity.formCrf4aDTO);
                crf4Complete.setFormCrf4b(CRF4aActivity.formCrf4bDTO);

                mAPIService.postCrf4Complete(crf4Complete).enqueue(new Callback<Crf4Complete>() {
                    @Override
                    public void onResponse(Call<Crf4Complete> call, Response<Crf4Complete> response) {

                        mAPIService.postCrf5a(CRF4aActivity.formCrf5a).enqueue(new Callback<FormCrf5a>() {
                            @Override
                            public void onResponse(Call<FormCrf5a> call, Response<FormCrf5a> response) {

                            }

                            @Override
                            public void onFailure(Call<FormCrf5a> call, Throwable t) {

                            }
                        });



                    }

                    @Override
                    public void onFailure(Call<Crf4Complete> call, Throwable t) {

                    }
                });

                startActivity(new Intent(getActivity(), CRF4And5Dashboard.class));
                getActivity().finish();



              /*  Crf5bQ25Fragment fragment = new Crf5bQ25Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                fragmentTransaction.commit();*/

            }
        });



        return view;
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

}
