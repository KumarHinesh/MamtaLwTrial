package mamtalwtrial.vitalpakistan.com.mamtalwtrial.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1CollectionDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormCrf1DTO;


public class SendingFormAdapter extends BaseAdapter{

    String[] statusListItem = {"Agree for screening (Screening k liya razamand)","Not at home (Ghar par mojoud nahi)","Refused (inkar kar diya)"
            ,"Wrong information (Ghalt information of PW)","wrong DSS infromation(pw not found)","woman was never found pregnent","woman was pregnanat but recently develiverd (age of child greater then 7 dasys)","Shifted out of DSS (DSS sa bahir chali gay)","PW died before the visit (PW ka intiqaal ho gaya"
            ,"Visitor (Mehman th and ab wapis chali gay)"};

    Context context;
    FormCrf1CollectionDTO formCrf1CollectionDTO;

    public SendingFormAdapter(Context context,  FormCrf1CollectionDTO formCrf1CollectionDTO){

        this.context = context;
        this.formCrf1CollectionDTO = formCrf1CollectionDTO;
    }

    @Override
    public int getCount() {
        return formCrf1CollectionDTO.getForms().size();
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

        if(formCrf1CollectionDTO.getForms()!=null){

        }
        if(formCrf1CollectionDTO.getForms().get(position).getPregnantWoman()!=null){

            tv_showName.setText(""+formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getName()
                                +" W/O "+formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getHusbandName());
            tv_site.setText(""+formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getDssAddress().getSite()+":"
                    +formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getDssAddress().getPara()+":"+
                    formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getDssAddress().getBlock()+":"+
                    formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getDssAddress().getStructure());
            tv_visitStatus.setText(statusListItem[formCrf1CollectionDTO.getForms().get(position).getVisitStatus()]+"");

            if (formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getAvgMuac()!=null)
                tv_muac.setText(""+formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getAvgMuac());
            if (formCrf1CollectionDTO.getForms().get(position).getPregnantWoman().getContactNumbers()!=null)
                tv_contact.setText(""+formCrf1CollectionDTO.getForms().get(position).getContactNumbers().toArray());
        }


        return convertView;
    }

    public void refresh(){

        notifyDataSetChanged();
    }

}
