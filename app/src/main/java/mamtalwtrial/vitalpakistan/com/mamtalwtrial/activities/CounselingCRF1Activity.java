package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.messageDialogBox.SingleButtonDialog;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Crf1CounselingDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CounselingCRF1Activity extends AppCompatActivity {

    Context context;
    ProgressDialog progressDialog;
    boolean b =false;
    int isVisibleField =-1;
    CheckBox cb_counsling_Q2_2, cb_counsling_Q2_1;

    String startTime, endTime;

    CheckBox cb_q1_1, cb_q1_2, cb_q2_1, cb_q2_2, cb_q3_1, cb_q3_2, cb_q4_1, cb_q4_2, cb_q5_1, cb_q5_2, cb_q6_1, cb_q6_2, cb_q7_2, cb_q7_1, cb_q8_2, cb_q8_1, cb_q9_1, cb_q9_2,
            cb_q10_1, cb_q10_2, cb_q11_2, cb_q11_1, cb_q12_1, cb_q12_2, cb_q13_1,cb_q13_2, cb_q14_1, cb_q14_2, cb_q15_1, cb_q15_2, cb_q16_1, cb_q16_2,
            cb_q17_2, cb_q17_1, cb_sQ1_1, cb_sQ1_2, cb_sQ2_1, cb_sQ2_2, cb_sQ3_1, cb_sQ3_2, cb_sQ4_1, cb_sQ4_2, cb_sQ5_1, cb_sQ5_2, cb_sQ6_1, cb_sQ6_2, cb_sQ7_1, cb_sQ7_2,
            cb_sQ8_1, cb_sQ8_2, cb_sQ9_1, cb_sQ9_2, cb_sQ10_1, cb_sQ10_2, cb_sQ11_1, cb_sQ11_2, cb_sQ12_1, cb_sQ12_2,  cb_sQ13_1, cb_sQ13_2;
    ;


    // decliaration for dialog
    Button btnCancel,btnConform;
    Dialog dialog;
    TextView  tv_RomanEngText, tv_engText;


    Button btn_CounSubmit;
    CheckBox cb_counsling_Q1_1, cb_counsling_Q1_2;
    LinearLayout llForhidden;

    FormCrf1DTO formCrf1DTO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counseling_crf1);



         Intent i = getIntent();
         String s = i.getStringExtra("obj");
         formCrf1DTO = new Gson().fromJson(s, FormCrf1DTO.class);

         /////////////////


        initilizePrograssDialog();
        llForhidden = (LinearLayout) findViewById(R.id.llForhidden);


        cb_q1_1 = (CheckBox) findViewById(R.id.cb_q1_1);
        cb_q1_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb_q1_2.setChecked(false);

                    Calendar calendar = Calendar.getInstance();
                    Date date = calendar.getTime();
                    date.getTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

                    startTime =   sdf.format(date);

                }
            }
        });

        cb_q1_2 = (CheckBox) findViewById(R.id.cb_q1_2);
        cb_q1_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb_q1_1.setChecked(false);

                    Calendar calendar = Calendar.getInstance();
                    Date date = calendar.getTime();
                    date.getTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

                    startTime =   sdf.format(date);

                }
            }
        });

        cb_q2_1 = (CheckBox) findViewById(R.id.cb_q2_1);
        cb_q2_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                    cb_q2_2.setChecked(false);
            }
        });

        cb_q2_2 = (CheckBox) findViewById(R.id.cb_q2_2);
        cb_q2_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q2_1.setChecked(false);
            }
        });

        cb_q3_2 = (CheckBox) findViewById(R.id.cb_q3_2);
        cb_q3_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                    cb_q3_1.setChecked(false);
            }
        });
        cb_q3_1 = (CheckBox) findViewById(R.id.cb_q3_1);
        cb_q3_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q3_2.setChecked(false);
            }
        });

        cb_q4_1 = (CheckBox) findViewById(R.id.cb_q4_1);
        cb_q4_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q4_2.setChecked(false);
            }
        });
        cb_q4_2 = (CheckBox) findViewById(R.id.cb_q4_2);
        cb_q4_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q4_1.setChecked(false);
            }
        });

        cb_q5_1 = (CheckBox) findViewById(R.id.cb_q5_1);
        cb_q5_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q5_2.setChecked(false);
            }
        });
        cb_q5_2 = (CheckBox) findViewById(R.id.cb_q5_2);
        cb_q5_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q5_1.setChecked(false);
            }
        });

        cb_q6_2 = (CheckBox) findViewById(R.id.cb_q6_2);
        cb_q6_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    cb_q6_1.setChecked(false);
            }
        });

        cb_q6_1 = (CheckBox) findViewById(R.id.cb_q6_1);
        cb_q6_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q6_2.setChecked(false);
            }
        });

        cb_q7_2 = (CheckBox) findViewById(R.id.cb_q7_2);
        cb_q7_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q7_1.setChecked(false);
            }
        });

        cb_q7_1 = (CheckBox) findViewById(R.id.cb_q7_1);
        cb_q7_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q7_2.setChecked(false);
                }
        });

        cb_q8_2 = (CheckBox) findViewById(R.id.cb_q8_2);
        cb_q8_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q8_1.setChecked(false);
            }
        });

        cb_q8_1 = (CheckBox) findViewById(R.id.cb_q8_1);
        cb_q8_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q8_2.setChecked(false);
            }
        });

        cb_q9_1 = (CheckBox) findViewById(R.id.cb_q9_1);
        cb_q9_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q9_2.setChecked(false);
            }
        });

        cb_q9_2 = (CheckBox) findViewById(R.id.cb_q9_2);
        cb_q9_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q9_1.setChecked(false);
            }
        });

        cb_q10_1 = (CheckBox) findViewById(R.id.cb_q10_1);
        cb_q10_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q10_2.setChecked(false);
            }
        });

        cb_q10_2 = (CheckBox) findViewById(R.id.cb_q10_2);
        cb_q10_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q10_1.setChecked(false);
            }
        });

        cb_q11_2 = (CheckBox) findViewById(R.id.cb_q11_2);
        cb_q11_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q11_1.setChecked(false);
            }
        });

        cb_q11_1 = (CheckBox) findViewById(R.id.cb_q11_1);
        cb_q11_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q11_2.setChecked(false);
            }
        });

        cb_q12_1 = (CheckBox) findViewById(R.id.cb_q12_1);
        cb_q12_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q12_2.setChecked(false);

            }
        });

        cb_q12_2 = (CheckBox) findViewById(R.id.cb_q12_2);
        cb_q12_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q12_1.setChecked(false);

            }
        });

        cb_q13_1 = (CheckBox) findViewById(R.id.cb_q13_1);
        cb_q13_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q13_2.setChecked(false);
            }
        });

        cb_q13_2 = (CheckBox) findViewById(R.id.cb_q13_2);
        cb_q13_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q13_1.setChecked(false);
            }
        });

        cb_q14_1 = (CheckBox) findViewById(R.id.cb_q14_1);
        cb_q14_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q14_2.setChecked(false);
                }
        });
        cb_q14_2 = (CheckBox) findViewById(R.id.cb_q14_2);
        cb_q14_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q14_1.setChecked(false);
            }
        });
        cb_q15_1 = (CheckBox) findViewById(R.id.cb_q15_1);
        cb_q15_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q15_2.setChecked(false);
            }
        });
        cb_q15_2 = (CheckBox) findViewById(R.id.cb_q15_2);
        cb_q15_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q15_1.setChecked(false);
            }
        });
        cb_q16_1 = (CheckBox) findViewById(R.id.cb_q16_1);
        cb_q16_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q16_2.setChecked(false);
            }
        });

        cb_q16_2 = (CheckBox) findViewById(R.id.cb_q16_2);
        cb_q16_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q16_1.setChecked(false);
            }
        });

        cb_q17_2 = (CheckBox) findViewById(R.id.cb_q17_2);
        cb_q17_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q17_1.setChecked(false);
            }
        });

        cb_q17_1 = (CheckBox) findViewById(R.id.cb_q17_1);
        cb_q17_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_q17_2.setChecked(false);
            }
        });
        cb_sQ1_1 = (CheckBox) findViewById(R.id.cb_sQ1_1);
        cb_sQ1_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ1_2.setChecked(false);
            }
        });
        cb_sQ1_2 = (CheckBox) findViewById(R.id.cb_sQ1_2);
        cb_sQ1_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ1_1.setChecked(false);
            }
        });
        cb_sQ2_1 = (CheckBox) findViewById(R.id.cb_sQ2_1);
        cb_sQ2_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ2_2.setChecked(false);
            }
        });
        cb_sQ2_2 = (CheckBox) findViewById(R.id.cb_sQ2_2);
        cb_sQ2_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ2_1.setChecked(false);
            }
        });
        cb_sQ3_1 = (CheckBox) findViewById(R.id.cb_sQ3_1);
        cb_sQ3_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ3_2.setChecked(false);
            }
        });
        cb_sQ3_2 = (CheckBox) findViewById(R.id.cb_sQ3_2);
        cb_sQ3_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ3_1.setChecked(false);
            }
        });
        cb_sQ4_1 = (CheckBox) findViewById(R.id.cb_sQ4_1);
        cb_sQ4_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ4_2.setChecked(false);
            }
        });
        cb_sQ4_2 = (CheckBox) findViewById(R.id.cb_sQ4_2);
        cb_sQ4_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ4_1.setChecked(false);
            }
        });

        cb_sQ5_1 = (CheckBox) findViewById(R.id.cb_sQ5_1);
        cb_sQ5_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ5_2.setChecked(false);
            }
        });
        cb_sQ5_2 = (CheckBox) findViewById(R.id.cb_sQ5_2);
        cb_sQ5_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ5_1.setChecked(false);
            }
        });

        cb_sQ6_1 = (CheckBox) findViewById(R.id.cb_sQ6_1);
        cb_sQ6_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb_sQ6_1.isChecked())
                    cb_sQ6_2.setChecked(false);

            }
        });
        cb_sQ6_2 = (CheckBox) findViewById(R.id.cb_sQ6_2);
        cb_sQ6_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ6_1.setChecked(false);

            }
        });
        cb_sQ7_1 = (CheckBox) findViewById(R.id.cb_sQ7_1);
        cb_sQ7_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ7_2.setChecked(false);
            }
        });
        cb_sQ7_2 = (CheckBox) findViewById(R.id.cb_sQ7_2);
        cb_sQ7_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ7_1.setChecked(false);
            }
        });
        cb_sQ8_1 = (CheckBox) findViewById(R.id.cb_sQ8_1);
        cb_sQ8_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ8_2.setChecked(false);
            }
        });
        cb_sQ8_2 = (CheckBox) findViewById(R.id.cb_sQ8_2);
        cb_sQ8_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ8_1.setChecked(false);
            }
        });
        cb_sQ9_1 = (CheckBox) findViewById(R.id.cb_sQ9_1);
        cb_sQ9_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ9_2.setChecked(false);
            }
        });

        cb_sQ9_2 = (CheckBox) findViewById(R.id.cb_sQ9_2);
        cb_sQ9_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ9_1.setChecked(false);
            }
        });

        cb_sQ10_1 = (CheckBox) findViewById(R.id.cb_sQ10_1);
        cb_sQ10_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ10_2.setChecked(false);
            }
        });

        cb_sQ10_2 = (CheckBox) findViewById(R.id.cb_sQ10_2);
        cb_sQ10_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ10_1.setChecked(false);
            }
        });

        cb_sQ11_1 = (CheckBox) findViewById(R.id.cb_sQ11_1);
        cb_sQ11_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ11_2.setChecked(false);

            }
        });
        cb_sQ11_2 = (CheckBox) findViewById(R.id.cb_sQ11_2);
        cb_sQ11_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ11_1.setChecked(false);
            }
        });
        cb_sQ12_1 = (CheckBox) findViewById(R.id.cb_sQ12_1);
        cb_sQ12_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ12_2.setChecked(false);
            }
        });
        cb_sQ12_2 = (CheckBox) findViewById(R.id.cb_sQ12_2);
        cb_sQ12_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ12_1.setChecked(false);
            }
        });
        cb_sQ13_1 = (CheckBox) findViewById(R.id.cb_sQ13_1);
        cb_sQ13_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ13_2.setChecked(false);

                Calendar calendar = Calendar.getInstance();
                Date date = calendar.getTime();
                date.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

                endTime = sdf.format(date);


            }
        });
        cb_sQ13_2 = (CheckBox) findViewById(R.id.cb_sQ13_2);
        cb_sQ13_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    cb_sQ13_1.setChecked(false);

                Calendar calendar = Calendar.getInstance();
                Date date = calendar.getTime();
                date.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

                endTime = sdf.format(date);


            }
        });

        cb_counsling_Q1_1 = (CheckBox) findViewById(R.id.cb_counsling_Q1_1);
        cb_counsling_Q1_2 = (CheckBox) findViewById(R.id.cb_counsling_Q1_2);

        cb_counsling_Q2_2 = (CheckBox) findViewById(R.id.cb_counsling_Q2_2);
        cb_counsling_Q2_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    cb_counsling_Q2_1.setChecked(false);
                }
            }
        });

        cb_counsling_Q2_1 = (CheckBox) findViewById(R.id.cb_counsling_Q2_1);
        cb_counsling_Q2_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_counsling_Q2_2.setChecked(false);
                }

            }
        });

        cb_counsling_Q1_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    cb_counsling_Q1_2.setChecked(false);
                    isVisibleField = 1;
                    llForhidden.setVisibility(View.VISIBLE);

                }
            }
        });

        cb_counsling_Q1_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    isVisibleField = -1;
                    cb_counsling_Q1_1.setChecked(false);
                    llForhidden.setVisibility(View.GONE);
                }

            }
        });

        btn_CounSubmit = (Button) findViewById(R.id.btn_CounSubmit);
        btn_CounSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validation() && isVisibleField!=-1){


                    if(cb_counsling_Q1_1.isChecked()){

                        if(formCrf1DTO.getFollowupId()!=0){

                            SharedPreferences sharedPreferences = getSharedPreferences("comptask",CounselingCRF1Activity.MODE_PRIVATE);
                            int val = sharedPreferences.getInt("val", 0);

                            val++;
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("val",val);
                            editor.commit();


                        }else {

                            SharedPreferences sharedPreferences = getSharedPreferences("comp",CounselingCRF1Activity.MODE_PRIVATE);
                            int val = sharedPreferences.getInt("val", 0);

                            val++;
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putInt("val",val);
                            editor.commit();

                        }

                        formCrf1DTO.setQ34(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                        formCrf1DTO.setCounselingStartDate(startTime);
                        formCrf1DTO.setCounselingEndDate(endTime);
                        formCrf1DTO.setFormStatus(Constants.COMPLETED);
                        sendDataToServer();
                    }
                }else if( cb_counsling_Q1_2.isChecked()){

                    myCustomeDialog();

                }

            }
        });


    }

    public boolean validation(){
        boolean b = true;

        if(!cb_q1_1.isChecked() && !cb_q1_2.isChecked() ){
            cb_q1_1.setError("Required");
            cb_q1_2.setFocusable(true);
            b = false;
        }

        if(!cb_q2_2.isChecked() && !cb_q2_1.isChecked()){
            cb_q2_1.setError("Required");
            cb_q2_2.setFocusable(true);
            b = false;
        }

        if(!cb_q3_1.isChecked() && !cb_q3_2.isChecked()){
            cb_q3_1.setError("Required");
            cb_q3_2.setFocusable(true);
            b = false;
        }
        if(!cb_q4_1.isChecked() && !cb_q4_2.isChecked()){
            cb_q4_1.setError("Required");
            cb_q4_2.setFocusable(true);
            b = false;
        }
        if(!cb_q5_1.isChecked() && !cb_q5_2.isChecked()){
            cb_q5_1.setError("Required");
            cb_q5_2.setFocusable(true);
            b = false;
        }
        if(!cb_q6_1.isChecked() && !cb_q6_2.isChecked()){
            cb_q6_1.setError("Required");
            cb_q6_2.setFocusable(true);
            b = false;
        }
        if(!cb_q7_2.isChecked() && !cb_q7_1.isChecked()){
            cb_q7_2.setError("Required");
            cb_q7_1.setFocusable(true);
            b = false;
        }
        if(!cb_q8_2.isChecked() && !cb_q8_1.isChecked()){
            cb_q8_1.setError("Required");
            cb_q8_1.setFocusable(true);
            b = false;
        }
        if(!cb_q9_1.isChecked() && !cb_q9_2.isChecked()){
            cb_q9_1.setError("Required");
            cb_q9_2.setFocusable(true);
            b = false;
        }
        if(!cb_q10_1.isChecked() && !cb_q10_2.isChecked()){
            cb_q10_1.setError("Required");
            cb_q10_2.setFocusable(true);
            b = false;
        }
        if(!cb_q11_2.isChecked() && !cb_q11_1.isChecked()){
            cb_q11_2.setError("Required");
            cb_q11_1.setFocusable(true);
            b = false;
        }
        if(!cb_q12_1.isChecked() && !cb_q12_2.isChecked()){
            cb_q12_1.setError("Required");
            cb_q12_2.setFocusable(true);
            b = false;
        }
        if(!cb_q13_1.isChecked() && !cb_q13_2.isChecked()){
            cb_q13_1.setError("Required");
            cb_q13_2.setFocusable(true);
            b = false;
        }
        if(!cb_q14_1.isChecked() && !cb_q14_2.isChecked()){
            cb_q13_1.setError("Required");
            cb_q14_2.setFocusable(true);
            b = false;
        }
        if(!cb_q15_1.isChecked() && !cb_q15_2.isChecked()){
            cb_q15_1.setError("Required");
            cb_q15_2.setFocusable(true);
            b = false;
        }
        if(!cb_q16_1.isChecked() && !cb_q16_2.isChecked()){
            cb_q16_1.setError("Required");
            cb_q16_2.setFocusable(true);
            b = false;
        }
        if(!cb_q17_2.isChecked() && !cb_q17_1.isChecked()){
            cb_q17_2.setError("Required");
            cb_q17_1.setFocusable(true);
            b = false;
        }
        if(!cb_sQ1_1.isChecked() && !cb_sQ1_2.isChecked()){
            cb_sQ1_1.setError("Required");
            cb_sQ1_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ2_1.isChecked() && !cb_sQ2_2.isChecked()){
            cb_sQ2_1.setError("Required");
            cb_sQ2_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ3_1.isChecked() && !cb_sQ3_2.isChecked()){
            cb_sQ3_1.setError("Required");
            cb_sQ3_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ4_1.isChecked() && !cb_sQ4_2.isChecked()){
            cb_sQ4_1.setError("Required");
            cb_sQ4_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ5_1.isChecked() && !cb_sQ5_2.isChecked()){
            cb_sQ5_1.setError("Required");
            cb_sQ5_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ6_1.isChecked() && !cb_sQ6_2.isChecked()){
            cb_sQ6_1.setError("Required");
            cb_sQ6_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ7_1.isChecked() && !cb_sQ7_2.isChecked()){
            cb_sQ7_1.setError("Required");
            cb_sQ7_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ8_1.isChecked() && !cb_sQ8_2.isChecked()){
            cb_sQ8_1.setError("Required");
            cb_sQ8_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ9_1.isChecked() && !cb_sQ9_2.isChecked()){
            cb_sQ9_1.setError("Required");
            cb_sQ9_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ10_1.isChecked() && !cb_sQ10_2.isChecked()){
            cb_sQ10_1.setError("Required");
            cb_sQ10_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ11_1.isChecked() && !cb_sQ11_2.isChecked()){
            cb_sQ11_1.setError("Required");
            cb_sQ11_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ12_1.isChecked() && !cb_sQ12_2.isChecked()){
            cb_sQ12_1.setError("Required");
            cb_sQ12_2.setFocusable(true);
            b = false;
        }
        if(!cb_sQ13_1.isChecked() && !cb_sQ13_2.isChecked()){
            cb_sQ13_1.setError("Required");
            cb_sQ13_2.setFocusable(true);
            b = false;
        }

        return b;
    }

    public void myCustomeDialog(){


        dialog = new Dialog(CounselingCRF1Activity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);
        dialog.setCancelable(false);

        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);


        // dialog = new Dialog(getContext());
        //dialog.setContentView(R.layout.fragment_pw_info_fragment1);
        btnCancel.setText("No (Nahi)");
        btnConform.setText("Yes (G Han)");

        cb_counsling_Q1_1.setChecked(false);
        cb_counsling_Q1_2.setChecked(false);



        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);
        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);

        tv_RomanEngText.setText("Kya Women ab Pregnant Nhi?");
        tv_engText.setText("Women is Not Pregnant?");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(formCrf1DTO.getFollowupId()!=0){

                    SharedPreferences sharedPreferences = getSharedPreferences("comptask",CounselingCRF1Activity.MODE_PRIVATE);
                    int val = sharedPreferences.getInt("val", 0);

                    val++;
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("val",val);
                    editor.commit();

                }else {

                    SharedPreferences sharedPreferences = getSharedPreferences("comp",CounselingCRF1Activity.MODE_PRIVATE);
                    int val = sharedPreferences.getInt("val", 0);

                    val++;
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt("val",val);
                    editor.commit();

                }

                formCrf1DTO.setQ34(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));
                formCrf1DTO.setFormStatus(Constants.COMPLETED);
                dialog.dismiss();
                sendDataToServer();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });

        dialog.show();
    }

    @Override
    public void onBackPressed() {


        dialog = new Dialog(CounselingCRF1Activity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.confromation_dialog);
        dialog.setCancelable(false);

        btnConform = (Button) dialog.findViewById(R.id.btnConform);
        btnCancel = (Button) dialog.findViewById(R.id.btnCancel);

        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);
        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);

        btnCancel.setText("No (Nahi)");
        btnConform.setText("Yes (G Han)");


        tv_RomanEngText.setText("Kya App Form band Krna Chati h");
        tv_engText.setText("You Want to close The Form");

        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b = true;
                finish();


            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });

        dialog.show();
    }

    public void sendDataToServer(){

        progressDialog.show();

        if(WifiConnectOrNot.haveNetworkConnection(CounselingCRF1Activity.this)){

            APIService mAPIService = ApiUtils.getAPIService();
            mAPIService.sendCrf1Form(formCrf1DTO).enqueue(new Callback<FormCrf1DTO>() {
                @Override
                public void onResponse(Call<FormCrf1DTO> call, Response<FormCrf1DTO> response) {

                    if(response.code()==200){

                        progressDialog.dismiss();
                        singleBtnDialog(CounselingCRF1Activity.this,formCrf1DTO.getPregnantWoman().getName()+" Form submited...:)",formCrf1DTO.getPregnantWoman().getName()+" Ka Form Send Hogaya h..:)");
                        startActivity(new Intent(CounselingCRF1Activity.this, DashboardActivity.class));
                        finish();
                    }else {

                        SaveAndReadInternalData.saveCrf1FormInternal(CounselingCRF1Activity.this,formCrf1DTO);
                        progressDialog.dismiss();
                        singleBtnDialog(CounselingCRF1Activity.this,"Internet Connection is not Working properly "+ formCrf1DTO.getPregnantWoman().getName()+" form save Internel Storage","Internet Sahi nahi chal raha islia "+formCrf1DTO.getPregnantWoman().getName()+" Ka Form Internal Storage m Save Kardia h");
                    }
                }
                @Override
                public void onFailure(Call<FormCrf1DTO> call, Throwable t) {

                    SaveAndReadInternalData.saveCrf1FormInternal(CounselingCRF1Activity.this,formCrf1DTO);
                    progressDialog.dismiss();
                    singleBtnDialog(CounselingCRF1Activity.this,"Internet Connection is not Working properly "+ formCrf1DTO.getPregnantWoman().getName()+" form save Internel Storage","Internet Sahi nahi chal raha islia "+formCrf1DTO.getPregnantWoman().getName()+" Ka Form Internal Storage m Save Kardia h");

                }
            });

        }else {

            SaveAndReadInternalData.saveCrf1FormInternal(CounselingCRF1Activity.this,formCrf1DTO);
            progressDialog.dismiss();
            singleBtnDialog(CounselingCRF1Activity.this,"Internet Connection is not Working properly "+ formCrf1DTO.getPregnantWoman().getName()+" form save Internel Storage","Internet Sahi nahi chal raha islia "+formCrf1DTO.getPregnantWoman().getName()+" Ka Form Internal Storage m Save Kardia h");

        }

        if(formCrf1DTO.getFollowUpPositionInList()!=-1){
            SaveAndReadInternalData.deleteFollowUpFromList(CounselingCRF1Activity.this,formCrf1DTO.getFollowUpPositionInList());}


    }

    public  void singleBtnDialog(Context context, String engMessage, String romanEng){

        Button btnConform;
        TextView tv_engText, tv_RomanEngText;

        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.single_btn_dialog);
        dialog.setCancelable(false);

        btnConform = (Button) dialog.findViewById(R.id.btnok);

        tv_engText = (TextView) dialog.findViewById(R.id.tv_engText);
        tv_RomanEngText = (TextView) dialog.findViewById(R.id.tv_RomanEngText);

        tv_engText.setText(engMessage);
        tv_RomanEngText.setText(romanEng);


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CounselingCRF1Activity.this, DashboardActivity.class));
                finish();
            }
        });

        dialog.show();
    }

    public void initilizePrograssDialog(){

        progressDialog = new ProgressDialog(CounselingCRF1Activity.this);
        progressDialog.setTitle("Sending..");
        progressDialog.setMessage("Please Wait");
        progressDialog.setCancelable(false);

    }

}
