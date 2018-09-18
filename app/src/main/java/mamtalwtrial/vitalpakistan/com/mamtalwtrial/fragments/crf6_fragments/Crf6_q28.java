package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities.Crf6Activity;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments.Crf6WeightLW;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments.VaccinationFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Crf6_q28 extends Fragment {

    Button btn_next;
    RadioButton rb_q28;
    RadioGroup rg_q28;
    TextView tv_q28;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf6_q28, container, false);

        btn_next = (Button) view.findViewById(R.id.btn_next);
        rg_q28 = (RadioGroup) view.findViewById(R.id.rg_q28);

        rg_q28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rb_q28 = (RadioButton) view.findViewById(rg_q28.getCheckedRadioButtonId());

               /* Fragment fragment;

                if (rb_q28.getTag().equals("1")){

                    fragment = new Crf6WeightLW();

                }else {

                    fragment = new VaccinationFragment();

                }

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layoutcrf6, fragment);
                fragmentTransaction.commit();
*/

            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rb_q28.getTag() != null){

                    Crf6Activity.formCrf6.setQ28(rb_q28.getTag().toString());
                    Fragment fragment = null;

                    if (rb_q28.getTag().equals("2") &&
                            (Crf6Activity.followupsDTO.getFollowupDetails().getChd()
                                    != null && Crf6Activity.followupsDTO.getFollowupDetails().getChd().equalsIgnoreCase("Y"))){

                        // send Data to server

                    }else if (rb_q28.getTag().equals("2") &&
                            (Crf6Activity.followupsDTO.getFollowupDetails().getChd()
                                    == null)){
                        fragment = new VaccinationFragment();
                    }else {
                        fragment = new Crf6WeightLW();
                    }


                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layoutcrf6, fragment);
                    fragmentTransaction.commit();

                }

            }
        });



        // Inflate the layout for this fragment
        return view;
    }

    public void sendDataToServer(){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf6(Crf6Activity.formCrf6).enqueue(new Callback<FormCrf6>() {
            @Override
            public void onResponse(Call<FormCrf6> call, Response<FormCrf6> response) {

                startActivity(new Intent(getActivity(), Crf6Activity.class));
                getActivity().finish();
            }

            @Override
            public void onFailure(Call<FormCrf6> call, Throwable t) {

                startActivity(new Intent(getActivity(), Crf6Activity.class));
                getActivity().finish();

            }
        });

    }

}
