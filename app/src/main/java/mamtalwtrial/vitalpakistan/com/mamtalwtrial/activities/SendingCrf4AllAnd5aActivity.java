package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.Sending2And3AllAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.Sending4AllAnd5aAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCRF4AllAnd5ADTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Forms4AllAnd5ACollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.Crf4Complete;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SendingCrf4AllAnd5aActivity extends AppCompatActivity {

    ListView listView;

    Forms4AllAnd5ACollectionDTO forms4AllAnd5ACollectionDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_crf4_all_and5a);

        listView = (ListView) findViewById(R.id.list_view);

        forms4AllAnd5ACollectionDTO = SaveAndReadInternalData.getSavedCrf4AllAnd5AFromsList(SendingCrf4AllAnd5aActivity.this);

        Sending4AllAnd5aAdapter adapter = new Sending4AllAnd5aAdapter(SendingCrf4AllAnd5aActivity.this, forms4AllAnd5ACollectionDTO);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(forms4AllAnd5ACollectionDTO.getForms().get(position).isFormCRF4aAndbStatus()){
                    //sendCrf2Form(forms4AllAnd5ACollectionDTO.getForms().get(position).getFormCrf4Complete());
                }else if (forms4AllAnd5ACollectionDTO.getForms().get(position).isFormCRF5aStatus()){
                   // sendCrf3aForm(formCrf2toCrf3AllCollection.getForms().get(position));
                }

            }
        });


    }

    public void sendCrf4CompleteToServer(FormCRF4AllAnd5ADTO formCRF4AllAnd5ADTO){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf4Complete(formCRF4AllAnd5ADTO.getFormCrf4Complete()).enqueue(new Callback<Crf4Complete>() {
            @Override
            public void onResponse(Call<Crf4Complete> call, Response<Crf4Complete> response) {

            }

            @Override
            public void onFailure(Call<Crf4Complete> call, Throwable t) {

            }
        });

    }

    public void sendCrf5aToServer(FormCRF4AllAnd5ADTO formCRF4AllAnd5ADTO){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf5a(formCRF4AllAnd5ADTO.getFormCrf5a()).enqueue(new Callback<FormCrf5a>() {
            @Override
            public void onResponse(Call<FormCrf5a> call, Response<FormCrf5a> response) {

            }

            @Override
            public void onFailure(Call<FormCrf5a> call, Throwable t) {

            }
        });

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
              //  .setAdapter(new Sending2And3AllAdapter(SendingCrf3AllForms.this, SaveAndReadInternalData.getSavedCrf2toCrf3AllCollection(SendingCrf3AllForms.this)));
            }
        });
        dialog.show();
    }


}
