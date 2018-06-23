package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf2_fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF2DashboargActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Constants;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;

public class CRF2TypeOfPregnancyFragment extends Fragment {



//Dialog initilizing
    Button btnCancel,btnConform;
    Dialog dialog;
    TextView  tv_RomanEngText, tv_engText;

    int pregnancy_type_status=-1;

    Button btn_TOPragnancySubmit;
    CheckBox cb_top_1, cb_top_2, cb_top_3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf2_type_of_pregnancy,container,false);


        CRF2Activity.fragmentNo = 1;

        cb_top_1 = (CheckBox) view.findViewById(R.id.cb_top_1);
        cb_top_2 = (CheckBox) view.findViewById(R.id.cb_top_2);
        cb_top_3 = (CheckBox) view.findViewById(R.id.cb_top_3);

        cb_top_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    cb_top_2.setChecked(false);
                    cb_top_3.setChecked(false);

                    pregnancy_type_status = 0;
                }

            }
        });


        cb_top_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    cb_top_1.setChecked(false);
                    cb_top_3.setChecked(false);

                    pregnancy_type_status = 1;
                }
            }
        });

        cb_top_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    cb_top_2.setChecked(false);
                    cb_top_1.setChecked(false);

                    pregnancy_type_status = 2;
                }
            }
        });

        btn_TOPragnancySubmit = (Button) view.findViewById(R.id.btn_TOPragnancySubmit);
        btn_TOPragnancySubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cb_top_1.isChecked()){

                    CRF2Activity.formCrf2DTO.setQ19(pregnancy_type_status+"");
                    Crf2Q20Fragment crf2Q20Fragment = new Crf2Q20Fragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layout_crf2, crf2Q20Fragment);
                    fragmentTransaction.commit();
                    

                }else if(cb_top_2.isChecked() || cb_top_3.isChecked()){

                    myCustomeDialog();

                }else {Toast.makeText(getContext(),"Please Select One",Toast.LENGTH_SHORT).show(); }


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

        tv_RomanEngText.setText("Judwa And Tedwa bacho k agay form fil Nhi hongay Mammtalw Tril k mutabik");
        tv_engText.setText("Twin And Triplet Would not Consider in MaamtaLw");


        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                CRF2Activity.formCrf2DTO.setQ19(pregnancy_type_status+"");
                CRF2Activity.formCrf2DTO.setFormStatus(Constants.COMPLETED);
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
