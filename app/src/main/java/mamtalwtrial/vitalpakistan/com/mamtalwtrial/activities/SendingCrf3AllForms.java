package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.Sending2And3AllAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.SendingFormAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf2toCrf3AllCollection;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormsCrf2AndCrf3All;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3a.FormCrf3aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.FormCrf3bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.FormCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SendingCrf3AllForms extends AppCompatActivity {


    ListView list_view_send;
    int positionOfselectlist = -1;
    FormCrf2toCrf3AllCollection formCrf2toCrf3AllCollection;
    ProgressDialog progressDialog;
    Sending2And3AllAdapter sending2And3AllAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_crf3_all_forms);

        initlizePrograssDialog();

        list_view_send = (ListView) findViewById(R.id.sending_list);
        formCrf2toCrf3AllCollection = SaveAndReadInternalData.getSavedCrf2toCrf3AllCollection(SendingCrf3AllForms.this);
        sending2And3AllAdapter = new Sending2And3AllAdapter(SendingCrf3AllForms.this,formCrf2toCrf3AllCollection);
        list_view_send.setAdapter(sending2And3AllAdapter);

        list_view_send.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                positionOfselectlist = position;
                progressDialog.show();
                if(formCrf2toCrf3AllCollection.getForms().get(position).getCrf2Status()){
                    sendCrf2Form(formCrf2toCrf3AllCollection.getForms().get(position));
                }else if (formCrf2toCrf3AllCollection.getForms().get(position).getCrf3aStatus()){
                    sendCrf3aForm(formCrf2toCrf3AllCollection.getForms().get(position));
                }else if(formCrf2toCrf3AllCollection.getForms().get(position).getCrf3bStatus()){
                    sendCrf3bForm(formCrf2toCrf3AllCollection.getForms().get(position));
                }else if (formCrf2toCrf3AllCollection.getForms().get(position).getCrf3cStatus()){
                    sendCrf3cForm(formCrf2toCrf3AllCollection.getForms().get(position));
                }

            }
        });

    }


    public void initlizePrograssDialog(){
        progressDialog = new ProgressDialog(SendingCrf3AllForms.this);
        progressDialog.setTitle("Sending..");
        progressDialog.setMessage("Please Wait");
        progressDialog.setCancelable(false);
    }


    public    void sendCrf2Form(final FormsCrf2AndCrf3All body){

        progressDialog.setMessage("CRF2 Sending Wait..");
        APIService mAPIService = ApiUtils.getAPIService();

        //final FormCrf2DTO dto;
        mAPIService.postCrf2(body.getFormCrf2DTO()).enqueue(new Callback<FormCrf2DTO>() {

            @Override
            public void onResponse(Call<FormCrf2DTO> call, Response<FormCrf2DTO> response) {

                if(response.code()==200){

                    body.setCrf2Status(false);
                    body.setFormCrf2DTO(null);
                    sendCrf3aForm(body);
                    progressDialog.setMessage("CRF3A Sending Wait..");

                }else {

                    SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                    SaveAndReadInternalData.saveCrf2And3AllForms(SendingCrf3AllForms.this, body);
                    progressDialog.dismiss();
                    singleBtnDialog(SendingCrf3AllForms.this,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");

                }
            }

            @Override
            public void onFailure(Call<FormCrf2DTO> call, Throwable t) {
                SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                SaveAndReadInternalData.saveCrf2And3AllForms(SendingCrf3AllForms.this, body);
                progressDialog.dismiss();
                singleBtnDialog(SendingCrf3AllForms.this,"Internet Connection is not Working properly "+ CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+CRF3cActivity.formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");

            }
        });

    }


    public void sendCrf3aForm(final FormsCrf2AndCrf3All body){
        APIService mAPIService = ApiUtils.getAPIService();
        mAPIService.postCrf3a(body.getFormCrf3aDTO()).enqueue(new Callback<FormCrf3aDTO>() {
            @Override
            public void onResponse(Call<FormCrf3aDTO> call, Response<FormCrf3aDTO> response) {

                if(response.code()==200){

                    body.setCrf3aStatus(false);
                    body.setFormCrf3aDTO(null);
                    progressDialog.setMessage("Crf3b Sending Wait..");
                    sendCrf3bForm(body);

                }else {
                    SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                    SaveAndReadInternalData.saveCrf2And3AllForms(SendingCrf3AllForms.this, body);
                    progressDialog.dismiss();
                    singleBtnDialog(SendingCrf3AllForms.this,"Internet Connection is not Working properly "+ body.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+body.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");
                }
            }

            @Override
            public void onFailure(Call<FormCrf3aDTO> call, Throwable t) {
                SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                SaveAndReadInternalData.saveCrf2And3AllForms(SendingCrf3AllForms.this, body);
                progressDialog.dismiss();
                singleBtnDialog(SendingCrf3AllForms.this,"Internet Connection is not Working properly "+ body.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+body.getFormCrf3cDTO().getPregnantWoman().getName()+"+Ka Form Internal Storage m Save Kardia h");
            }
        });


    }

    public  void sendCrf3bForm(final FormsCrf2AndCrf3All body){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf3b(body.getFormCrf3bDTO()).enqueue(new Callback<FormCrf3bDTO>() {
            @Override
            public void onResponse(Call<FormCrf3bDTO> call, Response<FormCrf3bDTO> response) {


                if(response.code()==200){
                    body.setCrf3bStatus(false);
                    body.setFormCrf3bDTO(null);
                    sendCrf3cForm(body);
                    progressDialog.setMessage("CRF3C Sending Wait..");

                }else {
                    SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                    SaveAndReadInternalData.saveCrf2And3AllForms(SendingCrf3AllForms.this, body);
                    progressDialog.dismiss();
                    openPopUp(body);
                }

            }

            @Override
            public void onFailure(Call<FormCrf3bDTO> call, Throwable t) {
                SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                SaveAndReadInternalData.saveCrf2And3AllForms(SendingCrf3AllForms.this, body);
                progressDialog.dismiss();
                openPopUp(body);
            }
        });

    }

    public void sendCrf3cForm(final FormsCrf2AndCrf3All body){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf3c(body.getFormCrf3cDTO()).enqueue(new Callback<FormCrf3cDTO>() {
            @Override
            public void onResponse(Call<FormCrf3cDTO> call, Response<FormCrf3cDTO> response) {

                if(response.code()==200){
                    progressDialog.dismiss();
                    SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                    singleBtnDialog(SendingCrf3AllForms.this,body.getFormCrf3cDTO().getPregnantWoman().getName()+" Form submited...:)",body.getFormCrf3cDTO().getPregnantWoman().getName()+" Ka Form Send Hogaya h..:)");
                }else {
                    SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                    SaveAndReadInternalData.saveCrf2And3AllForms(SendingCrf3AllForms.this, body);
                    progressDialog.dismiss();
                    openPopUp(body);
                }

            }

            @Override
            public void onFailure(Call<FormCrf3cDTO> call, Throwable t) {
                SaveAndReadInternalData.deleteCrf2And3AllFromIndex(SendingCrf3AllForms.this, positionOfselectlist);
                SaveAndReadInternalData.saveCrf2And3AllForms(SendingCrf3AllForms.this, body);
                progressDialog.dismiss();
                openPopUp(body);
            }
        });

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
                if (SaveAndReadInternalData.getSavedCrf2toCrf3AllCollection(SendingCrf3AllForms.this) != null){
                    list_view_send.setAdapter(new Sending2And3AllAdapter(SendingCrf3AllForms.this, SaveAndReadInternalData.getSavedCrf2toCrf3AllCollection(SendingCrf3AllForms.this)));
                }
            }
        });
        dialog.show();
    }


    public void openPopUp(FormsCrf2AndCrf3All formsCrf2AndCrf3All){

        if (formsCrf2AndCrf3All.getCrf2Status()){
            singleBtnDialog(SendingCrf3AllForms.this,"Internet Connection is not Working properly "+ formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+ formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() +"+Ka Form Internal Storage m Save Kardia h");
        }else if (formsCrf2AndCrf3All.getCrf3aStatus()){
            singleBtnDialog(SendingCrf3AllForms.this,"Internet Connection is not Working properly "+ formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+ formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getName() +"+Ka Form Internal Storage m Save Kardia h");
        }else if (formsCrf2AndCrf3All.getCrf3bStatus()){
            singleBtnDialog(SendingCrf3AllForms.this,"Internet Connection is not Working properly "+ formsCrf2AndCrf3All.getFormCrf3bDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+ formsCrf2AndCrf3All.getFormCrf3bDTO().getPregnantWoman().getName() +"+Ka Form Internal Storage m Save Kardia h");
        }else if (formsCrf2AndCrf3All.getCrf3cStatus()){
            singleBtnDialog(SendingCrf3AllForms.this,"Internet Connection is not Working properly "+ formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName()+" forms save Internel Storage", "Internet Sahi nahi chal raha islia "+ formsCrf2AndCrf3All.getFormCrf3cDTO().getPregnantWoman().getName() +"+Ka Form Internal Storage m Save Kardia h");
        }
    }

}
