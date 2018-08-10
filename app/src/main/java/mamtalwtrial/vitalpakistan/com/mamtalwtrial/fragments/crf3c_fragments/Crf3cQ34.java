package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3c_fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3a.FormCrf3aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.FormCrf3bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.FormCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Crf3cQ34 extends Fragment {

    Button btn_Crf3cCounSubmit;

    ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf3c_q34, container, false);

        CRF3cActivity.formCrf3cDTO.setCounsilStartTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        btn_Crf3cCounSubmit = (Button) view.findViewById(R.id.btn_Crf3cCounSubmit);

        btn_Crf3cCounSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CRF3cActivity.formCrf3cDTO.setCounsilEndTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                CRF3cActivity.formCrf3cDTO.setQ40(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                CRF3cActivity.formsCrf2AndCrf3All.setCrf3cStatus(Constants.COMPLETED);
                CRF3cActivity.formsCrf2AndCrf3All.setFormCrf3cDTO(CRF3cActivity.formCrf3cDTO);

                progressDialog = new ProgressDialog(getActivity());
                progressDialog.setTitle("Uploding..");
                progressDialog.setMessage("Wait");
                progressDialog.setCancelable(false);
                progressDialog.show();

                sendCrf2Form(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf2DTO());

            }
        });


        return view;
    }


    public    void sendCrf2Form(FormCrf2DTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf2DTO dto;
        mAPIService.postCrf2(body).enqueue(new Callback<FormCrf2DTO>() {

            @Override
            public void onResponse(Call<FormCrf2DTO> call, Response<FormCrf2DTO> response) {

                if(response.code()==200){

                    sendCrf3aForm(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3aDTO());

                }else {

                    Toast.makeText(getContext(),"Data Not send Crf2 ",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getContext(),CRF2DashboargActivity.class));

                    getActivity().finish();
                    progressDialog.dismiss();

                }

            }

            @Override
            public void onFailure(Call<FormCrf2DTO> call, Throwable t) {

            }
        });

    }



    public    void sendCrf3aForm(FormCrf3aDTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf2DTO dto;
        mAPIService.postCrf3a(body).enqueue(new Callback<FormCrf3aDTO>() {
            @Override
            public void onResponse(Call<FormCrf3aDTO> call, Response<FormCrf3aDTO> response) {

                if(response.code()==200){

                    sendCrf3bForm(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3bDTO());
                }else {
                    Toast.makeText(getContext(),"Data Not send Crf3a ",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getContext(),CRF2DashboargActivity.class));
                    getActivity().finish();

                    progressDialog.dismiss();
                }

            }

            @Override
            public void onFailure(Call<FormCrf3aDTO> call, Throwable t) {

                Log.d("responce", t+"0009");

            }
        });


    }




    public    void sendCrf3bForm(FormCrf3bDTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf2DTO dto;
        mAPIService.postCrf3b(body).enqueue(new Callback<FormCrf3bDTO>() {
            @Override
            public void onResponse(Call<FormCrf3bDTO> call, Response<FormCrf3bDTO> response) {


                if(response.code()==200){

                    sendCrf3cForm(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO());
                }else {
                    Toast.makeText(getContext(),"Data Not send Crf3b ",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getContext(),CRF2DashboargActivity.class));
                    getActivity().finish();

                    progressDialog.dismiss();
                }

            }

            @Override
            public void onFailure(Call<FormCrf3bDTO> call, Throwable t) {

            }
        });

    }


    public   void sendCrf3cForm(FormCrf3cDTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf3c(body).enqueue(new Callback<FormCrf3cDTO>() {
            @Override
            public void onResponse(Call<FormCrf3cDTO> call, Response<FormCrf3cDTO> response) {

                if(response.code()==200){

                    Toast.makeText(getContext(),"Forms Sended",Toast.LENGTH_LONG).show();
                 //   progressDialog.setCancelable(true);
                    progressDialog.dismiss();
                    startActivity(new Intent(getContext(),CRF2DashboargActivity.class));
                  getActivity().finish();
                }else {
                    Toast.makeText(getContext(),"Data Not send Crf3c",Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<FormCrf3cDTO> call, Throwable t) {

                progressDialog.dismiss();
                startActivity(new Intent(getContext(),CRF2DashboargActivity.class));
                getActivity().finish();

            }
        });





    }





}
