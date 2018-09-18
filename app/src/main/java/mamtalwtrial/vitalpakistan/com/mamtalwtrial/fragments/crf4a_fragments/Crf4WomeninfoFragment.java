package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4And5Dashboard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.StatusListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments.CRF2TypeOfPregnancyFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments.Crf2GetDeathDateFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4b_fragments.Crf4bQ20Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.Crf4Complete;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Crf4WomeninfoFragment extends Fragment {



    Button btnCancel,btnConform;
    TextView tv_engText, tv_RomanEngText;
    Dialog dialog;

    int visitStatus = -1;

    EditText etPwName, etPwHusbandName, etPwBlock, etPwStracture, etPwFamilyHousehold, etPwNumber, etPwSite, etPwPara, et_refused;
    ListView listView;
    Button btnF1Register;
    boolean checkFieldStatus = true;
    StatusListAdapter statusListAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_crf2_womeninfo_fragment1,container,false);

       // CRF2Activity.fragmentNo = 0;
      //  CRF2Activity.formCrf2DTO.setQ (new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
      //  CRF2Activity.formCrf2DTO.setQ03(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        CRF4aActivity.formCrf4aDTO.setDateOfAttempt(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        CRF4aActivity.formCrf4aDTO.setTimeOfAttempt(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        final String[] statusListItem = {"1.Complete (visit pori hoi)","2.Woman/baby not present (Maa ya bacha moojoud nahi tha)","3.Refused (Mana kar diya)"
                ,"4.Household locked (Ghar bund tha)","5.Permanent migration (Mustaqil tor par kahin aur chala gaya)","6.Baby is adopted by someone else (Bacha kisi aur na gaud lay liya)"};


        statusListAdapter = new StatusListAdapter(getContext(),statusListItem);


        //edit text all field
        etPwName = (EditText) view.findViewById(R.id.etPwName);
        etPwHusbandName = (EditText) view.findViewById(R.id.etPwHusbandName);
        etPwSite = (EditText) view.findViewById(R.id.etPwSite);
        etPwPara = (EditText) view.findViewById(R.id.etPwPara);
        etPwBlock = (EditText) view.findViewById(R.id.etPwBlock);
        etPwStracture = (EditText) view.findViewById(R.id.etPwStracture);
        etPwFamilyHousehold = (EditText) view.findViewById(R.id.etPwFamilyHousehold);
        etPwNumber = (EditText) view.findViewById(R.id.etPwNumber);
        et_refused = (EditText) view.findViewById(R.id.et_refused2);

        if(CRF4aActivity.formCrf4aDTO!=null){


            if(CRF4aActivity.formCrf4aDTO.getPregnantWoman()!=null){

                etPwName.setText(CRF4aActivity.formCrf4aDTO.getPregnantWoman().getName()+"");
                etPwHusbandName.setText(CRF4aActivity.formCrf4aDTO.getPregnantWoman().getHusbandName()+"");
                etPwSite.setText(CRF4aActivity.formCrf4aDTO.getPregnantWoman().getDssAddress().getSite()+"");
                etPwPara.setText(CRF4aActivity.formCrf4aDTO.getPregnantWoman().getDssAddress().getPara()+"");
                etPwBlock.setText(CRF4aActivity.formCrf4aDTO.getPregnantWoman().getDssAddress().getBlock()+"");
                etPwStracture.setText(CRF4aActivity.formCrf4aDTO.getPregnantWoman().getDssAddress().getStructure()+"");
                etPwFamilyHousehold.setText(CRF4aActivity.formCrf4aDTO.getPregnantWoman().getDssAddress().getHouseholdOrFamily()+"");
                etPwNumber.setText(CRF4aActivity.formCrf4aDTO.getPregnantWoman().getDssAddress().getWomanNumber()+"");

            }

        }

        listView = (ListView) view.findViewById(R.id.lvStatus);

        listView.setAdapter(statusListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                visitStatus = position;
                statusListAdapter.setChecked(position);

                if(visitStatus==2){

                    et_refused.setVisibility(View.VISIBLE);
                }else {
                    et_refused.setVisibility(View.GONE);
                }

            }
        });

        btnF1Register = (Button) view.findViewById(R.id.btnF1Register);

        btnF1Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){


                   // CRF4aActivity.formCrf4aDTO.setQ19(visitStatus+"");
                    if(visitStatus==0){

                        Crf4aQ20Fragment crf4bQ20Fragment = new Crf4aQ20Fragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout4a, crf4bQ20Fragment);
                        fragmentTransaction.commit();


                    }else if (visitStatus==1){
                        myCustomeDialog(visitStatus,"Woman/baby not present","Orat Or Bacha Ghar P Moojod Nhi Hai");
                    }
                    else if (visitStatus==2){
                        myCustomeDialog(visitStatus,"Refused","Orat Nay Inkar Krdia");
                    }
                    else if (visitStatus==3){
                        myCustomeDialog(visitStatus,"Household Locked ","Ghar band para tha");
                    }
                    else if (visitStatus==4){
                        myCustomeDialog(visitStatus,"Permanent Migration","Mustaqil tor par Kahin or chali gai ");
                    }
                    else if (visitStatus==5){
                        myCustomeDialog(visitStatus,"Baby is adopted by someone else","Bacha kisi or n goud le lia h ");
                    }



                }

                /*if(visitStatus !=-1){


                }else {

                    Toast.makeText(getContext(),"Please Fill All fields",Toast.LENGTH_LONG).show();
                }
*/            }
        });

        return view;
    }


    public void myCustomeDialog(final int status, String engMessage, String romanMessage){


        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);


        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);
        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);

        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);

        tv_engText.setText(engMessage);
        tv_RomanEngText.setText(romanMessage);

        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //CRF4aActivity.formCrf4aDTO.setQ84(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                /*if(visitStatus==1 || visitStatus==2){*/

                    //CRF4aActivity.formCrf4aDTO.(Constants.INCOMPLETE);
                   // CRF2Activity.formCrf2DTO.setVisitStatus(visitStatus);
                  //  CRF4aActivity.formCrf2DTO.setVisitStatus();
                   // SendDataToServer.sendCrf2Form(CRF2Activity.formCrf2DTO);


                APIService mAPIService = ApiUtils.getAPIService();

               // CRF4aActivity.formCrf4bDTO.setQ64(SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance()));

              //  CRF4aActivity.formCrf4aDTO.setFollowupId(CRF4aActivity.followupDto.getId());
                CRF4aActivity.formCrf4aDTO.setFollowupStatus(Constants.COMPLETED);
                CRF4aActivity.formCrf4aDTO.setFormStatus(Constants.COMPLETED);
                Crf4Complete crf4Complete = new Crf4Complete();

                crf4Complete.setFormCrf4a(CRF4aActivity.formCrf4aDTO);
                crf4Complete.setFormCrf4b(CRF4aActivity.formCrf4bDTO);


                mAPIService.postCrf4Complete(crf4Complete).enqueue(new Callback<Crf4Complete>() {
                    @Override
                    public void onResponse(Call<Crf4Complete> call, Response<Crf4Complete> response) {

                        if(response.code()==200){
                            SaveAndReadInternalData.deleteFollowUpsByIndex(getContext(), CRF4aActivity.position);
                            Toast.makeText(getContext(),"Succesfully Sended",Toast.LENGTH_LONG).show();
                        }

                    }

                    @Override
                    public void onFailure(Call<Crf4Complete> call, Throwable t) {
                        SaveAndReadInternalData.deleteFollowUpsByIndex(getContext(), CRF4aActivity.position);
                        Toast.makeText(getContext(),"Error occur ",Toast.LENGTH_LONG).show();
                    }
                });



                startActivity(new Intent(getContext(), CRF4And5Dashboard.class));
                    getActivity().finish();


                /*}*//*if(status==3 || status==4 || status==5){

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    String currentTime = sdf.format(calendar.getTime().getTime());
                    CRF2Activity.formCrf2DTO.setQ51(currentTime);
                    CRF2Activity.formCrf2DTO.setFormStatus(Constants.COMPLETED);
                    SendDataToServer.sendCrf2Form(CRF2Activity.formCrf2DTO);
                    startActivity(new Intent(getContext(), CRF2DashboargActivity.class));
                    getActivity().finish();
                    /////////////////////////// enter here form status

                }if(status==6){

                    Crf2GetDeathDateFragment crf2GetDeathDateFragment = new Crf2GetDeathDateFragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf2, crf2GetDeathDateFragment);
                    fragmentTransaction.commit();

                }*/

            }
        });


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });

        dialog.show();

    }

    public boolean validation(){
        boolean b = true;

        if(etPwPara.getText().toString().isEmpty()){
            b = false;
            etPwPara.setError("Required");
        }
        if(etPwHusbandName.getText().toString().isEmpty()){
            b = false;
            etPwPara.setError("Required");
        }
        if(etPwSite.getText().toString().isEmpty()){
            b = false;
            etPwSite.setError("Required");
        }
        if(etPwPara.getText().toString().isEmpty()){
            b = false;
            etPwPara.setError("Required");
        }
        if(etPwBlock.getText().toString().isEmpty()){
            b = false;
            etPwBlock.setError("Required");
        }
        if(etPwStracture.getText().toString().isEmpty()){
            b = false;
            etPwStracture.setError("Required");
        }
        if(etPwNumber.getText().toString().isEmpty()){
            b = false;
            etPwNumber.setError("Required");
        }
        if(etPwFamilyHousehold.getText().toString().isEmpty()){
            b = false;
            etPwFamilyHousehold.setError("Required");
        }

        if(visitStatus==2){

            if(et_refused.getText().toString().equals("")){
                b = false;
                et_refused.setError("Required");
            }else {

                CRF4aActivity.formCrf4aDTO.setQ19(visitStatus+":"+et_refused.getText().toString());
            }
        }else if(visitStatus!=-1 && visitStatus!=2){

            CRF4aActivity.formCrf4aDTO.setQ19(visitStatus+"");
        }



        return b;
    }

    public void setFormData(){

       // CRF2Activity.formCrf2DTO.setPregnantWoman();

    }

}
