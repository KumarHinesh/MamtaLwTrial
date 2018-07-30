package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

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
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.StatusListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments.CRF2TypeOfPregnancyFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments.Crf2GetDeathDateFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class Crf2WomeninfoFragment1 extends Fragment {



    Button btnCancel,btnConform;
    TextView tv_engText, tv_RomanEngText;
    Dialog dialog;

    int visitStatus = -1;

    EditText etPwName, etPwHusbandName, etPwBlock, etPwStracture, etPwFamilyHousehold, etPwNumber, etPwSite, etPwPara;
    ListView listView;
    Button btnF1Register;
    boolean checkFieldStatus = true;
    StatusListAdapter statusListAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_crf2_womeninfo_fragment1,container,false);

        CRF2Activity.fragmentNo = 0;
      //  CRF2Activity.formCrf2DTO.setQ (new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
      //  CRF2Activity.formCrf2DTO.setQ03(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        CRF2Activity.formCrf2DTO.setDateOfAttempt(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        CRF2Activity.formCrf2DTO.setTimeOfAttempt(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        final String[] statusListItem = {"Agree for this visit (Razamand ha visit k liya)","Not at home (Ghar par mojoud nahi)","Refused (inkar kar diya)"
                ,"False pregnancy (Ghalt khabar th hamaal k)","Shifted out of DSS (DSS sa bahir chali gay)","Adopted child from outside DSS (Bacha DSS area sa bahir sa aya ha)"
                ,"PW died before the visit (PW ka inteeqal ho gaya ha)"};


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

        if(CRF2Activity.formCrf2DTO.getPregnantWoman()!=null){

            etPwName.setText(CRF2Activity.formCrf2DTO.getPregnantWoman().getName()+"");
            etPwHusbandName.setText(CRF2Activity.formCrf2DTO.getPregnantWoman().getHusbandName()+"");
            etPwSite.setText(CRF2Activity.formCrf2DTO.getPregnantWoman().getDssAddress().getSite()+"");
            etPwPara.setText(CRF2Activity.formCrf2DTO.getPregnantWoman().getDssAddress().getPara()+"");
            etPwBlock.setText(CRF2Activity.formCrf2DTO.getPregnantWoman().getDssAddress().getBlock()+"");
            etPwStracture.setText(CRF2Activity.formCrf2DTO.getPregnantWoman().getDssAddress().getStructure()+"");
            etPwFamilyHousehold.setText(CRF2Activity.formCrf2DTO.getPregnantWoman().getDssAddress().getHouseholdOrFamily()+"");
            etPwNumber.setText(CRF2Activity.formCrf2DTO.getPregnantWoman().getDssAddress().getWomanNumber()+"");

        }


        listView = (ListView) view.findViewById(R.id.lvStatus);

        listView.setAdapter(statusListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                visitStatus = position;
                statusListAdapter.setChecked(position);
            }
        });

        btnF1Register = (Button) view.findViewById(R.id.btnF1Register);

        btnF1Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(visitStatus !=-1){

                CRF2Activity.formCrf2DTO.setQ17(visitStatus+"");
                    if(visitStatus==0){

                        CRF2TypeOfPregnancyFragment crf2TypeOfPregnancyFragment = new CRF2TypeOfPregnancyFragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_crf2, crf2TypeOfPregnancyFragment);
                        fragmentTransaction.commit();


                    }else if (visitStatus==1){
                        myCustomeDialog(visitStatus,"Not At Home","Orat Ghar P Moojod Nhi Hai");
                    }
                    else if (visitStatus==2){
                        myCustomeDialog(visitStatus,"Refused","Orat Nay Inkar Krdia");
                    }
                    else if (visitStatus==3){
                        myCustomeDialog(visitStatus,"False pregnancy ","Ghalt khabar th hamaal k");
                    }
                    else if (visitStatus==4){
                        myCustomeDialog(visitStatus,"Shifted Out Of DSS","DSS Sa Bhar Chali gai ");
                    }
                    else if (visitStatus==5){
                        myCustomeDialog(visitStatus,"Adopted child from outside DSS ","Bacha DSS area sa bahir sa aya ha");
                    }
                    else if (visitStatus==6){
                        myCustomeDialog(visitStatus,"PW died before the visit ","PW ka inteeqal ho gaya ha");
                    }

                }else {

                    Toast.makeText(getContext(),"Please Fill All fields",Toast.LENGTH_LONG).show();

                }

            }
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

                if(visitStatus==1 || visitStatus==2){

                    CRF2Activity.formCrf2DTO.setFormStatus(Constants.INCOMPLETE);
                    CRF2Activity.formCrf2DTO.setVisitStatus(visitStatus);
                   // CRF2Activity.formCrf2DTO.setVisitStatus();
                    SendDataToServer.sendCrf2Form(CRF2Activity.formCrf2DTO);
                    startActivity(new Intent(getContext(), CRF2DashboargActivity.class));
                    getActivity().finish();


                }if(status==3 || status==4 || status==5){

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

                }

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

        return b;
    }

    public void setFormData(){

       // CRF2Activity.formCrf2DTO.setPregnantWoman();

    }

}
