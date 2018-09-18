package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4And5Dashboard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF5bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.DashboardActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.StatusListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf1_fragments.PwMuacAssessmentFragment2;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.DSSAddressDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5b;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PwInfoCrf5bFragmnet extends Fragment {


    FollowupsDTO followupsDTO;

    Context context;

    int selectStatusItemIndex=-1;

    ProgressDialog progressDialog;

    EditText etPwName, etPwHusbandName, et_para, etPwBlock, etPwStracture, etPwFamilyHousehold, etPwNumber, et_site, et_refuesd;
    ListView listView;
    Button btnF1Register;

    StatusListAdapter statusListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.pw_info_crf5b,
                container, false);

        followupsDTO = CRF5bActivity.followupsDTO;
        context = getContext();

        et_refuesd = (EditText) view.findViewById(R.id.et_refuesd);

        CRF5bActivity.formCrf5b.setDateOfAttempt(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        CRF5bActivity.formCrf5b.setTimeOfAttempt(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        final String[] statusListItem = {"Complete (Muqamaal)","child not present (Maa/bacha moujood nahi)","Refused (inkar kar diya)"
                                    ,"Household locked (ghar bund ha)","Permanent migration (mustaqil chali gay)","Child is adopted by someone else\n" +
                                    "(Bacha kisi aur ko gaoud day diya)"};

        statusListAdapter = new StatusListAdapter(getContext(),statusListItem);

        //edit text all field

        progressDialog = new ProgressDialog(getContext());
        progressDialog.setTitle("Wait..");
        progressDialog.setMessage("Sending Forms Crf-5b");
        etPwName = (EditText) view.findViewById(R.id.etPwName);
        etPwHusbandName = (EditText) view.findViewById(R.id.etPwHusbandName);
        etPwBlock = (EditText) view.findViewById(R.id.etPwBlock);
        et_site = (EditText) view.findViewById(R.id.et_site);
        et_para = (EditText) view.findViewById(R.id.et_para);
        etPwStracture = (EditText) view.findViewById(R.id.etPwStracture);
        etPwFamilyHousehold = (EditText) view.findViewById(R.id.etPwFamilyHousehold);
        etPwNumber = (EditText) view.findViewById(R.id.etPwNumber);

        listView = (ListView) view.findViewById(R.id.lvStatus);

        listView.setAdapter(statusListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==2){

                    et_refuesd.setVisibility(View.VISIBLE);

                }else {

                    et_refuesd.setVisibility(View.GONE);
                }
                selectStatusItemIndex = position;
                statusListAdapter.setChecked(position);
            }
        });

        btnF1Register = (Button) view.findViewById(R.id.btnF1Register);

        btnF1Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    if (selectStatusItemIndex==0){

                        Crf5bQ19Fragmnet fragment = new Crf5bQ19Fragmnet();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout, fragment);
                        fragmentTransaction.commit();

                    }else {


                        progressDialog.show();
                        sendDataToServer();
                    }


                }
            }
        });


        dataInsertInFields(followupsDTO);

        return view;
    }

    public boolean validation(){

        boolean validation = true;


        if(selectStatusItemIndex==-1){

            validation = false;

        }else {

            if(selectStatusItemIndex==1){

                if (et_refuesd.getText().toString().equals("")){

                    et_refuesd.setError("please Enter");
                    validation = false;

                }else {


                    CRF5bActivity.formCrf5b.setRefusedReason(et_refuesd.getText().toString());
                }


            }else {

                CRF5bActivity.formCrf5b.setQ18((selectStatusItemIndex+1)+"");
            }
        }

        return validation;
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
                startActivity(new Intent(getContext(), DashboardActivity.class));
                getActivity().finish();
            }
        });

        dialog.show();
    }


    public void dataInsertInFields(FollowupsDTO followupsDTO){

        FollowupDetails followupDetails = followupsDTO.getFollowupDetails();

        if(followupDetails != null){

            et_para.setText(followupDetails.getPara());
            et_site.setText(followupDetails.getSite());
            etPwBlock.setText(followupDetails.getBlock());
            etPwHusbandName.setText(followupDetails.getHusbandName());
            etPwName.setText(followupDetails.getName());
            etPwNumber.setText(followupDetails.getWnum()+"");
            etPwStracture.setText(followupDetails.getStructure());
            etPwFamilyHousehold.setText(followupDetails.getHouseholdOrFamily());
        }

    }


    public void sendDataToServer(){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf5b(CRF5bActivity.formCrf5b).enqueue(new Callback<FormCrf5b>() {
            @Override
            public void onResponse(Call<FormCrf5b> call, Response<FormCrf5b> response) {

                if(response.code()==200){
                    progressDialog.dismiss();
                    Toast.makeText(context, "Data Sended Congrats",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getContext(), CRF4And5Dashboard.class));
                    getActivity().finish();
                }else {
                    progressDialog.dismiss();
                    Toast.makeText(context, "Data not  Sended ",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getContext(), CRF4And5Dashboard.class));
                    getActivity().finish();
                }
            }

            @Override
            public void onFailure(Call<FormCrf5b> call, Throwable t) {

                progressDialog.dismiss();
                startActivity(new Intent(getContext(), CRF4And5Dashboard.class));
                getActivity().finish();

            }
        });

    }

}

