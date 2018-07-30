package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter.TaskListAdapter;

public class CRF4And5Dashboard extends AppCompatActivity {

    ListView list_item;
    TaskListAdapter taskListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf4_and5_dashboard);

        list_item = (ListView) findViewById(R.id.list_item);
     //   taskListAdapter = new TaskListAdapter(getApplicationContext(),);


    }
}
