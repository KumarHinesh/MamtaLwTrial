package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.Forms4AllAnd5ACollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;

public class Sending4AllAnd5aAdapter extends BaseAdapter {

    private Forms4AllAnd5ACollectionDTO forms4AllAnd5ACollectionDTO;
    Context context;
    public Sending4AllAnd5aAdapter(Context context, Forms4AllAnd5ACollectionDTO forms4AllAnd5ACollectionDTO){
        this.forms4AllAnd5ACollectionDTO = forms4AllAnd5ACollectionDTO;
        this.context = context;
    }

    @Override
    public int getCount() {
        return forms4AllAnd5ACollectionDTO.getForms().size();
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

        if(forms4AllAnd5ACollectionDTO.getForms()!=null){

            if(forms4AllAnd5ACollectionDTO.getForms().get(position).getFormCrf4Complete().getFormCrf4a().getPregnantWoman() != null){
                pregnantWomanDTO = forms4AllAnd5ACollectionDTO.getForms().get(position).getFormCrf4Complete().getFormCrf4a().getPregnantWoman();
            }else if (forms4AllAnd5ACollectionDTO.getForms().get(position).getFormCrf4Complete().getFormCrf4b().getPregnantWoman() != null){
                pregnantWomanDTO = forms4AllAnd5ACollectionDTO.getForms().get(position).getFormCrf4Complete().getFormCrf4b().getPregnantWoman();
            }else if (forms4AllAnd5ACollectionDTO.getForms().get(position).getFormCrf5a().getPregnantWoman() != null){
                pregnantWomanDTO = forms4AllAnd5ACollectionDTO.getForms().get(position).getFormCrf5a().getPregnantWoman();
            }


        }
        if(!pregnantWomanDTO.getName().isEmpty()){
            tv_showName.setText(""+pregnantWomanDTO.getName()
                    +" W/O "+pregnantWomanDTO.getHusbandName());
            tv_site.setText(""+pregnantWomanDTO.getDssAddress().getSite()+":"
                    +pregnantWomanDTO.getDssAddress().getPara()+":"+
                    pregnantWomanDTO.getDssAddress().getBlock()+":"+
                    pregnantWomanDTO.getDssAddress().getStructure());
            tv_visitStatus.setText("FormCRf4 All And 5A");

            if (pregnantWomanDTO.getAvgMuac()!=null)
                tv_muac.setText(""+pregnantWomanDTO.getAvgMuac());
        }

        return convertView;
    }
}
