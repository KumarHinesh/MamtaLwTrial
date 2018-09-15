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

public class AnthroDashBoard extends AppCompatActivity {

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
        setContentView(R.layout.activity_anthro_dash_board);


        listfollowUpDetails = new ArrayList<FollowupDetails>();
        list_item = (ListView) findViewById(R.id.list_item);
        listOfFollowUps = SaveAndReadInternalData.getFollowUpsList(AnthroDashBoard.this);


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

                Intent intent = new Intent(AnthroDashBoard.this,Crf6Activity.class);
                intent.putExtra("position",position);
                intent.putExtra("followupdetails",new Gson().toJson( listOfFollowUps.get(position),FollowupsDTO.class));
                startActivity(intent);
                finish();
            }
        });




    }

}
