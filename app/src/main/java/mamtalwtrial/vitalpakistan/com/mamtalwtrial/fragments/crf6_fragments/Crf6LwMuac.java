package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.Crf6Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3c_fragments.Crf3cQ28;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.MuacLwCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.MuacLwCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.Vaccination;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;


public class Crf6LwMuac extends Fragment {
    //toolbar
    TextView tv_headingText;

    boolean isDataFiled=false;
   //dialog
    Button btnCancel,btnConform;
    Dialog dialog;
    TextView  tv_RomanEngText, tv_engText;

    double avrageVal = -1;


    EditText et_r1_mauc1, et_r2_mauc1, et_r1_mauc2, et_r2_mauc2, et_r1_mauc3, et_r2_mauc3, et_r1_mauc4, et_r2_mauc4;
    Button btn_checkReading, btn_maucSubmit;
    TextView tv_muac_difference1, tv_muac_difference2,tv_muac_difference3, tv_muac_difference4, tv_averageMAUC,tv_ass_id;

    EditText et_readerId_1,et_readerId_2;
    int turn = 1;

    LinearLayout[] listOfLayout;
    LinearLayout ll_muac1, ll_muac2, ll_muac3, ll_muac4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.crf3c_q26_lw_muac,
                container, false);



        tv_headingText = (TextView) view.findViewById(R.id.tv_headingText);
        tv_headingText.setText("MUAC ASSESMENT");

        et_readerId_1 = (EditText) view.findViewById(R.id.et_readerId_1);
        et_readerId_2 = (EditText) view.findViewById(R.id.et_readerId_2);

        tv_ass_id = (TextView) view.findViewById(R.id.tv_ass_id);

        ll_muac1 = (LinearLayout) view.findViewById(R.id.ll_muac1);
        ll_muac2 = (LinearLayout) view.findViewById(R.id.ll_muac2);
        ll_muac3 = (LinearLayout) view.findViewById(R.id.ll_muac3);
        ll_muac4 = (LinearLayout) view.findViewById(R.id.ll_muac4);

        listOfLayout = new LinearLayout[]{ll_muac1, ll_muac2, ll_muac3, ll_muac4};


        et_r1_mauc1 = (EditText) view.findViewById(R.id.et_r1_mauc1);
        et_r2_mauc1 = (EditText) view.findViewById(R.id.et_r2_mauc1);
        et_r1_mauc2 = (EditText) view.findViewById(R.id.et_r1_mauc2);
        et_r2_mauc2 = (EditText) view.findViewById(R.id.et_r2_mauc2);
        et_r1_mauc3 = (EditText) view.findViewById(R.id.et_r1_mauc3);
        et_r2_mauc3 = (EditText) view.findViewById(R.id.et_r2_mauc3);
        et_r2_mauc4 = (EditText) view.findViewById(R.id.et_r2_mauc4);
        et_r1_mauc4 = (EditText) view.findViewById(R.id.et_r1_mauc4);


        tv_muac_difference1 = (TextView) view.findViewById(R.id.tv_muac_difference1);
        tv_muac_difference2 = (TextView) view.findViewById(R.id.tv_muac_difference2);
        tv_muac_difference3 = (TextView) view.findViewById(R.id.tv_muac_difference3);
        tv_muac_difference4 = (TextView) view.findViewById(R.id.tv_muac_difference4);
        tv_averageMAUC = (TextView) view.findViewById(R.id.tv_averageMAUC);

        btn_maucSubmit = (Button) view.findViewById(R.id.btn_maucSubmit);

        if (Crf6Activity.formCrf6.getChildWeightCrf6().get(0).getReaderCode1() != null){

            et_readerId_1.setText(Crf6Activity.formCrf6.getChildWeightCrf6().get(0).getReaderCode1());
            et_readerId_1.setEnabled(false);

            et_readerId_2.setText(Crf6Activity.formCrf6.getChildWeightCrf6().get(0).getReaderCode2());
            et_readerId_2.setEnabled(false);

        }

        btn_maucSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkFieldValidation()){

                    dataInsertInForm();


                    VaccinationFragment vaccinationFragment = new VaccinationFragment();

                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layoutcrf6, vaccinationFragment);
                    fragmentTransaction.commit();


            //        if(avrageVal!=-1 && (avrageVal>=16 && avrageVal<24)){

                       // CRF1Activity.formCrf1DTO.setQ22("YES");
/*
                        PwOtherDataFragment3 pwOtherDataFragment3 = new PwOtherDataFragment3();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_frame, pwOtherDataFragment3);
                        fragmentTransaction.commit();*/

       /*             }else {

                    //    CRF1Activity.formCrf1DTO.setQ22("NO");
                        dataInsertInForm();
                        myCustomeDialog(1);

                    }
*/
                }


            }
        });

        btn_checkReading = (Button) view.findViewById(R.id.btn_checkReading);

        btn_checkReading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turn==1){

                    checkReadingEditText(et_r1_mauc1, et_r2_mauc1,tv_muac_difference1);

                }
                else if(turn==2){

                    checkReadingEditText(et_r1_mauc2, et_r2_mauc2,tv_muac_difference2);
                }
                else if(turn==3){

                    checkReadingEditText(et_r1_mauc3, et_r2_mauc3,tv_muac_difference3);
                }
                else if(turn==4){

                    checkReadingEditText(et_r1_mauc4, et_r2_mauc4,tv_muac_difference4);
                }


         //       CRF1Activity.turnId = turn;
            }
        });

        /*try{  isDataFiled = !CRF1Activity.formCrf1DTO.getMuacAssesments().isEmpty(); }catch (Exception e){}

        if(isDataFiled){

            ArrayList<MuacAssesmentDTO> muacAssesmentDTOS = (ArrayList<MuacAssesmentDTO>) CRF1Activity.formCrf1DTO.getMuacAssesments();

            et_readerId_1.setText(muacAssesmentDTOS.get(0).getReaderCode1());
            et_readerId_2.setText(muacAssesmentDTOS.get(0).getReaderCode2());

            if(muacAssesmentDTOS.size()>=1){

                et_r1_mauc1.setText(muacAssesmentDTOS.get(0).getReading1().toString());
                et_r2_mauc1.setText(muacAssesmentDTOS.get(0).getReading2().toString());
                checkReadingEditText(et_r1_mauc1,et_r2_mauc1,tv_muac_difference1);
            }
            if(muacAssesmentDTOS.size()>=2){
                ll_muac2.setVisibility(View.VISIBLE);
                et_r1_mauc2.setText(muacAssesmentDTOS.get(1).getReading1().toString());
                et_r2_mauc2.setText(muacAssesmentDTOS.get(1).getReading2().toString());
                checkReadingEditText(et_r1_mauc2,et_r2_mauc2,tv_muac_difference2);
            }
            if(muacAssesmentDTOS.size()>=3){
                ll_muac3.setVisibility(View.VISIBLE);
                et_r1_mauc3.setText(muacAssesmentDTOS.get(2).getReading1().toString());
                et_r2_mauc3.setText(muacAssesmentDTOS.get(2).getReading2().toString());
                checkReadingEditText(et_r1_mauc3,et_r2_mauc3,tv_muac_difference3);
            }
            if(muacAssesmentDTOS.size()>=4){
                ll_muac4.setVisibility(View.VISIBLE);
                et_r1_mauc4.setText(muacAssesmentDTOS.get(3).getReading1().toString());
                et_r2_mauc4.setText(muacAssesmentDTOS.get(3).getReading2().toString());
                checkReadingEditText(et_r1_mauc4,et_r2_mauc4,tv_muac_difference4);
            }
        }
*/

        return view;
    }


    public boolean textVaildation(EditText et1, EditText et2){

        boolean b = true;


        String tem1 = et1.getText().toString();
        String tem2 = et2.getText().toString();



                if(TextUtils.isEmpty(tem1)){
                    et1.setError("Required");
                    b= false;
                }
                if(!tem1.contains(".")){
                    et1.setError("Enter Decimal Value");
                    b= false;

                }

                if(TextUtils.isEmpty(tem2)){

                            et2.setError("Required");

                            b = false;
                        }

                    if(!tem2.contains(".")){

                        et2.setError("Enter Decimal Value");
                        b= false;

                    }

        return b;
    }

    public float convertIntoFloat(String value){

        float val = Float.parseFloat(value);

        return val;
    }

    public void checkReadingEditText(EditText et_1, EditText et_2, TextView tv){


        if(textVaildation(et_1, et_2)) {

            float f1 = convertIntoFloat(et_1.getText().toString());
            float f2 = convertIntoFloat(et_2.getText().toString());

            float diff = f1 - f2;

            double difference =  Math.round(diff * 10000.0)/10000.0;

            if ((difference <= 0 && difference >= -0.5) || (difference >= 0 && difference <= 0.5)) {


              //  DecimalFormat decimalFormat = new DecimalFormat(10.0);
                 ;

                tv.setText( difference+ "");
                tv.setTextColor(Color.GREEN);

                et_1.setEnabled(false);
                et_2.setEnabled(false);

                btn_checkReading.setClickable(false);
                btn_checkReading.setBackgroundResource(R.drawable.button_shape_green);

                float temp1 = (f1 + f2) / 2;
                avrageVal = Double.parseDouble( new DecimalFormat("##.#").format(temp1));

                tv_averageMAUC.setText(avrageVal + "");
              //  CRF3cActivity.formCrf3cDTO.setQ25(avrageVal + "");

            } else {

                tv.setText(difference + "");
                tv.setTextColor(Color.RED);

                turn++;

                et_1.setEnabled(false);
                et_2.setEnabled(false);

                if (turn <= 4) {

                    listOfLayout[turn - 1].setVisibility(View.VISIBLE);
                }
                if (turn == 5) {
                    //myCustomeDialog(1);
                }
            }
        }
    }

   /* public void myCustomeDialog(int i){


        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);
        dialog.setCancelable(false);


        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);

        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);
        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);

        if(i==0){

            tv_RomanEngText.setText("Apny 4 Bar Galt Muac dala h islia form band ho gya h");
            tv_engText.setText("You entered wrong muac thats why form closed");
            btnCancel.setVisibility(View.GONE);
            btnConform.setText("Ok");

        }else {

            tv_RomanEngText.setText("Average MUAC maamtaLw Trial k laiq nhi");
            tv_engText.setText("Average MUAC is not Valid");

        }

        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(WifiConnectOrNot.haveNetworkConnection(getContext())){
                    if(CRF1Activity.formCrf1DTO.getFollowUpPositionInList()!=-1){SaveAndReadInternalData.deleteFollowUpFromList(getContext(),CRF1Activity.formCrf1DTO.getFollowUpPositionInList());}
                    //SendDataToServer.sendCrf1Form(CRF1Activity.formCrf1DTO);

                }else {
                    if(CRF1Activity.formCrf1DTO.getFollowUpPositionInList()!=-1){SaveAndReadInternalData.deleteFollowUpFromList(getContext(),CRF1Activity.formCrf1DTO.getFollowUpPositionInList());}
                  //  SaveAndReadInternalData.saveCrf1FormInternal(getContext(),new Gson().toJson(CRF1Activity.formCrf1DTO, FormCrf1DTO.class));

                }

                dialog.dismiss();

            }
        });


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });
        dialog.show();

    }*/


    public boolean checkFieldValidation(  ){
        boolean b = true;
       String tem1 =  et_readerId_1.getText().toString();
       String tem2 = et_readerId_2.getText().toString();

        if(TextUtils.isEmpty(tem1)){
            et_readerId_1.setError("Must Required");
            b = false;
        }else if (tem1.length()<3){

            et_readerId_1.setError("Enter Min Three Digit code");
            b = false;
        }

        if(TextUtils.isEmpty(tem2)){
            et_readerId_2.setError("Must Required");
            b = false;
        }else if (tem2.length()<3){

            et_readerId_2.setError("Enter Min Three Digit code");
            b = false;
        }
        if(avrageVal==-1){

            b = false;
        }
        String tem3 = et_r2_mauc1.getText().toString();
        String tem4 = et_r1_mauc1.getText().toString();

        if(TextUtils.isEmpty(tem3)){
            et_r2_mauc1.setError("Must Required");
            b = false;
        }
        if(TextUtils.isEmpty(tem4)){
            et_r2_mauc1.setError("Must Required");
            b = false;
        }

        return b;
    }

    public void dataInsertInForm(){

        List<MuacLwCrf6> muacList = new ArrayList<MuacLwCrf6>();

        if(turn>=1){ muacList.add(getMuacLwObject(1,et_r1_mauc1,et_r2_mauc1)); }
        if(turn>=2){ muacList.add(getMuacLwObject(2,et_r1_mauc2,et_r2_mauc2)); }
        if(turn>=3){ muacList.add(getMuacLwObject(3,et_r1_mauc3,et_r2_mauc3)); }
        if(turn>=4){ muacList.add(getMuacLwObject(4,et_r1_mauc4,et_r2_mauc4)); }


        Crf6Activity.formCrf6.setMuacLwCrf6(muacList);
        Crf6Activity.formCrf6.setQ34(avrageVal+"");

    }

    public float getTextFromField(EditText et){

        return  Float.parseFloat(et.getText().toString());
    }

    public MuacLwCrf6 getMuacLwObject(int id ,EditText et_1, EditText et_2){

        MuacLwCrf6 muacLwCrf6 = new MuacLwCrf6();

  //      muacLwCrf3cDTO.setReading1(getTextFromField(et_1));
  //      muacLwCrf3cDTO.setReading2(getTextFromField(et_2));
  //      muacLwCrf3cDTO.setReaderCode1(et_readerId_1.getText().toString());
  //      muacLwCrf3cDTO.setReaderCode2(et_readerId_2.getText().toString());

        muacLwCrf6.setId(id);
        muacLwCrf6.setReaderCode1(et_readerId_1.getText().toString());
        muacLwCrf6.setReaderCode1(et_readerId_2.getText().toString());
        muacLwCrf6.setReader1(getTextFromField(et_1));
        muacLwCrf6.setReader2(getTextFromField(et_2));
        muacLwCrf6.setDifference(getTextFromField(et_1)-getTextFromField(et_2));

        return muacLwCrf6;
    }

}