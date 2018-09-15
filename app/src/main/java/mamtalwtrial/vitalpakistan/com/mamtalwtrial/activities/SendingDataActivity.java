package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.FollowUpListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.SendingFormAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.TaskListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.messageDialogBox.SingleButtonDialog;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SendDataToServer;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SendingDataActivity extends AppCompatActivity {

    ListView list_view_send;

    FormCrf1CollectionDTO formCrf1CollectionDTO;
    ProgressDialog progressDialog;
    SendingFormAdapter sendingFormAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending_data);

        initlizePrograssDialog();

        list_view_send = (ListView) findViewById(R.id.list_view_send);
        formCrf1CollectionDTO = SaveAndReadInternalData.getSavedCrf1FromsList(SendingDataActivity.this);
        sendingFormAdapter = new SendingFormAdapter(SendingDataActivity.this,formCrf1CollectionDTO);

        list_view_send.setAdapter(sendingFormAdapter);

        list_view_send.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {

                if(WifiConnectOrNot.haveNetworkConnection(SendingDataActivity.this)){

                    progressDialog.show();
                    APIService mAPIService = ApiUtils.getAPIService();

                    if(formCrf1CollectionDTO != null){

                            mAPIService.sendCrf1Form(formCrf1CollectionDTO.getForms().get(position)).enqueue(new Callback<FormCrf1DTO>() {
                                @Override
                                public void onResponse(Call<FormCrf1DTO> call, Response<FormCrf1DTO> response) {

                                    if(response.code()==200){
                                        progressDialog.dismiss();
                                        SingleButtonDialog.singleBtnDialog(SendingDataActivity.this,formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getName()+" Form submited...:)",formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getName()+" Ka Form Send Hogaya h..:)");
                                        SaveAndReadInternalData.deleteCrf1FromIndex(SendingDataActivity.this,position);
                                        sendingFormAdapter.refresh();
                                        formCrf1CollectionDTO = SaveAndReadInternalData.getSavedCrf1FromsList(SendingDataActivity.this);
                                        list_view_send.setAdapter(new SendingFormAdapter(SendingDataActivity.this, formCrf1CollectionDTO));

                                    }else {
                                        progressDialog.dismiss();
                                        SingleButtonDialog.singleBtnDialog(SendingDataActivity.this,"Internet Connection is not Working properly","Internet Sahi nahi chal raha");
                                    }
                                }
                                @Override
                                public void onFailure(Call<FormCrf1DTO> call, Throwable t) {
                                    progressDialog.dismiss();
                                    SingleButtonDialog.singleBtnDialog(SendingDataActivity.this,"Internet Connection is not Working properly","Internet Sahi nahi chal raha");
                                }
                            });
                        }

                }else {

                    SingleButtonDialog.singleBtnDialog(SendingDataActivity.this,"First Connect With Internet","Pehle Internet Say Connect hpjai");

                }

            }
        });

    }


    public void initlizePrograssDialog(){
        progressDialog = new ProgressDialog(SendingDataActivity.this);
        progressDialog.setTitle("Sending..");
        progressDialog.setMessage("Please Wait");
        progressDialog.setCancelable(false);
    }


}
