package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments;

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

import java.util.ArrayList;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.Crf6Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.DashboardActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments.Crf2Q36Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.ChildWeightDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.ChildWeightCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class Crf6BabyWeightFragment extends Fragment {

    Button btn_BweightSubmit, btn_checkReading;
    int avrageWeight=-1;

    int turn = 1;

    //dialog
    Button btnCancel,btnConform;
    Dialog dialog;
    TextView  tv_RomanEngText, tv_engText;

    TextView tv_lessOrNot, tv_weekOfPregnancy;

    LinearLayout[] listOfLayout;
    LinearLayout ll_weight1, ll_weight2, ll_weight3, ll_weight4, ll_week;

    EditText et_readerId_2, et_readerId_1;
    EditText et_r1_weight1, et_r2_weight1, et_r1_weight2, et_r2_weight2 ,et_r1_weight3, et_r2_weight3, et_r1_weight4, et_r2_weight4;
    TextView tv_weight_difference1, tv_weight_difference2, tv_weight_difference3, tv_weight_difference4, tv_averageWeight;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf2_baby_weight,container,false);

        tv_weekOfPregnancy = (TextView) view.findViewById(R.id.tv_weekOfPregnancy);

        et_readerId_1 = (EditText) view.findViewById(R.id.et_readerId_1);
        et_readerId_2 = (EditText) view.findViewById(R.id.et_readerId_2);

        ll_weight1 = (LinearLayout) view.findViewById(R.id.ll_weight1);
        ll_weight2 = (LinearLayout) view.findViewById(R.id.ll_weight2);
        ll_weight3 = (LinearLayout) view.findViewById(R.id.ll_weight3);
        ll_weight4 = (LinearLayout) view.findViewById(R.id.ll_weight4);
        ll_week = (LinearLayout) view.findViewById(R.id.ll_week);
        ll_week.setVisibility(View.GONE);

        listOfLayout = new LinearLayout[]{ll_weight1, ll_weight2, ll_weight3, ll_weight4};

        tv_lessOrNot = (TextView) view.findViewById(R.id.tv_lessOrNot);

        et_r1_weight1 = (EditText) view.findViewById(R.id.et_r1_weight1);
        et_r2_weight1 = (EditText) view.findViewById(R.id.et_r2_weight1);
        et_r1_weight2 = (EditText) view.findViewById(R.id.et_r1_weight2);
        et_r2_weight2 = (EditText) view.findViewById(R.id.et_r2_weight2);
        et_r1_weight3 = (EditText) view.findViewById(R.id.et_r1_weight3);
        et_r2_weight3 = (EditText) view.findViewById(R.id.et_r2_weight3);
        et_r1_weight4 = (EditText) view.findViewById(R.id.et_r1_weight4);
        et_r2_weight4 = (EditText) view.findViewById(R.id.et_r2_weight4);


        tv_weight_difference1 = (TextView) view.findViewById(R.id.tv_weight_difference1);
        tv_weight_difference2 = (TextView) view.findViewById(R.id.tv_weight_difference2);
        tv_weight_difference3 = (TextView) view.findViewById(R.id.tv_weight_difference3);
        tv_weight_difference4 = (TextView) view.findViewById(R.id.tv_weight_difference4);
        tv_averageWeight = (TextView) view.findViewById(R.id.tv_averageWeight);

        btn_checkReading = view.findViewById(R.id.btn_checkReading);
        btn_checkReading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(turn==1){

                    checkReadingEditText(et_r1_weight1, et_r2_weight1,tv_weight_difference1);

                }
                else if(turn==2){

                    checkReadingEditText(et_r1_weight2, et_r2_weight2,tv_weight_difference2);
                }
                else if(turn==3){

                    checkReadingEditText(et_r1_weight3, et_r2_weight3,tv_weight_difference3);
                }
                else if(turn==4){

                    checkReadingEditText(et_r1_weight4, et_r2_weight4,tv_weight_difference4);
                }

            }
        });



        btn_BweightSubmit = (Button) view.findViewById(R.id.btn_BweightSubmit);

        btn_BweightSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(checkFieldValidation()){

                    dataInsertInForm();

                    Crf6BabyLengthFragment fragment = new Crf6BabyLengthFragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layoutcrf6, fragment);
                    fragmentTransaction.commit();

                }

            }
        });

        return view;
    }

    public void checkReadingEditText(EditText et_1, EditText et_2, TextView tv){


        if(textVaildation(et_1, et_2)) {

            int  weight1 = Integer.parseInt(et_1.getText().toString());
            int weight2 = Integer.parseInt(et_2.getText().toString());

            int diff = weight1 - weight2;

            if ((diff <= 0 && diff >= -50) || (diff >= 0 && diff <= 50)) {

                tv.setText(diff + "Grams");
                tv.setTextColor(Color.GREEN);

                et_1.setEnabled(false);
                et_2.setEnabled(false);

                btn_checkReading.setClickable(false);
                btn_checkReading.setBackgroundResource(R.drawable.button_shape_green);
                avrageWeight = (weight1 + weight2) / 2;
                tv_averageWeight.setText(avrageWeight + "Grams");

            } else {

                tv.setText(diff + "Grams");
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

            if(avrageWeight>=1500){
                tv_lessOrNot.setText("YES");

            }else {
                tv_lessOrNot.setText("NO");

            }
        }
    }

    public boolean textVaildation(EditText et1, EditText et2){

        boolean b = true;

        String tem1 = et1.getText().toString();
        String tem2 = et2.getText().toString();


        if(TextUtils.isEmpty(tem1)){
            et1.setError("Required");
            b= false;
        }


        if(TextUtils.isEmpty(tem2)){

            et2.setError("Required");

            b = false;
        }


        return b;
    }

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

            tv_RomanEngText.setText("Apny 4 Bar Galt Weight dala h islia form band ho gya h");
            tv_engText.setText("You entered wrong Weight thats why form closed");
            btnCancel.setVisibility(View.GONE);
            btnConform.setText("Ok");
        }else {

            tv_RomanEngText.setText("XXXXXXXXXXXXX");
            tv_engText.setText("XXXXXXXXXXXXXXX");

        }


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                startActivity(new Intent(getContext(), DashboardActivity.class));
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
        if(avrageWeight==-1){

            b = false;
        }
        String tem3 = et_r1_weight1.getText().toString();
        String tem4 = et_r2_weight1.getText().toString();

        if(TextUtils.isEmpty(tem3)){
            et_r1_weight1.setError("Must Required");
            b = false;
        }
        if(TextUtils.isEmpty(tem4)){
            et_r2_weight1.setError("Must Required");
            b = false;
        }

        return b;
    }


    public void dataInsertInForm(){

        List<ChildWeightCrf6> childWeightDTOSList = new ArrayList<ChildWeightCrf6>();

        if(turn>=1){ childWeightDTOSList.add(getChildWeightObject(1,et_r1_weight1,et_r2_weight1)); }
        if(turn>=2){ childWeightDTOSList.add(getChildWeightObject(2,et_r1_weight2,et_r2_weight2)); }
        if(turn>=3){ childWeightDTOSList.add(getChildWeightObject(3,et_r1_weight3,et_r2_weight3)); }
        if(turn>=4){ childWeightDTOSList.add(getChildWeightObject(4,et_r1_weight4,et_r2_weight4)); }

        Crf6Activity.formCrf6.setChildWeightCrf6(childWeightDTOSList);
        Crf6Activity.formCrf6.setQ20(avrageWeight+"");

    }
    public float getTextFromField(EditText et){
        return  Float.parseFloat(et.getText().toString());
    }

    public ChildWeightCrf6 getChildWeightObject(int id , EditText et_1, EditText et_2){

        ChildWeightCrf6 childWeightDTO = new ChildWeightCrf6();

        childWeightDTO.setReader1(getTextFromField(et_1));
        childWeightDTO.setReader2(getTextFromField(et_2));
        childWeightDTO.setReaderCode1(et_readerId_1.getText().toString());
        childWeightDTO.setReaderCode2(et_readerId_2.getText().toString());
        childWeightDTO.setId(id);
        childWeightDTO.setDifference(getTextFromField(et_1)-getTextFromField(et_2));

        return childWeightDTO;
    }

}
