package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments;

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


public class Crf6Q17And18Fragment extends Fragment {

    Button btn_next;
    RadioGroup rg_q18;
    RadioButton rb_q18;
    TextView tv_q17;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_crf6_q17_and18, container, false);

        tv_q17 = (TextView) view.findViewById(R.id.tv_q17);
        rg_q18 = (RadioGroup) view.findViewById(R.id.rg_q18);
        btn_next = (Button) view.findViewById(R.id.btn_next);

        tv_q17.setText(Crf6Activity.followupsDTO.getFollowupDetails().getAge());

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb_q18!=null){

                    Crf6Activity.formCrf6.setQ18(Integer.parseInt(rb_q18.getTag().toString()));
                    Crf6Activity.formCrf6.setQ17(Integer.parseInt(Crf6Activity.followupsDTO.getFollowupDetails().getAge()));
                    Fragment fragment;

                    if(rb_q18.getTag().equals("1")){
                         fragment = new Crf6BabyWeightFragment();
                    }else {
                        fragment = new Crf6_q28();
                    }

                    Crf6Activity.formCrf6.setQ18(Integer.parseInt(rb_q18.getTag().toString()));

                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame_layoutcrf6, fragment);
                    fragmentTransaction.commit();
                }
            }
        });

        rg_q18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb_q18 = (RadioButton) view.findViewById(rg_q18.getCheckedRadioButtonId());
            }
        });

        return view;
    }

}
