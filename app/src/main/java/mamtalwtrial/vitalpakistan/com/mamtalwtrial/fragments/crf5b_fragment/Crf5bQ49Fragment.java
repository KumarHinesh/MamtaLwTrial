package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4And5Dashboard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF5bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5b;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Crf5bQ49Fragment extends Fragment {

    TextView tv_q49, tv_q50, tv_q51, tv_q52, tv_q53, tv_q54, tv_q55, tv_q56, tv_q57, tv_q58;

    RadioGroup rg_q49, rg_q50, rg_q51, rg_q52, rg_q53, rg_q54, rg_q55, rg_q56, rg_q57, rg_q58;

    RadioButton rb_q49, rb_q50, rb_q51, rb_q52, rb_q53, rb_q54, rb_q55, rb_q56, rb_q57, rb_q58 ;

    ScrollView scrollView;

    EditText et_q49, et_q50, et_q51, et_q52, et_q53, et_q54, et_q55, et_q56, et_q57, et_q58;

    Context context;

    Button btn_submit;
    ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_crf5b_q49, container, false);
        // Inflate the layout for this fragment

        initializeView(view, getContext());



        btn_submit = (Button) view.findViewById(R.id.btn_submit);

        scrollView = (ScrollView) view.findViewById(R.id.scrolView);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    CRF5bActivity.formCrf5b.setQ59(new java.text.SimpleDateFormat(ContantsValues.TIMEFORMAT).format(java.util.Calendar.getInstance().getTime()));
                    sendDataToServer();

                }


            }
        });

        rg_q49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q49 = (RadioButton) view.findViewById(rg_q49.getCheckedRadioButtonId());

                if (rb_q49.getTag().toString().equals("1")){
                    et_q49.setVisibility(View.VISIBLE);
                }else {
                    et_q49.setVisibility(View.GONE);
                }

            }
        });

        rg_q50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50 = (RadioButton) view.findViewById(rg_q50.getCheckedRadioButtonId());

                if (rb_q50.getTag().toString().equals("1")){
                    et_q50.setVisibility(View.VISIBLE);
                }else {
                    et_q50.setVisibility(View.GONE);
                }
            }
        });


        rg_q51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q51 = (RadioButton) view.findViewById(rg_q51.getCheckedRadioButtonId());

                if (rb_q51.getTag().toString().equals("1")){
                    et_q51.setVisibility(View.VISIBLE);
                }else {
                    et_q51.setVisibility(View.GONE);
                }

            }
        });


        rg_q52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q52 = (RadioButton) view.findViewById(rg_q52.getCheckedRadioButtonId());

                if (rb_q52.getTag().toString().equals("1")){
                    et_q52.setVisibility(View.VISIBLE);
                }else {
                    et_q52.setVisibility(View.GONE);
                }

            }
        });


        rg_q53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q53 = (RadioButton) view.findViewById(rg_q53.getCheckedRadioButtonId());

                if (rb_q53.getTag().toString().equals("1")){
                    et_q53.setVisibility(View.VISIBLE);
                }else {
                    et_q53.setVisibility(View.GONE);
                }

            }
        });


        rg_q54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q54 = (RadioButton) view.findViewById(rg_q54.getCheckedRadioButtonId());

                if (rb_q54.getTag().toString().equals("1")){
                    et_q54.setVisibility(View.VISIBLE);
                }else {
                    et_q54.setVisibility(View.GONE);
                }

            }
        });


        rg_q55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55 = (RadioButton) view.findViewById(rg_q55.getCheckedRadioButtonId());

                if (rb_q55.getTag().toString().equals("1")){
                    et_q55.setVisibility(View.VISIBLE);
                }else {
                    et_q55.setVisibility(View.GONE);
                }
            }
        });


        rg_q56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q56 = (RadioButton) view.findViewById(rg_q56.getCheckedRadioButtonId());

                if (rb_q56.getTag().toString().equals("1")){
                    et_q56.setVisibility(View.VISIBLE);
                }else {
                    et_q56.setVisibility(View.GONE);
                }

            }
        });


        rg_q57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q57 = (RadioButton) view.findViewById(rg_q57.getCheckedRadioButtonId());

                if (rb_q57.getTag().toString().equals("1")){
                    et_q57.setVisibility(View.VISIBLE);
                }else {
                    et_q57.setVisibility(View.GONE);
                }

            }
        });


        rg_q58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q58 = (RadioButton) view.findViewById(rg_q58.getCheckedRadioButtonId());

                if (rb_q58.getTag().toString().equals("1")){
                    et_q58.setVisibility(View.VISIBLE);
                }else {
                    et_q58.setVisibility(View.GONE);
                }

            }
        });


        return view;
    }


    public boolean validation(){

        boolean validation = true;

        if (getEditText(rg_q49, rb_q49, et_q49,tv_q49,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ49(getEditText(rg_q49, rb_q49, et_q49,tv_q49,"1", null, null, null, null, null));
        }

        if (getEditText(rg_q50, rb_q50, et_q50,tv_q50,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ50(getEditText(rg_q50, rb_q50, et_q50,tv_q50,"1", null, null, null, null, null));
        }

        if (getEditText(rg_q51, rb_q51, et_q51,tv_q51,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ51(getEditText(rg_q51, rb_q51, et_q49,tv_q51,"1", null, null, null, null, null));
        }

        if (getEditText(rg_q52, rb_q52, et_q52,tv_q52,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ52(getEditText(rg_q52, rb_q52, et_q52,tv_q52,"1", null, null, null, null, null));
        }

        if (getEditText(rg_q53, rb_q53, et_q53,tv_q53,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ53(getEditText(rg_q53, rb_q53, et_q53,tv_q53,"1", null, null, null, null, null));
        }


        if (getEditText(rg_q54, rb_q54, et_q54,tv_q54,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ54(getEditText(rg_q54, rb_q54, et_q54,tv_q54,"1", null, null, null, null, null));
        }


        if (getEditText(rg_q55, rb_q55, et_q55,tv_q55,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ55(getEditText(rg_q55, rb_q55, et_q55,tv_q55,"1", null, null, null, null, null));
        }

        if (getEditText(rg_q56, rb_q56, et_q56,tv_q56,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ56(getEditText(rg_q56, rb_q56, et_q56,tv_q56,"1", null, null, null, null, null));
        }

        if (getEditText(rg_q57, rb_q57, et_q57,tv_q57,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ57(getEditText(rg_q57, rb_q57, et_q57,tv_q57,"1", null, null, null, null, null));
        }

        if (getEditText(rg_q58, rb_q58, et_q58,tv_q58,"1", null, null, null, null, null).equals("")){
            validation = false;
        }else {
            CRF5bActivity.formCrf5b.setQ58(getEditText(rg_q58, rb_q58, et_q58,tv_q58,"1", null, null, null, null, null));
        }


        return validation;
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

    public void sendDataToServer(){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf5b(CRF5bActivity.formCrf5b).enqueue(new Callback<FormCrf5b>() {
            @Override
            public void onResponse(Call<FormCrf5b> call, Response<FormCrf5b> response) {

                if(response.code()==200){
                    Toast.makeText(context, "Data Sended Congrats",Toast.LENGTH_LONG).show();
                }else {

                    Toast.makeText(context, "Data not  Sended ",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<FormCrf5b> call, Throwable t) {

            }
        });

    }

    public void initializeView(View view, Context context){

        this.context = context;
        progressDialog = new ProgressDialog(context);

        rg_q49 = (RadioGroup) view.findViewById(R.id.rg_q49);
        rg_q50 = (RadioGroup) view.findViewById(R.id.rg_q50);
        rg_q51 = (RadioGroup) view.findViewById(R.id.rg_q51);
        rg_q52 = (RadioGroup) view.findViewById(R.id.rg_q52);
        rg_q53 = (RadioGroup) view.findViewById(R.id.rg_q53);
        rg_q54 = (RadioGroup) view.findViewById(R.id.rg_q54);
        rg_q55 = (RadioGroup) view.findViewById(R.id.rg_q55);
        rg_q56 = (RadioGroup) view.findViewById(R.id.rg_q56);
        rg_q57 = (RadioGroup) view.findViewById(R.id.rg_q57);
        rg_q58 = (RadioGroup) view.findViewById(R.id.rg_q58);

        tv_q49 = (TextView) view.findViewById(R.id.tv_q49);
        tv_q50 = (TextView) view.findViewById(R.id.tv_q50);
        tv_q51 = (TextView) view.findViewById(R.id.tv_q51);
        tv_q52 = (TextView) view.findViewById(R.id.tv_q52);
        tv_q53 = (TextView) view.findViewById(R.id.tv_q53);
        tv_q54 = (TextView) view.findViewById(R.id.tv_q54);
        tv_q55 = (TextView) view.findViewById(R.id.tv_q55);
        tv_q56 = (TextView) view.findViewById(R.id.tv_q56);
        tv_q57 = (TextView) view.findViewById(R.id.tv_q57);
        tv_q58 = (TextView) view.findViewById(R.id.tv_q58);

        et_q49 = (EditText) view.findViewById(R.id.et_q49);
        et_q50 = (EditText) view.findViewById(R.id.et_q50);
        et_q51 = (EditText) view.findViewById(R.id.et_q51);
        et_q52 = (EditText) view.findViewById(R.id.et_q52);
        et_q53 = (EditText) view.findViewById(R.id.et_q53);
        et_q54 = (EditText) view.findViewById(R.id.et_q54);
        et_q55 = (EditText) view.findViewById(R.id.et_q55);
        et_q56 = (EditText) view.findViewById(R.id.et_q56);
        et_q57 = (EditText) view.findViewById(R.id.et_q57);
        et_q58 = (EditText) view.findViewById(R.id.et_q58);


    }


}
