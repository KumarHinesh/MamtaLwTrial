package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;

public class TaskListAdapter extends BaseAdapter {

    private ArrayList<FollowupsDTO> followupsDTOS;
    private ArrayList<String> listOfAddres;
    private ArrayList<String> listOfAst;
    private ArrayList<String> listOfTask;
    private Context context;
    int checkedPosition =-1;

    public TaskListAdapter(Context context, ArrayList<FollowupsDTO> followupDetails) {
        this.context = context;
        this.followupsDTOS = followupDetails;
    }

    @Override
    public int getCount() {
        return followupsDTOS.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.task_list_item, parent, false);
        }

        TextView tv_showName = (TextView) convertView.findViewById(R.id.tv_showName);
        tv_showName.setText(followupsDTOS.get(position).getFollowupDetails().getName());

        TextView tv_astId = (TextView) convertView.findViewById(R.id.tv_astId);
        tv_astId.setText(followupsDTOS.get(position).getFollowupDetails().getAssistId());


        TextView tv_site = (TextView) convertView.findViewById(R.id.tv_site);
        tv_site.setText(followupsDTOS.get(position).getFollowupDetails().getSite()+"-"+followupsDTOS.get(position).getFollowupDetails().getPara()+"-"+
                followupsDTOS.get(position).getFollowupDetails().getBlock()+"-"+followupsDTOS.get(position).getFollowupDetails().getStructure()+"-"+
                followupsDTOS.get(position).getFollowupDetails().getHouseholdOrFamily());

        //TextView muac_dumy = (TEx)

        return convertView;
    }
}
