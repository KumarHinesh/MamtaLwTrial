package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment.Crf5bQ25Fragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf5b_fragment.PwInfoCrf5bFragmnet;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments.PwInfoCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.DSSAddressDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5b;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5bDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.utils.ContantsValues;

public class CRF5bActivity extends AppCompatActivity {

    public static int positionOfFollowup = -1;
    public static FormCrf5b formCrf5b;
    public static FormCrf5bDetails formCrf5bDetails;
    public static int startHour = 0;
    public static ArrayList<FormCrf5bDetails> listFormCrf5bDetails;
    public static FollowupsDTO followupsDTO;
    PregnantWomanDTO pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf5b);

        TeamDTO teamDTO = new TeamDTO();

        teamDTO.setId(getSharedPreferences("teamId",CRF1Activity.MODE_PRIVATE).getInt("id",-1));


        Intent intent = getIntent();

        String[] data =  intent.getStringArrayExtra("data");

        positionOfFollowup =  Integer.parseInt(data[0]);
        followupsDTO =  new Gson().fromJson(data[1], FollowupsDTO.class);

        listFormCrf5bDetails = new ArrayList<>();
        formCrf5bDetails = new FormCrf5bDetails();
        pw = setDataInPw(followupsDTO);
        formCrf5b = new FormCrf5b();

        formCrf5b.setPregnantWoman(pw);

        formCrf5b.setTeam(teamDTO);


        formCrf5b.setFollowupNumber(Integer.parseInt(followupsDTO.getFollowupDetails().getfNum()));

        formCrf5b.setDateOfAttempt(new SimpleDateFormat(ContantsValues.DATEFORMAT).format(Calendar.getInstance().getTime()));
        formCrf5b.setTimeOfAttempt(new SimpleDateFormat(ContantsValues.TIMEFORMAT).format(Calendar.getInstance().getTime()));

        formCrf5b.setId(followupsDTO.getId());


        PwInfoCrf5bFragmnet pwInfoCrf5bFragmnet = new PwInfoCrf5bFragmnet();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, pwInfoCrf5bFragmnet, pwInfoCrf5bFragmnet.getClass().getSimpleName()).addToBackStack(null).commit();



    }

    public PregnantWomanDTO setDataInPw(FollowupsDTO followupsDTO){

        PregnantWomanDTO pregnantWomanDTO = new PregnantWomanDTO();

        DSSAddressDTO dssAddressDTO = new DSSAddressDTO();



        dssAddressDTO.setSite(followupsDTO.getFollowupDetails().getSite());
        dssAddressDTO.setPara(followupsDTO.getFollowupDetails().getPara());
        dssAddressDTO.setHouseholdOrFamily(followupsDTO.getFollowupDetails().getHouseholdOrFamily());
        dssAddressDTO.setBlock(followupsDTO.getFollowupDetails().getBlock());
        dssAddressDTO.setStructure(followupsDTO.getFollowupDetails().getStructure());
        dssAddressDTO.setWomanNumber(followupsDTO.getFollowupDetails().getWomanNumber());

        pregnantWomanDTO.setName(followupsDTO.getFollowupDetails().getName());
        pregnantWomanDTO.setHusbandName(followupsDTO.getFollowupDetails().getHusbandName());
        pregnantWomanDTO.setAssessmentId(followupsDTO.getFollowupDetails().getAssistId());

        pregnantWomanDTO.setDssAddress(dssAddressDTO);

        return pregnantWomanDTO;
    }
}
