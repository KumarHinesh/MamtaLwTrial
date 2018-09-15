package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCRF6CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;

public class SendingCrf6Adapter extends BaseAdapter{

    FormCRF6CollectionDTO formCRF6CollectionDTO;
    Context context;
    public SendingCrf6Adapter(Context context, FormCRF6CollectionDTO formCRF6CollectionDTO){
        this.formCRF6CollectionDTO = formCRF6CollectionDTO;
        this.context = context;
    }

    @Override
    public int getCount() {
        return formCRF6CollectionDTO.getForms().size();
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

        TextView tv_showName, tv_site, tv_visitStatus, tv_muac, tv_contact;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.sending_item_layout, parent, false);
        }

        tv_showName = (TextView) convertView.findViewById(R.id.tv_showName);
        tv_site = (TextView) convertView.findViewById(R.id.tv_site);
        tv_visitStatus = (TextView) convertView.findViewById(R.id.tv_visitStatus);
        tv_muac = (TextView) convertView.findViewById(R.id.tv_muac);
        tv_contact = (TextView) convertView.findViewById(R.id.tv_contact);

        PregnantWomanDTO pregnantWomanDTO = new PregnantWomanDTO();

        if(formCRF6CollectionDTO.getForms().get(position).getStudies().getStudyCode() != null){

            tv_visitStatus.setText("FormCRf6");
            tv_muac.setText(formCRF6CollectionDTO.getForms().get(position).getStudies().getStudyCode());

        }



        return convertView;


    }
}
