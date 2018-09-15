package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5a_fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4And5Dashboard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.Crf4Complete;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Crf5aQ59Counseling extends Fragment {

    ScrollView scrolView;
    Button btn_submit;

    APIService mAPIService;
    ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_crf5a_q59_counseling, container, false);

        mAPIService = ApiUtils.getAPIService();

        progressDialog = new ProgressDialog(getContext());
        progressDialog.setTitle("Sending...");
        progressDialog.setMessage("Please Wait...");


        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        btn_submit = (Button) view.findViewById(R.id.btn_submit);


        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               progressDialog.show();


               CRF4aActivity.formCrf5a.setCounsilEndTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));


               if (CRF4aActivity.followupDto.getFollowupDetails().getChd().equalsIgnoreCase("y")){



               }else {


                   Crf4Complete crf4Complete = new Crf4Complete();

                   crf4Complete.setFormCrf4a(CRF4aActivity.formCrf4aDTO);
                   crf4Complete.setFormCrf4b(CRF4aActivity.formCrf4bDTO);

                   CRF4aActivity.formCrf5a.setFollowupStatus(Constants.COMPLETED);
                   CRF4aActivity.formCrf5a.setFormStatus(Constants.COMPLETED);

                   mAPIService.postCrf4Complete(crf4Complete).enqueue(new Callback<Crf4Complete>() {
                       @Override
                       public void onResponse(Call<Crf4Complete> call, Response<Crf4Complete> response) {

                           if(response.code()==200){
                               Log.d("0001010", "send Form 4Alll");
                           }

                       }

                       @Override
                       public void onFailure(Call<Crf4Complete> call, Throwable t) {

                           mAPIService.postCrf5a(CRF4aActivity.formCrf5a).enqueue(new Callback<FormCrf5a>() {
                               @Override
                               public void onResponse(Call<FormCrf5a> call, Response<FormCrf5a> response) {

                                   if(response.code()==200){

                                   }
                               }

                               @Override
                               public void onFailure(Call<FormCrf5a> call, Throwable t) {

                                   Log.d("0001010", "send Form 5Alll");
                                   CRF4aActivity.startHour = 0;
                                   progressDialog.dismiss();
                                   startActivity(new Intent(getActivity(), CRF4And5Dashboard.class));
                                   getActivity().finish();

                                   System.out.println(t.getMessage()+"000011");

                               }
                           });

                       }
                   });


               }




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


    public void sendDataToServerOnly5a(){

        mAPIService.postCrf5a(CRF4aActivity.formCrf5a).enqueue(new Callback<FormCrf5a>() {
            @Override
            public void onResponse(Call<FormCrf5a> call, Response<FormCrf5a> response) {



            }

            @Override
            public void onFailure(Call<FormCrf5a> call, Throwable t) {

            }
        });



    }


}
