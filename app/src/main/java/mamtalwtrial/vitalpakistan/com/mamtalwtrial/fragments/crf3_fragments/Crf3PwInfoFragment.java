package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3_fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.CRF3bActivity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.StatusListAdapter;

public class Crf3PwInfoFragment extends Fragment {



    Button btnCancel, btnConform;

    Dialog dialog;

    int selectStatusItemIndex = -1;

    EditText etPwName, etPwHusbandName, etPwSite, etPwPara, etPwBlock, etPwStracture, etPwFamilyHousehold, etPwNumber;
    ListView listView;
    Button btnF1Register;
    boolean checkFieldStatus = true;
    StatusListAdapter statusListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf3_pw_info, container, false);


        final String[] statusListItem = {"Yes (G han)", "Withdraw consent ", "Postponed by LW (LW k taraf sa takheer hoi)"
                , "Interrupted by Family (Ghar waloun k madakhalat)", "Baby is  sick unable to avoid the situation (Bacha beemar tha jis k waja sa rukna para)", "LW is sick, unable to avoid the situation (LW beemar ha jis k waja sa rukhan para)"
        };

        statusListAdapter = new StatusListAdapter(getContext(), statusListItem);

        //edit text all field
        etPwName = (EditText) view.findViewById(R.id.etPwName);
        etPwHusbandName = (EditText) view.findViewById(R.id.etPwHusbandName);
        etPwSite = (EditText) view.findViewById(R.id.etPwSite);
        etPwPara = (EditText) view.findViewById(R.id.etPwPara);
        etPwBlock = (EditText) view.findViewById(R.id.etPwBlock);
        etPwStracture = (EditText) view.findViewById(R.id.etPwStracture);
        etPwFamilyHousehold = (EditText) view.findViewById(R.id.etPwFamilyHousehold);
        etPwNumber = (EditText) view.findViewById(R.id.etPwNumber);

        etPwName.setText(CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getName());
        etPwHusbandName.setText(CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getHusbandName());
        etPwSite.setText(CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getDssAddress().getSite());
        etPwPara.setText(CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getDssAddress().getPara());
        etPwBlock.setText(CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getDssAddress().getBlock());
        etPwStracture.setText(CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getDssAddress().getStructure());
        etPwFamilyHousehold.setText(CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getDssAddress().getHouseholdOrFamily());
        etPwNumber.setText(CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman().getDssAddress().getWomanNumber()+"");

        listView = (ListView) view.findViewById(R.id.lvStatus);

       // CRF3Activity.formCrf3aDTO.setQ15();
       // CRF3Activity.formCrf3aDTO.setQ16();
        listView.setAdapter(statusListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                selectStatusItemIndex = position;
                statusListAdapter.setChecked(position);
            }
        });

        btnF1Register = (Button) view.findViewById(R.id.btnF1Register);

        btnF1Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectStatusItemIndex != -1) {


                    if (selectStatusItemIndex == 0) {

                        CRF3Activity.formsCrf2AndCrf3All.getFormCrf3aDTO().setQ14(selectStatusItemIndex+"");
                        Crf3Q15Fragment crf3Q15Fragment = new Crf3Q15Fragment();

                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.frame_layoutCrf3, crf3Q15Fragment);
                        fragmentTransaction.commit();


                    } else {

                        //  myCustomeDialog();

                    }

                } else {

                    Toast.makeText(getContext(), "Please Fill All fields", Toast.LENGTH_LONG).show();
                }

            }
        });


        return view;
    }


}