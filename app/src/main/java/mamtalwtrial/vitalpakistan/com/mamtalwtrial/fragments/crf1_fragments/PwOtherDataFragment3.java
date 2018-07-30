package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf1_fragments;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CounselingCRF1Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.ContactNumberDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static java.security.AccessController.getContext;

public class PwOtherDataFragment3 extends Fragment {


    private APIService mAPIService;


    String fDate, expDate, pragWeek, ultraDate;
    LinearLayout ll_ultraHideFields, ll_ultraHideFields_2;

    EditText et_num1, et_num2, et_num3, et_num4;

    Button btn_Frag3_submit;
    CheckBox cb_Q1_1, cb_Q1_2, cb_Q2_1, cb_Q2_2 ,cb_Q3_1, cb_Q3_2, cb_Q4_1, cb_Q4_2, cb_Q5_1, cb_Q5_2;

    EditText et_getUltraWeek;
    SimpleDateFormat sdf;


    //Calendar calendar;
    int year;
    int month;
    int day;

    Context context;

    TextView tvGetData, tvDeliveryExpectedDate, tvWeekOfPregnancy, tvDateOfAltrasound;


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pw_other_data_fragment3,
                container, false);

        CRF1Activity.fragmentNo = 3;

        ll_ultraHideFields = (LinearLayout) view.findViewById(R.id.ll_ultraHideFields);
        ll_ultraHideFields_2 = (LinearLayout) view.findViewById(R.id.ll_ultraHideFields_2);

        et_getUltraWeek = (EditText) view.findViewById(R.id.et_getUltraWeek);

        et_num1 = (EditText) view.findViewById(R.id.et_num1);
        et_num2 = (EditText) view.findViewById(R.id.et_num2);
        et_num3 = (EditText) view.findViewById(R.id.et_num3);
        et_num4 = (EditText) view.findViewById(R.id.et_num4);


        sdf = new SimpleDateFormat("dd-MM-yyyy");

        final Calendar  calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);


        context = container.getContext();

        tvGetData = (TextView) view.findViewById(R.id.tvGetData);
        tvDeliveryExpectedDate = (TextView) view.findViewById(R.id.tvDeliveryExpectedDate);
        tvWeekOfPregnancy = (TextView) view.findViewById(R.id.tvWeekOfPregnancy);

        tvGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  Toast.makeText(context," dfdf", Toast.LENGTH_LONG).show();

                DatePickerDialog  mdiDialog = new DatePickerDialog(context,new DatePickerDialog.OnDateSetListener() {
                    @RequiresApi(api = Build.VERSION_CODES.N)
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {


                      //  view.setMaxDate(new Date().getTime());
                   //     view.setMinDate();
                       // tvGetData.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);
                        String oldDate = dayOfMonth+"-"+(monthOfYear+1)+"-"+year;

                        Calendar c = Calendar.getInstance();
                        try{
                            c.setTime(sdf.parse(oldDate));

                            fDate = sdf.format(sdf.parse(oldDate));
                            tvGetData.setText(fDate);
                        }

                        catch(ParseException e){
                            e.printStackTrace();
                        }

                        //Number of Days to add
                       // Calendar c = Calendar.getInstance();
                        c.add(Calendar.DAY_OF_MONTH, 280);
                        //Date after adding the days to the given date
                        expDate = sdf.format(c.getTime());
                        tvDeliveryExpectedDate.setText(expDate);

                        pragWeek = getCurrentWeekOfPregnancy(expDate,oldDate)+"";
                        tvWeekOfPregnancy.setText(pragWeek);

                    }
                }, year, month, day);

                Calendar calendar5 = Calendar.getInstance();

               calendar5.add(Calendar.DATE,-294);

               Date date3 = calendar5.getTime();

               mdiDialog.getDatePicker().setMinDate(date3.getTime());
               mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
               mdiDialog.show();

            }
        });


        btn_Frag3_submit = (Button) view.findViewById(R.id.btn_Frag3_submit);
        btn_Frag3_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    setDataInModels();

                    CRF1Activity.formCrf1DTO.setFormStatus(Constants.COMPLETED);


                        Intent i = new Intent(getContext(),CounselingCRF1Activity.class);
                        i.putExtra("obj",new Gson().toJson(CRF1Activity.formCrf1DTO));
                        startActivity(i);
                        getActivity().finish();


                    /*
                        Gson gson = new Gson();

                        SaveAndReadInternalData.saveCrf1FormInternal(context,gson.toJson(CRF1Activity.formCrf1DTO));
                        startActivity(new Intent(getContext(), CounselingCRF1Activity.class));
                        getActivity().finish();

                    }*/


                }else {

                    Toast.makeText(getContext(),"Please Enter All Fields",Toast.LENGTH_SHORT).show();
                }

            }
        });


        tvDateOfAltrasound = (TextView) view.findViewById(R.id.tvDateOfAltrasound);
        tvDateOfAltrasound.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(final View v) {


                DatePickerDialog  mdiDialog =new DatePickerDialog(context,new DatePickerDialog.OnDateSetListener() {
                    @Override

                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        tvDateOfAltrasound.setText(dayOfMonth+" : "+(monthOfYear+1)+" : "+year);

                        try{

                            ultraDate = sdf.format(sdf.parse(dayOfMonth+"-"+(monthOfYear+1)+"-"+year));
                            tvDateOfAltrasound.setText(ultraDate);
                        }

                        catch(ParseException e){
                            e.printStackTrace();
                        }
                    }
                }, year, month, day);
//////
                Calendar calendar5 = Calendar.getInstance();

                calendar5.add(Calendar.DATE,-294);

                Date date3 = calendar5.getTime();

                mdiDialog.getDatePicker().setMinDate(date3.getTime());

                mdiDialog.getDatePicker().setMaxDate(new Date().getTime());
                mdiDialog.show();


            }
        });



        cb_Q1_1 = (CheckBox) view.findViewById(R.id.cb_Q1_1);
        cb_Q1_2 = (CheckBox) view.findViewById(R.id.cb_Q1_2);

        cb_Q1_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    cb_Q1_2.setChecked(false);
                }

            }
        });

        cb_Q1_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if(isChecked){
                    cb_Q1_1.setChecked(false);
                }
            }
        });


        cb_Q2_1 = (CheckBox) view.findViewById(R.id.cb_Q2_1);
        cb_Q2_2 = (CheckBox) view.findViewById(R.id.cb_Q2_2);

        cb_Q2_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    cb_Q2_2.setChecked(false);
                }

            }
        });

        cb_Q2_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    cb_Q2_1.setChecked(false);
                }


            }
        });


        cb_Q3_1 = (CheckBox) view.findViewById(R.id.cb_Q3_1);
        cb_Q3_2 = (CheckBox) view.findViewById(R.id.cb_Q3_2);

        cb_Q3_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_Q3_2.setChecked(false);

                }
            }
        });

        cb_Q3_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_Q3_1.setChecked(false);
                }
            }
        });

        cb_Q4_1 = (CheckBox) view.findViewById(R.id.cb_Q4_1);
        cb_Q4_2 = (CheckBox) view.findViewById(R.id.cb_Q4_2);

        cb_Q4_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_Q4_2.setChecked(false);
                    ll_ultraHideFields.setVisibility(View.VISIBLE);
                }
            }
        });

        cb_Q4_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_Q4_1.setChecked(false);
                    ll_ultraHideFields.setVisibility(View.GONE);
                }
            }
        });



        cb_Q5_1 = (CheckBox) view.findViewById(R.id.cb_Q5_1);
        cb_Q5_2 = (CheckBox) view.findViewById(R.id.cb_Q5_2);

        cb_Q5_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_Q5_2.setChecked(false);
                    ll_ultraHideFields_2.setVisibility(View.VISIBLE);
                }


            }
        });

        cb_Q5_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_Q5_1.setChecked(false);
                    ll_ultraHideFields_2.setVisibility(View.GONE);

                }

            }
        });

        return view;
    }



    public String getCurrentWeekOfPregnancy(String d1, String d2){

        Calendar cal = Calendar.getInstance();

        String[] arr1 = d1.split("-");
        String[] arr2 = d2.split("-");

        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(arr1[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(arr1[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(arr1[2]));
        Date firstDate = cal.getTime();

        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(arr2[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(arr2[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(arr2[2]));
        Date secondDate = cal.getTime();


        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MONTH, month+1);
        cal.set(Calendar.YEAR, year);
        Date currentDate = cal.getTime();



        double totaldays = firstDate.getTime()/1000 / 60 / 60 / 24- secondDate.getTime()/1000 / 60 / 60 / 24;
        double currentDays = firstDate.getTime()/ 1000 / 60 / 60 / 24 - currentDate.getTime()/ 1000 / 60 / 60 / 24;

        double remainigDays =totaldays-currentDays;

        //double totalWeeks = totaldays/7;
        //double currentWeeks = currentDays/7;

       // Log.d("Current Week","0777 "+diff / 1000 / 60 / 60 / 24 );
        //Log.d("Current Week","07777 "+diff);

           // System.out.println ("Days: " + diff / 1000 / 60 / 60 / 24);


        DecimalFormat f = new DecimalFormat("##");

     //   Math.round()

        Double db = remainigDays/7;

        int con = db.intValue() ;

        double dv = db-con;

        dv = dv*7;

        //dv = Math.abs(dv);

        String s = f.format(dv);


        /*String t = con+"."+dv;



        String s =   f.format(Double.parseDouble(t));
*/

     //   double res = Double.parseDouble(dv);



        return  con+"."+s;
    }


    public boolean validation(){

        boolean b = true;

        if(!cb_Q1_1.isChecked() && !cb_Q1_2.isChecked()){

            cb_Q1_1.setError("Check This (Isay Check kre)");

            b = false;
        }

        if(!cb_Q2_1.isChecked() && !cb_Q2_2.isChecked()){

            cb_Q2_1.setError("Check This (Isay Check kre)");

            b = false;
        }
        if(!cb_Q3_1.isChecked() && !cb_Q3_2.isChecked()){

            cb_Q3_1.setError("Check This (Isay Check kre)");

            b = false;
        }
        if(!cb_Q4_1.isChecked() && !cb_Q4_2.isChecked()){

            cb_Q4_1.setError("Check This (Isay Check kre)");

            b = false;
        }
       if(cb_Q4_1.isChecked()){

           if(!cb_Q5_1.isChecked() && !cb_Q5_2.isChecked()){

               cb_Q5_1.setError("Check This (Isay Check kre)");

               b = false;
           }


       }


        String tem1 = et_num1.getText().toString();
        String tem2 = et_num2.getText().toString();
        String tem3 = et_num3.getText().toString();
        String tem4 = et_num4.getText().toString();

        if(TextUtils.isEmpty(tem1)){

            et_num1.setError("Atleast One Number required\nkam s kam 1 number le");
            b = false;
        }
        if(fDate==null){
            b = false;
        }

        return b;
    }

    public void setDataInModels(){
       // boolean b = true;

        Set<ContactNumberDTO> listOfContactNumbers = new HashSet<ContactNumberDTO>();

        String tem1 = et_num1.getText().toString();
        String tem2 = et_num2.getText().toString();
        String tem3 = et_num3.getText().toString();
        String tem4 = et_num4.getText().toString();

        if(tem1 != null && !tem1.isEmpty()){listOfContactNumbers.add(new ContactNumberDTO(1,tem1));}
        if(tem2 != null && !tem2.isEmpty()){listOfContactNumbers.add(new ContactNumberDTO(2,tem2));}
        if(tem3 != null && !tem3.isEmpty()){listOfContactNumbers.add(new ContactNumberDTO(3,tem3));}
        if(tem4 != null && !tem4.isEmpty()){listOfContactNumbers.add(new ContactNumberDTO(4,tem4));}

        CRF1Activity.formCrf1DTO.setContactNumbers(listOfContactNumbers);
        CRF1Activity.formCrf1DTO.setContactNumbers(listOfContactNumbers);

        //Q23
        CRF1Activity.formCrf1DTO.setQ23(getCheckBoxResult(cb_Q1_1,cb_Q1_2));

        //Q24
        CRF1Activity.formCrf1DTO.setQ24(getCheckBoxResult(cb_Q2_1,cb_Q2_2));

        //Q25
        CRF1Activity.formCrf1DTO.setQ25(getCheckBoxResult(cb_Q3_1,cb_Q3_2));

        //Q26
        CRF1Activity.formCrf1DTO.setQ26(fDate);

        //Q27
        CRF1Activity.formCrf1DTO.setQ27(expDate);

        //Q28
        CRF1Activity.formCrf1DTO.setQ28(pragWeek);

        //Q29
        CRF1Activity.formCrf1DTO.setQ29(getCheckBoxResult(cb_Q4_1,cb_Q4_2));

        //Q30
        CRF1Activity.formCrf1DTO.setQ30(getCheckBoxResult(cb_Q5_1,cb_Q5_2));

        //Q31
        CRF1Activity.formCrf1DTO.setQ31(ultraDate);

        //Q32
        CRF1Activity.formCrf1DTO.setQ32(et_getUltraWeek.getText().toString());

        Log.d("data","Q32"+CRF1Activity.formCrf1DTO.getQ32()+" Q31 "+CRF1Activity.formCrf1DTO.getQ31()
        +" Q30 "+CRF1Activity.formCrf1DTO.getQ30()+"Q29"+CRF1Activity.formCrf1DTO.getQ29());

        Log.d("data001","Q28"+CRF1Activity.formCrf1DTO.getQ28()+" Q27 "+CRF1Activity.formCrf1DTO.getQ27()
                +" Q26 "+CRF1Activity.formCrf1DTO.getQ26()+"Q25"+CRF1Activity.formCrf1DTO.getQ25());

        Log.d("data002","Q24"+CRF1Activity.formCrf1DTO.getQ24()+" Q23 "+CRF1Activity.formCrf1DTO.getQ23());
    }

    public String getCheckBoxResult(CheckBox cb1, CheckBox cb2){

        if(cb1.isChecked()){return "yes";}
        else if(cb2.isChecked()){return "no";}
        else {return "x";}

    }

    /*public void sendPost(String title, FormCrf1DTO body) {

        //final FormCrf1DTO dto;
        mAPIService.sendCrf1Form(body).enqueue(new Callback<FormCrf1DTO>() {


            @Override
            public void onResponse(Call<FormCrf1DTO> call, Response<FormCrf1DTO> response) {
               // dto = response;
                Log.e("Geting Responce", "Sucsesfulluy submited"+response);
            }

            @Override
            public void onFailure(Call<FormCrf1DTO> call, Throwable t) {
                Log.e("Geting Error", "Unable to submit post to API.");
            }
        });
    }*/

}
