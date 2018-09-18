package mamtalwtrial.vitalpakistan.com.mamtalwtrial.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.R;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.fragments.crf6_fragments.PwInfoCrf6;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.DSSAddressDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.FollowupsDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.StudiesDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;

public class Crf6Activity extends AppCompatActivity {

    public static int selectedPosition = -1;
    public static FormCrf6 formCrf6;
    public static StudiesDTO studiesDTO;
    public static FollowupsDTO followupsDTO;
    public static PregnantWomanDTO pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crf6);

        Intent intent = getIntent();

        String[] data = intent.getStringArrayExtra("data");

        selectedPosition = Integer.parseInt(data[0]);
        followupsDTO = new Gson().fromJson(data[1],FollowupsDTO.class);


        TeamDTO teamDTO = new TeamDTO();

        teamDTO.setId(getSharedPreferences("teamId",CRF1Activity.MODE_PRIVATE).getInt("id",-1));

       // pw = detailsToDto(followupsDTO);
        formCrf6 = new FormCrf6();

//        VaccinationFragment vaccinationFragment = new VaccinationFragment();

        PwInfoCrf6 pwInfoCrf6 = new PwInfoCrf6();

        formCrf6.setTeam(teamDTO);

        formCrf6.setFollowUpNum(followupsDTO.getFollowupDetails().getfNum());
        formCrf6.setFollowupId(followupsDTO.getId());

        studiesDTO = new StudiesDTO();

        studiesDTO.setStudyCode(followupsDTO.getFollowupDetails().getStdyId());
        studiesDTO.setStudyId(followupsDTO.getFollowupDetails().getStdyId());
        formCrf6.setStudies(studiesDTO);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layoutcrf6, pwInfoCrf6, pwInfoCrf6.getClass().getSimpleName()).addToBackStack(null).commit();

    }

    public PregnantWomanDTO detailsToDto(FollowupsDTO followupsDTO){

        PregnantWomanDTO pregnantWomanDTO = new PregnantWomanDTO();
        DSSAddressDTO dssAddressDTO = new DSSAddressDTO();

            dssAddressDTO.setBlock(followupsDTO.getFollowupDetails().getBlock());
            dssAddressDTO.setHouseholdOrFamily(followupsDTO.getFollowupDetails().getHouseholdOrFamily());
            dssAddressDTO.setPara(followupsDTO.getFollowupDetails().getPara());
            dssAddressDTO.setSite(followupsDTO.getFollowupDetails().getSite());

            pregnantWomanDTO.setDssAddress(dssAddressDTO);
            pregnantWomanDTO.setName(followupsDTO.getFollowupDetails().getName());
            pregnantWomanDTO.setHusbandName(followupsDTO.getFollowupDetails().getHusbandName());


        return   pregnantWomanDTO;
    }


    @Override
    public void onBackPressed() {
       //s super.onBackPressed();
    }
}
