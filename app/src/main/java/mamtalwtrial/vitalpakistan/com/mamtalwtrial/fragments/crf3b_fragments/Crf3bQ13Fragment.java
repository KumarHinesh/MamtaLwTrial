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

    LinearLayout ll_q27_q28;

    EditText et_q13, et_q14, et_q15, et_q16, et_q18, et_q19, et_q20, et_q21, et_q24, et_q25, et_q28;

    RadioGroup rg_q13, rg_q14, rg_q17, rg_q18, rg_q19, rg_q20, rg_q21, rg_q22, rg_q23, rg_q24, rg_q26,
               rg_q27, rg_q28;

    RadioButton rb_q13, rb_q14, rb_q17, rb_q18, rb_q19, rb_q20, rb_q21, rb_q22, rb_q23, rb_q24, rb_q26,
                rb_q27, rb_q28;

    ScrollView scrollView;

    String q13 = "";
    String q14 = "";
    String q15 = "";
    String q16 = "";
    String q17 = "";
    String q18 = "";
    String q19 = "";
    String q20 = "";
    String q21 = "";
    String q22 = "";
    String q23 = "";
    String q24 = "";
    String q25 = "";
    String q26 = "";
    String q27 = "";
    String q28 = "";



    Button  btn_next;

    //dialog
    Button btn_input_dialog_ok, btn_input_dialog_cancel;
    Dialog dialog;
    EditText et_getInput;

    TextView tv_q13, tv_q14, tv_q17, tv_q18, tv_q19, tv_q20, tv_q21
            , tv_q22, tv_q23, tv_q24 , tv_q26, tv_q27, tv_q28;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf3b_q13, container, false);

        scrollView = (ScrollView) view.findViewById(R.id.scrolView);

        ll_q27_q28 = (LinearLayout) view.findViewById(R.id.ll_q27_q28);

        tv_q13 = (TextView) view.findViewById(R.id.tv_q13);
        tv_q14 = (TextView) view.findViewById(R.id.tv_q14);
        tv_q17 = (TextView) view.findViewById(R.id.tv_q17);
        tv_q18 = (TextView) view.findViewById(R.id.tv_q18);
        tv_q19 = (TextView) view.findViewById(R.id.tv_q19);
        tv_q20 = (TextView) view.findViewById(R.id.tv_q20);
        tv_q21 = (TextView) view.findViewById(R.id.tv_q21);
        tv_q22 = (TextView) view.findViewById(R.id.tv_q22);
        tv_q23 = (TextView) view.findViewById(R.id.tv_q23);
        tv_q24 = (TextView) view.findViewById(R.id.tv_q24);
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
                    q13 = rb_q13.getTag().toString();

                }else {

                    q13 = rb_q13.getTag().toString();
                    //  CRF3bActivity.formCrf3bDTO.setQ13(rb_q13.getTag().toString());
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
                    q14 = rb_q14.getTag().toString();

                }else {
                    q14 = rb_q14.getTag().toString();
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
                q17 = rb_q17.getTag().toString();
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
                    q18 = rb_q18.getTag().toString();

                }else {
                    q18 = rb_q18.getTag().toString();
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
                    q19 = rb_q19.getTag().toString();

                }else {
                    q19 = rb_q19.getTag().toString();
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
                    q20 = rb_q20.getTag().toString();

                }else {
                    q20 = rb_q20.getTag().toString();
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
                    q21 = rb_q21.getTag().toString();

                }else {
                    q21 = rb_q21.getTag().toString();
                    et_q21.setVisibility(View.GONE);
                }
            }
        });

        rg_q22 = (RadioGroup) view.findViewById(R.id.rg_q22);
        rg_q22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q22 = (RadioButton) view.findViewById(rg_q22.getCheckedRadioButtonId());
                q22 = rb_q22.getTag().toString();
            }
        });


        rg_q23 = (RadioGroup) view.findViewById(R.id.rg_q23);
        rg_q23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q23 = (RadioButton) view.findViewById(rg_q23.getCheckedRadioButtonId());
                    q23 = rb_q23.getTag().toString();
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
                    q24 = rb_q24.getTag().toString();

                }else {
                    q24 = rb_q24.getTag().toString();
                    et_q24.setVisibility(View.GONE);
                }

            }
        });

        rg_q26 = (RadioGroup) view.findViewById(R.id.rg_q26);
        rg_q26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q26 = (RadioButton) view.findViewById(rg_q26.getCheckedRadioButtonId());
                q26 = rb_q26.getTag().toString();

                if(q26.equals("4")){

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
                rb_q27 = (RadioButton) view.findViewById(rg_q27.getCheckedRadioButtonId());
                q27 = rb_q27.getTag().toString();
            }
        });

        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);
        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());
                et_q28.setError(null);
                tv_q28.setError(null);
                if(rb_q28.getTag().toString().equalsIgnoreCase("3")){
                    et_q28.setVisibility(View.VISIBLE);
                    q28 = rb_q28.getTag().toString();

                }else {
                    q28 = rb_q28.getTag().toString();
                    et_q28.setVisibility(View.GONE);
                }
            }
        });





        return view;

    }

    public boolean dataInsertion(){

        boolean isInserted = true;

      //  if(q13.equalsIgnoreCase("14")){
      //      CRF3bActivity.formCrf3bDTO.setQ13(et_q13.getText().toString());
     //   }
   /*     if(q13.equalsIgnoreCase("8")){
            CRF3bActivity.formCrf3bDTO.setQ14(et_q14.getText().toString());
        }*/
     /*   if(q18.equalsIgnoreCase("8")){
            CRF3bActivity.formCrf3bDTO.setQ18(et_q18.getText().toString());
        }
     */ /*  if(q19.equalsIgnoreCase("6")){
            CRF3bActivity.formCrf3bDTO.setQ19(et_q19.getText().toString());
        }
        if(q20.equalsIgnoreCase("6")){
            CRF3bActivity.formCrf3bDTO.setQ20(et_q20.getText().toString());
        }*/
       /* if(q21.equalsIgnoreCase("8")){
            CRF3bActivity.formCrf3bDTO.setQ21(et_q21.getText().toString());
        }*/
        /*if(q24.equalsIgnoreCase("8")){
            CRF3bActivity.formCrf3bDTO.setQ24(et_q24.getText().toString());
        }*/
/*

        if(q28.equalsIgnoreCase("3")){
            CRF3bActivity.formCrf3bDTO.setQ28(et_q28.getText().toString());
        }
*/



       // CRF3bActivity.formCrf3bDTO.setQ16(et_q16.getText().toString());
       // CRF3bActivity.formCrf3bDTO.setQ25(et_q25.getText().toString());



        return isInserted;
    }

///////////////////////
    public boolean validation(){

        boolean validation  =  true;

        if(rg_q13.getCheckedRadioButtonId()!=-1){

            if(q13.equals("14")){

                if(et_q13.getText().toString().isEmpty()){

                    setFocuseable(tv_q13.getX(),tv_q13.getY());
                    et_q13.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ13(et_q13.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ13(q13);
            }

        }else {
            setFocuseable(tv_q13.getX(),tv_q13.getY());
            tv_q13.setError("select One");
            validation = false;
        }


        if(rg_q14.getCheckedRadioButtonId()!=-1){

            if(q14.equals("8")){

                if(et_q14.getText().toString().isEmpty()){

                    setFocuseable(tv_q14.getX(),tv_q14.getY());
                    et_q14.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ14(et_q14.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ14(q14);
            }

        }else {
            setFocuseable(tv_q14.getX(),tv_q14.getY());
            tv_q14.setError("select One");
            validation = false;
        }


        if(et_q15.getText().toString().equals(null) || et_q15.getText().toString().isEmpty()){
            setFocuseable(et_q15.getX(),et_q15.getY());
            validation = false;
            et_q15.setError("Required");
        }else {

            CRF3bActivity.formCrf3bDTO.setQ15(et_q15.getText().toString());

        }

        if(et_q16.getText().toString().equals(null) || et_q16.getText().toString().isEmpty()){

            setFocuseable(et_q16.getX(),et_q16.getY());
            validation = false;
            et_q16.setError("Required");

        }else {
            CRF3bActivity.formCrf3bDTO.setQ16(et_q16.getText().toString());
        }

        if(rg_q17.getCheckedRadioButtonId()==-1){
            setFocuseable(tv_q17.getX(),tv_q17.getY());
            validation = false;
            tv_q17.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ17(q17);
        }


        if(rg_q18.getCheckedRadioButtonId()!=-1){

            if(q18.equals("8")){

                if(et_q18.getText().toString().isEmpty()){

                    setFocuseable(tv_q18.getX(),tv_q18.getY());
                    et_q18.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ18(et_q18.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ18(q18);
            }

        }else {
            setFocuseable(tv_q18.getX(),tv_q18.getY());
            tv_q18.setError("select One");
            validation = false;
        }


        if(rg_q19.getCheckedRadioButtonId()!=-1){

            if(q19.equals("6")){

                if(et_q19.getText().toString().isEmpty()){

                    setFocuseable(tv_q19.getX(),tv_q19.getY());
                    et_q19.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ19(et_q19.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ19(q19);
            }

        }else {
            setFocuseable(tv_q19.getX(),tv_q19.getY());
            tv_q19.setError("select One");
            validation = false;
        }


        if(rg_q20.getCheckedRadioButtonId()!=-1){

            if(q20.equals("6")){

                if(et_q20.getText().toString().isEmpty()){

                    setFocuseable(tv_q20.getX(),tv_q20.getY());
                    et_q20.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ20(et_q20.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ20(q20);
            }

        }else {
            setFocuseable(tv_q20.getX(),tv_q20.getY());
            tv_q20.setError("select One");
            validation = false;
        }

        if(rg_q21.getCheckedRadioButtonId()!=-1){

            if(q21.equals("8")){

                if(et_q21.getText().toString().isEmpty()){

                    setFocuseable(tv_q21.getX(),tv_q21.getY());
                    et_q21.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ21(et_q21.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ21(q21);
            }

        }else {
            setFocuseable(tv_q21.getX(),tv_q21.getY());
            tv_q21.setError("select One");
            validation = false;
        }


        if(rg_q22.getCheckedRadioButtonId()==-1){
            setFocuseable(tv_q22.getX(),tv_q22.getY());
            validation = false;
            tv_q22.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ22(q22);
        }

        if(rg_q23.getCheckedRadioButtonId()==-1){
            setFocuseable(tv_q23.getX(),tv_q23.getY());
            validation = false;
            tv_q23.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ23(q23);
        }


        if(rg_q24.getCheckedRadioButtonId()!=-1){

            if(q24.equals("8")){

                if(et_q24.getText().toString().isEmpty()){

                    setFocuseable(tv_q24.getX(),tv_q24.getY());
                    et_q24.setError("Enter Here");
                    validation = false;
                }else {

                    CRF3bActivity.formCrf3bDTO.setQ24(et_q24.getText().toString());
                }
            }else {
                CRF3bActivity.formCrf3bDTO.setQ24(q24);
            }

        }else {
            setFocuseable(tv_q24.getX(),tv_q24.getY());
            tv_q24.setError("select One");
            validation = false;
           }


        if(et_q25.getText().toString().equals(null) || et_q25.getText().toString().isEmpty()){
            setFocuseable(et_q25.getX(),et_q25.getY());
            validation = false;
            et_q25.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ25(et_q25.getText().toString());
        }

        if(rg_q26.getCheckedRadioButtonId()==-1){
            setFocuseable(tv_q26.getX(),tv_q26.getY());
            validation = false;
            tv_q26.setError("Required");
        }else {
            CRF3bActivity.formCrf3bDTO.setQ26(q26);
        }

        if(ll_q27_q28.getVisibility()==View.VISIBLE){

            if(rg_q27.getCheckedRadioButtonId()==-1){
                setFocuseable(tv_q27.getX(),tv_q27.getY());
                validation = false;
                tv_q27.setError("Required");
            }else {
                CRF3bActivity.formCrf3bDTO.setQ27(q27);
            }


            if(rg_q28.getCheckedRadioButtonId()!=-1){

                if(q28.equals("3")){

                    if(et_q28.getText().toString().isEmpty()){

                        setFocuseable(tv_q28.getX(),tv_q28.getY());
                        et_q28.setError("Enter Here");
                        validation = false;
                    }else {

                        CRF3bActivity.formCrf3bDTO.setQ28(et_q28.getText().toString());
                    }
                }else {
                    CRF3bActivity.formCrf3bDTO.setQ28(q28);
                }

            }else {
                setFocuseable(tv_q28.getX(),tv_q28.getY());
                tv_q28.setError("select One");
                validation = false;
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

}
