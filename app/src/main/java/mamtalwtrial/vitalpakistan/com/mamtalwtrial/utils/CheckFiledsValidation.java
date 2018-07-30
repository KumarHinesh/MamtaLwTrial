package mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils;


import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import java.lang.reflect.Field;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;

public  class CheckFiledsValidation {


    public static void setTextColorOnTextView(View view, int id, boolean b){

        TextView tv = (TextView) view.findViewById(id);

        if(b)
            tv.setTextColor(view.getResources().getColor(R.color.black));
        else
            tv.setTextColor(view.getResources().getColor(R.color.red));

    }

    public static String getTagData(View view, RadioGroup radioGroup){

        if(radioGroup.getCheckedRadioButtonId()==-1){
            return "";
        }else {

            RadioButton radioButton = (RadioButton) view.findViewById(radioGroup.getCheckedRadioButtonId());

            return radioButton.getTag().toString();
        }

    }


    public static String getTextFromeditText(){


        return "";
    }

    public static boolean checkDtoFields(Object object){
        boolean b = true;

        for(int i = 0; i<object.getClass().getFields().length; i++){

            Field field = object.getClass().getFields()[i];

            if(field==null || field.equals(""))
                b = false;
            else
                b = true;

        }

        return b;
    }


    public static String getTextFromField(ScrollView scrollView, EditText et, TextView tv){


        if(et.getText().toString().equals("")){
            setFocuseable(scrollView,et.getX(),et.getY());
            tv.setError("Required");
            et.setError("Required");
            return "";
        }else {
            return et.getText().toString();
        }
    }



    public static void setFocuseable(final ScrollView scrolView, float x1, float y1){

       final int  x,y;
        x = (int) x1;
        y = (int) y1;

        scrolView.post(new Runnable() {
            public void run() {
                scrolView.scrollTo(x,y); // these are your x and y coordinates
            }
        });

    }

    public static boolean checkValue(String data){

        try{

            if(data.isEmpty() || data.equals("") || data==null)
                return false;
            else
                return true;

        }catch (NullPointerException e){ return false; }

        }



    /*public String isRBCheckedThree(RadioGroup rg, RadioButton rb, TextView tv){

        if(rg.getCheckedRadioButtonId()==-1){
            tv.setError("Required");
            setFocuseable(tv.getX(),tv.getY());
            return "";
        }else {
            return  rb.getTag().toString();
        }
    }
    */



}
