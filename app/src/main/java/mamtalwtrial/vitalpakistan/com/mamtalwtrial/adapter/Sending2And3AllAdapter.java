package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf2toCrf3AllCollection;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;

public class Sending2And3AllAdapter extends BaseAdapter {

    String[] statusListItem = {"Agree for screening (Screening k liya razamand)","Not at home (Ghar par mojoud nahi)","Refused (inkar kar diya)"
            ,"Wrong information (Ghalt information of PW)","wrong DSS infromation(pw not found)","woman was never found pregnent","woman was pregnanat but recently develiverd (age of child greater then 7 dasys)","Shifted out of DSS (DSS sa bahir chali gay)","PW died before the visit (PW ka intiqaal ho gaya"
            ,"Visitor (Mehman th and ab wapis chali gay)"};

    Context context;
    FormCrf2toCrf3AllCollection formCrf2toCrf3AllCollection;

    public Sending2And3AllAdapter(Context context,  FormCrf2toCrf3AllCollection formCrf2toCrf3AllCollection){

        this.context = context;
        this.formCrf2toCrf3AllCollection = formCrf2toCrf3AllCollection;
    }

    @Override
    public int getCount() {
        return formCrf2toCrf3AllCollection.getForms().size();
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

        if(formCrf2toCrf3AllCollection.getForms()!=null){

            if(formCrf2toCrf3AllCollection.getForms().get(position).getCrf2Status()){
                pregnantWomanDTO = formCrf2toCrf3AllCollection.getForms().get(position).getFormCrf2DTO().getPregnantWoman();
            }else if (formCrf2toCrf3AllCollection.getForms().get(position).getCrf3aStatus()){
                pregnantWomanDTO = formCrf2toCrf3AllCollection.getForms().get(position).getFormCrf3aDTO().getPregnantWoman();
            }else if (formCrf2toCrf3AllCollection.getForms().get(position).getCrf3bStatus()){
                pregnantWomanDTO = formCrf2toCrf3AllCollection.getForms().get(position).getFormCrf3bDTO().getPregnantWoman();
            }else if (formCrf2toCrf3AllCollection.getForms().get(position).getCrf3cStatus()){
                pregnantWomanDTO = formCrf2toCrf3AllCollection.getForms().get(position).getFormCrf3cDTO().getPregnantWoman();
            }

        }
        if(!pregnantWomanDTO.getName().isEmpty()){
            tv_showName.setText(""+pregnantWomanDTO.getName()
                    +" W/O "+pregnantWomanDTO.getHusbandName());
            tv_site.setText(""+pregnantWomanDTO.getDssAddress().getSite()+":"
                    +pregnantWomanDTO.getDssAddress().getPara()+":"+
                    pregnantWomanDTO.getDssAddress().getBlock()+":"+
                    pregnantWomanDTO.getDssAddress().getStructure());
            tv_visitStatus.setText(statusListItem[pregnantWomanDTO.getVisitStatus()]+"");

            if (pregnantWomanDTO.getAvgMuac()!=null)
                tv_muac.setText(""+pregnantWomanDTO.getAvgMuac());
            /*if (formCrf2toCrf3AllCollection.getForms().get(position).getFormCrf3cDTO().getPregnantWoman().getContactNumbers()!=null)
                tv_contact.setText(""+formCrf2toCrf3AllCollection.getForms().get(position).getFormCrf3cDTO().getContactNumbers().toArray());*/
        }
        return convertView;
    }

    public void refresh(){
        notifyDataSetChanged();
    }

}