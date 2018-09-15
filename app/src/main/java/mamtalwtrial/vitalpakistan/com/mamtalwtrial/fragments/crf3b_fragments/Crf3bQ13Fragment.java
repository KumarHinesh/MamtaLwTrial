package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3b_fragments;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;

import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.GpsTracker;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;

import static android.content.Context.LOCATION_SERVICE;

public class Crf3bQ13Fragment extends Fragment {

    int x , y;

    LinearLayout ll_q27_q28, ll_q23;

    EditText et_q13, et_q14, et_q15, et_q16, et_q18, et_q19, et_q20, et_q21, et_q24, et_q25, et_q28;

    RadioGroup rg_q13, rg_q14, rg_q17, rg_q18, rg_q19, rg_q20, rg_q21, rg_q22, rg_q23, rg_q24, rg_q26,
               rg_q27, rg_q28;

    RadioButton rb_q13, rb_q14, rb_q17, rb_q18, rb_q19, rb_q20, rb_q21, rb_q22, rb_q23, rb_q24, rb_q26,
                rb_q27, rb_q28;

    ScrollView scrollView;



    Button  btn_next;

    //dialog
    Button btn_input_dialog_ok, btn_input_dialog_cancel;
    Dialog dialog;
    EditText et_getInput;

    TextView tv_q13, tv_q14, tv_q15, tv_q16,tv_q17, tv_q18, tv_q19, tv_q20, tv_q21
            , tv_q22, tv_q23, tv_q24 ,tv_q25, tv_q26, tv_q27, tv_q28;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf3b_q13, container, false);




        scrollView = (ScrollView) view.findViewById(R.id.scrolView);

        ll_q27_q28 = (LinearLayout) view.findViewById(R.id.ll_q27_q28);
        ll_q23 = (LinearLayout) view.findViewById(R.id.ll_q23);


        tv_q13 = (TextView) view.findViewById(R.id.tv_q13);
        tv_q14 = (TextView) view.findViewById(R.id.tv_q14);
        tv_q15 = (TextView) view.findViewById(R.id.tv_q15);
        tv_q16 = (TextView) view.findViewById(R.id.tv_q16);
        tv_q17 = (TextView) view.findViewById(R.id.tv_q17);
        tv_q18 = (TextView) view.findViewById(R.id.tv_q18);
        tv_q19 = (TextView) view.findViewById(R.id.tv_q19);
        tv_q20 = (TextView) view.findViewById(R.id.tv_q20);
        tv_q21 = (TextView) view.findViewById(R.id.tv_q21);
        tv_q22 = (TextView) view.findViewById(R.id.tv_q22);
        tv_q23 = (TextView) view.findViewById(R.id.tv_q23);
        tv_q24 = (TextView) view.findViewById(R.id.tv_q24);
        tv_q25 = (TextView) view.findViewById(R.id.tv_q25);
        tv_q26 = (TextView) view.findViewById(R.id.tv_q26);
        tv_q27 = (TextView) view.findViewById(R.id.tv_q27);
        tv_q28 = (TextView) view.findViewById(R.id.tv_q28);


        et_q18 = (EditText) view.findViewById(R.id.et_q18);
        et_q13 = (EditText) view.findViewById(R.id.et_q13);
        et_q14 = (EditText) view.findViewById(R.id.et_q14);
        et_q15 = (EditText) view.findViewById(R.id.et_q15);
        et_q16 = (EditText) view.findViewById(R.id.et_q16);
        et_q19 = (EditText) view.findViewById(R.id.et_q19);
        et_q20 = (EditText) view.findViewById(R.id.et_q20);
        et_q21 = (EditText) view.findViewById(R.id.et_q21);
        et_q24 = (EditText) view.findViewById(R.id.et_q24);
        et_q25 = (EditText) view.findViewById(R.id.et_q25);
        et_q28 = (EditText) view.findViewById(R.id.et_q28);


        btn_next = (Button) view.findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(validation()) {

                    Crf3bQ29Fragment crf3bQ29Fragment = new Crf3bQ29Fragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf3b, crf3bQ29Fragment);
                    fragmentTransaction.commit();

                }

            }
        });

        rg_q13 = (RadioGroup) view.findViewById(R.id.rg_q13);
        rg_q13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q13 = (RadioButton) view.findViewById(rg_q13.getCheckedRadioButtonId());
                et_q13.setError(null);
                tv_q13.setError(null);

                if(rb_q13.getTag().toString().equalsIgnoreCase("14")){
                    et_q13.setVisibility(View.VISIBLE);
                }else {
                    et_q13.setVisibility(View.GONE);
                }
            }
        });


        rg_q14 = (RadioGroup) view.findViewById(R.id.rg_q14);
        rg_q14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q14 = (RadioButton) view.findViewById(rg_q14.getCheckedRadioButtonId());
                et_q14.setError(null);
                tv_q14.setError(null);
                if(rb_q14.getTag().toString().equalsIgnoreCase("8")){
                    et_q14.setVisibility(View.VISIBLE);

                }else {

                    et_q14.setVisibility(View.GONE);
                }
            }
        });

        rg_q17  = (RadioGroup) view.findViewById(R.id.rg_q17);
        rg_q17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q17 = (RadioButton) view.findViewById(rg_q17.getCheckedRadioButtonId());
                tv_q17.setError(null);

            }
        });

        rg_q18 = (RadioGroup) view.findViewById(R.id.rg_q18);
        rg_q18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q18 = (RadioButton) view.findViewById(rg_q18.getCheckedRadioButtonId());
                et_q18.setError(null);
                tv_q18.setError(null);
                if(rb_q18.getTag().toString().equalsIgnoreCase("8")){
                    et_q18.setVisibility(View.VISIBLE);


                }else {

                    et_q18.setVisibility(View.GONE);
                }
            }
        });

        rg_q19 = (RadioGroup) view.findViewById(R.id.rg_q19);
        rg_q19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q19 = (RadioButton) view.findViewById(rg_q19.getCheckedRadioButtonId());
                et_q19.setError(null);
                tv_q19.setError(null);
                if(rb_q19.getTag().toString().equalsIgnoreCase("6")){
                    et_q19.setVisibility(View.VISIBLE);


                }else {

                    et_q19.setVisibility(View.GONE);
                }

            }
        });

        rg_q20 = (RadioGroup) view.findViewById(R.id.rg_q20);
        rg_q20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q20 = (RadioButton) view.findViewById(rg_q20.getCheckedRadioButtonId());
                et_q20.setError(null);
                tv_q20.setError(null);
                if(rb_q20.getTag().toString().equalsIgnoreCase("6")){
                    et_q20.setVisibility(View.VISIBLE);


                }else {

                    et_q20.setVisibility(View.GONE);
                }
            }
        });

        rg_q21 = (RadioGroup) view.findViewById(R.id.rg_q21);
        rg_q21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q21 = (RadioButton) view.findViewById(rg_q21.getCheckedRadioButtonId());
                et_q21.setError(null);
                tv_q21.setError(null);
                if(rb_q21.getTag().toString().equalsIgnoreCase("8")){
                    et_q21.setVisibility(View.VISIBLE);


                }else {

                    et_q21.setVisibility(View.GONE);
                }
            }
        });

        rg_q22 = (RadioGroup) view.findViewById(R.id.rg_q22);
        rg_q22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q22.setError(null);
                rb_q22 = (RadioButton) view.findViewById(rg_q22.getCheckedRadioButtonId());

                if(rb_q22.getTag().toString().equals("3") || rb_q22.getTag().toString().equals("4")){

                    ll_q23.setVisibility(View.GONE);

                }else {

                    ll_q23.setVisibility(View.VISIBLE);
                }

            }
        });


        rg_q23 = (RadioGroup) view.findViewById(R.id.rg_q23);
        rg_q23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q23 = (RadioButton) view.findViewById(rg_q23.getCheckedRadioButtonId());



            }
        });


        rg_q24 = (RadioGroup) view.findViewById(R.id.rg_q24);
        rg_q24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q24 = (RadioButton) view.findViewById(rg_q24.getCheckedRadioButtonId());
                et_q24.setError(null);
                tv_q24.setError(null);
                if(rb_q24.getTag().toString().equalsIgnoreCase("8")){
                    et_q24.setVisibility(View.VISIBLE);

                }else {

                    et_q24.setVisibility(View.GONE);
                }

            }
        });

        rg_q26 = (RadioGroup) view.findViewById(R.id.rg_q26);
        rg_q26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q26.setError(null);
                rb_q26 = (RadioButton) view.findViewById(rg_q26.getCheckedRadioButtonId());

                if(rb_q26.getTag().toString().equals("4") || rb_q26.getTag().toString().equals("2")){

                    ll_q27_q28.setVisibility(View.GONE);
                }else {
                    ll_q27_q28.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q27 = (RadioGroup) view.findViewById(R.id.rg_q27);
        rg_q27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q27.setError(null);
                rb_q27 = (RadioButton) view.findViewById(rg_q27.getCheckedRadioButtonId());

            }
        });

        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);
        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());
                et_q28.setError(null);
                tv_q28.setError(null);
                if(rb_q28.getTag().toString().equalsIgnoreCase("1")){

                    et_q28.setVisibility(View.VISIBLE);

                }else {
                    et_q28.setVisibility(View.GONE);
                }
            }
        });


            if(true){

           //     filledRadioButton();


            }





        return view;

    }


    public boolean validation(){

        boolean validation  =  true;

        if (getEditText(rg_q13, rb_q13, et_q13, tv_q13, "14","","","").equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ13(getEditText(rg_q13, rb_q13, et_q13, tv_q13, "14","","",""));
        }

        if (getEditText(rg_q14, rb_q14, et_q14, tv_q14, "8","","","").equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ14(getEditText(rg_q14, rb_q14, et_q14, tv_q14, "8","","",""));
        }

        if (getTextFromField(et_q15, tv_q15).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ15(getTextFromField(et_q15, tv_q15));
        }

        if (getTextFromField(et_q16, tv_q16).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ16(getTextFromField(et_q16, tv_q16));
        }

        if (isRBCheckedThree(rg_q17, rb_q17, tv_q17).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ17(isRBCheckedThree(rg_q17, rb_q17, tv_q17));
        }

        if (getEditText(rg_q18, rb_q18, et_q18, tv_q18, "8","","","").equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ18(getEditText(rg_q18, rb_q18, et_q18, tv_q18, "8","","",""));
        }

        if (getEditText(rg_q19, rb_q19, et_q19, tv_q19, "6","","","").equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ19(getEditText(rg_q19, rb_q19, et_q19, tv_q19, "6","","",""));
        }

        if (getEditText(rg_q20, rb_q20, et_q20, tv_q20, "6","","","").equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ20(getEditText(rg_q20, rb_q20, et_q20, tv_q20, "6","","",""));
        }

        if (getEditText(rg_q21, rb_q21, et_q21, tv_q21, "8","","","").equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ21(getEditText(rg_q21, rb_q21, et_q21, tv_q21, "8","","",""));
        }

        if (isRBCheckedThree(rg_q22, rb_q22, tv_q22).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ22(isRBCheckedThree(rg_q22, rb_q22, tv_q22));
        }


        if(ll_q23.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q23, rb_q23, tv_q23).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ23(isRBCheckedThree(rg_q23, rb_q23, tv_q23));
            }

        }


        if (getEditText(rg_q24, rb_q24, et_q24, tv_q24, "8","","","").equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ24(getEditText(rg_q24, rb_q24, et_q24, tv_q24, "8","","",""));
        }

        if (getTextFromField(et_q25, tv_q25).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ25(getTextFromField(et_q25, tv_q25));
        }

        if (isRBCheckedThree(rg_q26, rb_q26, tv_q26).equals("")) {
            validation = false;
        } else {
            CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ26(isRBCheckedThree(rg_q26, rb_q26, tv_q26));
        }

        if(ll_q27_q28.getVisibility()==View.VISIBLE ){

            if (isRBCheckedThree(rg_q27, rb_q27, tv_q27).equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ27(isRBCheckedThree(rg_q27, rb_q27, tv_q27));
            }


            if (getEditText(rg_q28, rb_q28, et_q28, tv_q28, "1","","","").equals("")) {
                validation = false;
            } else {
                CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().setQ28(getEditText(rg_q28, rb_q28, et_q28, tv_q28, "1","","",""));
            }

        }



        return validation;
    }

    public void setFocuseable(float x1, float y1){

         x = (int) x1;
         y = (int) y1;

        scrollView.post(new Runnable() {
            public void run() {
                scrollView.scrollTo(x,y); // these are your x and y coordinates
            }
        });

    }

    public String isRBCheckedThree(RadioGroup rg, RadioButton rb, TextView tv){

        Log.d("00007","00000000000007");
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
                    return rb.getTag().toString()+":"+editText.getText().toString();
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


    public void filledRadioButton(View view, RadioGroup radioGroup, EditText editText){

        try{

            if(CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().getQ13()!=null){

                String data;
                String[] arrayData;

                for(int i = 1; i<=rg_q13.getChildCount(); i++){

                    if(rg_q13.getChildAt(i).getTag().toString().contains(":")){

                        arrayData = rg_q13.getChildAt(i).getTag().toString().split(":");

                        editText.setText(arrayData[1]);
                        rg_q13.check(rg_q13.getChildAt(i).getId());

                    }else{

                        if (rg_q13.getChildAt(i).getTag().toString().equalsIgnoreCase(CRF3bActivity.formsCrf2AndCrf3All.getFormCrf3bDTO().getQ13())){

                            rg_q13.check(rg_q13.getChildAt(i).getId());

                        }
                    }

                }

            }


        }catch (Exception e){

        }

    }


}
