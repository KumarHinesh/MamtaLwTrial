package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

        ImageView iv_1 = (ImageView) convertView.findViewById(R.id.iv_1);

        try{

            if(Float.parseFloat(searchResult.getPregnantWomen().get(position).getAvgMuac().toString())<24 &&
                    searchResult.getPregnantWomen().get(position).getVisitStatus()==0 ){


                iv_1.setBackgroundResource(R.drawable.green_circle);

            }else {

                iv_1.setBackgroundResource(R.drawable.red_circle);
            }


        }catch (Exception e){}

        TextView tv_visitStatus = (TextView) convertView.findViewById(R.id.tv_visitStatus);
        tv_visitStatus.setText(searchResult.getPregnantWomen().get(position).getVisitStatus()+"");



        TextView tv_muac = (TextView) convertView.findViewById(R.id.tv_muac);
        LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.ll_muac);
        linearLayout.setVisibility(View.VISIBLE);
        tv_muac.setText(searchResult.getPregnantWomen().get(position).getAvgMuac().toString()+"");

        TextView tv_showName = (TextView) convertView.findViewById(R.id.tv_showName);
        tv_showName.setText(searchResult.getPregnantWomen().get(position).getName()+"");

        TextView tv_astId = (TextView) convertView.findViewById(R.id.tv_astId);
        tv_astId.setText(searchResult.getPregnantWomen().get(position).getAssessmentId()+"");

        TextView tv_site = (TextView) convertView.findViewById(R.id.tv_site);
        tv_site.setText(searchResult.getPregnantWomen().get(position).getDssAddress().getSite()+":"+
                searchResult.getPregnantWomen().get(position).getDssAddress().getPara()+":"
                +searchResult.getPregnantWomen().get(position).getDssAddress().getBlock()+":"+
                searchResult.getPregnantWomen().get(position).getDssAddress().getStructure());

        String a="";

        for(int i = 0; i<searchResult.getPregnantWomen().get(position).getContactNumbers().size(); i++){

             a = a+""+searchResult.getPregnantWomen().get(position).getContactNumbers().get(i).getContactNumber();

          //  a = a+(searchResult.getPregnantWomen().get(position).getContactNumbers().get(i));
        }

        TextView tv_contact = (TextView) convertView.findViewById(R.id.tv_contact);
        LinearLayout ll = (LinearLayout) convertView.findViewById(R.id.ll_contacts);
        ll.setVisibility(View.VISIBLE);
        tv_contact.setText(a);

        /*tv_site.setText(followupDetails.get(position).getSite()+"-"+followupDetails.get(position).getPara()+"-"+
                followupDetails.get(position).getBlock()+"-"+followupDetails.get(position).getStructure()+"-"+
                followupDetails.get(position).getHouseholdOrFamily());
*/
        return convertView;

    }
}
