package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.SendingCrf5bAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5b;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SendingCrf5bActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_crf5b);

        progressDialog = new ProgressDialog(SendingCrf5bActivity.this);
        progressDialog.setTitle("Wait..");
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Sending");

        listView = (ListView) findViewById(R.id.list_view);

        SendingCrf5bAdapter adapter = new SendingCrf5bAdapter(SendingCrf5bActivity.this, SaveAndReadInternalData.getSavedCrf5bFromsList(SendingCrf5bActivity.this));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            }
        });

    }


    public void sendDataToServer(FormCrf5b formCrf5b){

        APIService mAPIService = ApiUtils.getAPIService();

        mAPIService.postCrf5b(formCrf5b).enqueue(new Callback<FormCrf5b>() {
            @Override
            public void onResponse(Call<FormCrf5b> call, Response<FormCrf5b> response) {

                SaveAndReadInternalData.deleteCrf5bFromIndex(SendingCrf5bActivity.this,listView.getSelectedItemPosition());

            }

            @Override
            public void onFailure(Call<FormCrf5b> call, Throwable t) {

            }
        });

    }


}
