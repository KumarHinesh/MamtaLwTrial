package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3c_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
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
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3cActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;


public class Crf3cQ28 extends Fragment {

    LinearLayout ll_q33;

    ScrollView scrolView;

    TextView tv_q28, tv_q29, tv_q30, tv_q31_a, tv_q31_b, tv_q31_c, tv_q31_d, tv_q31_e
            , tv_q31_f, tv_q31_g, tv_q31_h, tv_q31_i, tv_q31_j, tv_q31_k, tv_q31_l, tv_q32, tv_q33;


    EditText et_q29, et_q30;


    LinearLayout ll_q29 ;
    Button btn_submit;

    RadioGroup rg_q28, rg_q31_a, rg_q31_b, rg_q31_c, rg_q31_d, rg_q31_e, rg_q31_f, rg_q31_g, rg_q31_h, rg_q31_i, rg_q31_j,
               rg_q31_k, rg_q31_l, rg_q32, rg_q33;
    RadioButton rb_q28, rb_q31_a, rb_q31_b, rb_q31_c, rb_q31_d, rb_q31_e, rb_q31_f, rb_q31_g, rb_q31_h, rb_q31_i, rb_q31_j,
               rb_q31_k, rb_q31_l, rb_q32, rb_q33;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf3c_q28, container, false);

        ll_q33 = (LinearLayout) view.findViewById(R.id.ll_q33);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);

        tv_q28 = (TextView) view.findViewById(R.id.tv_q28);
        tv_q29 = (TextView) view.findViewById(R.id.tv_q29);
        tv_q30 = (TextView) view.findViewById(R.id.tv_q30);
        tv_q31_a = (TextView) view.findViewById(R.id.tv_q31_a);
        tv_q31_b = (TextView) view.findViewById(R.id.tv_q31_b);
        tv_q31_c = (TextView) view.findViewById(R.id.tv_q31_c);
        tv_q31_d = (TextView) view.findViewById(R.id.tv_q31_d);
        tv_q31_e = (TextView) view.findViewById(R.id.tv_q31_e);
        tv_q31_f = (TextView) view.findViewById(R.id.tv_q31_f);
        tv_q31_g = (TextView) view.findViewById(R.id.tv_q31_g);
        tv_q31_h = (TextView) view.findViewById(R.id.tv_q31_h);
        tv_q31_i = (TextView) view.findViewById(R.id.tv_q31_i);
        tv_q31_j = (TextView) view.findViewById(R.id.tv_q31_j);
        tv_q31_k = (TextView) view.findViewById(R.id.tv_q31_k);
        tv_q31_l = (TextView) view.findViewById(R.id.tv_q31_l);


        tv_q32 = (TextView) view.findViewById(R.id.tv_q32);
        tv_q33 = (TextView) view.findViewById(R.id.tv_q33);

        et_q29 = (EditText) view.findViewById(R.id.et_q29);
        et_q30 = (EditText) view.findViewById(R.id.et_q30);

        ll_q29 = (LinearLayout) view.findViewById(R.id.ll_q29);

        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);

        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q28.setError(null);
                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());


                if(rb_q28.getTag().toString().equalsIgnoreCase("a")){

                    ll_q29.setVisibility(View.GONE);

                }else {

                    ll_q29.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q31_a = (RadioGroup) view.findViewById(R.id.rg_q31_a);
        rg_q31_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_a.setError(null);
                rb_q31_a = (RadioButton) view.findViewById(rg_q31_a.getCheckedRadioButtonId());
            }
        });

        rg_q31_b = (RadioGroup) view.findViewById(R.id.rg_q31_b);
        rg_q31_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_b.setError(null);
                rb_q31_b = (RadioButton) view.findViewById(rg_q31_b.getCheckedRadioButtonId());
            }
        });

        rg_q31_c = (RadioGroup) view.findViewById(R.id.rg_q31_c);
        rg_q31_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_c.setError(null);
                rb_q31_c = (RadioButton) view.findViewById(rg_q31_c.getCheckedRadioButtonId());
            }
        });

        rg_q31_d = (RadioGroup) view.findViewById(R.id.rg_q31_d);
        rg_q31_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_d.setError(null);
                rb_q31_d = (RadioButton) view.findViewById(rg_q31_d.getCheckedRadioButtonId());
            }
        });


        rg_q31_e = (RadioGroup) view.findViewById(R.id.rg_q31_e);
        rg_q31_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_e.setError(null);
                rb_q31_e = (RadioButton) view.findViewById(rg_q31_e.getCheckedRadioButtonId());
            }
        });

        rg_q31_f = (RadioGroup) view.findViewById(R.id.rg_q31_f);
        rg_q31_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_f.setError(null);
                rb_q31_f = (RadioButton) view.findViewById(rg_q31_f.getCheckedRadioButtonId());
            }
        });


        rg_q31_g = (RadioGroup) view.findViewById(R.id.rg_q31_g);
        rg_q31_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_g.setError(null);
                rb_q31_g = (RadioButton) view.findViewById(rg_q31_g.getCheckedRadioButtonId());
            }
        });

        rg_q31_h = (RadioGroup) view.findViewById(R.id.rg_q31_h);
        rg_q31_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_h.setError(null);
                rb_q31_h = (RadioButton) view.findViewById(rg_q31_h.getCheckedRadioButtonId());
            }
        });


        rg_q31_i = (RadioGroup) view.findViewById(R.id.rg_q31_i);
        rg_q31_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_i.setError(null);
                rb_q31_i = (RadioButton) view.findViewById(rg_q31_i.getCheckedRadioButtonId());
            }
        });

        rg_q31_j = (RadioGroup) view.findViewById(R.id.rg_q31_j);
        rg_q31_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_j.setError(null);
                rb_q31_j = (RadioButton) view.findViewById(rg_q31_j.getCheckedRadioButtonId());
            }
        });


        rg_q31_k = (RadioGroup) view.findViewById(R.id.rg_q31_k);
        rg_q31_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_k.setError(null);
                rb_q31_k = (RadioButton) view.findViewById(rg_q31_k.getCheckedRadioButtonId());
            }
        });

        rg_q31_l = (RadioGroup) view.findViewById(R.id.rg_q31_l);
        rg_q31_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q31_l.setError(null);
                rb_q31_l = (RadioButton) view.findViewById(rg_q31_l.getCheckedRadioButtonId());
            }
        });

        rg_q32 = (RadioGroup) view.findViewById(R.id.rg_q32);
        rg_q32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q32.setError(null);
                rb_q32 = (RadioButton) view.findViewById(rg_q32.getCheckedRadioButtonId());

                if(rb_q32.getTag().toString().equalsIgnoreCase(ContantsValues.NO)){

                    ll_q33.setVisibility(View.GONE);
                    CRF3cActivity.formCrf3cDTO.setQ32(rb_q32.getTag().toString());
                }else {
                    ll_q33.setVisibility(View.VISIBLE);
                    CRF3cActivity.formCrf3cDTO.setQ32(rb_q32.getTag().toString());
                }

            }
        });

        rg_q33 = (RadioGroup) view.findViewById(R.id.rg_q33);
        rg_q33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                tv_q33.setError(null);
                rb_q33 = (RadioButton) view.findViewById(rg_q33.getCheckedRadioButtonId());
            }
        });


        btn_submit = (Button) view.findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // insertedData();

                if(validation()){

                    Crf3cQ34 crf3cQ34 = new Crf3cQ34();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf3c, crf3cQ34);
                    fragmentTransaction.commit();

                }




            }
        });

        return view;
    }


    public boolean  validation(){

        boolean validation = true;


        if (isRBCheckedThree(rg_q28, rb_q28, tv_q28).equals("")) {
            validation = false;
        } else {
            CRF3cActivity.formCrf3cDTO.setQ28(isRBCheckedThree(rg_q28, rb_q28, tv_q28));
        }

        if((isRBCheckedThree(rg_q28, rb_q28, tv_q28).equalsIgnoreCase("a"))){

            validation = true;
        }else{
            //////////




            if (getTextFromField(et_q29, tv_q29).equals("")) {
                validation = false;
            } else {
                CRF3cActivity.formCrf3cDTO.setQ29(getTextFromField(et_q29, tv_q29));
            }

            if (getTextFromField(et_q30, tv_q30).equals("")) {
                validation = false;
            } else {
                CRF3cActivity.formCrf3cDTO.setQ30(getTextFromField(et_q30, tv_q30));
            }


            if(isRBCheckedThree(rg_q31_a, rb_q31_a, tv_q31_a).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31a(isRBCheckedThree(rg_q31_a, rb_q31_a, tv_q31_a));
            }

            if(isRBCheckedThree(rg_q31_b, rb_q31_b, tv_q31_b).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31b(isRBCheckedThree(rg_q31_b, rb_q31_b, tv_q31_b));
            }

            if(isRBCheckedThree(rg_q31_c, rb_q31_c, tv_q31_c).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31c(isRBCheckedThree(rg_q31_c, rb_q31_c, tv_q31_c));
            }

            if(isRBCheckedThree(rg_q31_d, rb_q31_d, tv_q31_d).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31d(isRBCheckedThree(rg_q31_d, rb_q31_d, tv_q31_d));
            }

            if(isRBCheckedThree(rg_q31_e, rb_q31_e, tv_q31_e).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31e(isRBCheckedThree(rg_q31_e, rb_q31_e, tv_q31_e));
            }


            if(isRBCheckedThree(rg_q31_f, rb_q31_f, tv_q31_f).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31f(isRBCheckedThree(rg_q31_f, rb_q31_f, tv_q31_f));
            }

            if(isRBCheckedThree(rg_q31_g, rb_q31_g, tv_q31_g).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31g(isRBCheckedThree(rg_q31_g, rb_q31_g, tv_q31_g));
            }

            if(isRBCheckedThree(rg_q31_h, rb_q31_h, tv_q31_h).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31h(isRBCheckedThree(rg_q31_h, rb_q31_h, tv_q31_h));
            }

            if(isRBCheckedThree(rg_q31_i, rb_q31_i, tv_q31_i).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31i(isRBCheckedThree(rg_q31_i, rb_q31_i, tv_q31_i));
            }

            if(isRBCheckedThree(rg_q31_j, rb_q31_j, tv_q31_j).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31j(isRBCheckedThree(rg_q31_j, rb_q31_j, tv_q31_j));
            }

            if(isRBCheckedThree(rg_q31_k, rb_q31_k, tv_q31_k).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31k(isRBCheckedThree(rg_q31_k, rb_q31_k, tv_q31_k));
            }

            if(isRBCheckedThree(rg_q31_l, rb_q31_l, tv_q31_l).equals("")){
                validation = false;
            }else {
                CRF3cActivity.formCrf3cDTO.setQ31l(isRBCheckedThree(rg_q31_l, rb_q31_l, tv_q31_l));
            }


            if(isRBCheckedThree(rg_q32, rb_q32, tv_q32).equals("")){
                validation = false;
            }else {
                CRF3bActivity.formCrf3bDTO.setQ32(isRBCheckedThree(rg_q32, rb_q32, tv_q32));
            }

            if(ll_q33.getVisibility()==View.VISIBLE){


                if(isRBCheckedThree(rg_q33, rb_q33, tv_q33).equals("")){
                    validation = false;
                }else {
                    CRF3cActivity.formCrf3cDTO.setQ33(isRBCheckedThree(rg_q33, rb_q33, tv_q33));
                }
            }




            /////////////////
        }




      return   validation;
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
                    return editText.getText().toString();
                }
            }else {

                return rb.getTag().toString();
            }

        }
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
