package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

import android.app.DatePickerDialog;
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
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.DashboardActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;


public class Crf2GetDeathDateFragment extends Fragment {

    //Dialog initilizing
    Button btnCancel,btnConform;
    Dialog dialog;
    TextView  tv_RomanEngText, tv_engText;

    String getDateFromUser;

    Button btn_deathFragmentSubmit;
    boolean b = false;

    TextView tv_getDeathDtae;
    Calendar calendar;

    int year, month, day;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf2_get_death_date,container,false);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);


        tv_getDeathDtae = (TextView) view.findViewById(R.id.tv_getDeathDtae);

        tv_getDeathDtae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog mdiDialog =new DatePickerDialog(getContext(),new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                     //  new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().setTime(new Date(dayOfMonth,monthOfYear,year)););

                        getDateFromUser = dayOfMonth+"-"+monthOfYear+"-"+year;
                        tv_getDeathDtae.setText("   "+dayOfMonth+"-"+monthOfYear+"-"+year);
                        b = true;
                    }
                }, year, month, day);
                mdiDialog.getDatePicker();
                mdiDialog.show();

            }
        });

        btn_deathFragmentSubmit = (Button) view.findViewById(R.id.btn_deathFragmentSubmit);
        btn_deathFragmentSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(b){
                            myCustomeDialog();

                        }else {

                            Toast.makeText(getContext(),"Please Enter Date",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );


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

        tv_RomanEngText.setText("Woman died, thats why form is finished");
        tv_engText.setText("woman ka intqal hogya is wjha s form khtm hogay ");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                CRF2Activity.formCrf2DTO.setFormStatus(Constants.COMPLETED);
                startActivity(new Intent(getContext(), CRF2DashboargActivity.class));
                getActivity().finish();
                }
        });

       // btnCancel.setVisibility(View.GONE);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });
        dialog.show();

    }

}
