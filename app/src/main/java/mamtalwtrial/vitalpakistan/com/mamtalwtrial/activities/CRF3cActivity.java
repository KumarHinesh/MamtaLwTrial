package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf3c_fragments.Crf3cQ16BabyLengthFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FormsCrf2AndCrf3All;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.ChildWeightCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.FormCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.MuacLwCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class CRF3cActivity extends AppCompatActivity {

    public static FormCrf3cDTO formCrf3cDTO;
    public static FormsCrf2AndCrf3All formsCrf2AndCrf3All;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf3c);

        formsCrf2AndCrf3All = new Gson().fromJson(getIntent().getStringExtra("forms"),FormsCrf2AndCrf3All.class) ;


        formCrf3cDTO = new FormCrf3cDTO();

        formCrf3cDTO.setPregnantWoman(formsCrf2AndCrf3All.getFormCrf3aDTO().getPregnantWoman());
        formCrf3cDTO.setTeam(formsCrf2AndCrf3All.getFormCrf3bDTO().getTeam());


        formCrf3cDTO.setQ27(formsCrf2AndCrf3All.getFormCrf2DTO().getQ30());
        formCrf3cDTO.setQ15(formsCrf2AndCrf3All.getFormCrf2DTO().getQ34());


        List<ChildWeightCrf3cDTO> list = new ArrayList<ChildWeightCrf3cDTO>();
        List<MuacLwCrf3cDTO>    listMuac = new ArrayList<MuacLwCrf3cDTO>();

        for(int i =0; i<formsCrf2AndCrf3All.getFormCrf2DTO().getChildWeights().size(); i++){

            ChildWeightCrf3cDTO childWeightCrf3cDTO = new ChildWeightCrf3cDTO();

            childWeightCrf3cDTO.setReaderCode1(formsCrf2AndCrf3All.getFormCrf2DTO().getChildWeights().get(i).getReaderCode1());
            childWeightCrf3cDTO.setReaderCode2(formsCrf2AndCrf3All.getFormCrf2DTO().getChildWeights().get(i).getReaderCode2());
            childWeightCrf3cDTO.setReader1(formsCrf2AndCrf3All.getFormCrf2DTO().getChildWeights().get(i).getReader1());
            childWeightCrf3cDTO.setReader2(formsCrf2AndCrf3All.getFormCrf2DTO().getChildWeights().get(i).getReader2());
            childWeightCrf3cDTO.setDifference(formsCrf2AndCrf3All.getFormCrf2DTO().getChildWeights().get(i).getDifference());
            childWeightCrf3cDTO.setId(formsCrf2AndCrf3All.getFormCrf2DTO().getChildWeights().get(i).getId());

            list.add(childWeightCrf3cDTO);

        }

        formCrf3cDTO.setChildWeightCrf3c(list);


        for(int i =0; i<formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().size(); i++){

            MuacLwCrf3cDTO muacLwCrf3cDTO = new MuacLwCrf3cDTO();

            muacLwCrf3cDTO.setReaderCode1(formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().get(i).getReaderCode1());
            muacLwCrf3cDTO.setReaderCode2(formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().get(i).getReaderCode2());
            muacLwCrf3cDTO.setReader1(formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().get(i).getReader1());
            muacLwCrf3cDTO.setReader2(formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().get(i).getReader2());
            muacLwCrf3cDTO.setDifference(formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().get(i).getDifference());
            muacLwCrf3cDTO.setId(formsCrf2AndCrf3All.getFormCrf2DTO().getArmReadings().get(i).getId());

            listMuac.add(muacLwCrf3cDTO);

        }

        formCrf3cDTO.setMuacLwCrf3c(listMuac);


        formCrf3cDTO.setQ2(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        formCrf3cDTO.setQ3(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));



        Crf3cQ16BabyLengthFragment fragment4 = new Crf3cQ16BabyLengthFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout_crf3c, fragment4, fragment4.getClass().getSimpleName()).addToBackStack(null).commit();



    }


}
