package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
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

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF5bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class Crf5bQ19Fragmnet extends Fragment {

    ScrollView scrolView;
    Button btn_next;

    TextView tv_q19, tv_q20,tv_dod_babay, tv_tod_lw, tv_q23, tv_q24,
            tv_q25, tv_q26, tv_getTime_baby, tv_dod_lw, tv_q21, tv_q22, tv_babyDays;

    RadioGroup rg_q19, rg_q22;
    RadioButton rb_q19, rb_q22;

    LinearLayout ll_q20, ll_q21, ll_q22, ll_q23, ll_q24, ll_q26;

    EditText et_BabyName;

    int year, month, day, min, hour;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf5b_q19_fragmnet, container, false);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

      //  CRF5bActivity.formCrf5b.setDateOfAttempt(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
      //  CRF4aActivity.formCrf4aDTO.setTimeOfAttempt(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));


        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        min = (calendar.get(Calendar.MINUTE));
        hour = (calendar.get(Calendar.HOUR_OF_DAY));

        btn_next = (Button) view.findViewById(R.id.btn_next);

        rg_q19 = (RadioGroup) view.findViewById(R.id.rg_q19);
        rg_q22 = (RadioGroup) view.findViewById(R.id.rg_q22);

        ll_q20 = (LinearLayout) view.findViewById(R.id.ll_q20);
        ll_q21 = (LinearLayout) view.findViewById(R.id.ll_q21);
        ll_q22 = (LinearLayout) view.findViewById(R.id.ll_q22);
        ll_q23 = (LinearLayout) view.findViewById(R.id.ll_q23);
        ll_q24 = (LinearLayout) view.findViewById(R.id.ll_q24);

        tv_q21 = (TextView) view.findViewById(R.id.tv_q21);
        tv_q20 = (TextView) view.findViewById(R.id.tv_q20);
        tv_q19 = (TextView) view.findViewById(R.id.tv_q19);
        tv_tod_lw = (TextView) view.findViewById(R.id.tv_tod_lw);
        tv_q22 = (TextView) view.findViewById(R.id.tv_q22);
        tv_q23 = (TextView) view.findViewById(R.id.tv_q23);
        tv_dod_babay = (TextView) view.findViewById(R.id.tv_dod_babay);
        tv_q24 = (TextView) view.findViewById(R.id.tv_q24);
        tv_getTime_baby = (TextView) view.findViewById(R.id.tv_getTime_baby);
        tv_dod_lw = (TextView) view.findViewById(R.id.tv_dod_lw);



        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    if(rb_q22.getTag().equals("2")){


                    }if(rb_q19.getTag().toString().equals("2")){


                    }else {

                        Crf5bQ25Fragment fragment = new Crf5bQ25Fragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout, fragment);
                        fragmentTransaction.commit();

                    }


                }

            }
        });

        tv_dod_lw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        //  new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().setTime(new Date(dayOfMonth,monthOfYear,year)););

                        tv_dod_lw.setText(dayOfMonth + "-" + (monthOfYear+1) + "-" + year);

                    }
                }, year, month, day);
                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();

            }
        });



        tv_tod_lw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tv_tod_lw.setText(hourOfDay + " : " + minute);

                    }

                }, hour, min, true);

                timePickerDialog.show();

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

        rg_q19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q19 = (RadioButton) view.findViewById(rg_q19.getCheckedRadioButtonId());

                if(rb_q19.getTag().equals("2")){
                    ll_q20.setVisibility(View.VISIBLE);
                    ll_q21.setVisibility(View.VISIBLE);
                }else {
                    ll_q20.setVisibility(View.GONE);
                    ll_q21.setVisibility(View.GONE);
                }

            }
        });

        rg_q22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q22 = (RadioButton) view.findViewById(rg_q22.getCheckedRadioButtonId());

                if(rb_q22.getTag().equals("2")){
                    ll_q23.setVisibility(View.VISIBLE);
                    ll_q24.setVisibility(View.VISIBLE);
                }else {
                    ll_q23.setVisibility(View.GONE);
                    ll_q24.setVisibility(View.GONE);
                }
            }
        });


        return view;
    }


    public boolean validation(){

        boolean validation = true;

        if (isRBCheckedThree(rg_q19, rb_q19, tv_q19).equals("")) {
            validation = false;
        } else {
            CRF5bActivity.formCrf5b.setQ19(isRBCheckedThree(rg_q19, rb_q19, tv_q19));
        }

        if (ll_q20.getVisibility() == View.VISIBLE) {

            if (tv_dod_lw.getText().toString().equals("")) {
                Toast.makeText(getContext(), "Please Enter Date Of Death", Toast.LENGTH_LONG).show();
                validation = false;
            } else {

                CRF5bActivity.formCrf5b.setQ20(tv_dod_lw.getText().toString());
            }
        }

        if (ll_q21.getVisibility() == View.VISIBLE) {

            if (tv_tod_lw.getText().toString().equals("")) {
                Toast.makeText(getContext(), "Please Enter Date Of Death", Toast.LENGTH_LONG).show();
                validation = false;
            } else {

                CRF5bActivity.formCrf5b.setQ21(tv_tod_lw.getText().toString());
            }
        }

        if (isRBCheckedThree(rg_q22, rb_q22, tv_q22).equals("")) {
            validation = false;
        } else {
            CRF5bActivity.formCrf5b.setQ22(isRBCheckedThree(rg_q22, rb_q22, tv_q22));
        }


        if (ll_q23.getVisibility() == View.VISIBLE) {

            if (tv_dod_babay.getText().toString().equals("")) {
                Toast.makeText(getContext(), "Please Enter Date Of Death", Toast.LENGTH_LONG).show();
                validation = false;
            } else {

                CRF5bActivity.formCrf5b.setQ23(tv_dod_babay.getText().toString());
            }
        }

        if (ll_q24.getVisibility() == View.VISIBLE) {

            if (tv_getTime_baby.getText().toString().equals("")) {
                Toast.makeText(getContext(), "Please Enter Date Of Death", Toast.LENGTH_LONG).show();
                validation = false;
            } else {

                CRF5bActivity.formCrf5b.setQ24(tv_getTime_baby.getText().toString());
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

}
