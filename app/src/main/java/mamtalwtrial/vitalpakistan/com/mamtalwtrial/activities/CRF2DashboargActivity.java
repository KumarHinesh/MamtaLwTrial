package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.SearchIteamsAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.messageDialogBox.SingleButtonDialog;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.SearchResult;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.APIService;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.retrofit.ApiUtils;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.WifiConnectOrNot;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CRF2DashboargActivity extends AppCompatActivity {

    int a;

    ListView lv_womanList;
    Button btn_randTeam_task, btnUploadData;
    EditText et_site, et_para, et_block, et_structure;
    ImageButton btn_search;
    SearchResult searchResult;

    private APIService mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf2dashboard);

        lv_womanList = (ListView) findViewById(R.id.lv_womanList);


        a =  SaveAndReadInternalData.isDataAvailable(CRF2DashboargActivity.this);

        btnUploadData = (Button) findViewById(R.id.btnUploadData);

        if(a==-1){

            btnUploadData.setBackgroundResource(R.drawable.button_shape_green);
            btnUploadData.setText("DataUploaded");
        }else {

            btnUploadData.setBackgroundResource(R.drawable.button_shape_color);
            btnUploadData.setText("Upload Data "+a);
        }

        btnUploadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(WifiConnectOrNot.haveNetworkConnection(getApplicationContext())){

  //                  SaveAndReadInternalData.uploadData(DashboardActivity.this);
    //                startActivity(new Intent(DashboardActivity.this,DashboardActivity.class));
      //              finish();

                }else {

//                    SingleButtonDialog.singleBtnDialog(DashboardActivity.this,"First Connect With Internet","Pehle Internet Say Connect hpjai");

                }

            }
        });



        btn_search = (ImageButton) findViewById(R.id.btn_search);
        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(WifiConnectOrNot.haveNetworkConnection(CRF2DashboargActivity.this)){
                    mAPIService = ApiUtils.getAPIService();

                    if(validation()){
                        mAPIService.searchWoman(et_site.getText().toString(),et_para.getText().toString(),
                                et_block.getText().toString(),et_structure.getText().toString()).enqueue(new Callback<SearchResult>() {
                            @Override
                            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {

                                searchResult = response.body();

                                if(searchResult!=null){

                                    SearchIteamsAdapter searchIteamsAdapter = new SearchIteamsAdapter(CRF2DashboargActivity.this,searchResult);
                                    lv_womanList.setAdapter(searchIteamsAdapter);

                                }


                            }

                            @Override
                            public void onFailure(Call<SearchResult> call, Throwable t) {

                                SingleButtonDialog.singleBtnDialog(CRF2DashboargActivity.this,"Sorry Data Not Found","Data Mojood nhi Hai  pehle");
                            }
                        });

                    }

                }else {

                    SingleButtonDialog.singleBtnDialog(CRF2DashboargActivity.this, "First Connect With Internet","Pehle Internet Say Connect hpjai");
                }

            }
        });


        lv_womanList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(Float.parseFloat(searchResult.getPregnantWomen().get(position).getAvgMuac().toString())<24 &&
                        searchResult.getPregnantWomen().get(position).getVisitStatus()==0){

                    String selectedForm = new Gson().toJson(searchResult.getPregnantWomen().get(position), PregnantWomanDTO.class);

                    startActivity(new Intent(CRF2DashboargActivity.this,CRF2Activity.class).putExtra("pw",selectedForm));
                    finish();

                }else {


                    Toast.makeText(CRF2DashboargActivity.this,"Sorry MAUC is Greter Then 23.9",Toast.LENGTH_LONG).show();

                }


            }
        });

        btn_randTeam_task = (Button) findViewById(R.id.btn_randTeam_task);
        btn_randTeam_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

         //       startActivity(new Intent(CRF2DashboargActivity.this,TaskListActivity.class));
            }
        });

        et_site = (EditText) findViewById(R.id.et_site);
        et_para = (EditText) findViewById(R.id.et_para);
        et_block = (EditText) findViewById(R.id.et_block);
        et_structure = (EditText) findViewById(R.id.et_structure);

    }


    public boolean validation(){
        boolean b = true;

        if(et_site.getText().toString().isEmpty()){
            b = false;
            et_site.setError("Required");
        }
        if(et_para.getText().toString().isEmpty()){
            b = false;
            et_para.setError("Required");

        }
        if(et_block.getText().toString().isEmpty()){

            b = false;
            et_block.setError("Required");
        }
        if(et_structure.getText().toString().isEmpty()){

            b = false;
            et_structure.setError("Required");
        }
        return b;
    }


    @Override
    public void onBackPressed() {
       // super.onBackPressed();
    }
}
