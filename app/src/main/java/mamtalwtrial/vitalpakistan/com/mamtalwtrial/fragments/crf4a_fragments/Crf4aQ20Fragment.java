package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4And5Dashboard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4b_fragments.Crf4bQ20Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.Crf4Complete;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;

public class Crf4aQ20Fragment extends Fragment {

    ScrollView scrolView;
    Button btn_next;
   // tv_dod = (TextView) view.findViewById(R.id.tv_dod);


    TextView tv_q20, tv_dod_babay, tv_dod_time, tv_q23, tv_q24, tv_q25, tv_q26, tv_getTime_baby, tv_dod, tv_q21, tv_q22, tv_babyDays;

    RadioGroup rg_q20, rg_q23;
    RadioButton rb_q20, rb_q23;

    LinearLayout ll_q20, ll_q21, ll_q22, ll_q23, ll_q24, ll_q25, ll_q26;

    EditText et_BabyName;

    int year, month, day, min, hour;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf4a_q20, container, false);

        initializeViews(view);
        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        CRF4aActivity.formCrf4aDTO.setDateOfAttempt(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        CRF4aActivity.formCrf4aDTO.setTimeOfAttempt(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        if (CRF4aActivity.followupDto.getFollowupDetails().getPwd() != null){

            if (CRF4aActivity.followupDto.getFollowupDetails().getPwd().equalsIgnoreCase("Y")){

                ll_q21.setVisibility(View.GONE);
                ll_q22.setVisibility(View.GONE);
                ll_q20.setVisibility(View.GONE);

            }

        }

        if (CRF4aActivity.followupDto.getFollowupDetails().getChd() != null){

            if (CRF4aActivity.followupDto.getFollowupDetails().getChd().equalsIgnoreCase("Y")){

                ll_q24.setVisibility(View.GONE);
                ll_q25.setVisibility(View.GONE);
                ll_q23.setVisibility(View.GONE);

            }

        }
        /*CRF4aActivity.followupDto.getFollowupDetails().getPwd()*/

        et_BabyName  = (EditText) view.findViewById(R.id.et_BabyName);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        min = (calendar.get(Calendar.MINUTE));
        hour = (calendar.get(Calendar.HOUR_OF_DAY));


        tv_babyDays.setText(CRF4aActivity.followupDto.getFollowupDetails().getAge()+"");

        tv_dod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        //  new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().setTime(new Date(dayOfMonth,monthOfYear,year)););

                        tv_dod.setText(dayOfMonth + "-" + (monthOfYear+1) + "-" + year);

                    }
                }, year, month, day);
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();


            }
        });

        tv_dod_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tv_dod_time.setText(hourOfDay + " : " + minute);

                    }
                }, hour, min, true);


                timePickerDialog.show();
            }
        });

        tv_dod_babay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        //  new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().setTime(new Date(dayOfMonth,monthOfYear,year)););

                        tv_dod_babay.setText(dayOfMonth + "-" + (monthOfYear+1) + "-" + year);

                    }
                }, year, month, day);
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();


            }
        });


        tv_getTime_baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tv_getTime_baby.setText(hourOfDay + " : " + minute);

                    }

                }, hour, min, true);

                timePickerDialog.show();

            }
        });


        rg_q20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q20.setError(null);
                rb_q20 = (RadioButton) view.findViewById(rg_q20.getCheckedRadioButtonId());


                if (rb_q20.getTag().toString().equals("2")) {

                    ll_q22.setVisibility(View.VISIBLE);
                    ll_q21.setVisibility(View.VISIBLE);

                } else {

                    ll_q21.setVisibility(View.GONE);
                    ll_q22.setVisibility(View.GONE);

                }
            }
        });

        rg_q23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                tv_q23.setError(null);
                rb_q23 = (RadioButton) view.findViewById(rg_q23.getCheckedRadioButtonId());

                if (rb_q23.getTag().toString().equals("2")) {

                    et_BabyName.setVisibility(View.GONE);
                    ll_q24.setVisibility(View.VISIBLE);
                    ll_q25.setVisibility(View.VISIBLE);

                } else {
                    et_BabyName.setVisibility(View.VISIBLE);
                    ll_q24.setVisibility(View.GONE);
                    ll_q25.setVisibility(View.GONE);
                }

            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                validation();


                        if((ll_q20.getVisibility() == View.GONE && rb_q23.getTag().equals("2")) ||
                                (ll_q23.getVisibility()==View.GONE && rb_q20.getTag().equals("2")) ||
                                (rb_q20.getTag().toString().equals("2")  || rb_q23.getTag().toString().equals("2") )){

                            APIService mAPIService = ApiUtils.getAPIService();

                            // CRF4aActivity.formCrf4bDTO.setQ64(SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance()));

                            CRF4aActivity.formCrf4aDTO.setFollowupStatus(Constants.COMPLETED);
                            CRF4aActivity.formCrf4aDTO.setFormStatus(Constants.COMPLETED);

                            Crf4Complete crf4Complete = new Crf4Complete();

                            crf4Complete.setFormCrf4a(CRF4aActivity.formCrf4aDTO);
                            crf4Complete.setFormCrf4b(CRF4aActivity.formCrf4bDTO);

                            mAPIService.postCrf4Complete(crf4Complete).enqueue(new Callback<Crf4Complete>() {
                                @Override
                                public void onResponse(Call<Crf4Complete> call, Response<Crf4Complete> response) {

                                    if(response.code()==200){

                                        CRF4aActivity.startHour = 0;
                                        startActivity(new Intent(getActivity(), CRF4And5Dashboard.class));
                                        getActivity().finish();
                                        Toast.makeText(getContext(),"Succesfully Sended",Toast.LENGTH_LONG).show();
                                    }
                                }

                                @Override
                                public void onFailure(Call<Crf4Complete> call, Throwable t) {
                                    CRF4aActivity.startHour = 0;
                                    startActivity(new Intent(getActivity(), CRF4And5Dashboard.class));
                                    getActivity().finish();

                                    Toast.makeText(getContext(),"Error occur ",Toast.LENGTH_LONG).show();
                                }
                            });


                            //->
                        } else {

                            Crf4aQ27Fragment fragment = new Crf4aQ27Fragment();
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                            fragmentTransaction.commit();

                        }



            }
        });


        return view;
    }

    public boolean validation() {

        boolean validation = true;

        if (ll_q20.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q20, rb_q20, tv_q20).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4aDTO.setQ20(isRBCheckedThree(rg_q20, rb_q20, tv_q20));
            }

        }

        if (ll_q21.getVisibility() == View.VISIBLE) {

            if (tv_dod.getText().toString().equals("")) {
                Toast.makeText(getContext(), "Please Enter Date Of Death", Toast.LENGTH_LONG).show();
                validation = false;
            } else {

                    CRF4aActivity.formCrf4aDTO.setQ21(tv_dod.getText().toString());
            }
        }

        if (ll_q22.getVisibility() == View.VISIBLE) {

                if (tv_dod_time.getText().toString().equals("")) {
                    Toast.makeText(getContext(), "Please Enter Time Of Death", Toast.LENGTH_LONG).show();
                    validation = false;
                } else {

                    CRF4aActivity.formCrf4aDTO.setQ22(tv_dod_time.getText().toString());
                }
        }

        if (ll_q23.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q23, rb_q23, tv_q23).equals("")) {

                validation = false;
            } else {
                CRF4aActivity.formCrf4aDTO.setQ23(isRBCheckedThree(rg_q23, rb_q23, tv_q23));
            }

        }



        if (ll_q24.getVisibility() == View.VISIBLE) {


            if (tv_dod_babay.getText().toString().equals("")) {
                Toast.makeText(getContext(), "Please Enter Date Of baby Death", Toast.LENGTH_LONG).show();
                validation = false;
            } else {

                CRF4aActivity.formCrf4aDTO.setQ24(tv_dod_babay.getText().toString());
            }
        }


        if (ll_q25.getVisibility() == View.VISIBLE) {

            if (tv_getTime_baby.getText().toString().equals("")) {
                Toast.makeText(getContext(), "Please Enter Time Of baby Death", Toast.LENGTH_LONG).show();
                validation = false;
            } else {

                CRF4aActivity.formCrf4aDTO.setQ25(tv_getTime_baby.getText().toString());
            }
        }

        if(et_BabyName.getVisibility()==View.VISIBLE){

            if(et_BabyName.getText().toString().isEmpty()){

                et_BabyName.setError("Required");
            }else {

                CRF4aActivity.formCrf4aDTO.setQ9(et_BabyName.getText().toString());
            }

        }



        return validation;

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

    public String getEditText(RadioGroup rg, RadioButton rb, EditText editText , TextView tv, String id, String id2, String id3, String id4){

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

    public void initializeViews(View view){

        btn_next = (Button) view.findViewById(R.id.btn_next);

        rg_q20 = (RadioGroup) view.findViewById(R.id.rg_q20);
        rg_q23 = (RadioGroup) view.findViewById(R.id.rg_q23);

        tv_q20 = (TextView) view.findViewById(R.id.tv_q20);
        tv_q21 = (TextView) view.findViewById(R.id.tv_q21);
        tv_q22 = (TextView) view.findViewById(R.id.tv_q22);
        tv_q23 = (TextView) view.findViewById(R.id.tv_q23);
        tv_q24 = (TextView) view.findViewById(R.id.tv_q24);
        tv_q25 = (TextView) view.findViewById(R.id.tv_q25);
        tv_q26 = (TextView) view.findViewById(R.id.tv_q26);

        ll_q20 = (LinearLayout) view.findViewById(R.id.ll_q20);
        ll_q21 = (LinearLayout) view.findViewById(R.id.ll_q21);
        ll_q22 = (LinearLayout) view.findViewById(R.id.ll_q22);
        ll_q23 = (LinearLayout) view.findViewById(R.id.ll_q23);
        ll_q24 = (LinearLayout) view.findViewById(R.id.ll_q24);
        ll_q25 = (LinearLayout) view.findViewById(R.id.ll_q25);
        ll_q26 = (LinearLayout) view.findViewById(R.id.ll_q26);

        tv_dod = (TextView) view.findViewById(R.id.tv_dod);
        tv_dod_time = (TextView) view.findViewById(R.id.tv_dod_time);
        tv_dod_babay = (TextView) view.findViewById(R.id.tv_dod_babay);
        tv_getTime_baby = (TextView) view.findViewById(R.id.tv_getTime_baby);
        tv_q20 = (TextView) view.findViewById(R.id.tv_q20);
        tv_q23 = (TextView) view.findViewById(R.id.tv_q23);
        tv_babyDays = (TextView) view.findViewById(R.id.tv_babyDays);



    }

}
