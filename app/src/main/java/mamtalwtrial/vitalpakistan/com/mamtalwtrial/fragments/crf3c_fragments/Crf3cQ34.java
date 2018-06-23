package mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3c_fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;

public class Crf3cQ34 extends Fragment {

    Button btn_Crf3cCounSubmit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crf3c_q34, container, false);

        btn_Crf3cCounSubmit = (Button) view.findViewById(R.id.btn_Crf3cCounSubmit);

        btn_Crf3cCounSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });


        return view;
    }

}
