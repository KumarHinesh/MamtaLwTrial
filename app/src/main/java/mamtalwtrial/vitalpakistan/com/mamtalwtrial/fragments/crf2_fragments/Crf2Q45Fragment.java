package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.JsonReader;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormsCrf2AndCrf3All;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Crf2Q45Fragment extends Fragment {

    Button btn_submitCrf2;
    RadioGroup rg_q45, rg_q46, rg_q47, rg_q48, rg_q49, rg_q50;
    RadioButton rb_q45, rb_q46, rb_q47, rb_q48, rb_q49, rb_q50;
    TextView tv_q45, tv_q46, tv_q47, tv_q48, tv_q49, tv_q50;

    ProgressDialog progressDialog;
    Context context;

    Button btnConform, btnCancel;

    TextView tv_engText,tv_RomanEngText;

    Dialog dialog;

    EditText et_q47, et_q48;

    LinearLayout ll_q48_q50;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_crf2_q45, container,false);

        context = getContext();
        btn_submitCrf2 = (Button) view.findViewById(R.id.btn_submitCrf2);

        ll_q48_q50 = (LinearLayout) view.findViewById(R.id.ll_q48_q50);

        et_q47 = (EditText) view.findViewById(R.id.et_q47);
        et_q48 = (EditText) view.findViewById(R.id.et_q48);

        tv_q45 = (TextView) view.findViewById(R.id.tv_q45);
        tv_q46 = (TextView) view.findViewById(R.id.tv_q46);
        tv_q47 = (TextView) view.findViewById(R.id.tv_q47);
        tv_q48 = (TextView) view.findViewById(R.id.tv_q48);
        tv_q49 = (TextView) view.findViewById(R.id.tv_q49);
        tv_q50 = (TextView) view.findViewById(R.id.tv_q50);

        rg_q45 = (RadioGroup) view.findViewById(R.id.rg_q45);
        rg_q46 = (RadioGroup) view.findViewById(R.id.rg_q46);
        rg_q47 = (RadioGroup) view.findViewById(R.id.rg_q47);
        rg_q48 = (RadioGroup) view.findViewById(R.id.rg_q48);
        rg_q49 = (RadioGroup) view.findViewById(R.id.rg_q49);
        rg_q50 = (RadioGroup) view.findViewById(R.id.rg_q50);

        rg_q45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q45 = (RadioButton) view.findViewById(rg_q45.getCheckedRadioButtonId());

            }
        });

        rg_q46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q46 = (RadioButton) view.findViewById(rg_q46.getCheckedRadioButtonId());
            }
        });

        rg_q47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q47 = (RadioButton) view.findViewById(rg_q47.getCheckedRadioButtonId());

               if(rb_q47.getTag().toString().equals("2")){
                   et_q47.setVisibility(View.VISIBLE);
                    ll_q48_q50.setVisibility(View.GONE);
               }
               else{
                   et_q47.setVisibility(View.GONE);
                   ll_q48_q50.setVisibility(View.VISIBLE);
               }

            }
        });

        rg_q48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q48 = (RadioButton) view.findViewById(rg_q48.getCheckedRadioButtonId());

                if(rb_q48.getTag().toString().equals("2"))
                    et_q48.setVisibility(View.VISIBLE);
                else
                    et_q48.setVisibility(View.GONE);


            }
        });

        rg_q49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q49 = (RadioButton) view.findViewById(rg_q49.getCheckedRadioButtonId());
            }
        });

        rg_q50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q50 = (RadioButton) view.findViewById(rg_q50.getCheckedRadioButtonId());

            }
        });


        btn_submitCrf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    if(rb_q47.getTag().toString().equals("2")){
                        myCustomeDialog(false);
                    }else {
                        myCustomeDialog(true);
                    }

                }


            }
        });


        return view;
    }

    public boolean validation(){

        boolean validation = true;

        if(rg_q45.getCheckedRadioButtonId()!=-1){
            CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ45(rb_q45.getTag().toString());
        }else {
            tv_q45.setError("Required");
        }

        if(rg_q46.getCheckedRadioButtonId()!=-1){
            CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ46(rb_q46.getTag().toString());
        }else {
            tv_q46.setError("Required");
        }

/*
        if(rg_q46.getCheckedRadioButtonId()!=-1){
            CRF2Activity.formCrf2DTO.setQ46(rb_q46.getTag().toString());
        }else {
            tv_q46.setError("Required");
        }
*/

        if(et_q47.getVisibility()!=View.VISIBLE) {

            if(rg_q47.getCheckedRadioButtonId()!=-1){
                CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ47(rb_q47.getTag().toString());
            }else {
                tv_q47.setError("Required");
            }
        }else {

            if(et_q47.getText().equals("")){
                et_q47.setError("Required");
            }else {
                CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ47(rb_q47.getTag().toString()+":"+et_q47.getText().toString());
            }
        }


        if(ll_q48_q50.getVisibility()==View.VISIBLE){

            if(et_q48.getVisibility()!=View.VISIBLE) {

                if(rg_q48.getCheckedRadioButtonId()!=-1){
                    CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ48(rb_q48.getTag().toString());
                }else {
                    tv_q48.setError("Required");
                }
            }else {

                if(et_q48.getText().equals("")){
                    et_q48.setError("Required");
                }else {
                    CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ48(rb_q48.getTag().toString()+":"+et_q48.getText().toString());
                }
            }

            if(rg_q49.getCheckedRadioButtonId()!=-1){
                CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ49(rb_q49.getTag().toString());
            }else {
                tv_q49.setError("Required");
            }

            if(rg_q50.getCheckedRadioButtonId()!=-1){
                CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ50(rb_q50.getTag().toString());
            }else {
                tv_q50.setError("Required");
            }

        }


        return validation;
    }



    public void myCustomeDialog(final boolean b){


        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);


        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);
        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);

        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);

        btnCancel.setVisibility(View.GONE);

        if(b){
            tv_engText.setText("You filled Crf2 Now fill crf3A");
            tv_RomanEngText.setText("Apny Crf2 bhar lia h ab ap crf3a bharay");
        }else {

            tv_engText.setText("woman is not agree");
            tv_RomanEngText.setText("woman razamand nahi h");
        }


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setTimeOfEnd(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

                if(b){

                 //   CRF2Activity.formCrf2DTO.setTimeOfEnd(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                 //   FormsCrf2AndCrf3All formsCrf2AndCrf3All = new FormsCrf2AndCrf3All();
                //    formsCrf2AndCrf3All.setCrf2Status(Constants.COMPLETED);
                //    formsCrf2AndCrf3All.setFormCrf2DTO(CRF2Activity.formCrf2DTO);
                    //  SendDataToServer.sendCrf2Form(CRF2Activity.formCrf2DTO);
                    startActivity(new Intent(getContext(), CRF3Activity.class).putExtra("forms",new Gson().toJson(CRF2Activity.formsCrf2AndCrf3All, FormsCrf2AndCrf3All.class)));
                    getActivity().finish();

                }else {

                    sendDataToServer();

               }

            }
        });

        dialog.show();

    }

    public void sendDataToServer(){

        progressDialog.show();
        APIService mAPIService = ApiUtils.getAPIService();

        if(WifiConnectOrNot.haveNetworkConnection(getContext())){

            mAPIService.postCrf2(CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO()).enqueue(new Callback<FormCrf2DTO>() {
                @Override
                public void onResponse(Call<FormCrf2DTO> call, Response<FormCrf2DTO> response) {

                    progressDialog.dismiss();

                    if(response.code()==200){

                        singleBtnDialog(getContext(),CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() + "Form submited...:)",CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() +" Ka Form Send Hogaya h..:)");

                    }else {

                        singleBtnDialog(getContext(),"Internet Connection is not Working properly "+ CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() +" form save Internel Storage","Internet Sahi nahi chal raha islia "+ CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() +" Ka Form Internal Storage m Save Kardia h");
                        SaveAndReadInternalData.saveCrf2And3AllForms(context,CRF2Activity.formsCrf2AndCrf3All);

                    }

                }

                @Override
                public void onFailure(Call<FormCrf2DTO> call, Throwable t) {

                    singleBtnDialog(getContext(),"Internet Connection is not Working properly "+ CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() +" form save Internel Storage","Internet Sahi nahi chal raha islia "+ CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() +" Ka Form Internal Storage m Save Kardia h");
                    SaveAndReadInternalData.saveCrf2And3AllForms(context,CRF2Activity.formsCrf2AndCrf3All);

                }
            });

        }else{

            singleBtnDialog(getContext(),"Internet Connection is not Working properly "+ CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() +" form save Internel Storage","Internet Sahi nahi chal raha islia "+ CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().getPregnantWoman().getName() +" Ka Form Internal Storage m Save Kardia h");
            SaveAndReadInternalData.saveCrf2And3AllForms(context,CRF2Activity.formsCrf2AndCrf3All);
        }

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
