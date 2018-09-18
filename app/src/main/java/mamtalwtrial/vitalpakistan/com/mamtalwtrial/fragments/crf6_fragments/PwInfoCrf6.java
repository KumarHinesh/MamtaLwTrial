package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
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
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.AnthroDashBoard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF5bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.Crf6Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.DashboardActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.StatusListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf1_fragments.PwMuacAssessmentFragment2;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment.Crf5bQ19Fragmnet;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.DSSAddressDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PwInfoCrf6 extends Fragment {

    FollowupsDTO followupsDTO;

    Context context;


    int selectStatusItemIndex=-1;

    EditText etPwName, etPwHusbandName, et_para, etPwBlock, etPwStracture, etPwFamilyHousehold, etPwNumber, et_site, et_refuesd;
    ListView listView;
    Button btnF1Register;

    StatusListAdapter statusListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pw_info_crf6, container, false);

        followupsDTO = Crf6Activity.followupsDTO;
        context = getContext();

        et_refuesd = (EditText) view.findViewById(R.id.et_refuesd);

         Crf6Activity.formCrf6.setQ2(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
         Crf6Activity.formCrf6.setQ3(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        final String[] statusListItem = {"Complete","Refused (inkar kar diya)"
                ,"Household locked (ghar bund ha)","Permanent migration (mustaqil chali gay)"};


        statusListAdapter = new StatusListAdapter(getContext(),statusListItem);

        Crf6Activity.formCrf6.setQ2(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        Crf6Activity.formCrf6.setQ3(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        //edit text all field
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

                if(position==1){

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

                if (selectStatusItemIndex==0){

                    Crf6Activity.formCrf6.setQ15(selectStatusItemIndex);


                    Fragment fragment = null;

                    if(followupsDTO.getFollowupDetails().getChd() != null && followupsDTO.getFollowupDetails().getChd().equalsIgnoreCase("Y")){

                        fragment = new Crf6_q28();

                    }else if (followupsDTO.getFollowupDetails().getChd() == null &&  followupsDTO.getFollowupDetails().getPwd() == null){

                        fragment = new Crf6Q17And18Fragment();

                    }else if (followupsDTO.getFollowupDetails().getChd() != null && followupsDTO.getFollowupDetails().getChd().equalsIgnoreCase("n")){

                        fragment = new Crf6Q17And18Fragment();

                    }

                  //  Crf6Q17And18Fragment fragment = new Crf6Q17And18Fragment();

                    if (fragment != null){

                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layoutcrf6, fragment);
                        fragmentTransaction.commit();

                    }

                }else {


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
                startActivity(new Intent(getContext(), AnthroDashBoard.class));
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
            etPwNumber.setText(followupsDTO.getFollowupDetails().getWnum()+"");
            etPwStracture.setText(followupDetails.getStructure());
            etPwFamilyHousehold.setText(followupDetails.getHouseholdOrFamily());


        }


    }

    public void sendDataToServer(){

        APIService mAPIService = ApiUtils.getAPIService();

        if(WifiConnectOrNot.haveNetworkConnection(context)){

            mAPIService.postCrf6(Crf6Activity.formCrf6).enqueue(new Callback<FormCrf6>() {
                @Override
                public void onResponse(Call<FormCrf6> call, Response<FormCrf6> response) {

                    if (response.code()==200){
                        SaveAndReadInternalData.deleteFollowUpsByIndex(getContext(), Crf6Activity.selectedPosition);
                        startActivity(new Intent(getActivity(), AnthroDashBoard.class));
                        getActivity().finish();

                    }else {
                        SaveAndReadInternalData.deleteFollowUpsByIndex(getContext(), Crf6Activity.selectedPosition);
                        //SaveAndReadInternalData.saveCrf6FormInternal(getContext(), Crf6Activity.formCrf6);
                        Log.d("Error", "Sending error");
                        startActivity(new Intent(getActivity(), AnthroDashBoard.class));
                        getActivity().finish();

                    }

                }

                @Override
                public void onFailure(Call<FormCrf6> call, Throwable t) {

                    SaveAndReadInternalData.deleteFollowUpsByIndex(getContext(), Crf6Activity.selectedPosition);
                    //SaveAndReadInternalData.saveCrf6FormInternal(getContext(), Crf6Activity.formCrf6);
                    singleBtnDialog(getContext(), "Sorry connection not working send later", "Sorry connection Work nahi kar raha");
                    startActivity(new Intent(getActivity(), AnthroDashBoard.class));
                    getActivity().finish();

                }
            });

        }else {



        }


    }



}
