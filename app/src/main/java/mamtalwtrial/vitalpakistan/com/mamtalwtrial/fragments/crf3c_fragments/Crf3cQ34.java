package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3c_fragments;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.Crf6Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormsCrf2AndCrf3All;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3a.FormCrf3aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.FormCrf3bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.FormCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Crf3cQ34 extends Fragment {

    Button btn_Crf3cCounSubmit;

    Context context;
    ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf3c_q34, container, false);

        initializeView(getContext(), view);

        CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().setCounsilStartTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        btn_Crf3cCounSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().setCounsilEndTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().setQ40(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                CRF3cActivity.formsCrf2AndCrf3All.setCrf3cStatus(true);

                sendCrf2Form(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf2DTO());

            }
        });


        return view;
    }


    public    void sendCrf2Form(FormCrf2DTO body){

        progressDialog.setMessage("CRF2 Sending Wait..");
        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf2DTO dto;
        mAPIService.postCrf2(body).enqueue(new Callback<FormCrf2DTO>() {

            @Override
            public void onResponse(Call<FormCrf2DTO> call, Response<FormCrf2DTO> response) {

                if(response.code()==200){

                    CRF3cActivity.formsCrf2AndCrf3All.setCrf2Status(false);
                    CRF3cActivity.formsCrf2AndCrf3All.setFormCrf2DTO(null);
                    sendCrf3aForm(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3aDTO());
                    progressDialog.setMessage("CRF3A Sending Wait..");

                }else {

                    SaveAndReadInternalData.saveCrf2And3AllForms(getContext(), CRF3cActivity.formsCrf2AndCrf3All);
                    progressDialog.dismiss();
                    singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");

                }

            }

            @Override
            public void onFailure(Call<FormCrf2DTO> call, Throwable t) {

                SaveAndReadInternalData.saveCrf2And3AllForms(getContext(), CRF3cActivity.formsCrf2AndCrf3All);
                progressDialog.dismiss();
                singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");

            }
        });

    }


    public    void sendCrf3aForm(FormCrf3aDTO body){
        APIService mAPIService = ApiUtils.getAPIService();
        mAPIService.postCrf3a(body).enqueue(new Callback<FormCrf3aDTO>() {
            @Override
            public void onResponse(Call<FormCrf3aDTO> call, Response<FormCrf3aDTO> response) {

                if(response.code()==200){

                    CRF3cActivity.formsCrf2AndCrf3All.setFormCrf3aDTO(null);
                    CRF3cActivity.formsCrf2AndCrf3All.setCrf3aStatus(false);
                    progressDialog.setMessage("Crf3b Sending Wait..");
                    sendCrf3bForm(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3bDTO());

                }else {
                    SaveAndReadInternalData.saveCrf2And3AllForms(getContext(), CRF3cActivity.formsCrf2AndCrf3All);
                    progressDialog.dismiss();
                    singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");
                }

            }

            @Override
            public void onFailure(Call<FormCrf3aDTO> call, Throwable t) {
                    SaveAndReadInternalData.saveCrf2And3AllForms(getContext(), CRF3cActivity.formsCrf2AndCrf3All);
                    progressDialog.dismiss();
                    singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");
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

                    CRF3cActivity.formsCrf2AndCrf3All.setFormCrf3bDTO(null);
                    CRF3cActivity.formsCrf2AndCrf3All.setCrf3bStatus(false);
                    sendCrf3cForm(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO());
                    progressDialog.setMessage("CRF3C Sending Wait..");

                }else {
                    SaveAndReadInternalData.saveCrf2And3AllForms(getContext(), CRF3cActivity.formsCrf2AndCrf3All);
                    progressDialog.dismiss();
                    singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");
                }

            }

            @Override
            public void onFailure(Call<FormCrf3bDTO> call, Throwable t) {

                SaveAndReadInternalData.saveCrf2And3AllForms(getContext(), CRF3cActivity.formsCrf2AndCrf3All);
                progressDialog.dismiss();
                singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+Crf6Activity.pw.getName()+"+Ka Form Internal Storage m Save Kardia h");

            }
        });

    }

    public   void sendCrf3cForm(FormCrf3cDTO body){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf3c(body).enqueue(new Callback<FormCrf3cDTO>() {
            @Override
            public void onResponse(Call<FormCrf3cDTO> call, Response<FormCrf3cDTO> response) {

                if(response.code()==200){
                    progressDialog.dismiss();
                    singleBtnDialog(context,CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" Form submited...:)",CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" Ka Form Send Hogaya h..:)");
                }else {
                    SaveAndReadInternalData.saveCrf2And3AllForms(getContext(), CRF3cActivity.formsCrf2AndCrf3All);
                    progressDialog.dismiss();
                    singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");
                }

            }

            @Override
            public void onFailure(Call<FormCrf3cDTO> call, Throwable t) {

                SaveAndReadInternalData.saveCrf2And3AllForms(getContext(), CRF3cActivity.formsCrf2AndCrf3All);
                progressDialog.dismiss();
                singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName() +"+Ka Form Internal Storage m Save Kardia h");
            }
        });

    }

    public void initializeView(Context context, View view){

        this.context = context;

        btn_Crf3cCounSubmit = (Button) view.findViewById(R.id.btn_Crf3cCounSubmit);

        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle("Uploding..");
        progressDialog.setMessage("Wait");
        progressDialog.setCancelable(false);
        progressDialog.show();


    }



    public  void singleBtnDialog(Context context, String engMessage, String romanEng){

        Button btnConform;
        TextView tv_engText, tv_RomanEngText;

        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.single_btn_dialog);
        dialog.setCancelable(false);

        btnConform = (Button) dialog.findViewById(R.id.btnok);

        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);
        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);

        tv_engText.setText(engMessage);
        tv_RomanEngText.setText(romanEng);

        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), CRF2DashboargActivity.class));
                getActivity().finish();
            }
        });

        dialog.show();
    }

    public void initilizePrograssDialog(){

        progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Sending..");
        progressDialog.setMessage("Please Wait");
        progressDialog.setCancelable(false);

    }

}
