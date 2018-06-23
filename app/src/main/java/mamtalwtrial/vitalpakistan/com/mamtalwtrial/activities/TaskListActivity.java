package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.TaskListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.DSSAddressDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;

public class TaskListActivity extends AppCompatActivity {

    ArrayList<FollowupsDTO> listOfFollowUps;
    ListView listView;
    TextView  tv_site, tv_astId;

    ArrayList<FollowupDetails> listfollowUpDetails;
    ArrayList<String> astList;
    ArrayList<String> addList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        listfollowUpDetails = new ArrayList<FollowupDetails>();

        tv_astId  = (TextView) findViewById(R.id.tv_astId);

        listOfFollowUps = SaveAndReadInternalData.getFollowUpsList(TaskListActivity.this);

        /*womanNameList = new ArrayList<String>();
        addList = new ArrayList<String>();
        astList = new ArrayList<String>();
*/

          if(listOfFollowUps !=null && !listOfFollowUps.isEmpty()){
                for(int i=0; i<listOfFollowUps.size(); i++){

                    listfollowUpDetails.add(listOfFollowUps.get(i).getFollowupDetails());
                }
          }
         listView = (ListView) findViewById(R.id.lv_task);
        TaskListAdapter taskListAdapter = new TaskListAdapter(TaskListActivity.this,listfollowUpDetails);

        listView.setAdapter(taskListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                PregnantWomanDTO pregnantWomanDTO = new PregnantWomanDTO();
                DSSAddressDTO dssAddressDTO = new DSSAddressDTO();
                dssAddressDTO.setSite(listOfFollowUps.get(position).getFollowupDetails().getSite());
                dssAddressDTO.setPara(listOfFollowUps.get(position).getFollowupDetails().getPara());
                dssAddressDTO.setBlock(listOfFollowUps.get(position).getFollowupDetails().getBlock());
                dssAddressDTO.setStructure(listOfFollowUps.get(position).getFollowupDetails().getStructure());
                dssAddressDTO.setHouseholdOrFamily(listOfFollowUps.get(position).getFollowupDetails().getHouseholdOrFamily());
                dssAddressDTO.setWomanNumber(listOfFollowUps.get(position).getFollowupDetails().getWomanNumber());
                pregnantWomanDTO.setAssessmentId(listOfFollowUps.get(position).getFollowupDetails().getAssistId());
                pregnantWomanDTO.setName(listOfFollowUps.get(position).getFollowupDetails().getName());
                pregnantWomanDTO.setHusbandName(listOfFollowUps.get(position).getFollowupDetails().getHusbandName());

                pregnantWomanDTO.setDssAddress(dssAddressDTO);

              if(UserLoginActivity.teamType.equalsIgnoreCase("SCREENING")){
                    FormCrf1DTO formCrf1DTO = new FormCrf1DTO();
                    formCrf1DTO.setFollowUpPositionInList(position);
                    formCrf1DTO.setPregnantWoman(pregnantWomanDTO);
                    formCrf1DTO.setFollowupId(listOfFollowUps.get(position).getId());


                    Intent intent = new Intent(TaskListActivity.this,CRF1Activity.class);
                    intent.putExtra("form",new Gson().toJson(formCrf1DTO,FormCrf1DTO.class));
                    startActivity(intent);
                    finish();

                }
                if(UserLoginActivity.teamType.equalsIgnoreCase("RANDOMIZATION")){

                    FormCrf2DTO formCrf2DTO = new FormCrf2DTO();

                    formCrf2DTO.setPregnantWoman(pregnantWomanDTO);
                    formCrf2DTO.setFollowupId(listOfFollowUps.get(position).getId());

                    Intent intent = new Intent(TaskListActivity.this,CRF2Activity.class);
                    intent.putExtra("form",new Gson().toJson(formCrf2DTO,FormCrf2DTO.class));
                    startActivity(intent);
                    finish();


                }

              //  CRF1Activity.formCrf1DTO.setPregnantWoman(listOfFollowUps.get(position).getFollowupDetails().);


            }
        });
    }

    @Override
    public void onBackPressed() {

        startActivity(new Intent(TaskListActivity.this,DashboardActivity.class));
        finish();
        super.onBackPressed();
    }
}

