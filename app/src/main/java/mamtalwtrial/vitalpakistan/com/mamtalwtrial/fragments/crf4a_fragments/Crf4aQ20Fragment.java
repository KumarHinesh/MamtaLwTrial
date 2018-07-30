package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments;

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
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;

public class Crf4aQ20Fragment extends Fragment {

    Button btn_next;
    TextView tv_dod, tv_dod_time, tv_dod_babay, tv_getTime_baby, tv_q20, tv_q23;

    RadioGroup rg_q20, rg_q23;
    RadioButton rb_q20, rb_q23;

    LinearLayout  ll_q21, ll_q22, ll_q23, ll_q24, ll_q25, ll_q26;


    int year, month, day, min, hour;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf4a_q20, container, false);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        min = (calendar.get(Calendar.MINUTE));
        hour = (calendar.get(Calendar.HOUR_OF_DAY));

        btn_next = (Button) view.findViewById(R.id.btn_next);

        rg_q20 = (RadioGroup) view.findViewById(R.id. rg_q20);
        rg_q23 = (RadioGroup) view.findViewById(R.id. rg_q23);
        tv_q20 = (TextView) view.findViewById(R.id.tv_q20);
        tv_q23 = (TextView) view.findViewById(R.id.tv_q23);
        tv_dod = (TextView) view.findViewById(R.id.tv_dod);
        tv_dod_time = (TextView) view.findViewById(R.id.tv_dod_time);
        tv_dod_babay = (TextView) view.findViewById(R.id.tv_dod_babay);
        tv_getTime_baby = (TextView) view.findViewById(R.id.tv_getTime_baby);
       // calendar.getTime().get


        ll_q21 = (LinearLayout) view.findViewById(R.id.ll_q21);
        ll_q22 = (LinearLayout) view.findViewById(R.id.ll_q22);
        ll_q23 = (LinearLayout) view.findViewById(R.id.ll_q23);
        ll_q24 = (LinearLayout) view.findViewById(R.id.ll_q24);
        ll_q25 = (LinearLayout) view.findViewById(R.id.ll_q25);
        ll_q26 = (LinearLayout) view.findViewById(R.id.ll_q26);


       /* rg_q20 = (RadioGroup) view.findViewById(R.id.rg_q20);
        rg_q20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q20 = (RadioButton) view.findViewById(rg_q20.getCheckedRadioButtonId());




            }
        });

        rg_q23 = (RadioGroup) view.findViewById(R.id.rg_q23);
        rg_q23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {



            }
        });*/



        tv_dod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        //  new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().setTime(new Date(dayOfMonth,monthOfYear,year)););

                        tv_dod.setText(dayOfMonth+"-"+monthOfYear+"-"+year);

                    }
                }, year, month, day);
                mdiDialog.getDatePicker();
                mdiDialog.show();


            }
        });

        tv_dod_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tv_dod_time.setText(hourOfDay+" : "+minute);

                    }
                },hour,min,true);


                timePickerDialog.show();
            }
        });

        tv_dod_babay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        //  new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().setTime(new Date(dayOfMonth,monthOfYear,year)););

                        tv_dod_babay.setText(dayOfMonth+"-"+monthOfYear+"-"+year);

                    }
                }, year, month, day);
                mdiDialog.getDatePicker();
                mdiDialog.show();



            }
        });


        tv_getTime_baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tv_getTime_baby.setText(hourOfDay+" : "+minute);

                        }

                    },hour,min,true);

                timePickerDialog.show();

            }
        });


        rg_q20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q20 = (RadioButton) view.findViewById(rg_q20.getCheckedRadioButtonId());


                if(rb_q20.getTag().toString().equals("1")){

                    ll_q22.setVisibility(View.VISIBLE);
                    ll_q21.setVisibility(View.VISIBLE);

                }else {

                    ll_q21.setVisibility(View.GONE);
                    ll_q22.setVisibility(View.GONE);

                }

            }
        });

        rg_q23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23 = (RadioButton) view.findViewById(rg_q23.getCheckedRadioButtonId());


                if(rb_q23.getTag().toString().equals("1")){

                    ll_q24.setVisibility(View.VISIBLE);
                    ll_q25.setVisibility(View.GONE);


                }else {

                    ll_q24.setVisibility(View.GONE);
                    ll_q25.setVisibility(View.GONE);
                }


            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Crf4aQ27Fragment fragment = new Crf4aQ27Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                fragmentTransaction.commit();




            }
        });


        return view;
    }

    public boolean validation(){




        return true;

    }


}
