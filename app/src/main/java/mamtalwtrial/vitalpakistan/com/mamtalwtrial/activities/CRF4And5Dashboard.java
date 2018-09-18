package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.FollowUpListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.PageAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.TaskListAdapter;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowUpsCollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.SaveAndReadInternalData;

public class CRF4And5Dashboard extends AppCompatActivity {


    public static ArrayList<FollowupsDTO> listOf4and5aFollowUps;
    public static ArrayList<FollowupsDTO> listOf5bFollowUps;

    PageAdapter pagerAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    public static ArrayList<FollowupsDTO> listOfFollowUps;
    ListView listView;
    TextView tv_site, tv_astId;

    ArrayList<FollowupDetails> listfollowUpDetails;
    ArrayList<String> astList;
    ArrayList<String> addList;

   // ListView list_item;
    TaskListAdapter taskListAdapter;

    FollowUpListAdapter followUpListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf4_and5_dashboard);

        listOf4and5aFollowUps = new ArrayList<>();
        listOf5bFollowUps = new ArrayList<>();

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("Crf4 AND 5a FollowUps"));
        tabLayout.addTab(tabLayout.newTab().setText("CRF5B FollowUps"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0){

                    System.out.println("Tab 1");
                    // tv_toolbar.setText("History");
                }

                if(tab.getPosition()==1){
                    //     tv_toolbar.setText("Schedule");

                    System.out.println("Tab 2");
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        listfollowUpDetails = new ArrayList<FollowupDetails>();

        //listOfFollowUps = SaveAndReadInternalData.getFollowUpsList(CRF4And5Dashboard.this);

        FollowUpsCollectionDTO followUpsCollectionDTO = new FollowUpsCollectionDTO();

        followUpsCollectionDTO = SaveAndReadInternalData.getSavedFollowUpsList(CRF4And5Dashboard.this);

        listOfFollowUps = followUpsCollectionDTO.getFollowUpsCollection();

        if(listOfFollowUps !=null && !listOfFollowUps.isEmpty()){
            insertDataInLists(listOfFollowUps);
        }

//        taskListAdapter = new TaskListAdapter(getApplicationContext(),listfollowUpDetails);

        followUpListAdapter = new FollowUpListAdapter(getApplicationContext(),listfollowUpDetails);
        /*list_item.setAdapter(followUpListAdapter);

        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(CRF4And5Dashboard.this,CRF4aActivity.class);
                intent.putExtra("position",position);
                intent.putExtra("followupdetails",new Gson().toJson( listOfFollowUps.get(position),FollowupsDTO.class));
                startActivity(intent);
                finish();
            }
        });
*/
    }

    public void insertDataInLists(ArrayList<FollowupsDTO> listOfFollowUps){

        for (int i = 0; i<listOfFollowUps.size(); i++){

            if(listOfFollowUps.get(i)!=null){

                if(listOfFollowUps.get(i).getFollowupDetails().getForm() == null){
                    listOf4and5aFollowUps.add(listOfFollowUps.get(i));
                }else {
                    listOf5bFollowUps.add(listOfFollowUps.get(i));
                }

            }
        }
    }




    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
