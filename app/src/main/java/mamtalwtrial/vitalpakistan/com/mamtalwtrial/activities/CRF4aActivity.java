package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf4a_fragments.Crf4WomeninfoFragment;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.DSSAddressDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupDetails;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a.FormCrf4aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a.FormCrf4aDetailsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4b.FormCrf4bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;

public class CRF4aActivity extends AppCompatActivity {

    public static int position;
    public static FormCrf4aDTO formCrf4aDTO;
    public static FormCrf4bDTO formCrf4bDTO;
    public static FormCrf5a formCrf5a;
    public static List listOfq27Toq73;
    public FollowupDetails followupDetails;
    public static FollowupsDTO followupDto;
    public static int startHour = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf4a);

        formCrf4aDTO = new FormCrf4aDTO();
        formCrf4bDTO = new FormCrf4bDTO();
        formCrf5a = new FormCrf5a();
        listOfq27Toq73 = new ArrayList<FormCrf4aDetailsDTO>();


        Intent intent = getIntent();
        String followUpDetails = intent.getStringExtra("followupdetails");

        position = intent.getIntExtra("position",-1);
        TeamDTO teamDTO = new TeamDTO();

        teamDTO.setId(getSharedPreferences("teamId",CRF1Activity.MODE_PRIVATE).getInt("id",-1));


        followupDto = new Gson().fromJson(followUpDetails, FollowupsDTO.class);

        followupDetails = followupDto.getFollowupDetails();

        PregnantWomanDTO pregnantWomanDTO = new PregnantWomanDTO();
        DSSAddressDTO dssAddressDTO = new DSSAddressDTO();
        dssAddressDTO.setSite(followupDetails.getSite());
        dssAddressDTO.setPara(followupDetails.getPara());
        dssAddressDTO.setBlock(followupDetails.getBlock());
        dssAddressDTO.setStructure(followupDetails.getStructure());
        dssAddressDTO.setHouseholdOrFamily(followupDetails.getHouseholdOrFamily());
        dssAddressDTO.setWomanNumber(Integer.parseInt(followupDetails.getWnum()));
        pregnantWomanDTO.setAssessmentId(followupDetails.getAssistId());
        pregnantWomanDTO.setName(followupDetails.getName());
        pregnantWomanDTO.setHusbandName(followupDetails.getHusbandName());

        pregnantWomanDTO.setDssAddress(dssAddressDTO);



        formCrf5a.setFollowupNumber(Integer.parseInt(followupDto.getFollowupDetails().getfNum()));
        formCrf5a.setPregnantWoman(pregnantWomanDTO);
        formCrf5a.setTeam(teamDTO);
        formCrf5a.setFollowupId(followupDto.getId());

        formCrf4aDTO.setFollowupNumber(Integer.parseInt(CRF4aActivity.followupDto.getFollowupDetails().getfNum()));
        formCrf4aDTO.setPregnantWoman(pregnantWomanDTO);
        formCrf4aDTO.setTeam(teamDTO);
        formCrf4aDTO.setFollowupId(followupDto.getId());

        formCrf4bDTO.setFollowupNumber(Integer.parseInt(CRF4aActivity.followupDto.getFollowupDetails().getfNum()));
        formCrf4bDTO.setPregnantWoman(pregnantWomanDTO);
        formCrf4bDTO.setTeam(teamDTO);
        formCrf4aDTO.setFollowupId(followupDto.getId());

        Crf4WomeninfoFragment fragment = new Crf4WomeninfoFragment();

        // Crf4aCounselingQ79 crf4aCounselingQ79 = new Crf4aCounselingQ79();

     //   Crf4bQ20Fragment fragment = new Crf4bQ20Fragment();

     //   Crf4aQ20Fragment fragment = new Crf4aQ20Fragment();

      //  Crf5aQ26Fragment fragment = new Crf5aQ26Fragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout4a, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();


    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
