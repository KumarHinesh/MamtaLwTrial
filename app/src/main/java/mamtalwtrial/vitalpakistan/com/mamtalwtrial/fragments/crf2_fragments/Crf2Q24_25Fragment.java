package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
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
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class Crf2Q24_25Fragment extends Fragment {

    //Dialog initilizing
    Button btnCancel,btnConform;
    Dialog dialog;
    TextView  tv_RomanEngText, tv_engText;

    String selectedDate, selectedTime;

    TextView tv_DODGetDate, tv_DOD_timeepicker;
    Calendar calendar;
    int year, month, day;

    Button btn_Q24_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf2_q24_25,container,false);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);


        btn_Q24_submit = (Button) view.findViewById(R.id.btn_Q24_submit);
        btn_Q24_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                myCustomeDialog();

            }
        });

        tv_DOD_timeepicker = (TextView) view.findViewById(R.id.tv_DOD_timeepicker);
        tv_DOD_timeepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {


                        tv_DOD_timeepicker.setText(hourOfDay+" : "+minute);
                        selectedTime = hourOfDay+""+minute;

                    }
                },12,00,true);

                timePickerDialog.show();
        }
        });

        tv_DODGetDate = (TextView) view.findViewById(R.id.tv_DODGetDate);
        tv_DODGetDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tv_DODGetDate.setText("   "+dayOfMonth+"-"+monthOfYear+"-"+year);
                        selectedDate = dayOfMonth+"-"+(monthOfYear+1)+"-"+year;
                    }
                }, year, month, day);
                mdiDialog.show();

            }
        });

        return view;
    }


    public void myCustomeDialog(){


        dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);
        dialog.setCancelable(false);


        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);

        btnConform.setText("Ok");

        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);
        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);

        tv_RomanEngText.setText("Maamta Lw trial m Ab agay k form fil nhi hongay");
        tv_engText.setText("Cannot fill other Maamta Lw trial form ");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                CRF2Activity.formCrf2DTO.setFormStatus(Constants.COMPLETED);
                CRF2Activity.formCrf2DTO.setQ24(selectedDate);
                CRF2Activity.formCrf2DTO.setQ25(selectedTime);
                SendDataToServer.sendCrf2Form(CRF2Activity.formCrf2DTO);
                startActivity(new Intent(getContext(), CRF2DashboargActivity.class));
                getActivity().finish();
            }
        });

        btnCancel.setVisibility(View.GONE);
        btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });
        dialog.show();

    }




}
