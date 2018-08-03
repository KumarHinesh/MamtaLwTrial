package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4b_fragments;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
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

import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4And5Dashboard;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF4aActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments.Crf4aCounselingQ79;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5a_fragment.Crf5aQ26Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;


public class Crf4bQ20Fragment extends Fragment {


    boolean q45 = false;
    boolean a = false;
    boolean b = false;
    boolean c1 = false;
    boolean d = false;
    EditText et_q21_z, et_q31_a, et_q32_a, et_q32_b, et_q50_p, et_q55_l, et_q27_a, et_q27_b, et_q27_c, et_q27_d, et_q27_e
            , et_q27_f, et_q29_a, et_q29_b, et_q29_c, et_q29_d, et_q29_e, et_q29_f, et_q37_a, et_q23_g, et_q23_h, et_q25_i;

    int year, month, day, min, hour;
    ScrollView scrolView;

    TextView  tv_q20, tv_q21_a, tv_q21_b, tv_q21_c, tv_q21_d, tv_q21_e, tv_q21_f, tv_q21_g, tv_q21_h, tv_q21_i, tv_q21_j, tv_q21_k
            , tv_q21_l, tv_q21_m, tv_q21_n, tv_q21_o, tv_q21_p, tv_q21_q, tv_q21_r, tv_q21_s, tv_q21_t, tv_q21_u, tv_q21_v, tv_q21_w
            , tv_q21_x, tv_q21_y, tv_q21_z, tv_q22, tv_q23_a, tv_q23_b, tv_q23_c, tv_q23_d, tv_q23_e, tv_q23_f, tv_q23_g, tv_q23_h
            , tv_q23_i, tv_q23_j, tv_q23_k , tv_q23_l, tv_q23_m, tv_q24, tv_q25_a, tv_q25_b, tv_q25_c, tv_q25_d, tv_q25_e, tv_q25_f
            , tv_q25_g, tv_q25_h, tv_q25_i, tv_q26, tv_q27, tv_q28, tv_q29, tv_q30, tv_q31, tv_q33, tv_q35, tv_q36, tv_q38, tv_q39, tv_q40, tv_q41
            , tv_q43, tv_q44, tv_q45, tv_q46, tv_q47, tv_q48, tv_q49, tv_q50_a, tv_q50_b, tv_q50_c, tv_q50_d, tv_q50_e, tv_q50_f
            , tv_q50_g, tv_q50_h, tv_q50_i, tv_q50_j, tv_q50_k, tv_q50_l, tv_q50_m, tv_q50_n, tv_q50_o, tv_q50_p, tv_q51, tv_q52
            , tv_q53, tv_q54, tv_q55_a, tv_q55_b, tv_q55_c, tv_q55_d, tv_q55_e, tv_q55_f, tv_q55_g, tv_q55_h, tv_q55_i, tv_q55_j
            , tv_q55_k, tv_q55_l, tv_q56, tv_q58, tv_q60, tv_q62, tv_q42, tv_q42_b, tv_q42_b_a, tv_q42_b_b, tv_q42_b_c, tv_q42_b_d, tv_q32,
                tv_q57_a, tv_q57_a_date, tv_q59_a_date, tv_q61_a_date, tv_q63_a_date;

    RadioGroup rg_q20, rg_q21_a, rg_q21_b, rg_q21_c, rg_q21_d, rg_q21_e, rg_q21_f, rg_q21_g, rg_q21_h, rg_q21_i, rg_q21_j, rg_q21_k
                , rg_q21_l, rg_q21_m, rg_q21_n, rg_q21_o, rg_q21_p, rg_q21_q, rg_q21_r, rg_q21_s, rg_q21_t, rg_q21_u, rg_q21_v, rg_q21_w
                , rg_q21_x, rg_q21_y, rg_q21_z, rg_q22, rg_q23_a, rg_q23_b, rg_q23_c, rg_q23_d, rg_q23_e, rg_q23_f, rg_q23_g, rg_q23_h
                , rg_q23_i, rg_q23_j, rg_q23_k , rg_q23_l, rg_q23_m, rg_q24, rg_q25_a, rg_q25_b, rg_q25_c, rg_q25_d, rg_q25_e, rg_q25_f
                , rg_q25_g, rg_q25_h, rg_q25_i, rg_q26, rg_q28, rg_q30, rg_q33, rg_q35, rg_q36, rg_q38, rg_q39, rg_q40, rg_q41
                , c, rg_q43, rg_q44, rg_q45, rg_q46, rg_q47, rg_q48, rg_q49, rg_q50_a, rg_q50_b, rg_q50_c, rg_q50_d, rg_q50_e, rg_q50_f
                , rg_q50_g, rg_q50_h, rg_q50_i, rg_q50_j, rg_q50_k, rg_q50_l, rg_q50_m, rg_q50_n, rg_q50_o, rg_q50_p, rg_q51, rg_q52
                , rg_q53, rg_q54, rg_q55_a, rg_q55_b, rg_q55_c, rg_q55_d, rg_q55_e, rg_q55_f, rg_q55_g, rg_q55_h, rg_q55_i, rg_q55_j
                , rg_q55_k, rg_q55_l, rg_q56, rg_q58, rg_q60, rg_q62, rg_q42_a, rg_q42_b, rg_q42_b_a, rg_q42_b_b, rg_q42_b_c, rg_q42_b_d, rg_q57_a
                , rg_q59_a, rg_q61_a, rg_q63_a;


    RadioButton  rb_q20, rb_q21_a, rb_q21_b, rb_q21_c, rb_q21_d, rb_q21_e, rb_q21_f, rb_q21_g, rb_q21_h, rb_q21_i, rb_q21_j, rb_q21_k
                , rb_q21_l, rb_q21_m, rb_q21_n, rb_q21_o, rb_q21_p, rb_q21_q, rb_q21_r, rb_q21_s, rb_q21_t, rb_q21_u, rb_q21_v, rb_q21_w
                , rb_q21_x, rb_q21_y, rb_q21_z, rb_q22, rb_q23_a, rb_q23_b, rb_q23_c, rb_q23_d, rb_q23_e, rb_q23_f, rb_q23_g, rb_q23_h
                , rb_q23_i, rb_q23_j, rb_q23_k , rb_q23_l, rb_q23_m, rb_q24, rb_q25_a, rb_q25_b, rb_q25_c, rb_q25_d, rb_q25_e, rb_q25_f
                , rb_q25_g, rb_q25_h, rb_q25_i, rb_q26, rb_q28, rb_q30, rb_q33, rb_q35, rb_q36, rb_q38, rb_q39, rb_q40, rb_q41
                , rb_q43, rb_q44, rb_q45, rb_q46, rb_q47, rb_q48, rb_q49, rb_q50_a, rb_q50_b, rb_q50_c, rb_q50_d, rb_q50_e, rb_q50_f
                , rb_q50_g, rb_q50_h, rb_q50_i, rb_q50_j, rb_q50_k, rb_q50_l, rb_q50_m, rb_q50_n, rb_q50_o, rb_q50_p, rb_q51, rb_q52
                , rb_q53, rb_q54, rb_q55_a, rb_q55_b, rb_q55_c, rb_q55_d, rb_q55_e, rb_q55_f, rb_q55_g, rb_q55_h, rb_q55_i, rb_q55_j
                , rb_q55_k, rb_q55_l, rb_q56, rb_q58, rb_q60, rb_q62, rb_q42_a, rb_q42_b_a, rb_q42_b_b, rb_q42_b_c, rb_q42_b_d, rb_q57_a
                , rb_q59_a, rb_q61_a, rb_q63_a;

    LinearLayout ll_q21, ll_q22, ll_q23_q32, ll_q57, ll_q59, ll_q61, ll_q63, ll_q25_q32, ll_q27, ll_q28, ll_q29, ll_q31
            , ll_q32, ll_q43, ll_q44, ll_q45, ll_q46, ll_q52, ll_q53, ll_q53_q55, ll_q54_q55, ll_q55, ll_q29_q32, ll_q42b_q47;


    Button btn_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf4b_q20, container, false);


        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        min = (calendar.get(Calendar.MINUTE));
        hour = (calendar.get(Calendar.HOUR_OF_DAY));

        ll_q21 = (LinearLayout) view.findViewById(R.id.ll_q21);
        ll_q22 = (LinearLayout) view.findViewById(R.id.ll_q22);
        ll_q23_q32 = (LinearLayout) view.findViewById(R.id.ll_q23_q32);
        /*ll_q57 = (LinearLayout) view.findViewById(R.id.ll_q57);*/
        /*ll_q59 = (LinearLayout) view.findViewById(R.id.ll_q59);*/
        /*ll_q61 = (LinearLayout) view.findViewById(R.id.ll_q61);*/
        /*ll_q63 = (LinearLayout) view.findViewById(R.id.ll_q63);*/
        ll_q25_q32 = (LinearLayout) view.findViewById(R.id.ll_q25_q32);
        ll_q27 = (LinearLayout) view.findViewById(R.id.ll_q27);
        ll_q28 = (LinearLayout) view.findViewById(R.id.ll_q28);
        ll_q29 = (LinearLayout) view.findViewById(R.id.ll_q29);
        ll_q31 = (LinearLayout) view.findViewById(R.id.ll_q31);
        ll_q32 = (LinearLayout) view.findViewById(R.id.ll_q32);
        ll_q43 = (LinearLayout) view.findViewById(R.id.ll_q43);
        ll_q44 = (LinearLayout) view.findViewById(R.id.ll_q44);
        ll_q45 = (LinearLayout) view.findViewById(R.id.ll_q45);
        ll_q46 = (LinearLayout) view.findViewById(R.id.ll_q46);
        ll_q52 = (LinearLayout) view.findViewById(R.id.ll_q52);
        ll_q53 = (LinearLayout) view.findViewById(R.id.ll_q53);
        ll_q53_q55 = (LinearLayout) view.findViewById(R.id.ll_q53_q55);
        ll_q54_q55 = (LinearLayout) view.findViewById(R.id.ll_q54_q55);
        ll_q55 = (LinearLayout) view.findViewById(R.id.ll_q55);
        ll_q29_q32 = (LinearLayout) view.findViewById(R.id.ll_q29_q32);
        ll_q42b_q47 = (LinearLayout) view.findViewById(R.id.ll_q42b_q47);

        et_q21_z = (EditText) view.findViewById(R.id.et_q21_z);
        et_q31_a = (EditText) view.findViewById(R.id.et_q31);
        et_q32_a = (EditText) view.findViewById(R.id.et_q32_a);
        et_q32_b = (EditText) view.findViewById(R.id.et_q32_b);
        et_q50_p = (EditText) view.findViewById(R.id.et_q50_p);
        et_q55_l = (EditText) view.findViewById(R.id.et_q55_l);
        et_q27_a = (EditText) view.findViewById(R.id.et_q27_a);
        et_q27_b = (EditText) view.findViewById(R.id.et_q27_b);
        et_q27_c = (EditText) view.findViewById(R.id.et_q27_c);
        et_q27_d = (EditText) view.findViewById(R.id.et_q27_d);
        et_q27_e = (EditText) view.findViewById(R.id.et_q27_e);
        et_q27_f = (EditText) view.findViewById(R.id.et_q27_f);
        et_q29_a = (EditText) view.findViewById(R.id.et_q29_a);
        et_q29_b = (EditText) view.findViewById(R.id.et_q29_b);
        et_q29_c = (EditText) view.findViewById(R.id.et_q29_c);
        et_q29_d = (EditText) view.findViewById(R.id.et_q29_d);
        et_q29_e = (EditText) view.findViewById(R.id.et_q29_e);
        et_q29_f = (EditText) view.findViewById(R.id.et_q29_f);
        et_q23_g = (EditText) view.findViewById(R.id.et_q23_g);
        et_q23_h = (EditText) view.findViewById(R.id.et_q23_h);
        et_q25_i = (EditText) view.findViewById(R.id.et_q25_i);

        scrolView = (ScrollView) view.findViewById(R.id.scrolView);


        rg_q20 = (RadioGroup) view.findViewById(R.id.rg_q20);
        rg_q21_a = (RadioGroup) view.findViewById(R.id.rg_q21_a);
        rg_q21_b = (RadioGroup) view.findViewById(R.id.rg_q21_b);
        rg_q21_c = (RadioGroup) view.findViewById(R.id.rg_q21_c);
        rg_q21_d = (RadioGroup) view.findViewById(R.id.rg_q21_d);
        rg_q21_e = (RadioGroup) view.findViewById(R.id.rg_q21_e);
        rg_q21_f = (RadioGroup) view.findViewById(R.id.rg_q21_f);
        rg_q21_g = (RadioGroup) view.findViewById(R.id.rg_q21_g);
        rg_q21_h = (RadioGroup) view.findViewById(R.id.rg_q21_h);
        rg_q21_i = (RadioGroup) view.findViewById(R.id.rg_q21_i);
        rg_q21_j = (RadioGroup) view.findViewById(R.id.rg_q21_j);
        rg_q21_k = (RadioGroup) view.findViewById(R.id.rg_q21_k);
        rg_q21_l = (RadioGroup) view.findViewById(R.id.rg_q21_l);
        rg_q21_m = (RadioGroup) view.findViewById(R.id.rg_q21_m);
        rg_q21_n = (RadioGroup) view.findViewById(R.id.rg_q21_n);
        rg_q21_o = (RadioGroup) view.findViewById(R.id.rg_q21_o);
        rg_q21_p = (RadioGroup) view.findViewById(R.id.rg_q21_p);
        rg_q21_q = (RadioGroup) view.findViewById(R.id.rg_q21_q);
        rg_q21_r = (RadioGroup) view.findViewById(R.id.rg_q21_r);
        rg_q21_s = (RadioGroup) view.findViewById(R.id.rg_q21_s);
        rg_q21_t = (RadioGroup) view.findViewById(R.id.rg_q21_t);
        rg_q21_u = (RadioGroup) view.findViewById(R.id.rg_q21_u);
        rg_q21_v = (RadioGroup) view.findViewById(R.id.rg_q21_v);
        rg_q21_w = (RadioGroup) view.findViewById(R.id.rg_q21_w);
        rg_q21_x = (RadioGroup) view.findViewById(R.id.rg_q21_x);
        rg_q21_y = (RadioGroup) view.findViewById(R.id.rg_q21_y);
        rg_q21_z = (RadioGroup) view.findViewById(R.id.rg_q21_z);
        rg_q22 = (RadioGroup) view.findViewById(R.id.rg_q22);
        rg_q23_a = (RadioGroup) view.findViewById(R.id.rg_q23_a);
        rg_q23_b = (RadioGroup) view.findViewById(R.id.rg_q23_b);
        rg_q23_c = (RadioGroup) view.findViewById(R.id.rg_q23_c);
        rg_q23_d = (RadioGroup) view.findViewById(R.id.rg_q23_d);
        rg_q23_e = (RadioGroup) view.findViewById(R.id.rg_q23_e);
        rg_q23_f = (RadioGroup) view.findViewById(R.id.rg_q23_f);
        rg_q23_g = (RadioGroup) view.findViewById(R.id.rg_q23_g);
        rg_q23_h = (RadioGroup) view.findViewById(R.id.rg_q23_h);
        rg_q23_i = (RadioGroup) view.findViewById(R.id.rg_q23_i);
        rg_q23_j = (RadioGroup) view.findViewById(R.id.rg_q23_j);
        rg_q23_k = (RadioGroup) view.findViewById(R.id.rg_q23_k);
        rg_q23_l = (RadioGroup) view.findViewById(R.id.rg_q23_l);
        rg_q23_m = (RadioGroup) view.findViewById(R.id.rg_q23_m);
        rg_q24 = (RadioGroup) view.findViewById(R.id.rg_q24);
        rg_q25_a = (RadioGroup) view.findViewById(R.id.rg_q25_a);
        rg_q25_b = (RadioGroup) view.findViewById(R.id.rg_q25_b);
        rg_q25_c = (RadioGroup) view.findViewById(R.id.rg_q25_c);
        rg_q25_d = (RadioGroup) view.findViewById(R.id.rg_q25_d);
        rg_q25_e = (RadioGroup) view.findViewById(R.id.rg_q25_e);
        rg_q25_f = (RadioGroup) view.findViewById(R.id.rg_q25_f);
        rg_q25_g = (RadioGroup) view.findViewById(R.id.rg_q25_g);
        rg_q25_h = (RadioGroup) view.findViewById(R.id.rg_q25_h);
        rg_q25_i = (RadioGroup) view.findViewById(R.id.rg_q25_i);
        rg_q26 = (RadioGroup) view.findViewById(R.id.rg_q26);
        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);
        rg_q30 = (RadioGroup) view.findViewById(R.id.rg_q30);
        rg_q33 = (RadioGroup) view.findViewById(R.id.rg_q33);
        rg_q35 = (RadioGroup) view.findViewById(R.id.rg_q35);
        rg_q36 = (RadioGroup) view.findViewById(R.id.rg_q36);
        rg_q38 = (RadioGroup) view.findViewById(R.id.rg_q38);
        rg_q39 = (RadioGroup) view.findViewById(R.id.rg_q39);
        rg_q40 = (RadioGroup) view.findViewById(R.id.rg_q40);
        rg_q41 = (RadioGroup) view.findViewById(R.id.rg_q41);
        rg_q43 = (RadioGroup) view.findViewById(R.id.rg_q43);
        rg_q44 = (RadioGroup) view.findViewById(R.id.rg_q44);
        rg_q45 = (RadioGroup) view.findViewById(R.id.rg_q45);
        rg_q46 = (RadioGroup) view.findViewById(R.id.rg_q46);
        rg_q47 = (RadioGroup) view.findViewById(R.id.rg_q47);
        rg_q48 = (RadioGroup) view.findViewById(R.id.rg_q48);
        rg_q49 = (RadioGroup) view.findViewById(R.id.rg_q49);
        rg_q50_a = (RadioGroup) view.findViewById(R.id.rg_q50_a);
        rg_q50_b = (RadioGroup) view.findViewById(R.id.rg_q50_b);
        rg_q50_c = (RadioGroup) view.findViewById(R.id.rg_q50_c);
        rg_q50_d = (RadioGroup) view.findViewById(R.id.rg_q50_d);
        rg_q50_e = (RadioGroup) view.findViewById(R.id.rg_q50_e);
        rg_q50_f = (RadioGroup) view.findViewById(R.id.rg_q50_f);
        rg_q50_g = (RadioGroup) view.findViewById(R.id.rg_q50_g);
        rg_q50_h = (RadioGroup) view.findViewById(R.id.rg_q50_h);
        rg_q50_i = (RadioGroup) view.findViewById(R.id.rg_q50_i);
        rg_q50_j = (RadioGroup) view.findViewById(R.id.rg_q50_j);
        rg_q50_k = (RadioGroup) view.findViewById(R.id.rg_q50_k);
        rg_q50_l = (RadioGroup) view.findViewById(R.id.rg_q50_l);
        rg_q50_m = (RadioGroup) view.findViewById(R.id.rg_q50_m);
        rg_q50_n = (RadioGroup) view.findViewById(R.id.rg_q50_n);
        rg_q50_o = (RadioGroup) view.findViewById(R.id.rg_q50_o);
        rg_q50_p = (RadioGroup) view.findViewById(R.id.rg_q50_p);
        rg_q51 = (RadioGroup) view.findViewById(R.id.rg_q51);
        rg_q52 = (RadioGroup) view.findViewById(R.id.rg_q52);
        rg_q53 = (RadioGroup) view.findViewById(R.id.rg_q53);
        rg_q54 = (RadioGroup) view.findViewById(R.id.rg_q54);
        rg_q55_a = (RadioGroup) view.findViewById(R.id.rg_q55_a);
        rg_q55_b = (RadioGroup) view.findViewById(R.id.rg_q55_b);
        rg_q55_c = (RadioGroup) view.findViewById(R.id.rg_q55_c);
        rg_q55_d = (RadioGroup) view.findViewById(R.id.rg_q55_d);
        rg_q55_e = (RadioGroup) view.findViewById(R.id.rg_q55_e);
        rg_q55_f = (RadioGroup) view.findViewById(R.id.rg_q55_f);
        rg_q55_g = (RadioGroup) view.findViewById(R.id.rg_q55_g);
        rg_q55_h = (RadioGroup) view.findViewById(R.id.rg_q55_h);
        rg_q55_i = (RadioGroup) view.findViewById(R.id.rg_q55_i);
        rg_q55_j = (RadioGroup) view.findViewById(R.id.rg_q55_j);
        rg_q55_k = (RadioGroup) view.findViewById(R.id.rg_q55_k);
        rg_q55_l = (RadioGroup) view.findViewById(R.id.rg_q55_l);
        rg_q56 = (RadioGroup) view.findViewById(R.id.rg_q56);
        rg_q58 = (RadioGroup) view.findViewById(R.id.rg_q58);
        rg_q60 = (RadioGroup) view.findViewById(R.id.rg_q60);
        rg_q62 = (RadioGroup) view.findViewById(R.id.rg_q62);
        rg_q42_a = (RadioGroup) view.findViewById(R.id.rg_q42_a);
        rg_q42_b_a = (RadioGroup) view.findViewById(R.id.rg_q42_b_a);
        rg_q42_b_b = (RadioGroup) view.findViewById(R.id.rg_q42_b_b);
        rg_q42_b_c = (RadioGroup) view.findViewById(R.id.rg_q42_b_c);
        rg_q42_b_d = (RadioGroup) view.findViewById(R.id.rg_q42_b_d);
        /*rg_q57_a = (RadioGroup) view.findViewById(R.id.rg_q57_a);
        rg_q59_a = (RadioGroup) view.findViewById(R.id.rg_q59_a);
        rg_q61_a = (RadioGroup) view.findViewById(R.id.rg_q61_a);
        rg_q63_a = (RadioGroup) view.findViewById(R.id.rg_q63_a);
*/
        // rg_q42_b = (RadioGroup) view.findViewById(R.id.rg_q42_b);


        tv_q20 = (TextView) view.findViewById(R.id.tv_q20);
        tv_q21_a = (TextView) view.findViewById(R.id.tv_q21_a);
        tv_q21_b = (TextView) view.findViewById(R.id.tv_q21_b);
        tv_q21_c = (TextView) view.findViewById(R.id.tv_q21_c);
        tv_q21_d = (TextView) view.findViewById(R.id.tv_q21_d);
        tv_q21_e = (TextView) view.findViewById(R.id.tv_q21_e);
        tv_q21_f = (TextView) view.findViewById(R.id.tv_q21_f);
        tv_q21_g = (TextView) view.findViewById(R.id.tv_q21_g);
        tv_q21_h = (TextView) view.findViewById(R.id.tv_q21_h);
        tv_q21_i = (TextView) view.findViewById(R.id.tv_q21_i);
        tv_q21_j = (TextView) view.findViewById(R.id.tv_q21_j);
        tv_q21_k = (TextView) view.findViewById(R.id.tv_q21_k);
        tv_q21_l = (TextView) view.findViewById(R.id.tv_q21_l);
        tv_q21_m = (TextView) view.findViewById(R.id.tv_q21_m);
        tv_q21_n = (TextView) view.findViewById(R.id.tv_q21_n);
        tv_q21_o = (TextView) view.findViewById(R.id.tv_q21_o);
        tv_q21_p = (TextView) view.findViewById(R.id.tv_q21_p);
        tv_q21_q = (TextView) view.findViewById(R.id.tv_q21_q);
        tv_q21_r = (TextView) view.findViewById(R.id.tv_q21_r);
        tv_q21_s = (TextView) view.findViewById(R.id.tv_q21_s);
        tv_q21_t = (TextView) view.findViewById(R.id.tv_q21_t);
        tv_q21_u = (TextView) view.findViewById(R.id.tv_q21_u);
        tv_q21_v = (TextView) view.findViewById(R.id.tv_q21_v);
        tv_q21_w = (TextView) view.findViewById(R.id.tv_q21_w);
        tv_q21_x = (TextView) view.findViewById(R.id.tv_q21_x);
        tv_q21_y = (TextView) view.findViewById(R.id.tv_q21_y);
        tv_q21_z = (TextView) view.findViewById(R.id.tv_q21_z);
        tv_q22 = (TextView) view.findViewById(R.id.tv_q22);
        tv_q23_a = (TextView) view.findViewById(R.id.tv_q23_a);
        tv_q23_b = (TextView) view.findViewById(R.id.tv_q23_b);
        tv_q23_c = (TextView) view.findViewById(R.id.tv_q23_c);
        tv_q23_d = (TextView) view.findViewById(R.id.tv_q23_d);
        tv_q23_e = (TextView) view.findViewById(R.id.tv_q23_e);
        tv_q23_f = (TextView) view.findViewById(R.id.tv_q23_f);
        tv_q23_g = (TextView) view.findViewById(R.id.tv_q23_g);
        tv_q23_h = (TextView) view.findViewById(R.id.tv_q23_h);
        tv_q23_i = (TextView) view.findViewById(R.id.tv_q23_i);
        tv_q23_j = (TextView) view.findViewById(R.id.tv_q23_j);
        tv_q23_k = (TextView) view.findViewById(R.id.tv_q23_k);
        tv_q23_l = (TextView) view.findViewById(R.id.tv_q23_l);
        tv_q23_m = (TextView) view.findViewById(R.id.tv_q23_m);
        tv_q24 = (TextView) view.findViewById(R.id.tv_q24);
        tv_q25_a = (TextView) view.findViewById(R.id.tv_q25_a);
        tv_q25_b = (TextView) view.findViewById(R.id.tv_q25_b);
        tv_q25_c = (TextView) view.findViewById(R.id.tv_q25_c);
        tv_q25_d = (TextView) view.findViewById(R.id.tv_q25_d);
        tv_q25_e = (TextView) view.findViewById(R.id.tv_q25_e);
        tv_q25_f = (TextView) view.findViewById(R.id.tv_q25_f);
        tv_q25_g = (TextView) view.findViewById(R.id.tv_q25_g);
        tv_q25_h = (TextView) view.findViewById(R.id.tv_q25_h);
        tv_q25_i = (TextView) view.findViewById(R.id.tv_q25_i);
        tv_q26 = (TextView) view.findViewById(R.id.tv_q26);
        tv_q27 = (TextView) view.findViewById(R.id.tv_q27);
        tv_q28 = (TextView) view.findViewById(R.id.tv_q28);
        tv_q29 = (TextView) view.findViewById(R.id.tv_q29);
        tv_q30 = (TextView) view.findViewById(R.id.tv_q30);
        tv_q31 = (TextView) view.findViewById(R.id.tv_q31);
        tv_q32 = (TextView) view.findViewById(R.id.tv_q32);
        tv_q33 = (TextView) view.findViewById(R.id.tv_q33);
        tv_q35 = (TextView) view.findViewById(R.id.tv_q35);
        tv_q36 = (TextView) view.findViewById(R.id.tv_q36);
        tv_q38 = (TextView) view.findViewById(R.id.tv_q38);
        tv_q39 = (TextView) view.findViewById(R.id.tv_q39);
        tv_q40 = (TextView) view.findViewById(R.id.tv_q40);
        tv_q41 = (TextView) view.findViewById(R.id.tv_q41);
        tv_q43 = (TextView) view.findViewById(R.id.tv_q43);
        tv_q44 = (TextView) view.findViewById(R.id.tv_q44);
        tv_q45 = (TextView) view.findViewById(R.id.tv_q45);
        tv_q46 = (TextView) view.findViewById(R.id.tv_q46);
        tv_q47 = (TextView) view.findViewById(R.id.tv_q47);
        tv_q48 = (TextView) view.findViewById(R.id.tv_q48);
        tv_q49 = (TextView) view.findViewById(R.id.tv_q49);
        tv_q50_a = (TextView) view.findViewById(R.id.tv_q50_a);
        tv_q50_b = (TextView) view.findViewById(R.id.tv_q50_b);
        tv_q50_c = (TextView) view.findViewById(R.id.tv_q50_c);
        tv_q50_d = (TextView) view.findViewById(R.id.tv_q50_d);
        tv_q50_e = (TextView) view.findViewById(R.id.tv_q50_e);
        tv_q50_f = (TextView) view.findViewById(R.id.tv_q50_f);
        tv_q50_g = (TextView) view.findViewById(R.id.tv_q50_g);
        tv_q50_h = (TextView) view.findViewById(R.id.tv_q50_h);
        tv_q50_i = (TextView) view.findViewById(R.id.tv_q50_i);
        tv_q50_j = (TextView) view.findViewById(R.id.tv_q50_j);
        tv_q50_k = (TextView) view.findViewById(R.id.tv_q50_k);
        tv_q50_l = (TextView) view.findViewById(R.id.tv_q50_l);
        tv_q50_m = (TextView) view.findViewById(R.id.tv_q50_m);
        tv_q50_n = (TextView) view.findViewById(R.id.tv_q50_n);
        tv_q50_o = (TextView) view.findViewById(R.id.tv_q50_o);
        tv_q50_p = (TextView) view.findViewById(R.id.tv_q50_p);
        tv_q51 = (TextView) view.findViewById(R.id.tv_q51);
        tv_q52 = (TextView) view.findViewById(R.id.tv_q52);
        tv_q53 = (TextView) view.findViewById(R.id.tv_q53);
        tv_q54 = (TextView) view.findViewById(R.id.tv_q54);
        tv_q55_a = (TextView) view.findViewById(R.id.tv_q55_a);
        tv_q55_b = (TextView) view.findViewById(R.id.tv_q55_b);
        tv_q55_c = (TextView) view.findViewById(R.id.tv_q55_c);
        tv_q55_d = (TextView) view.findViewById(R.id.tv_q55_d);
        tv_q55_e = (TextView) view.findViewById(R.id.tv_q55_e);
        tv_q55_f = (TextView) view.findViewById(R.id.tv_q55_f);
        tv_q55_g = (TextView) view.findViewById(R.id.tv_q55_g);
        tv_q55_h = (TextView) view.findViewById(R.id.tv_q55_h);
        tv_q55_i = (TextView) view.findViewById(R.id.tv_q55_i);
        tv_q55_j = (TextView) view.findViewById(R.id.tv_q55_j);
        tv_q55_k = (TextView) view.findViewById(R.id.tv_q55_k);
        tv_q55_l = (TextView) view.findViewById(R.id.tv_q55_l);
        tv_q56 = (TextView) view.findViewById(R.id.tv_q56);
        tv_q58 = (TextView) view.findViewById(R.id.tv_q58);
        tv_q60 = (TextView) view.findViewById(R.id.tv_q60);
        tv_q62 = (TextView) view.findViewById(R.id.tv_q62);
        tv_q42 = (TextView) view.findViewById(R.id.tv_q42);
        tv_q42_b = (TextView) view.findViewById(R.id.tv_q42);
        tv_q42_b_a = (TextView) view.findViewById(R.id.tv_q42_b_a);
        tv_q42_b_b = (TextView) view.findViewById(R.id.tv_q42_b_b);
        tv_q42_b_c = (TextView) view.findViewById(R.id.tv_q42_b_c);
        tv_q42_b_d = (TextView) view.findViewById(R.id.tv_q42_b_d);
        //tv_q57_a = (TextView) view.findViewById(R.id.tv_q57_a);
       /* tv_q57_a_date = (TextView) view.findViewById(R.id.tv_q57_a_date);
        tv_q59_a_date = (TextView) view.findViewById(R.id.tv_q59_a_date);
        tv_q61_a_date = (TextView) view.findViewById(R.id.tv_q61_a_date);
        tv_q63_a_date = (TextView) view.findViewById(R.id.tv_q63_a_date);*/

        btn_submit = (Button) view.findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation()){

                    if(CRF4aActivity.followupDetails.getArm().equals("a")){

                        Crf4aCounselingQ79 fragment = new Crf4aCounselingQ79();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                        fragmentTransaction.commit();


                    }else {


                        Crf5aQ26Fragment fragment = new Crf5aQ26Fragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layout4a, fragment);
                        fragmentTransaction.commit();


                        //startActivity(new Intent(getActivity(), CRF4And5Dashboard.class));
                        //getActivity().finish();
                    }

                }

            }
        });


        rg_q20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q20 = (RadioButton)  view.findViewById(rg_q20.getCheckedRadioButtonId());

                if(rb_q20.getTag().toString().equals("2") || rb_q20.getTag().toString().equals("9")){

                    ll_q21.setVisibility(View.GONE);

                }else {

                    ll_q21.setVisibility(View.VISIBLE);
                }

            }
        });


        rg_q21_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_a = (RadioButton)  view.findViewById(rg_q21_a.getCheckedRadioButtonId());

            }
        });


        rg_q21_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_b = (RadioButton)  view.findViewById(rg_q21_b.getCheckedRadioButtonId());

            }
        });


        rg_q21_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_c = (RadioButton)  view.findViewById(rg_q21_c.getCheckedRadioButtonId());

            }
        });


        rg_q21_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_d = (RadioButton)  view.findViewById(rg_q21_d.getCheckedRadioButtonId());

            }
        });

        rg_q21_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_e = (RadioButton)  view.findViewById(rg_q21_e.getCheckedRadioButtonId());

            }
        });


        rg_q21_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_f = (RadioButton)  view.findViewById(rg_q21_f.getCheckedRadioButtonId());

            }
        });

        rg_q21_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_g = (RadioButton)  view.findViewById(rg_q21_g.getCheckedRadioButtonId());

            }
        });

        rg_q21_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_h = (RadioButton)  view.findViewById(rg_q21_h.getCheckedRadioButtonId());

            }
        });

        rg_q21_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_i = (RadioButton)  view.findViewById(rg_q21_i.getCheckedRadioButtonId());

            }
        });

        rg_q21_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_j = (RadioButton)  view.findViewById(rg_q21_j.getCheckedRadioButtonId());

            }
        });

        rg_q21_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_k = (RadioButton)  view.findViewById(rg_q21_k.getCheckedRadioButtonId());

            }
        });

        rg_q21_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_l = (RadioButton)  view.findViewById(rg_q21_l.getCheckedRadioButtonId());


            }
        });

        rg_q21_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_m = (RadioButton)  view.findViewById(rg_q21_m.getCheckedRadioButtonId());


            }
        });

        rg_q21_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_n = (RadioButton)  view.findViewById(rg_q21_n.getCheckedRadioButtonId());


            }
        });

        rg_q21_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_o = (RadioButton)  view.findViewById(rg_q21_o.getCheckedRadioButtonId());


            }
        });

        rg_q21_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_p = (RadioButton)  view.findViewById(rg_q21_p.getCheckedRadioButtonId());


            }
        });

        rg_q21_q.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_q = (RadioButton)  view.findViewById(rg_q21_q.getCheckedRadioButtonId());


            }
        });

        rg_q21_r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_r = (RadioButton)  view.findViewById(rg_q21_r.getCheckedRadioButtonId());


            }
        });

        rg_q21_s.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_s = (RadioButton)  view.findViewById(rg_q21_s.getCheckedRadioButtonId());

            }
        });

        rg_q21_t.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_t = (RadioButton)  view.findViewById(rg_q21_t.getCheckedRadioButtonId());

            }
        });

        rg_q21_u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_u = (RadioButton)  view.findViewById(rg_q21_u.getCheckedRadioButtonId());

            }
        });

        rg_q21_v.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_v = (RadioButton)  view.findViewById(rg_q21_v.getCheckedRadioButtonId());

            }
        });

        rg_q21_w.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_w = (RadioButton)  view.findViewById(rg_q21_w.getCheckedRadioButtonId());


            }
        });

        rg_q21_x.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_x = (RadioButton)  view.findViewById(rg_q21_x.getCheckedRadioButtonId());

            }
        });


        rg_q21_y.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_y = (RadioButton)  view.findViewById(rg_q21_y.getCheckedRadioButtonId());


            }
        });

        rg_q21_z.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q21_z = (RadioButton)  view.findViewById(rg_q21_z.getCheckedRadioButtonId());

                if(rb_q21_z.getTag().toString().equals("1")){

                    et_q21_z.setVisibility(View.VISIBLE);
                    ///
                }else {

                    et_q21_z.setVisibility(View.GONE);
                }


            }
        });

        rg_q22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q22 = (RadioButton)  view.findViewById(rg_q22.getCheckedRadioButtonId());

                if(rb_q22.getTag().toString().equals("2") || rb_q22.getTag().toString().equals("9")){

                    ll_q23_q32.setVisibility(View.GONE);

                }else {

                    ll_q23_q32.setVisibility(View.VISIBLE);

                }

            }
        });

        rg_q23_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_a = (RadioButton)  view.findViewById(rg_q23_a.getCheckedRadioButtonId());


            }
        });

        rg_q23_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_b = (RadioButton)  view.findViewById(rg_q23_b.getCheckedRadioButtonId());

            }
        });

        rg_q23_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_c = (RadioButton)  view.findViewById(rg_q23_c.getCheckedRadioButtonId());

            }
        });

        rg_q23_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_d = (RadioButton)  view.findViewById(rg_q23_d.getCheckedRadioButtonId());


            }
        });

        rg_q23_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_e = (RadioButton)  view.findViewById(rg_q23_e.getCheckedRadioButtonId());


            }
        });

        rg_q23_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_f = (RadioButton)  view.findViewById(rg_q23_f.getCheckedRadioButtonId());


            }
        });

        rg_q23_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_g = (RadioButton)  view.findViewById(rg_q23_g.getCheckedRadioButtonId());

                if(rb_q23_g.getTag().toString().equals("1")){

                    et_q23_g.setVisibility(View.VISIBLE);
                }else {

                    et_q23_g.setVisibility(View.GONE);
                }


            }
        });

        rg_q23_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_h = (RadioButton)  view.findViewById(rg_q23_h.getCheckedRadioButtonId());


            }
        });


        rg_q23_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_i = (RadioButton)  view.findViewById(rg_q23_i.getCheckedRadioButtonId());


            }
        });


        rg_q23_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_j = (RadioButton)  view.findViewById(rg_q23_j.getCheckedRadioButtonId());


            }
        });


        rg_q23_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_k = (RadioButton)  view.findViewById(rg_q23_k.getCheckedRadioButtonId());


            }
        });

        rg_q23_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_l = (RadioButton)  view.findViewById(rg_q23_l.getCheckedRadioButtonId());


            }
        });

        rg_q23_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q23_m = (RadioButton)  view.findViewById(rg_q23_m.getCheckedRadioButtonId());


            }
        });

        rg_q24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q24 = (RadioButton)  view.findViewById(rg_q24.getCheckedRadioButtonId());

                if(rb_q24.getTag().toString().equals("2") || rb_q24.getTag().toString().equals("9")){

                    ll_q25_q32.setVisibility(View.GONE);

                }else {

                    ll_q25_q32.setVisibility(View.VISIBLE);

                }

            }
        });

        rg_q25_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_a = (RadioButton)  view.findViewById(rg_q25_a.getCheckedRadioButtonId());


            }
        });


        rg_q25_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_b = (RadioButton)  view.findViewById(rg_q25_b.getCheckedRadioButtonId());


            }
        });

        rg_q25_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_c = (RadioButton)  view.findViewById(rg_q25_c.getCheckedRadioButtonId());


            }
        });

        rg_q25_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_d = (RadioButton)  view.findViewById(rg_q25_d.getCheckedRadioButtonId());

            }
        });

        rg_q25_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_e = (RadioButton)  view.findViewById(rg_q25_e.getCheckedRadioButtonId());
            }
        });

        rg_q25_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_f = (RadioButton)  view.findViewById(rg_q25_f.getCheckedRadioButtonId());


            }
        });

        rg_q25_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_g = (RadioButton)  view.findViewById(rg_q25_g.getCheckedRadioButtonId());


            }
        });

        rg_q25_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_h = (RadioButton)  view.findViewById(rg_q25_h.getCheckedRadioButtonId());


            }
        });

        rg_q25_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q25_i = (RadioButton)  view.findViewById(rg_q25_i.getCheckedRadioButtonId());

                if(rb_q25_i.getTag().toString().equals("1")){

                    et_q25_i.setVisibility(View.VISIBLE);
                }else {


                    et_q25_i.setVisibility(View.GONE);

                }


            }
        });

        rg_q26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q26 = (RadioButton)  view.findViewById(rg_q26.getCheckedRadioButtonId());

                if(rb_q26.getTag().toString().equals("2")){

                    ll_q27.setVisibility(View.GONE);
                    ll_q28.setVisibility(View.VISIBLE);
                    ll_q29.setVisibility(View.VISIBLE);
                }else {
                    ll_q27.setVisibility(View.VISIBLE);
                    ll_q28.setVisibility(View.GONE);
                    ll_q29.setVisibility(View.GONE);
                }


            }
        });

        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q28 = (RadioButton)  view.findViewById(rg_q28.getCheckedRadioButtonId());

                if(rb_q28.getTag().toString().equals("2")){

                    ll_q29_q32.setVisibility(View.GONE);
                }else {
                    ll_q29_q32.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q30 = (RadioButton)  view.findViewById(rg_q30.getCheckedRadioButtonId());

                if(rb_q30.getTag().toString().equals("2")){

                    ll_q31.setVisibility(View.GONE);
                    ll_q32.setVisibility(View.GONE);

                }else {

                    ll_q31.setVisibility(View.VISIBLE);
                    ll_q32.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q33 = (RadioButton)  view.findViewById(rg_q33.getCheckedRadioButtonId());


            }
        });

        rg_q35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q35 = (RadioButton)  view.findViewById(rg_q35.getCheckedRadioButtonId());


            }
        });

        rg_q36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q36 = (RadioButton)  view.findViewById(rg_q36.getCheckedRadioButtonId());


            }
        });

        rg_q38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q38 = (RadioButton)  view.findViewById(rg_q38.getCheckedRadioButtonId());


            }
        });

        rg_q39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q39 = (RadioButton)  view.findViewById(rg_q39.getCheckedRadioButtonId());


            }
        });

        rg_q40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q40 = (RadioButton)  view.findViewById(rg_q40.getCheckedRadioButtonId());


            }
        });

        rg_q41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q41 = (RadioButton)  view.findViewById(rg_q41.getCheckedRadioButtonId());


            }
        });

        rg_q42_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q42_a = (RadioButton) view.findViewById(rg_q42_a.getCheckedRadioButtonId());

                if(rb_q42_a.getTag().toString().equals("4")){

                    ll_q42b_q47.setVisibility(View.GONE);

                }else {

                    ll_q42b_q47.setVisibility(View.VISIBLE);

                }

            }
        });


        rg_q42_b_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q42_b_a = (RadioButton) view.findViewById(rg_q42_b_a.getCheckedRadioButtonId());

                if(rb_q42_b_a.getTag().toString().equals("2")){

                    ll_q43.setVisibility(View.VISIBLE);

                }else {

                    ll_q43.setVisibility(View.GONE);
                }

                if(rb_q42_b_a.getTag().toString().equalsIgnoreCase("3") ){

                    a = true;

                }else {
                    a = false;
                }

            }
        });



        rg_q42_b_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q42_b_b = (RadioButton) view.findViewById(rg_q42_b_b.getCheckedRadioButtonId());

                if(rb_q42_b_b.getTag().toString().equals("2")){

                    ll_q44.setVisibility(View.VISIBLE);

                }else {

                    ll_q44.setVisibility(View.GONE);
                }

                if(rb_q42_b_b.getTag().toString().equalsIgnoreCase("3") ){
                    b = true;

                }else {
                    b = false;
                }

            }
        });


        rg_q42_b_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q42_b_c = (RadioButton) view.findViewById(rg_q42_b_c.getCheckedRadioButtonId());



                if(rb_q42_b_c.getTag().toString().equals("2") || rb_q42_b_c.getTag().toString().equals("3") ){

                    q45 = true;


                }else {

                    q45 = false;

                }




                if(rb_q42_b_c.getTag().toString().equals("3")){

                    c1 = true;
                }else {
                    c1 = false;
                }


            }
        });

        rg_q42_b_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q42_b_d = (RadioButton) view.findViewById(rg_q42_b_d.getCheckedRadioButtonId());



                if(rb_q42_b_d.getTag().toString().equals("2") || rb_q42_b_d.getTag().toString().equals("3") ){

                    q45 = true;


                }else {

                    q45 = false;

                }



                if(rb_q42_b_d.getTag().equals("3")){

                    d = true;
                }else {
                    d = false;
                }


                if(q45){

                    ll_q45.setVisibility(View.VISIBLE);

                }else {
                    ll_q45.setVisibility(View.GONE);
                }


                if(a && b && c1 && d){
                    ll_q46.setVisibility(View.VISIBLE);
                }else {
                    ll_q46.setVisibility(View.GONE);
                }


            }
        });



        rg_q43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q43 = (RadioButton)  view.findViewById(rg_q43.getCheckedRadioButtonId());


            }
        });

        rg_q44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q44 = (RadioButton)  view.findViewById(rg_q44.getCheckedRadioButtonId());


            }
        });

        rg_q45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q45 = (RadioButton)  view.findViewById(rg_q45.getCheckedRadioButtonId());


            }
        });

        rg_q46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q46 = (RadioButton)  view.findViewById(rg_q46.getCheckedRadioButtonId());


            }
        });

        rg_q47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q47 = (RadioButton)  view.findViewById(rg_q47.getCheckedRadioButtonId());


            }
        });

        rg_q48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q48 = (RadioButton)  view.findViewById(rg_q48.getCheckedRadioButtonId());


            }
        });

        rg_q49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q49 = (RadioButton)  view.findViewById(rg_q49.getCheckedRadioButtonId());


            }
        });

        rg_q50_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_a = (RadioButton)  view.findViewById(rg_q50_a.getCheckedRadioButtonId());


            }
        });

        rg_q50_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_b = (RadioButton)  view.findViewById(rg_q50_b.getCheckedRadioButtonId());


            }
        });

        rg_q50_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_c = (RadioButton)  view.findViewById(rg_q50_c.getCheckedRadioButtonId());


            }
        });

        rg_q50_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_d = (RadioButton)  view.findViewById(rg_q50_d.getCheckedRadioButtonId());


            }
        });

        rg_q50_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_e = (RadioButton)  view.findViewById(rg_q50_e.getCheckedRadioButtonId());


            }
        });

        rg_q50_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_f = (RadioButton)  view.findViewById(rg_q50_f.getCheckedRadioButtonId());


            }
        });

        rg_q50_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_g = (RadioButton)  view.findViewById(rg_q50_g.getCheckedRadioButtonId());


            }
        });

        rg_q50_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_h = (RadioButton)  view.findViewById(rg_q50_h.getCheckedRadioButtonId());


            }
        });

        rg_q50_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_i = (RadioButton)  view.findViewById(rg_q50_i.getCheckedRadioButtonId());


            }
        });

        rg_q50_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_j = (RadioButton)  view.findViewById(rg_q50_j.getCheckedRadioButtonId());


            }
        });


        rg_q50_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_k = (RadioButton)  view.findViewById(rg_q50_k.getCheckedRadioButtonId());


            }
        });

        rg_q50_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_l = (RadioButton)  view.findViewById(rg_q50_l.getCheckedRadioButtonId());


            }
        });

        rg_q50_m.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_m = (RadioButton)  view.findViewById(rg_q50_m.getCheckedRadioButtonId());


            }
        });

        rg_q50_n.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_n = (RadioButton)  view.findViewById(rg_q50_n.getCheckedRadioButtonId());


            }
        });

        rg_q50_o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_o = (RadioButton)  view.findViewById(rg_q50_o.getCheckedRadioButtonId());


            }
        });


        rg_q50_p.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q50_p = (RadioButton)  view.findViewById(rg_q50_p.getCheckedRadioButtonId());

                if(rb_q50_p.getTag().toString().equals("1")){

                    et_q50_p.setVisibility(View.VISIBLE);
                }else {
                    et_q50_p.setVisibility(View.GONE);
                }

            }
        });

        rg_q51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q51 = (RadioButton)  view.findViewById(rg_q51.getCheckedRadioButtonId());

                if(rb_q51.getTag().toString().equals("1")){

                     ll_q52.setVisibility(View.GONE);
                     ll_q53.setVisibility(View.GONE);


                }else {

                    ll_q52.setVisibility(View.VISIBLE);
                    ll_q53.setVisibility(View.VISIBLE);

                   // rg_q52.check(-1);
                    //rg_q52.setOnCheckedChangeListener(null);

                   // rg_q53.check(-1);
                  //  rg_q53.setOnCheckedChangeListener(null);
                }
            }
        });

        rg_q52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q52 = (RadioButton)  view.findViewById(rg_q52.getCheckedRadioButtonId());

                if(rb_q52.getTag().toString().equals("2")){;

                    ll_q53_q55.setVisibility(View.GONE);
                }else {
                    ll_q53_q55.setVisibility(View.VISIBLE);
                }
            }
        });


        rg_q53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q53 = (RadioButton)  view.findViewById(rg_q53.getCheckedRadioButtonId());

                ll_q54_q55.setVisibility(View.GONE);


            }
        });

        rg_q54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q54 = (RadioButton)  view.findViewById(rg_q54.getCheckedRadioButtonId());

                if(rb_q54.getTag().toString().equals("1")){

                    ll_q55.setVisibility(View.GONE);

                }else {

                    ll_q55.setVisibility(View.VISIBLE);
                }

            }
        });

        rg_q55_a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_a = (RadioButton)  view.findViewById(rg_q55_a.getCheckedRadioButtonId());


            }
        });

        rg_q55_b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_b = (RadioButton)  view.findViewById(rg_q55_b.getCheckedRadioButtonId());


            }
        });

        rg_q55_c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_c = (RadioButton)  view.findViewById(rg_q55_c.getCheckedRadioButtonId());


            }
        });

        rg_q55_d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_d = (RadioButton)  view.findViewById(rg_q55_d.getCheckedRadioButtonId());


            }
        });

        rg_q55_e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_e = (RadioButton)  view.findViewById(rg_q55_e.getCheckedRadioButtonId());


            }
        });

        rg_q55_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_f = (RadioButton)  view.findViewById(rg_q55_f.getCheckedRadioButtonId());


            }
        });

        rg_q55_g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_g = (RadioButton)  view.findViewById(rg_q55_g.getCheckedRadioButtonId());


            }
        });

        rg_q55_h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_h = (RadioButton)  view.findViewById(rg_q55_h.getCheckedRadioButtonId());


            }
        });

        rg_q55_i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_i = (RadioButton)  view.findViewById(rg_q55_i.getCheckedRadioButtonId());


            }
        });

        rg_q55_j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_j = (RadioButton)  view.findViewById(rg_q55_j.getCheckedRadioButtonId());


            }
        });


        rg_q55_k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_k = (RadioButton)  view.findViewById(rg_q55_k.getCheckedRadioButtonId());


            }
        });

        rg_q55_l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q55_l = (RadioButton)  view.findViewById(rg_q55_l.getCheckedRadioButtonId());

                if(rb_q55_l.getTag().toString().equals("1")){

                    et_q55_l.setVisibility(View.VISIBLE);

                }else {

                    et_q55_l.setVisibility(View.GONE);

                }

            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    public boolean validation(){

        boolean validation= true;


        if (isRBCheckedThree(rg_q20, rb_q20, tv_q20).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ20(isRBCheckedThree(rg_q20, rb_q20, tv_q20));
        }

        if(ll_q21.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q21_a, rb_q21_a, tv_q21_a).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21a(isRBCheckedThree(rg_q21_a, rb_q21_a, tv_q21_a));
            }


            if (isRBCheckedThree(rg_q21_b, rb_q21_b, tv_q21_b).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21b(isRBCheckedThree(rg_q21_b, rb_q21_b, tv_q21_b));
            }

            if (isRBCheckedThree(rg_q21_c, rb_q21_c, tv_q21_c).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21c(isRBCheckedThree(rg_q21_c, rb_q21_c, tv_q21_c));
            }

            if (isRBCheckedThree(rg_q21_d, rb_q21_d, tv_q21_d).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21d(isRBCheckedThree(rg_q21_d, rb_q21_d, tv_q21_d));
            }

            if (isRBCheckedThree(rg_q21_e, rb_q21_e, tv_q21_e).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21e(isRBCheckedThree(rg_q21_e, rb_q21_e, tv_q21_e));
            }

            if (isRBCheckedThree(rg_q21_f, rb_q21_f, tv_q21_f).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21f(isRBCheckedThree(rg_q21_f, rb_q21_f, tv_q21_f));
            }

            if (isRBCheckedThree(rg_q21_g, rb_q21_g, tv_q21_g).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21g(isRBCheckedThree(rg_q21_g, rb_q21_g, tv_q21_g));
            }

            if (isRBCheckedThree(rg_q21_h, rb_q21_h, tv_q21_h).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21h(isRBCheckedThree(rg_q21_h, rb_q21_h, tv_q21_h));
            }

            if (isRBCheckedThree(rg_q21_i, rb_q21_i, tv_q21_i).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21i(isRBCheckedThree(rg_q21_i, rb_q21_i, tv_q21_i));
            }

            if (isRBCheckedThree(rg_q21_j, rb_q21_j, tv_q21_j).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21j(isRBCheckedThree(rg_q21_j, rb_q21_j, tv_q21_j));
            }

            if (isRBCheckedThree(rg_q21_k, rb_q21_k, tv_q21_k).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21k(isRBCheckedThree(rg_q21_k, rb_q21_k, tv_q21_k));
            }

            if (isRBCheckedThree(rg_q21_l, rb_q21_l, tv_q21_l).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21l(isRBCheckedThree(rg_q21_l, rb_q21_l, tv_q21_l));
            }

            if (isRBCheckedThree(rg_q21_m, rb_q21_m, tv_q21_m).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21m(isRBCheckedThree(rg_q21_m, rb_q21_m, tv_q21_m));
            }

            if (isRBCheckedThree(rg_q21_n, rb_q21_n, tv_q21_n).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21a(isRBCheckedThree(rg_q21_n, rb_q21_n, tv_q21_n));
            }

            if (isRBCheckedThree(rg_q21_o, rb_q21_o, tv_q21_o).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21o(isRBCheckedThree(rg_q21_o, rb_q21_o, tv_q21_o));
            }

            if (isRBCheckedThree(rg_q21_p, rb_q21_p, tv_q21_p).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21p(isRBCheckedThree(rg_q21_p, rb_q21_p, tv_q21_p));
            }

            if (isRBCheckedThree(rg_q21_q, rb_q21_q, tv_q21_q).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21q(isRBCheckedThree(rg_q21_q, rb_q21_q, tv_q21_q));
            }


            if (isRBCheckedThree(rg_q21_r, rb_q21_r, tv_q21_r).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21r(isRBCheckedThree(rg_q21_r, rb_q21_r, tv_q21_r));
            }

            if (isRBCheckedThree(rg_q21_s, rb_q21_s, tv_q21_s).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21s(isRBCheckedThree(rg_q21_s, rb_q21_s, tv_q21_s));
            }

            if (isRBCheckedThree(rg_q21_t, rb_q21_t, tv_q21_t).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21t(isRBCheckedThree(rg_q21_t, rb_q21_t, tv_q21_t));
            }

            if (isRBCheckedThree(rg_q21_u, rb_q21_u, tv_q21_u).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21u(isRBCheckedThree(rg_q21_u, rb_q21_u, tv_q21_u));
            }


            if (isRBCheckedThree(rg_q21_v, rb_q21_v, tv_q21_v).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21v(isRBCheckedThree(rg_q21_v, rb_q21_v, tv_q21_v));
            }

            if (isRBCheckedThree(rg_q21_w, rb_q21_w, tv_q21_w).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21w(isRBCheckedThree(rg_q21_w, rb_q21_w, tv_q21_w));
            }


            if (isRBCheckedThree(rg_q21_x, rb_q21_x, tv_q21_x).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21x(isRBCheckedThree(rg_q21_x, rb_q21_x, tv_q21_x));
            }

            if (isRBCheckedThree(rg_q21_y, rb_q21_y, tv_q21_y).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21y(isRBCheckedThree(rg_q21_y, rb_q21_y, tv_q21_y));
            }


            if (getEditText(rg_q21_z, rb_q21_z, et_q21_z, tv_q21_z, ContantsValues.YES,"","","").equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ21z(getEditText(rg_q21_z, rb_q21_z, et_q21_z, tv_q21_z, ContantsValues.YES,"","",""));
            }

        }


        if(ll_q22.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q22, rb_q22, tv_q22).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ22(isRBCheckedThree(rg_q22, rb_q22, tv_q22));
            }

        }

        if(ll_q23_q32.getVisibility()==View.VISIBLE){



            if (isRBCheckedThree(rg_q23_a, rb_q23_a, tv_q23_a).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23a(isRBCheckedThree(rg_q23_a, rb_q23_a, tv_q23_a));
            }

            if (isRBCheckedThree(rg_q23_b, rb_q23_b, tv_q23_b).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23b(isRBCheckedThree(rg_q23_b, rb_q23_b, tv_q23_b));
            }

            if (isRBCheckedThree(rg_q23_c, rb_q23_c, tv_q23_c).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23c(isRBCheckedThree(rg_q23_c, rb_q23_c, tv_q23_c));
            }

            if (isRBCheckedThree(rg_q23_d, rb_q23_d, tv_q23_d).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23d(isRBCheckedThree(rg_q23_d, rb_q23_d, tv_q23_d));
            }

            if (isRBCheckedThree(rg_q23_e, rb_q23_e, tv_q23_e).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23e(isRBCheckedThree(rg_q23_e, rb_q23_e, tv_q23_e));
            }

            if (isRBCheckedThree(rg_q23_f, rb_q23_f, tv_q23_f).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23f(isRBCheckedThree(rg_q23_f, rb_q23_f, tv_q23_f));
            }



            if (getEditText(rg_q23_g, rb_q23_g, et_q23_g, tv_q23_g, ContantsValues.YES,"","","").equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23g(getEditText(rg_q23_g, rb_q23_g, et_q23_g, tv_q23_g, ContantsValues.YES,"","",""));
            }


            if (getEditText(rg_q23_h, rb_q23_h, et_q23_h, tv_q23_h, ContantsValues.YES,"","","").equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23h(getEditText(rg_q23_h, rb_q23_h, et_q23_h, tv_q23_h, ContantsValues.YES,"","",""));
            }

            if (isRBCheckedThree(rg_q23_i, rb_q23_i, tv_q23_i).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23i(isRBCheckedThree(rg_q23_i, rb_q23_i, tv_q23_i));
            }

            if (isRBCheckedThree(rg_q23_j, rb_q23_j, tv_q23_j).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23j(isRBCheckedThree(rg_q23_j, rb_q23_j, tv_q23_j));
            }

            if (isRBCheckedThree(rg_q23_k, rb_q23_k, tv_q23_k).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23k(isRBCheckedThree(rg_q23_k, rb_q23_k, tv_q23_k));
            }

            if (isRBCheckedThree(rg_q23_l, rb_q23_l, tv_q23_l).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23l(isRBCheckedThree(rg_q23_l, rb_q23_l, tv_q23_l));
            }

            if (isRBCheckedThree(rg_q23_m, rb_q23_m, tv_q23_m).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ23m(isRBCheckedThree(rg_q23_m, rb_q23_m, tv_q23_m));
            }

            if (isRBCheckedThree(rg_q24, rb_q24, tv_q24).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ24(isRBCheckedThree(rg_q24, rb_q24, tv_q24));
            }

            if(ll_q25_q32.getVisibility()==View.VISIBLE){


                if (isRBCheckedThree(rg_q25_a, rb_q25_a, tv_q25_a).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25a(isRBCheckedThree(rg_q25_a, rb_q25_a, tv_q25_a));
                }

                if (isRBCheckedThree(rg_q25_a, rb_q25_a, tv_q25_a).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25a(isRBCheckedThree(rg_q25_a, rb_q25_a, tv_q25_a));
                }

                if (isRBCheckedThree(rg_q25_b, rb_q25_b, tv_q25_b).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25b(isRBCheckedThree(rg_q25_b, rb_q25_b, tv_q25_b));
                }

                if (isRBCheckedThree(rg_q25_c, rb_q25_c, tv_q25_c).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25c(isRBCheckedThree(rg_q25_c, rb_q25_c, tv_q25_c));
                }

                if (isRBCheckedThree(rg_q25_d, rb_q25_d, tv_q25_d).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25d(isRBCheckedThree(rg_q25_d, rb_q25_d, tv_q25_d));
                }

                if (isRBCheckedThree(rg_q25_e, rb_q25_e, tv_q25_e).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25e(isRBCheckedThree(rg_q25_e, rb_q25_e, tv_q25_e));
                }

                if (isRBCheckedThree(rg_q25_f, rb_q25_f, tv_q25_f).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25f(isRBCheckedThree(rg_q25_f, rb_q25_f, tv_q25_f));
                }

                if (isRBCheckedThree(rg_q25_g, rb_q25_g, tv_q25_g).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25g(isRBCheckedThree(rg_q25_g, rb_q25_g, tv_q25_g));
                }


                if (isRBCheckedThree(rg_q25_h, rb_q25_h, tv_q25_h).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25h(isRBCheckedThree(rg_q25_h, rb_q25_h, tv_q25_h));
                }

                if (getEditText(rg_q25_i, rb_q25_i, et_q25_i, tv_q25_i, ContantsValues.YES,"","","").equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ25i(getEditText(rg_q25_i, rb_q25_i, et_q25_i, tv_q25_i, ContantsValues.YES,"","",""));
                }


                if (isRBCheckedThree(rg_q26, rb_q26, tv_q26).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ26(isRBCheckedThree(rg_q26, rb_q26, tv_q26));
                }


                if(ll_q27.getVisibility()==View.VISIBLE){

                    if(getTextFromField(et_q27_a,tv_q27).equals("")){
                        validation = false;
                    }else {

                        CRF4aActivity.formCrf4bDTO.setQ27a(getTextFromField(et_q27_a,tv_q27));

                        if(et_q27_b.getText().toString().equals("")){

                        }else {
                            CRF4aActivity.formCrf4bDTO.setQ27b(et_q27_b.getText().toString());
                        }
                        if(et_q27_c.getText().toString().equals("")){

                        }else {
                            CRF4aActivity.formCrf4bDTO.setQ27c(et_q27_c.getText().toString());
                        }
                        if(et_q27_d.getText().toString().equals("")){

                        }else {
                            CRF4aActivity.formCrf4bDTO.setQ27d(et_q27_d.getText().toString());
                        }
                        if(et_q27_e.getText().toString().equals("")){

                        }else {
                            CRF4aActivity.formCrf4bDTO.setQ27e(et_q27_e.getText().toString());
                        }

                        if(et_q27_f.getText().toString().equals("")){

                        }else {
                            CRF4aActivity.formCrf4bDTO.setQ27f(et_q27_f.getText().toString());
                        }

                    }

                }


                if(ll_q28.getVisibility()==View.VISIBLE){

                    if (isRBCheckedThree(rg_q28, rb_q28, tv_q28).equals("")) {
                        validation = false;
                    } else {
                        CRF4aActivity.formCrf4bDTO.setQ28(isRBCheckedThree(rg_q28, rb_q28, tv_q28));
                    }
                }

                if(ll_q29_q32.getVisibility()==View.VISIBLE){


                    if(ll_q29.getVisibility()==View.VISIBLE){

                        if(getTextFromField(et_q29_a,tv_q29).equals("")){
                            validation = false;
                        }else {

                            CRF4aActivity.formCrf4bDTO.setQ29a(getTextFromField(et_q29_a,tv_q29));

                            if(et_q29_b.getText().toString().equals("")){

                            }else {
                                CRF4aActivity.formCrf4bDTO.setQ29b(et_q29_b.getText().toString());
                            }
                            if(et_q29_c.getText().toString().equals("")){

                            }else {
                                CRF4aActivity.formCrf4bDTO.setQ29c(et_q29_c.getText().toString());
                            }
                            if(et_q29_d.getText().toString().equals("")){

                            }else {
                                CRF4aActivity.formCrf4bDTO.setQ29d(et_q29_d.getText().toString());
                            }
                            if(et_q29_e.getText().toString().equals("")){

                            }else {
                                CRF4aActivity.formCrf4bDTO.setQ29e(et_q29_e.getText().toString());
                            }

                            if(et_q29_f.getText().toString().equals("")){

                            }else {
                                CRF4aActivity.formCrf4bDTO.setQ29f(et_q29_f.getText().toString());
                            }

                        }

                    }

                    if (isRBCheckedThree(rg_q30, rb_q30, tv_q30).equals("")) {
                        validation = false;
                    } else {
                        CRF4aActivity.formCrf4bDTO.setQ30(isRBCheckedThree(rg_q30, rb_q30, tv_q30));
                    }

                    if(ll_q31.getVisibility()==View.VISIBLE){

                        if (getTextFromField(et_q31_a, tv_q31).equals("")) {
                            validation = false;
                        } else {
                            CRF4aActivity.formCrf4bDTO.setQ31(getTextFromField(et_q31_a, tv_q31));
                        }
                    }

                    if(ll_q32.getVisibility()==View.VISIBLE){

                        if (getTextFromField(et_q32_a, tv_q32).equals("")) {
                            validation = false;
                        } else {
                            CRF3bActivity.formCrf3bDTO.setQ32(getTextFromField(et_q32_a, tv_q32));
                        }
                    }
                }
            }
        }


        if (isRBCheckedThree(rg_q33, rb_q33, tv_q33).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ33(isRBCheckedThree(rg_q33, rb_q33, tv_q33));
        }


        if (isRBCheckedThree(rg_q35, rb_q35, tv_q35).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ35(isRBCheckedThree(rg_q35, rb_q35, tv_q35));
        }


        if (isRBCheckedThree(rg_q36, rb_q36, tv_q36).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ36(isRBCheckedThree(rg_q36, rb_q36, tv_q36));
        }

        if (isRBCheckedThree(rg_q38, rb_q38, tv_q38).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ38(isRBCheckedThree(rg_q38, rb_q38, tv_q38));
        }

        if (isRBCheckedThree(rg_q39, rb_q39, tv_q39).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ39(isRBCheckedThree(rg_q39, rb_q39, tv_q39));
        }

        if (isRBCheckedThree(rg_q40, rb_q40, tv_q40).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ40(isRBCheckedThree(rg_q40, rb_q40, tv_q40));
        }

        if (isRBCheckedThree(rg_q41, rb_q41, tv_q41).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ41(isRBCheckedThree(rg_q41, rb_q41, tv_q41));
        }

        if (isRBCheckedThree(rg_q42_a, rb_q42_a, tv_q42).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ42a(isRBCheckedThree(rg_q42_a, rb_q42_a, tv_q42));
        }



        if(ll_q42b_q47.getVisibility()==View.VISIBLE){


            if (isRBCheckedThree(rg_q42_b_a, rb_q42_b_a, tv_q42_b_a).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ42b1(isRBCheckedThree(rg_q42_b_a, rb_q42_b_a, tv_q42_b_a));
            }

            if (isRBCheckedThree(rg_q42_b_b, rb_q42_b_b, tv_q42_b_b).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ42b2(isRBCheckedThree(rg_q42_b_b, rb_q42_b_b, tv_q42_b_b));
            }

            if (isRBCheckedThree(rg_q42_b_c, rb_q42_b_c, tv_q42_b_c).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ42b3(isRBCheckedThree(rg_q42_b_c, rb_q42_b_c, tv_q42_b_c));
            }

            if (isRBCheckedThree(rg_q42_b_d, rb_q42_b_d, tv_q42_b_d).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ42b4(isRBCheckedThree(rg_q42_b_d, rb_q42_b_d, tv_q42_b_d));
            }


            if(ll_q43.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q43, rb_q43, tv_q43).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ43(isRBCheckedThree(rg_q43, rb_q43, tv_q43));
                }

            }


            if(ll_q44.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q44, rb_q44, tv_q44).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ44(isRBCheckedThree(rg_q44, rb_q44, tv_q44));
                }
            }

            if(ll_q45.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q45, rb_q45, tv_q45).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ45(isRBCheckedThree(rg_q45, rb_q45, tv_q45));
                }

            }

            if(ll_q46.getVisibility()==View.VISIBLE){


                if (isRBCheckedThree(rg_q46, rb_q46, tv_q46).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ46(isRBCheckedThree(rg_q46, rb_q46, tv_q46));
                }

            }

            if (isRBCheckedThree(rg_q47, rb_q47, tv_q47).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ47(isRBCheckedThree(rg_q47, rb_q47, tv_q47));
            }

        }


        if (isRBCheckedThree(rg_q48, rb_q48, tv_q48).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ48(isRBCheckedThree(rg_q48, rb_q48, tv_q48));
        }

        if (isRBCheckedThree(rg_q49, rb_q49, tv_q49).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ49(isRBCheckedThree(rg_q49, rb_q49, tv_q49));
        }

        if (isRBCheckedThree(rg_q50_a, rb_q50_a, tv_q50_a).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50a(isRBCheckedThree(rg_q50_a, rb_q50_a, tv_q50_a));
        }

        if (isRBCheckedThree(rg_q50_b, rb_q50_b, tv_q50_b).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50b(isRBCheckedThree(rg_q50_b, rb_q50_b, tv_q50_b));
        }

        if (isRBCheckedThree(rg_q50_c, rb_q50_c, tv_q50_c).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50c(isRBCheckedThree(rg_q50_c, rb_q50_c, tv_q50_c));
        }

        if (isRBCheckedThree(rg_q50_d, rb_q50_d, tv_q50_d).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50d(isRBCheckedThree(rg_q50_d, rb_q50_d, tv_q50_d));
        }

        if (isRBCheckedThree(rg_q50_e, rb_q50_e, tv_q50_e).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50e(isRBCheckedThree(rg_q50_e, rb_q50_e, tv_q50_e));
        }

        if (isRBCheckedThree(rg_q50_f, rb_q50_f, tv_q50_f).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50f(isRBCheckedThree(rg_q50_f, rb_q50_f, tv_q50_f));
        }

        if (isRBCheckedThree(rg_q50_g, rb_q50_g, tv_q50_g).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50g(isRBCheckedThree(rg_q50_g, rb_q50_g, tv_q50_g));
        }

        if (isRBCheckedThree(rg_q50_h, rb_q50_h, tv_q50_h).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50h(isRBCheckedThree(rg_q50_h, rb_q50_h, tv_q50_h));
        }

        if (isRBCheckedThree(rg_q50_i, rb_q50_i, tv_q50_i).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50i(isRBCheckedThree(rg_q50_i, rb_q50_i, tv_q50_i));
        }

        if (isRBCheckedThree(rg_q50_j, rb_q50_j, tv_q50_j).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50j(isRBCheckedThree(rg_q50_j, rb_q50_j, tv_q50_j));
        }

        if (isRBCheckedThree(rg_q50_k, rb_q50_k, tv_q50_k).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50k(isRBCheckedThree(rg_q50_k, rb_q50_k, tv_q50_k));
        }

        if (isRBCheckedThree(rg_q50_l, rb_q50_l, tv_q50_l).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50l(isRBCheckedThree(rg_q50_l, rb_q50_l, tv_q50_l));
        }

        if (isRBCheckedThree(rg_q50_m, rb_q50_m, tv_q50_m).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50m(isRBCheckedThree(rg_q50_m, rb_q50_m, tv_q50_m));
        }

        if (isRBCheckedThree(rg_q50_n, rb_q50_n, tv_q50_n).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50n(isRBCheckedThree(rg_q50_n, rb_q50_n, tv_q50_n));
        }

        if (isRBCheckedThree(rg_q50_o, rb_q50_o, tv_q50_o).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50o(isRBCheckedThree(rg_q50_o, rb_q50_o, tv_q50_o));
        }


        if (getEditText(rg_q50_p, rb_q50_p, et_q50_p, tv_q50_p, ContantsValues.YES,"","","").equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ50p(getEditText(rg_q50_p, rb_q50_p, et_q50_p, tv_q50_p, ContantsValues.YES,"","",""));
        }


        if (isRBCheckedThree(rg_q51, rb_q51, tv_q51).equals("")) {
            validation = false;
        } else {
            CRF4aActivity.formCrf4bDTO.setQ51(isRBCheckedThree(rg_q51, rb_q51, tv_q51));
        }

        if(ll_q52.getVisibility()==View.VISIBLE){

            if (isRBCheckedThree(rg_q52, rb_q52, tv_q52).equals("")) {
                validation = false;
            } else {
                CRF4aActivity.formCrf4bDTO.setQ52(isRBCheckedThree(rg_q52, rb_q52, tv_q52));
            }

        }

        if(ll_q53_q55.getVisibility()==View.VISIBLE){

            if(ll_q53.getVisibility()==View.VISIBLE){

                if (isRBCheckedThree(rg_q53, rb_q53, tv_q53).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ53(isRBCheckedThree(rg_q53, rb_q53, tv_q53));
                }

            }

            if(ll_q54_q55.getVisibility()==View.VISIBLE){


                if (isRBCheckedThree(rg_q54, rb_q54, tv_q54).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ54(isRBCheckedThree(rg_q54, rb_q54, tv_q54));
                }


                if (isRBCheckedThree(rg_q55_a, rb_q55_a, tv_q55_a).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55a(isRBCheckedThree(rg_q55_a, rb_q55_a, tv_q55_a));
                }

                if (isRBCheckedThree(rg_q55_b, rb_q55_b, tv_q55_b).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55b(isRBCheckedThree(rg_q55_b, rb_q55_b, tv_q55_b));
                }

                if (isRBCheckedThree(rg_q55_c, rb_q55_c, tv_q55_c).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55c(isRBCheckedThree(rg_q55_c, rb_q55_c, tv_q55_c));
                }

                if (isRBCheckedThree(rg_q55_d, rb_q55_d, tv_q55_d).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55d(isRBCheckedThree(rg_q55_d, rb_q55_d, tv_q55_d));
                }

                if (isRBCheckedThree(rg_q55_e, rb_q55_e, tv_q55_e).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55e(isRBCheckedThree(rg_q55_e, rb_q55_e, tv_q55_e));
                }

                if (isRBCheckedThree(rg_q55_f, rb_q55_f, tv_q55_f).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55f(isRBCheckedThree(rg_q55_f, rb_q55_f, tv_q55_f));
                }

                if (isRBCheckedThree(rg_q55_g, rb_q55_g, tv_q55_g).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55g(isRBCheckedThree(rg_q55_g, rb_q55_g, tv_q55_g));
                }

                if (isRBCheckedThree(rg_q55_h, rb_q55_h, tv_q55_h).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55h(isRBCheckedThree(rg_q55_h, rb_q55_h, tv_q55_h));
                }

                if (isRBCheckedThree(rg_q55_i, rb_q55_i, tv_q55_i).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55i(isRBCheckedThree(rg_q55_i, rb_q55_i, tv_q55_i));
                }

                if (isRBCheckedThree(rg_q55_j, rb_q55_j, tv_q55_j).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55j(isRBCheckedThree(rg_q55_j, rb_q55_j, tv_q55_j));
                }

                if (isRBCheckedThree(rg_q55_k, rb_q55_k, tv_q55_k).equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ55k(isRBCheckedThree(rg_q55_k, rb_q55_k, tv_q55_k));
                }


                if (getEditText(rg_q55_l, rb_q55_l, et_q55_l, tv_q55_l, ContantsValues.YES,"","","").equals("")) {
                    validation = false;
                } else {
                    CRF4aActivity.formCrf4bDTO.setQ50l(getEditText(rg_q55_l, rb_q55_l, et_q55_l, tv_q55_l, ContantsValues.YES,"","",""));
                }

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
