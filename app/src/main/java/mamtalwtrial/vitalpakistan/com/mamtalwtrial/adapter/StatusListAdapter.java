package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;

public class StatusListAdapter extends BaseAdapter {

   private String[] listOfStatus;
   private Context context;
   int checkedPosition =-1;


    public StatusListAdapter(Context context, String[] listOfStatus){
        this.context = context;
        this.listOfStatus = listOfStatus;

    }

    @Override
    public int getCount() {
        return listOfStatus.length;
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
                    inflate(R.layout.status_list_item, parent, false);
        }

        TextView tvStatusItem = (TextView) convertView.findViewById(R.id.tvStatusItem);
        tvStatusItem.setText(listOfStatus[position]);
        CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.checkbox);

        if(position==checkedPosition){

            checkBox.setChecked(true);

        }else {

            checkBox.setChecked(false);
        }


        return convertView;
    }

    public void setChecked(int position){

        checkedPosition = position;

        notifyDataSetChanged();

    }


}
