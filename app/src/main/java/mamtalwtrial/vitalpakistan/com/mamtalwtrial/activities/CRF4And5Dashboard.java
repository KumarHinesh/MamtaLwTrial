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
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.FollowUpListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.TaskListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;

public class CRF4And5Dashboard extends AppCompatActivity {

    ArrayList<FollowupsDTO> listOfFollowUps;
    ListView listView;
    TextView tv_site, tv_astId;

    ArrayList<FollowupDetails> listfollowUpDetails;
    ArrayList<String> astList;
    ArrayList<String> addList;

    ListView list_item;
    TaskListAdapter taskListAdapter;

    FollowUpListAdapter followUpListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf4_and5_dashboard);


        listfollowUpDetails = new ArrayList<FollowupDetails>();
        list_item = (ListView) findViewById(R.id.list_item);
        listOfFollowUps = SaveAndReadInternalData.getFollowUpsList(CRF4And5Dashboard.this);

        if(listOfFollowUps !=null && !listOfFollowUps.isEmpty()){
            for(int i=0; i<listOfFollowUps.size(); i++){

                listfollowUpDetails.add(listOfFollowUps.get(i).getFollowupDetails());

            }
        }

//        taskListAdapter = new TaskListAdapter(getApplicationContext(),listfollowUpDetails);

        followUpListAdapter = new FollowUpListAdapter(getApplicationContext(),listfollowUpDetails);
        list_item.setAdapter(followUpListAdapter);

        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(CRF4And5Dashboard.this,CRF4aActivity.class);
                intent.putExtra("followupdetails",new Gson().toJson( listfollowUpDetails.get(position),FollowupDetails.class));
                startActivity(intent);
            }
        });

    }

}
