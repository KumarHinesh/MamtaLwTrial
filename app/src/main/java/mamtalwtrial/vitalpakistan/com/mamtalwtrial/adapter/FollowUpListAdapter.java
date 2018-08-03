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

public class FollowUpListAdapter extends BaseAdapter {

    private ArrayList<FollowupDetails> followupDetails;
    private ArrayList<String> listOfAddres;
    private ArrayList<String> listOfAst;
    private ArrayList<String> listOfTask;
    private Context context;
    int checkedPosition =-1;

    public FollowUpListAdapter(Context context, ArrayList<FollowupDetails> followupDetails) {
        this.context = context;
        this.followupDetails = followupDetails;
    }

    @Override
    public int getCount() {
        return followupDetails.size();
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
                    inflate(R.layout.crf4and5followuplist_icon, parent, false);
        }

        TextView tv_showName = (TextView) convertView.findViewById(R.id.tv_showName);
        tv_showName.setText(followupDetails.get(position).getName()+" W/O "+followupDetails.get(position).getHusbandName());

        TextView tv_astId = (TextView) convertView.findViewById(R.id.tv_astId);
        tv_astId.setText(followupDetails.get(position).getAssistId());

        TextView tv_studyId = (TextView) convertView.findViewById(R.id.tv_studyId);
        tv_studyId.setText(followupDetails.get(position).getStdyId());

        TextView tv_arm = (TextView) convertView.findViewById(R.id.tv_arm);
        tv_arm.setText(followupDetails.get(position).getArm());

        TextView tv_babyAge = (TextView) convertView.findViewById(R.id.tv_babyAge);
        tv_babyAge.setText(followupDetails.get(position).getAge());


        TextView tv_site = (TextView) convertView.findViewById(R.id.tv_site);
        tv_site.setText(followupDetails.get(position).getSite()+"-"+followupDetails.get(position).getPara()+"-"+
                followupDetails.get(position).getBlock()+"-"+followupDetails.get(position).getStructure()+"-"+
                followupDetails.get(position).getHouseholdOrFamily()+"-"+followupDetails.get(position).getWnum());

        TextView followupNO = (TextView) convertView.findViewById(R.id.tv_muac);
        followupNO.setText(followupDetails.get(position).getfNum()+"");

        return convertView;
    }
}
