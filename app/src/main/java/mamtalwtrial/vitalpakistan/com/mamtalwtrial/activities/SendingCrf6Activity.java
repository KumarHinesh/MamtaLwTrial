package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.SendingCrf6Adapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCRF6CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SendingCrf6Activity extends AppCompatActivity {

    int posit = -1;
    ListView list_view;
    FormCRF6CollectionDTO formCRF6CollectionDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_crf6);

        list_view = (ListView) findViewById(R.id.list_view);

        formCRF6CollectionDTO = new FormCRF6CollectionDTO();
        formCRF6CollectionDTO = SaveAndReadInternalData.getSavedCrf6FromsList(SendingCrf6Activity.this);
        SendingCrf6Adapter adapter = new SendingCrf6Adapter(SendingCrf6Activity.this, formCRF6CollectionDTO);
        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                sendDataToServer(formCRF6CollectionDTO.getForms().get(position));
                posit = position;
            }

        });

    }

    public void sendDataToServer(FormCrf6 formCrf6){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf6(formCrf6).enqueue(new Callback<FormCrf6>() {
            @Override
            public void onResponse(Call<FormCrf6> call, Response<FormCrf6> response) {

                SaveAndReadInternalData.deleteCrf6FromIndex(SendingCrf6Activity.this, list_view.getSelectedItemPosition());

            }

            @Override
            public void onFailure(Call<FormCrf6> call, Throwable t) {


            }
        });

    }

}
