package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.SearchResult;

public class SearchIteamsAdapter extends BaseAdapter {

    SearchResult searchResult;
    Context context;

    public SearchIteamsAdapter(Context context, SearchResult searchResult) {

        this.context = context;
        this.searchResult = searchResult;
    }

    @Override
    public int getCount() {
        return searchResult.getPregnantWomen().size();
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
        tv_showName.setText(searchResult.getPregnantWomen().get(position).getName()+"");

        TextView tv_astId = (TextView) convertView.findViewById(R.id.tv_astId);
        tv_astId.setText(searchResult.getPregnantWomen().get(position).getAssessmentId()+"");

        TextView tv_site = (TextView) convertView.findViewById(R.id.tv_site);
        tv_site.setText(searchResult.getPregnantWomen().get(position).getDssAddress().getSite()+"");
        /*tv_site.setText(followupDetails.get(position).getSite()+"-"+followupDetails.get(position).getPara()+"-"+
                followupDetails.get(position).getBlock()+"-"+followupDetails.get(position).getStructure()+"-"+
                followupDetails.get(position).getHouseholdOrFamily());
*/
        return convertView;

    }
}
