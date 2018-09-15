package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf1_fragments;

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

import com.fasterxml.jackson.databind.node.POJONode;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CounselingCRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.DashboardActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.SendingDataActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.StatusListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.messageDialogBox.SingleButtonDialog;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.DSSAddressDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PwInfoFragment1 extends Fragment {

    boolean isDataFiled=false;

    String[] data;

    int statusSite =-1;
    int statusPara =-1;

    ProgressDialog progressDialog;

    String[]  paraArray;
    Button btnCancel,btnConform;

    private APIService mAPIService;

    Context context;
    Spinner spinner_para;

    String pwName, pwHusbandName, pwSite, pwPara,
            pwBlock, pwStructure, pwFamilyHousehold, strPwNumber;

    String pwPara2=null;
    int pwNumber;

    Dialog dialog;

    int selectStatusItemIndex=-1;

    EditText etPwName, etPwHusbandName, etPwPara, etPwBlock, etPwStracture, etPwFamilyHousehold, etPwNumber, et_site, et_refuesd;
    ListView listView;
    Button btnF1Register;
    boolean checkFieldStatus = true;
    StatusListAdapter statusListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pw_info_fragment1,
                container, false);



        CRF1Activity.fragmentNo = 1;
        et_refuesd = (EditText) view.findViewById(R.id.et_refuesd);


        if(CRF1Activity.getSite.equalsIgnoreCase("AG")){

            spinner_para = (Spinner) view.findViewById(R.id.spinner_para_AG);
            spinner_para.setVisibility(View.VISIBLE);
            paraArray = getResources().getStringArray(R.array.AG);

        }else if(CRF1Activity.getSite.equalsIgnoreCase("BH")){

            spinner_para = (Spinner) view.findViewById(R.id.spinner_para_BH);
            spinner_para.setVisibility(View.VISIBLE);
            paraArray = getResources().getStringArray(R.array.BH);
        }else if(CRF1Activity.getSite.equalsIgnoreCase("RG")){

            spinner_para = (Spinner) view.findViewById(R.id.spinner_para_RG);
            spinner_para.setVisibility(View.VISIBLE);
            paraArray = getResources().getStringArray(R.array.RG);
        }


        CRF1Activity.formCrf1DTO.setQ02(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        CRF1Activity.formCrf1DTO.setQ03(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        final String[] statusListItem = {"Agree for screening (Screening k liya razamand)","Not at home (Ghar par mojoud nahi)","Refused (inkar kar diya)"
                                    ,"Wrong information (Ghalt information of PW)","wrong DSS infromation(pw not found)","woman was never found pregnent","woman was pregnanat but recently develiverd (age of child greater then 7 dasys)","Shifted out of DSS (DSS sa bahir chali gay)","PW died before the visit (PW ka intiqaal ho gaya"
                                    ,"Visitor (Mehman th and ab wapis chali gay)"};


        statusListAdapter = new StatusListAdapter(getContext(),statusListItem);

        spinner_para.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                pwPara = paraArray[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        context = getContext();

        initilizePrograssDialog();

        //edit text all field
        etPwName = (EditText) view.findViewById(R.id.etPwName);
        etPwHusbandName = (EditText) view.findViewById(R.id.etPwHusbandName);
        etPwBlock = (EditText) view.findViewById(R.id.etPwBlock);
        et_site = (EditText) view.findViewById(R.id.et_site);
        etPwStracture = (EditText) view.findViewById(R.id.etPwStracture);
        etPwFamilyHousehold = (EditText) view.findViewById(R.id.etPwFamilyHousehold);
        etPwNumber = (EditText) view.findViewById(R.id.etPwNumber);

        et_site.setText(CRF1Activity.getSite);

        try{

            isDataFiled = !CRF1Activity.formCrf1DTO.getPregnantWoman().getName().isEmpty();

        }catch (Exception e){

        }

        if( CRF1Activity.formCrf1DTO.getFollowupId()!=0 || isDataFiled){

            etPwName.setText(CRF1Activity.formCrf1DTO.getPregnantWoman().getName());
            etPwHusbandName.setText(CRF1Activity.formCrf1DTO.getPregnantWoman().getHusbandName());
            //.setText(CRF1Activity.formCrf1DTO.getPregnantWoman().getDssAddress().getPara());
            etPwBlock.setText(CRF1Activity.formCrf1DTO.getPregnantWoman().getDssAddress().getBlock());
            etPwStracture.setText(CRF1Activity.formCrf1DTO.getPregnantWoman().getDssAddress().getStructure());
            etPwFamilyHousehold.setText(CRF1Activity.formCrf1DTO.getPregnantWoman().getDssAddress().getHouseholdOrFamily());
            etPwNumber.setText(CRF1Activity.formCrf1DTO.getPregnantWoman().getDssAddress().getWomanNumber()+"");
            et_site.setText(CRF1Activity.formCrf1DTO.getPregnantWoman().getDssAddress().getSite()+"");

            //////////////////////////////
            for(int i = 0; i<paraArray.length; i++){

                if(CRF1Activity.formCrf1DTO.getPregnantWoman().getDssAddress().getPara().equals(paraArray[i])){
                    spinner_para.setSelection(i);
                    pwPara2 = paraArray[i];
                }

            }

            }else {

            CRF1Activity.formCrf1DTO.setFollowUpPositionInList(-1);

        }

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

                    if(checkFields() && selectStatusItemIndex !=-1){

                        PregnantWomanDTO pregnantWoman = populatePwDTO();
                        CRF1Activity.formCrf1DTO.setPregnantWoman(pregnantWoman);

                        if(selectStatusItemIndex==0){

                            CRF1Activity.formCrf1DTO.setVisitStatus(selectStatusItemIndex);
                            PwMuacAssessmentFragment2 pwMuacAssessmentFragment2 = new PwMuacAssessmentFragment2();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_frame, pwMuacAssessmentFragment2);
                            fragmentTransaction.commit();

                        }else if(selectStatusItemIndex==1 || selectStatusItemIndex==2){


                            CRF1Activity.formCrf1DTO.setFormStatus(Constants.INCOMPLETE);
                            CRF1Activity.formCrf1DTO.setVisitStatus(selectStatusItemIndex);
                            CRF1Activity.formCrf1DTO.setQ34( new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

                            SharedPreferences sharedPreferences = context.getSharedPreferences("incomp",context.MODE_PRIVATE);
                            int val = sharedPreferences.getInt("val", 0);

                            val++;
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("val",val);
                            editor.commit();

                            myCustomeDialog(null, false);


                        }else {


                            CRF1Activity.formCrf1DTO.setFormStatus(Constants.COMPLETED);
                            CRF1Activity.formCrf1DTO.setVisitStatus(selectStatusItemIndex);
                            CRF1Activity.formCrf1DTO.setQ34( new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

                            SharedPreferences sharedPreferences = context.getSharedPreferences("incomp",context.MODE_PRIVATE);
                            int val = sharedPreferences.getInt("val", 0);

                            val++;
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("val",val);
                            editor.commit();

                            myCustomeDialog(null, false);


                        }

                    }else {
                        Toast.makeText(getContext(),"Please Fill All fields",Toast.LENGTH_LONG).show();

                    }
            }
        });

        return view;
    }

    public boolean checkFields(){

        checkFieldStatus = true;

        pwName = etPwName.getText().toString();
        pwHusbandName = etPwHusbandName.getText().toString();
        pwBlock = etPwBlock.getText().toString();
        pwStructure = etPwStracture.getText().toString();
        pwFamilyHousehold = etPwFamilyHousehold.getText().toString();
        strPwNumber = etPwNumber.getText().toString();

        try{
           pwNumber = Integer.parseInt(strPwNumber);
        }catch (NumberFormatException e){Toast.makeText(getContext(),
                "Please Enter Numric Value in Pragnant Woman Field",Toast.LENGTH_LONG).show();}

        if(TextUtils.isEmpty(pwPara) || pwPara.equals("CHOOSE PARA")){

            Toast.makeText(getContext(),"Please Enter para",Toast.LENGTH_SHORT).show();

            checkFieldStatus = false;
        }


        if(pwPara2!=null){

            pwPara = pwPara2;
        }

       /* if(TextUtils.isEmpty(pwSite)){

           Toast.makeText(getContext(),"Please Enter Site",Toast.LENGTH_SHORT).show();
         //  spinner_site.setFocusable(true);


            checkFieldStatus = false;
        }
*/


        if(TextUtils.isEmpty(pwName)){

            etPwName.setError("Required(Isko bharay)");
            checkFieldStatus = false;
        }

        if(TextUtils.isEmpty(pwHusbandName)){

            etPwHusbandName.setError("Required(Isko bharay)");
            checkFieldStatus = false;
        }


        if(TextUtils.isEmpty(pwBlock)){

            etPwBlock.setError("Required(Isko bharay)");
            checkFieldStatus = false;

        }else if(pwBlock.length()<2){

            etPwBlock.setError("Please Enter minimium 2 Character");
            checkFieldStatus = false;
        }

        if(TextUtils.isEmpty(pwStructure)){

            etPwStracture.setError("Required(Isko bharay)");
            checkFieldStatus = false;
        }else if(pwStructure.length()<3){

            etPwStracture.setError("Please Enter minimium 3 Character");
            checkFieldStatus = false;

        }



        if(TextUtils.isEmpty(pwFamilyHousehold )){

            etPwFamilyHousehold.setError("Required(Isko bharay)");
            checkFieldStatus = false;

        }else {

            if(!Character.isAlphabetic(pwFamilyHousehold.charAt(0))){
                etPwFamilyHousehold.setText("");
                etPwFamilyHousehold.setError("Enter Alphabetic value");
                checkFieldStatus = false;
            }
        }



        if(TextUtils.isEmpty(strPwNumber)){

            etPwNumber.setError("Required(Isko bharay)");
            checkFieldStatus = false;
        }

        if(selectStatusItemIndex==2){

            if(et_refuesd.getText().toString().equals("") || et_refuesd.getText().toString().isEmpty()){

                et_refuesd.setError("Required");
                checkFieldStatus = false;
            }else {

                CRF1Activity.formCrf1DTO.setRefusedReason(et_refuesd.getText().toString());

            }

        }

        return checkFieldStatus;
    }


    public void myCustomeDialog(final String objInJson, final boolean status){


        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);
        dialog.setCancelable(false);
        dialog.show();

       // dialog = new Dialog(getContext());
        //dialog.setContentView(R.layout.fragment_pw_info_fragment1);
        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressDialog.show();
                if(WifiConnectOrNot.haveNetworkConnection(context)){

                    APIService mAPIService = ApiUtils.getAPIService();
                    mAPIService.sendCrf1Form(CRF1Activity.formCrf1DTO).enqueue(new Callback<FormCrf1DTO>() {
                        @Override
                        public void onResponse(Call<FormCrf1DTO> call, Response<FormCrf1DTO> response) {

                            if(response.code()==200){

                                progressDialog.dismiss();
                                singleBtnDialog(context,CRF1Activity.formCrf1DTO.getPregnantWoman().getName()+" Form submited...:)",CRF1Activity.formCrf1DTO.getPregnantWoman().getName()+" Ka Form Send Hogaya h..:)");

                            }else {

                                Log.d("error2", response.code()+"");
                                SaveAndReadInternalData.saveCrf1FormInternal(getContext(),CRF1Activity.formCrf1DTO);
                                progressDialog.dismiss();
                                singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF1Activity.formCrf1DTO.getPregnantWoman().getName()+" form save Internel Storage","Internet Sahi nahi chal raha islia "+CRF1Activity.formCrf1DTO.getPregnantWoman().getName()+" Ka Form Internal Storage m Save Kardia h");
                            }
                        }
                        @Override
                        public void onFailure(Call<FormCrf1DTO> call, Throwable t) {

                            SaveAndReadInternalData.saveCrf1FormInternal(getContext(),CRF1Activity.formCrf1DTO);
                            progressDialog.dismiss();
                            singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF1Activity.formCrf1DTO.getPregnantWoman().getName()+" form save Internel Storage","Internet Sahi nahi chal raha islia "+CRF1Activity.formCrf1DTO.getPregnantWoman().getName()+" Ka Form Internal Storage m Save Kardia h");

                        }
                    });


                }else {

                    Log.d("error2", "internet ka masla");
                    SaveAndReadInternalData.saveCrf1FormInternal(getContext(),CRF1Activity.formCrf1DTO);
                    progressDialog.dismiss();
                    singleBtnDialog(context,"Internet Connection is not Working properly "+ CRF1Activity.formCrf1DTO.getPregnantWoman().getName()+" form save Internel Storage","Internet Sahi nahi chal raha islia "+CRF1Activity.formCrf1DTO.getPregnantWoman().getName()+" Ka Form Internal Storage m Save Kardia h");
                }

                if(CRF1Activity.formCrf1DTO.getFollowUpPositionInList()!=-1){
                    SaveAndReadInternalData.deleteFollowUpFromList(getContext(),CRF1Activity.formCrf1DTO.getFollowUpPositionInList());}

            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });



    }

    public PregnantWomanDTO populatePwDTO(){

        PregnantWomanDTO pregnantWoman = new PregnantWomanDTO();

        DSSAddressDTO dssAddress = new DSSAddressDTO();
        dssAddress.setBlock(pwBlock);

        dssAddress.setHouseholdOrFamily(pwFamilyHousehold);
        dssAddress.setPara(pwPara);
        dssAddress.setStructure(pwStructure);
        dssAddress.setSite(et_site.getText().toString());
        dssAddress.setWomanNumber(pwNumber);


        pregnantWoman.setDssAddress(dssAddress);
       // pregnantWoman.setAssessmentId("#Tem_23");
        pregnantWoman.setName(pwName);
        pregnantWoman.setHusbandName(pwHusbandName);


            if(isDataFiled){

                pregnantWoman.setAssessmentId(CRF1Activity.formCrf1DTO.getPregnantWoman().getAssessmentId());
            }

        return pregnantWoman;
    }

 public void initilizePrograssDialog(){

     progressDialog = new ProgressDialog(context);
     progressDialog.setTitle("Sending..");
     progressDialog.setMessage("Please Wait");
     progressDialog.setCancelable(false);

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

}

