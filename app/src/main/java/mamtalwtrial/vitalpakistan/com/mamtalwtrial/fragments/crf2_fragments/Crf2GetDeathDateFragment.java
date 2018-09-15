package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.DashboardActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
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


public class Crf2GetDeathDateFragment extends Fragment {

    //Dialog initilizing
    Button btnCancel,btnConform;
    Dialog dialog;
    TextView  tv_RomanEngText, tv_engText;

    String getDateFromUser = "";
    Context context;
    ProgressDialog progressDialog;
    Button btn_deathFragmentSubmit;
    boolean b = false;

    TextView tv_getDeathDtae;
    Calendar calendar;

    int year, month, day;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf2_get_death_date,container,false);

        initializeView(view,getContext());

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);



        tv_getDeathDtae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                     //  new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().setTime(new Date(dayOfMonth,monthOfYear,year)););

                        getDateFromUser = dayOfMonth+"-"+(monthOfYear+1)+"-"+year;
                        tv_getDeathDtae.setText("   "+dayOfMonth+"-"+(monthOfYear+1)+"-"+year);
                        b = true;
                    }
                }, year, month, day);
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });


        btn_deathFragmentSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(b){
                            myCustomeDialog();

                        }else {

                            Toast.makeText(getContext(),"Please Enter Date",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );


        return view;
    }

    public void myCustomeDialog(){

        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);
        dialog.setCancelable(false);


        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);

        btnConform.setText("Ok");


        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);
        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);

        tv_RomanEngText.setText("Woman died, thats why form is finished");
        tv_engText.setText("woman ka intqal hogya is wjha s form khtm hogay ");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(getDateFromUser.equals("")){

                    Toast.makeText(getContext(),"Please Enter Date",Toast.LENGTH_LONG).show();

                }else {


                    CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setQ18(getDateFromUser);
                    CRF2Activity.formsCrf2AndCrf3All.getFormCrf2DTO().setFormStatus(Constants.COMPLETED);
                    dialog.dismiss();
                    sendDataToServer();


                    /*startActivity(new Intent(getContext(), CRF2DashboargActivity.class));
                    getActivity().finish();*/


                }


                }
        });

       // btnCancel.setVisibility(View.GONE);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });
        dialog.show();

    }

    public void initializeView(View view, Context context){

        this.context = context;
        progressDialog = new ProgressDialog(context);
        tv_getDeathDtae = (TextView) view.findViewById(R.id.tv_getDeathDtae);
        btn_deathFragmentSubmit = (Button) view.findViewById(R.id.btn_deathFragmentSubmit);

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



}
