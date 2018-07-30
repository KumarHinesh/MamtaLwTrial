package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

import android.app.Dialog;
import android.content.Intent;
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
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.DashboardActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf1_fragments.PwOtherDataFragment3;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments.Crf2BabyWeightFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.MuacAssesmentDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.ArmReadingDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class Crf2Q26Fragment extends Fragment {

    //dialog initilization
    Button btnCancel,btnConform;
    Dialog dialog;
    TextView  tv_RomanEngText, tv_engText;


    EditText et_r1_mauc1, et_r2_mauc1, et_r1_mauc2, et_r2_mauc2, et_r1_mauc3, et_r2_mauc3, et_r1_mauc4, et_r2_mauc4;
    Button btn_checkReading;
    TextView tv_muac_difference1, tv_muac_difference2,tv_muac_difference3, tv_muac_difference4, tv_averageMAUC,tv_ass_id;

    TextView tv_yesNO;

    EditText et_readerId_1,et_readerId_2;
    int turn = 1;

    Button btn_q26_maucSubmit;

    TextView tv_babyHour;
    double avrageVal = -1;

    LinearLayout[] listOfLayout;
    LinearLayout ll_muac1, ll_muac2, ll_muac3, ll_muac4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_crf2_q26, container,false);

        et_readerId_1 = (EditText) view.findViewById(R.id.et_readerId_1);
        et_readerId_2 = (EditText) view.findViewById(R.id.et_readerId_2);

      /*  et_readerId_1.setText(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().get(0).getReaderCode1());
        et_readerId_1.setEnabled(false);

        et_readerId_2.setText(CRF3cActivity.formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().get(0).getReaderCode2());
        et_readerId_2.setEnabled(false);
      */

        tv_ass_id = (TextView) view.findViewById(R.id.tv_ass_id);

        ll_muac1 = (LinearLayout) view.findViewById(R.id.ll_muac1);
        ll_muac2 = (LinearLayout) view.findViewById(R.id.ll_muac2);
        ll_muac3 = (LinearLayout) view.findViewById(R.id.ll_muac3);
        ll_muac4 = (LinearLayout) view.findViewById(R.id.ll_muac4);

        listOfLayout = new LinearLayout[]{ll_muac1, ll_muac2, ll_muac3, ll_muac4};

        tv_yesNO = (TextView) view.findViewById(R.id.tv_yesNO);

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


        tv_babyHour = (TextView) view.findViewById(R.id.tv_babyHour);
        tv_babyHour.setText(CRF2Activity.babyHour+"-HOUR");

        et_r1_mauc1 = (EditText)  view.findViewById(R.id.et_r1_mauc1);


        if(CRF2Activity.babyHour<=168){
            tv_babyHour.setTextColor(Color.GREEN);
        }else {
            tv_babyHour.setTextColor(Color.RED);
        }


        btn_q26_maucSubmit = (Button) view.findViewById(R.id.btn_q26_maucSubmit);
        btn_q26_maucSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkFieldValidation()){

                    dataInsertInForm();

                    if(avrageVal<23){

                        Crf2BabyWeightFragment crf2BabyWeightFragment = new Crf2BabyWeightFragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout_crf2, crf2BabyWeightFragment);
                        fragmentTransaction.commit();


                    }else {

                        dataInsertInForm();
                        myCustomeDialog(1);

                    }

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



            }
        });



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

            if ((diff <= 0 && diff >= -0.5) || (diff >= 0 && diff <= 0.5)) {

                tv.setText(diff + "");
                tv.setTextColor(Color.GREEN);

                et_1.setEnabled(false);
                et_2.setEnabled(false);

                btn_checkReading.setClickable(false);
                btn_checkReading.setBackgroundResource(R.drawable.button_shape_green);

                float temp1 = (f1 + f2) / 2;

                avrageVal = Double.parseDouble( new DecimalFormat("##.#").format(temp1));


                tv_averageMAUC.setText(avrageVal + "");


            } else {

                tv.setText(diff + "");
                tv.setTextColor(Color.RED);

                turn++;

                et_1.setEnabled(false);
                et_2.setEnabled(false);

                if (turn <= 4) {

                    listOfLayout[turn - 1].setVisibility(View.VISIBLE);
                }
                if (turn == 5) {

                    myCustomeDialog(1);

                }

            }

        }

        if(avrageVal<23){tv_yesNO.setText("YES"); CRF2Activity.formCrf2DTO.setQ31(ContantsValues.YES);}else {tv_yesNO.setText("NO"); CRF2Activity.formCrf2DTO.setQ31(ContantsValues.NO);}

    }//end CheckReadingEditText

    public void myCustomeDialog(int i){


        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);
        dialog.setCancelable(false);



        // dialog = new Dialog(getContext());
        //dialog.setContentView(R.layout.fragment_pw_info_fragment1);
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

                dialog.dismiss();

                CRF2Activity.formCrf2DTO.setFormStatus(Constants.COMPLETED);
                SendDataToServer.sendCrf2Form(CRF2Activity.formCrf2DTO);
                startActivity(new Intent(getContext(), CRF2DashboargActivity.class));
                getActivity().finish();

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

    public void dataInsertInForm(){

        List<ArmReadingDTO> muacList = new ArrayList<ArmReadingDTO>();

        if(turn>=1){ muacList.add(getArmAssObject(1,et_r1_mauc1,et_r2_mauc1)); }
        if(turn>=2){ muacList.add(getArmAssObject(2,et_r1_mauc2,et_r2_mauc2)); }
        if(turn>=3){ muacList.add(getArmAssObject(3,et_r1_mauc3,et_r2_mauc3)); }
        if(turn>=4){ muacList.add(getArmAssObject(4,et_r1_mauc4,et_r2_mauc4)); }

        CRF2Activity.formCrf2DTO.setArmReadings(muacList);
        CRF2Activity.formCrf2DTO.setQ30(avrageVal+"");

        //CRF1Activity.formCrf1DTO.setMuacAssesments(muacList);
        //CRF1Activity.formCrf1DTO.setQ21();

        }

    public float getTextFromField(EditText et){

        return  Float.parseFloat(et.getText().toString());
    }

    public ArmReadingDTO getArmAssObject(int id , EditText et_1, EditText et_2){

        ArmReadingDTO armReadingDTO = new ArmReadingDTO();

        armReadingDTO.setReader1(getTextFromField(et_1));
        armReadingDTO.setReader2(getTextFromField(et_2));
        armReadingDTO.setReaderCode1(et_readerId_1.getText().toString());
        armReadingDTO.setReaderCode2(et_readerId_2.getText().toString());
        armReadingDTO.setId(id);
        armReadingDTO.setDifference(getTextFromField(et_1)-getTextFromField(et_2));

        return armReadingDTO;
    }

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


}
