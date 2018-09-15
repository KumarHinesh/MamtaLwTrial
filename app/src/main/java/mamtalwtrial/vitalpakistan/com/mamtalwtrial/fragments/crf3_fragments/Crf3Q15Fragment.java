package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3_fragments;

import android.app.Dialog;
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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments.Crf3bQ44Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class Crf3Q15Fragment extends Fragment {

    Button btnConform, btnCancel;
    TextView tv_engText,tv_RomanEngText, tv_q19, tv_q20, tv_q22, tv_q23,tv_q24 ;
    Dialog dialog;

    ScrollView scrolView;

    RadioGroup rg_q22, rg_q19, rg_q20;

    RadioButton rb_q22, rb_q19, rb_q20;

    EditText  et_q17, et_q24, et_q18, et_q23 , et_q26, et_q27;

    LinearLayout ll_q24, ll_q23;

    Button btn_next;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view  = inflater.inflate(R.layout.fragment_crf3_q15, container, false);

        tv_q19 = (TextView) view.findViewById(R.id.tv_q19);
        tv_q20 = (TextView) view.findViewById(R.id.tv_q20);
        tv_q22 = (TextView) view.findViewById(R.id.tv_q22);
        tv_q23 = (TextView) view.findViewById(R.id.tv_q23);
        tv_q24 = (TextView) view.findViewById(R.id.tv_q24);


        ll_q24 = (LinearLayout) view.findViewById(R.id.ll_q24);
        ll_q23 = (LinearLayout) view.findViewById(R.id.ll_q23);

        et_q24 = (EditText) view.findViewById(R.id.et_q24);
        et_q17 = (EditText) view.findViewById(R.id.et_q17);
        et_q18 = (EditText) view.findViewById(R.id.et_q18);
        et_q23 = (EditText) view.findViewById(R.id.et_q23);
        et_q26 = (EditText) view.findViewById(R.id.et_q26);
        et_q27 = (EditText) view.findViewById(R.id.et_q27);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        rg_q22 = (RadioGroup) view.findViewById(R.id.rg_q22);
        rg_q22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q22 = (RadioButton) view.findViewById(rg_q22.getCheckedRadioButtonId());
                if(rb_q22.getTag().toString().equalsIgnoreCase(ContantsValues.YES)){

                    ll_q24.setVisibility(View.VISIBLE);
                    ll_q23.setVisibility(View.VISIBLE);
                }else {

                    ll_q24.setVisibility(View.GONE);
                    ll_q23.setVisibility(View.GONE);
                }
            }
        });


        btn_next = (Button) view.findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){
                    myCustomeDialog();
                }

            }
        });

        rg_q19 = (RadioGroup) view.findViewById(R.id.rg_q19);
        rg_q19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q19 = (RadioButton) view.findViewById(rg_q19.getCheckedRadioButtonId());

            }
        });

        rg_q20 = (RadioGroup) view.findViewById(R.id.rg_q20);
        rg_q20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q20 = (RadioButton) view.findViewById(rg_q20.getCheckedRadioButtonId());

            }
        });


        return view;
    }


    public boolean validation(){
       boolean validation = true;

        CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ15(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ16(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));


        if (et_q17.getText().toString().equals("")) {
            validation = false;
        } else {
            CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ17(et_q17.getText().toString());
        }

        if (et_q18.getText().toString().equals("")) {
            validation = false;
        } else {
            CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ18(et_q18.getText().toString().toUpperCase());
        }

        if (et_q26.getText().toString().equals("")) {
            validation = false;
        } else {
            CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ26(et_q26.getText().toString().toUpperCase());
        }

        if (et_q27.getText().toString().equals("")) {
            validation = false;
        } else {
            CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ27(et_q27.getText().toString().toUpperCase());
        }

        if (isRBCheckedThree(rg_q19, rb_q19, tv_q19).equals("")) {
            validation = false;
        } else {
            CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ19(isRBCheckedThree(rg_q19, rb_q19, tv_q19));
        }

        if (isRBCheckedThree(rg_q20, rb_q20, tv_q20).equals("")) {
            validation = false;
        } else {
            CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ20(isRBCheckedThree(rg_q20, rb_q20, tv_q20));
        }

        if (isRBCheckedThree(rg_q22, rb_q22, tv_q22).equals("")) {
            validation = false;
        } else {
            CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ22(isRBCheckedThree(rg_q22, rb_q22, tv_q22));
        }

        if(ll_q23.getVisibility()==View.VISIBLE){

            if(getTextFromField(et_q23,tv_q23).equals("")){
                validation = false;
            }else {

                CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ23(getTextFromField(et_q23,tv_q23));
            }

        }

        if(ll_q24.getVisibility()==View.VISIBLE){

            if(getTextFromField(et_q24,tv_q24).equals("")){
                validation = false;
            }else {

                CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ24(getTextFromField(et_q24,tv_q24));
            }

        }


        return validation;
    }

    public void myCustomeDialog(){


        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);


        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);
        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);

        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);

        btnCancel.setVisibility(View.GONE);

        tv_engText.setText("You successfully filled CRF3A Now fill CRF3B");
        tv_RomanEngText.setText("Apny CRF3A bhar lia h ab ap CRF3B bharay");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ25(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format( Calendar.getInstance().getTime()));
                CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ17(et_q17.getText().toString());

                CRF3Activity.formsCrf2AndCrf3All.setCrf3aStatus(true);
                //CRF3Activity.formsCrf2AndCrf3All.setFormCrf3aDTO(CRF3Activity.formCrf3aDTO);
                //SendDataToServer.sendCrf3aForm(CRF3Activity.formCrf3aDTO);

                startActivity(new Intent(getContext(), CRF3bActivity.class).putExtra("forms",new Gson().toJson(CRF3Activity.formsCrf2AndCrf3All)));
                getActivity().finish();

            }
        });

        dialog.show();

    }



    int x,y;
    public void setFocuseable(float x1, float y1){

        x = (int) x1;
        y = (int) y1;

        scrolView.post(new Runnable() {
            public void run() {
                scrolView.scrollTo(x,y); // these are your x and y coordinates
            }
        });

    }

    public String isRBCheckedThree(RadioGroup rg, RadioButton rb, TextView tv){

        if(rg.getCheckedRadioButtonId()==-1){
            tv.setError("Required");
            setFocuseable(tv.getX(),tv.getY());
            return "";
        }else {
            return  rb.getTag().toString();
        }
    }

    public String getEditText(RadioGroup rg, RadioButton rb, EditText editText ,TextView tv, String id, String id2, String id3, String id4){

        if(rg.getCheckedRadioButtonId()==-1){
            setFocuseable(tv.getX(),tv.getY());
            tv.setError("Required");
            return "";
        }else {
            if(rb.getTag().toString().equals(id) || rb.getTag().toString().equals(id2) ||
                    rb.getTag().toString().equals(id3) || rb.getTag().toString().equals(id4)){

                if(editText.getText().toString().equals("") || editText.getText().toString().isEmpty()){
                    editText.setError("Enter Here");
                    setFocuseable(editText.getX(),editText.getY());
                    return "";
                }else {
                    return editText.getText().toString();
                }
            }else {

                return rb.getTag().toString();
            }

        }
    }

    public String getTextFromField(EditText et, TextView tv){

        if(et.getText().toString().equals("")){
            setFocuseable(et.getX(),et.getY());
            tv.setError("Required");
            et.setError("Required");
            return "";
        }else {
            return et.getText().toString();
        }
    }

}
