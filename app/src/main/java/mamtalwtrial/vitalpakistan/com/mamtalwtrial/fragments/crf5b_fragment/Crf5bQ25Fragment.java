package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF5bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5bDetails;

public class Crf5bQ25Fragment extends Fragment {

    RadioGroup rg_q26, rg_q27, rg_q28, rg_q33, rg_q34, rg_q39, rg_q44;

    RadioButton rb_q26, rb_q27, rb_q28, rb_q33, rb_q34, rb_q39, rb_q44;

    TextView tv_q26, tv_q27, tv_q28, tv_q29, tv_q30, tv_q31, tv_q32, tv_q33, tv_q34,
                tv_q35, tv_q36, tv_q37, tv_q38, tv_q39, tv_q40, tv_q41, tv_q42, tv_q43,
                tv_q44, tv_q45, tv_q46, tv_q47, tv_q48, tv_startTime, tv_endTime;

    EditText et_q29, et_q30, et_q31, et_q32, et_q35, et_q36, et_q37, et_q38, et_q40,
             et_q41, et_q42, et_q43, et_q45, et_q46, et_q47, et_q48;

    ScrollView scrollView;

    int start = 0;
    int end = 0;

    String startTime, endTime;

    LinearLayout ll_q34_to_q38, ll_q40_to_q48, ll_q27_to_q38, ll_q35_to_q38, ll_q45_to_q48, ll_q29_to_q32;

    FormCrf5bDetails formCrf5bDetails;

    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_crf5b_q25, container, false);

        initializeView(view);
        CRF5bActivity.startHour++;

        if(CRF5bActivity.startHour>18){

            end = CRF5bActivity.startHour-18;
            start = CRF5bActivity.startHour-19;

        }else {
           start = CRF5bActivity.startHour+5;
            end = CRF5bActivity.startHour+6;
        }

        if(end==25){
            end = 1;
        }

        if(start==25){
            start=1;
        }

        formCrf5bDetails.setQ25From(start+"");
        formCrf5bDetails.setQ25To(end+"");
        tv_startTime.setText(start+"");
        tv_endTime.setText(end+"");


        btn_submit.setText("Submit "+start+" TO "+end);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validation()){

                        if(CRF5bActivity.startHour==24){

                            CRF5bActivity.listFormCrf5bDetails.add(formCrf5bDetails);
                            CRF4aActivity.startHour = 0;
                            //need to make
                            //CRF4aActivity.formCrf4aDTO.setCounsilStartTime(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                            CRF5bActivity.formCrf5b.setDetails(CRF5bActivity.listFormCrf5bDetails);
                            Crf5bQ49Fragment fragment = new Crf5bQ49Fragment();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.frame_layout, fragment);
                            fragmentTransaction.commit();


                        }else {

                            CRF5bActivity.listFormCrf5bDetails.add(formCrf5bDetails);

                            Crf5bQ25Fragment fragment = new Crf5bQ25Fragment();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.frame_layout, fragment);
                            fragmentTransaction.commit();
                        }

                }

            }
        });


        rg_q26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q26 = (RadioButton) view.findViewById(rg_q26.getCheckedRadioButtonId());

                if(rb_q26.getTag().equals("2")){
                    ll_q27_to_q38.setVisibility(View.GONE);
                }else {
                    ll_q27_to_q38.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q27 = (RadioButton) view.findViewById(rg_q27.getCheckedRadioButtonId());
            }
        });

        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());

                if(rb_q28.getTag().equals("2")){
                    ll_q29_to_q32.setVisibility(View.GONE);
                }else {
                    ll_q29_to_q32.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q33 = (RadioButton) view.findViewById(rg_q33.getCheckedRadioButtonId());

                if (rb_q33.getTag().equals("2")){
                    ll_q34_to_q38.setVisibility(View.GONE);
                }else {
                    ll_q34_to_q38.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q34 = (RadioButton) view.findViewById(rg_q34.getCheckedRadioButtonId());

                if(rb_q34.getTag().equals("2")){
                    ll_q35_to_q38.setVisibility(View.GONE);
                }else {
                    ll_q35_to_q38.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q39 = (RadioButton) view.findViewById(rg_q39.getCheckedRadioButtonId());

                if(rb_q39.getTag().equals("2")){
                    ll_q40_to_q48.setVisibility(View.GONE);
                }else {
                    ll_q40_to_q48.setVisibility(View.VISIBLE);
                }
            }
        });

        rg_q44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q44 = (RadioButton) view.findViewById(rg_q44.getCheckedRadioButtonId());

                if(rb_q44.getTag().equals("2")){
                    ll_q45_to_q48.setVisibility(View.GONE);
                }else {
                    ll_q45_to_q48.setVisibility(View.VISIBLE);
                }
            }
        });


        return view;
    }


    public void initializeView(View view){

        scrollView = (ScrollView) view.findViewById(R.id.scrolView);

        formCrf5bDetails = new FormCrf5bDetails();

        rg_q26 = (RadioGroup) view.findViewById(R.id.rg_q26);
        rg_q27 = (RadioGroup) view.findViewById(R.id.rg_q27);
        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);
        rg_q33 = (RadioGroup) view.findViewById(R.id.rg_q33);
        rg_q34 = (RadioGroup) view.findViewById(R.id.rg_q34);
        rg_q39 = (RadioGroup) view.findViewById(R.id.rg_q39);
        rg_q44 = (RadioGroup) view.findViewById(R.id.rg_q44);

        tv_q26 = (TextView) view.findViewById(R.id.tv_q26);
        tv_q27 = (TextView) view.findViewById(R.id.tv_q27);
        tv_q28 = (TextView) view.findViewById(R.id.tv_q28);
        tv_q29 = (TextView) view.findViewById(R.id.tv_q29);
        tv_q30 = (TextView) view.findViewById(R.id.tv_q30);
        tv_q31 = (TextView) view.findViewById(R.id.tv_q31);
        tv_q32 = (TextView) view.findViewById(R.id.tv_q32);
        tv_q33 = (TextView) view.findViewById(R.id.tv_q33);
        tv_q34 = (TextView) view.findViewById(R.id.tv_q34);
        tv_q35 = (TextView) view.findViewById(R.id.tv_q35);
        tv_q36 = (TextView) view.findViewById(R.id.tv_q36);
        tv_q37 = (TextView) view.findViewById(R.id.tv_q37);
        tv_q38 = (TextView) view.findViewById(R.id.tv_q38);
        tv_q39 = (TextView) view.findViewById(R.id.tv_q39);
        tv_q40 = (TextView) view.findViewById(R.id.tv_q40);
        tv_q41 = (TextView) view.findViewById(R.id.tv_q41);
        tv_q42 = (TextView) view.findViewById(R.id.tv_q42);
        tv_q43 = (TextView) view.findViewById(R.id.tv_q43);
        tv_q44 = (TextView) view.findViewById(R.id.tv_q44);
        tv_q45 = (TextView) view.findViewById(R.id.tv_q45);
        tv_q46 = (TextView) view.findViewById(R.id.tv_q46);
        tv_q47 = (TextView) view.findViewById(R.id.tv_q47);
        tv_q48 = (TextView) view.findViewById(R.id.tv_q48);
        tv_startTime = (TextView) view.findViewById(R.id.tv_startTime);
        tv_endTime = (TextView) view.findViewById(R.id.tv_endTime);

        et_q29 = (EditText) view.findViewById(R.id.et_q29);
        et_q30 = (EditText) view.findViewById(R.id.et_q30);
        et_q31 = (EditText) view.findViewById(R.id.et_q31);
        et_q32 = (EditText) view.findViewById(R.id.et_q32);
        et_q35 = (EditText) view.findViewById(R.id.et_q35);
        et_q36 = (EditText) view.findViewById(R.id.et_q36);
        et_q37 = (EditText) view.findViewById(R.id.et_q37);
        et_q38 = (EditText) view.findViewById(R.id.et_q38);
        et_q40 = (EditText) view.findViewById(R.id.et_q40);
        et_q41 = (EditText) view.findViewById(R.id.et_q41);
        et_q42 = (EditText) view.findViewById(R.id.et_q42);
        et_q43 = (EditText) view.findViewById(R.id.et_q43);
        et_q45 = (EditText) view.findViewById(R.id.et_q45);
        et_q46 = (EditText) view.findViewById(R.id.et_q46);
        et_q47 = (EditText) view.findViewById(R.id.et_q47);
        et_q48 = (EditText) view.findViewById(R.id.et_q48);

        ll_q34_to_q38 = (LinearLayout) view.findViewById(R.id.ll_q34_to_q38);
        ll_q40_to_q48 = (LinearLayout) view.findViewById(R.id.ll_q40_to_q48);
        ll_q27_to_q38 = (LinearLayout) view.findViewById(R.id.ll_q27_to_q38);
        ll_q35_to_q38 = (LinearLayout) view.findViewById(R.id.ll_q35_to_q38);
        ll_q45_to_q48 = (LinearLayout) view.findViewById(R.id.ll_q45_to_q48);
        ll_q29_to_q32 = (LinearLayout) view.findViewById(R.id.ll_q29_to_q32);

        btn_submit = (Button) view.findViewById(R.id.btn_submit);

    }

    public boolean validation(){

        boolean validation = true;

    if (ll_q27_to_q38.getVisibility()==View.VISIBLE) {

        if (isRBCheckedThree(rg_q26, rb_q26, tv_q26).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ26(isRBCheckedThree(rg_q26, rb_q26, tv_q26));
        }

        if (isRBCheckedThree(rg_q27, rb_q27, tv_q27).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ27(isRBCheckedThree(rg_q27, rb_q27, tv_q27));
        }

        if (isRBCheckedThree(rg_q28, rb_q28, tv_q28).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ28(isRBCheckedThree(rg_q28, rb_q28, tv_q28));
        }

    if (ll_q29_to_q32.getVisibility()==View.VISIBLE){

        if (getTextFromField(et_q29, tv_q29).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ29(getTextFromField(et_q29, tv_q29));
        }

        if (getTextFromField(et_q30, tv_q30).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ30(getTextFromField(et_q30, tv_q30));
        }

        if (getTextFromField(et_q31, tv_q31).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ31(getTextFromField(et_q31, tv_q31));
        }

        if (getTextFromField(et_q32, tv_q32).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ32(getTextFromField(et_q32, tv_q32));
        }

    }//end of ll_q29 to q32

        if (isRBCheckedThree(rg_q33, rb_q33, tv_q33).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ33(isRBCheckedThree(rg_q33, rb_q33, tv_q33));
        }

        if (ll_q34_to_q38.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q34, rb_q34, tv_q34).equals("")) {
                validation = false;
            } else {
                formCrf5bDetails.setQ34(isRBCheckedThree(rg_q34, rb_q34, tv_q34));
            }

            if (ll_q35_to_q38.getVisibility()==View.VISIBLE){


                if (getTextFromField(et_q35, tv_q35).equals("")) {
                    validation = false;
                } else {
                    formCrf5bDetails.setQ35(getTextFromField(et_q35, tv_q35));
                }

                if (getTextFromField(et_q36, tv_q36).equals("")) {
                    validation = false;
                } else {
                    formCrf5bDetails.setQ36(getTextFromField(et_q36, tv_q36));
                }

                if (getTextFromField(et_q37, tv_q37).equals("")) {
                    validation = false;
                } else {
                    formCrf5bDetails.setQ37(getTextFromField(et_q37, tv_q37));
                }

                if (getTextFromField(et_q38, tv_q38).equals("")) {
                    validation = false;
                } else {
                    formCrf5bDetails.setQ38(getTextFromField(et_q38, tv_q38));
                }

            }// end of ll_q35_to_q38

        }// end of ll_q34_to_q38


    }//end ll_q27 to q38

        if (isRBCheckedThree(rg_q39, rb_q39, tv_q39).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ39(isRBCheckedThree(rg_q39, rb_q39, tv_q39));
        }

    if (ll_q40_to_q48.getVisibility()==View.VISIBLE){


        if (getTextFromField(et_q40, tv_q40).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ40(getTextFromField(et_q40, tv_q40));
        }

        if (getTextFromField(et_q41, tv_q41).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ41(getTextFromField(et_q41, tv_q41));
        }

        if (getTextFromField(et_q42, tv_q42).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ42(getTextFromField(et_q42, tv_q42));
        }

        if (getTextFromField(et_q43, tv_q43).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ43(getTextFromField(et_q43, tv_q43));
        }


        if (isRBCheckedThree(rg_q44, rb_q44, tv_q34).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ44(isRBCheckedThree(rg_q44, rb_q44, tv_q44));
        }

    if (ll_q45_to_q48.getVisibility()==View.VISIBLE){

        if (getTextFromField(et_q45, tv_q45).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ45(getTextFromField(et_q45, tv_q45));
        }

        if (getTextFromField(et_q46, tv_q46).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ46(getTextFromField(et_q46, tv_q46));
        }

        if (getTextFromField(et_q47, tv_q47).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ47(getTextFromField(et_q47, tv_q47));
        }

        if (getTextFromField(et_q48, tv_q48).equals("")) {
            validation = false;
        } else {
            formCrf5bDetails.setQ32(getTextFromField(et_q32, tv_q32));
        }

    }// end of ll_q45_to_q48

    }// end of ll_q40_to_q48


        return validation;
    }


    int x,y;
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

        if(rg.getCheckedRadioButtonId()==-1){
            tv.setError("Required");
            setFocuseable(tv.getX(),tv.getY());
            return "";
        }else {
            return  rb.getTag().toString();
        }
    }

    public String getEditText(RadioGroup rg, RadioButton rb, EditText editText , TextView tv, String id, String id2, String id3, String id4, String id5, String id6){

        if(rg.getCheckedRadioButtonId()==-1){
            setFocuseable(tv.getX(),tv.getY());
            tv.setError("Required");
            return "";
        }else {
            if(rb.getTag().toString().equals(id) || rb.getTag().toString().equals(id2) ||
                    rb.getTag().toString().equals(id3) || rb.getTag().toString().equals(id4) ||
                    rb.getTag().toString().equals(id5) || rb.getTag().toString().equals(id6)){

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




}
