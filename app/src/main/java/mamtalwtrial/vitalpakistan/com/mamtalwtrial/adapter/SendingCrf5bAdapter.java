package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCRF5bCollectionsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Forms4AllAnd5ACollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;

public class SendingCrf5bAdapter extends BaseAdapter{

    Context context;
    FormCRF5bCollectionsDTO formCRF5bCollectionsDTO;
    public SendingCrf5bAdapter(Context context, FormCRF5bCollectionsDTO formCRF5bCollectionsDTO){
        this.context = context;
        this.formCRF5bCollectionsDTO = formCRF5bCollectionsDTO;
    }

    @Override
    public int getCount() {
        return formCRF5bCollectionsDTO.getForms().size();
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

        if(formCRF5bCollectionsDTO.getForms()!=null){

            if(formCRF5bCollectionsDTO.getForms().get(position).getPregnantWoman() != null){
                pregnantWomanDTO = formCRF5bCollectionsDTO.getForms().get(position).getPregnantWoman();
            }

        }
        if(!pregnantWomanDTO.getName().isEmpty()){
            tv_showName.setText(""+pregnantWomanDTO.getName()
                    +" W/O "+pregnantWomanDTO.getHusbandName());
            tv_site.setText(""+pregnantWomanDTO.getDssAddress().getSite()+":"
                    +pregnantWomanDTO.getDssAddress().getPara()+":"+
                    pregnantWomanDTO.getDssAddress().getBlock()+":"+
                    pregnantWomanDTO.getDssAddress().getStructure());
            tv_visitStatus.setText("FormCRf5B");

            if (pregnantWomanDTO.getAvgMuac()!=null)
                tv_muac.setText(""+pregnantWomanDTO.getAvgMuac());
        }

        return convertView;
    }
}
