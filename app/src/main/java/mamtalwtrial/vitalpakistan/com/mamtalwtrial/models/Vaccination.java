package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.StudiesDTO;

public class Vaccination {
    private Integer id;

    private TeamDTO team;
    private StudiesDTO studies;

    //BCG0
    private String bCG0Date;


    private Integer bCG0CardOrHistory;


    private Integer bCG0FromAKUOrVPT;

    //OPV0

    private String oPV0Date;


    private Integer oPV0CardOrHistory;


    private Integer oPV0FromAKUOrVPT;

    //OPV1

    private String oPV1Date;


    private Integer oPV1CardOrHistory;


    private Integer oPV1FromAKUOrVPT;

    //PENTA1
    private String pENTA1Date;
    private Integer pENTA1CardOrHistory;
    private Integer pENTA1FromAKUOrVPT;

    //PCV1
    private String pCV1Date;
    private Integer pCV1CardOrHistory;
    private Integer pCV1FromAKUOrVPT;

    //ROTA1
    private String rOTA1Date;
    private Integer rOTA1CardOrHistory;
    private Integer rOTA1FromAKUOrVPT;

    //OPV2
    private String oPV2Date;
    private Integer oPV2CardOrHistory;
    private Integer oPV2FromAKUOrVPT;

    //PENTA2
    private String pENTA2Date;
    private Integer pENTA2CardOrHistory;
    private Integer pENTA2FromAKUOrVPT;

    //PCV2
    private String pCV2Date;
    private Integer pCV2CardOrHistory;
    private Integer pCV2FromAKUOrVPT;

    //ROTA2
    private String rOTA2Date;
    private Integer rOTA2CardOrHistory;
    private Integer rOTA2FromAKUOrVPT;

    //OPV3
    private String oPV3Date;
    private Integer oPV3CardOrHistory;
    private Integer oPV3FromAKUOrVPT;

    //PENTA3
    private String pENTA3Date;
    private Integer pENTA3CardOrHistory;
    private Integer pENTA3FromAKUOrVPT;

    //PCV3
    private String pCV3Date;
    private Integer pCV3CardOrHistory;
    private Integer pCV3FromAKUOrVPT;

    //IPV
    private String iPVDate;
    private Integer iPVCardOrHistory;
    private Integer iPVFromAKUOrVPT;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id == null) return;
        this.id = id;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        if(team == null) return;
        this.team = team;
    }

    public StudiesDTO getStudies() {
        return studies;
    }

    public void setStudies(StudiesDTO studies) {
        if(studies == null) return;
        this.studies = studies;
    }

    public String getbCG0Date() {
        return bCG0Date;
    }

    public void setbCG0Date(String bCG0Date) {
        if(bCG0Date == null) return;
        this.bCG0Date = bCG0Date;
    }

    public Integer getbCG0CardOrHistory() {
        return bCG0CardOrHistory;
    }

    public void setbCG0CardOrHistory(Integer bCG0CardOrHistory) {
        if(bCG0CardOrHistory== null) return;
        this.bCG0CardOrHistory = bCG0CardOrHistory;
    }

    public Integer getbCG0FromAKUOrVPT() {
        return bCG0FromAKUOrVPT;
    }

    public void setbCG0FromAKUOrVPT(Integer bCG0FromAKUOrVPT) {
        if(bCG0FromAKUOrVPT == null) return;
        this.bCG0FromAKUOrVPT = bCG0FromAKUOrVPT;
    }

    public String getoPV0Date() {
        return oPV0Date;
    }

    public void setoPV0Date(String oPV0Date) {
        if(oPV0Date == null) return;
        this.oPV0Date = oPV0Date;
    }

    public Integer getoPV0CardOrHistory() {
        return oPV0CardOrHistory;
    }

    public void setoPV0CardOrHistory(Integer oPV0CardOrHistory) {
        if(oPV0CardOrHistory == null) return;
        this.oPV0CardOrHistory = oPV0CardOrHistory;
    }

    public Integer getoPV0FromAKUOrVPT() {
        return oPV0FromAKUOrVPT;
    }

    public void setoPV0FromAKUOrVPT(Integer oPV0FromAKUOrVPT) {
        if(oPV0FromAKUOrVPT == null) return;
        this.oPV0FromAKUOrVPT = oPV0FromAKUOrVPT;
    }

    public String getoPV1Date() {
        return oPV1Date;
    }

    public void setoPV1Date(String oPV1Date) {
        if(oPV1Date == null) return;
        this.oPV1Date = oPV1Date;
    }

    public Integer getoPV1CardOrHistory() {
        return oPV1CardOrHistory;
    }

    public void setoPV1CardOrHistory(Integer oPV1CardOrHistory) {
        if(oPV1CardOrHistory == null) return;
        this.oPV1CardOrHistory = oPV1CardOrHistory;
    }

    public Integer getoPV1FromAKUOrVPT() {
        return oPV1FromAKUOrVPT;
    }

    public void setoPV1FromAKUOrVPT(Integer oPV1FromAKUOrVPT) {
        if(oPV1FromAKUOrVPT == null) return;
        this.oPV1FromAKUOrVPT = oPV1FromAKUOrVPT;
    }

    public String getpENTA1Date() {
        return pENTA1Date;
    }

    public void setpENTA1Date(String pENTA1Date) {
        if(pENTA1Date == null) return;
        this.pENTA1Date = pENTA1Date;
    }

    public Integer getpENTA1CardOrHistory() {
        return pENTA1CardOrHistory;
    }

    public void setpENTA1CardOrHistory(Integer pENTA1CardOrHistory) {
        if(pENTA1CardOrHistory == null) return;
        this.pENTA1CardOrHistory = pENTA1CardOrHistory;
    }

    public Integer getpENTA1FromAKUOrVPT() {
        return pENTA1FromAKUOrVPT;
    }

    public void setpENTA1FromAKUOrVPT(Integer pENTA1FromAKUOrVPT) {
        if(pENTA1FromAKUOrVPT == null) return;
        this.pENTA1FromAKUOrVPT = pENTA1FromAKUOrVPT;
    }

    public String getpCV1Date() {
        return pCV1Date;
    }

    public void setpCV1Date(String pCV1Date) {
        if(pCV1Date == null) return;
        this.pCV1Date = pCV1Date;
    }

    public Integer getpCV1CardOrHistory() {
        return pCV1CardOrHistory;
    }

    public void setpCV1CardOrHistory(Integer pCV1CardOrHistory) {
        if(pCV1CardOrHistory == null) return;
        this.pCV1CardOrHistory = pCV1CardOrHistory;
    }

    public Integer getpCV1FromAKUOrVPT() {
        return pCV1FromAKUOrVPT;
    }

    public void setpCV1FromAKUOrVPT(Integer pCV1FromAKUOrVPT) {
        if(pCV1FromAKUOrVPT == null) return;
        this.pCV1FromAKUOrVPT = pCV1FromAKUOrVPT;
    }

    public String getrOTA1Date() {
        return rOTA1Date;
    }

    public void setrOTA1Date(String rOTA1Date) {
        if(rOTA1Date == null) return;
        this.rOTA1Date = rOTA1Date;
    }

    public Integer getrOTA1CardOrHistory() {
        return rOTA1CardOrHistory;
    }

    public void setrOTA1CardOrHistory(Integer rOTA1CardOrHistory) {
        if(rOTA1CardOrHistory == null) return;
        this.rOTA1CardOrHistory = rOTA1CardOrHistory;
    }

    public Integer getrOTA1FromAKUOrVPT() {
        return rOTA1FromAKUOrVPT;
    }

    public void setrOTA1FromAKUOrVPT(Integer rOTA1FromAKUOrVPT) {
        if(rOTA1FromAKUOrVPT == null) return;
        this.rOTA1FromAKUOrVPT = rOTA1FromAKUOrVPT;
    }

    public String getoPV2Date() {
        return oPV2Date;
    }

    public void setoPV2Date(String oPV2Date) {
        if(oPV2Date == null) return;
        this.oPV2Date = oPV2Date;
    }

    public Integer getoPV2CardOrHistory() {
        return oPV2CardOrHistory;
    }

    public void setoPV2CardOrHistory(Integer oPV2CardOrHistory) {
        if(oPV2CardOrHistory == null) return;
        this.oPV2CardOrHistory = oPV2CardOrHistory;
    }

    public Integer getoPV2FromAKUOrVPT() {
        return oPV2FromAKUOrVPT;
    }

    public void setoPV2FromAKUOrVPT(Integer oPV2FromAKUOrVPT) {
        if(oPV2FromAKUOrVPT == null) return;
        this.oPV2FromAKUOrVPT = oPV2FromAKUOrVPT;
    }

    public String getpENTA2Date() {
        return pENTA2Date;
    }

    public void setpENTA2Date(String pENTA2Date) {
        if(pENTA2Date == null) return;
        this.pENTA2Date = pENTA2Date;
    }

    public Integer getpENTA2CardOrHistory() {
        return pENTA2CardOrHistory;
    }

    public void setpENTA2CardOrHistory(Integer pENTA2CardOrHistory) {
        if(pENTA2CardOrHistory == null) return;
        this.pENTA2CardOrHistory = pENTA2CardOrHistory;
    }

    public Integer getpENTA2FromAKUOrVPT() {
        return pENTA2FromAKUOrVPT;
    }

    public void setpENTA2FromAKUOrVPT(Integer pENTA2FromAKUOrVPT) {
        if(pENTA2FromAKUOrVPT == null) return;
        this.pENTA2FromAKUOrVPT = pENTA2FromAKUOrVPT;
    }

    public String getpCV2Date() {
        return pCV2Date;
    }

    public void setpCV2Date(String pCV2Date) {
        if(pCV2Date == null) return;
        this.pCV2Date = pCV2Date;
    }

    public Integer getpCV2CardOrHistory() {
        return pCV2CardOrHistory;
    }

    public void setpCV2CardOrHistory(Integer pCV2CardOrHistory) {
        if(pCV2CardOrHistory == null) return;
        this.pCV2CardOrHistory = pCV2CardOrHistory;
    }

    public Integer getpCV2FromAKUOrVPT() {
        return pCV2FromAKUOrVPT;
    }

    public void setpCV2FromAKUOrVPT(Integer pCV2FromAKUOrVPT) {
        if(pCV2FromAKUOrVPT == null) return;
        this.pCV2FromAKUOrVPT = pCV2FromAKUOrVPT;
    }

    public String getrOTA2Date() {
        return rOTA2Date;
    }

    public void setrOTA2Date(String rOTA2Date) {
        if(rOTA2Date == null) return;
        this.rOTA2Date = rOTA2Date;
    }

    public Integer getrOTA2CardOrHistory() {
        return rOTA2CardOrHistory;
    }

    public void setrOTA2CardOrHistory(Integer rOTA2CardOrHistory) {
        if(rOTA2CardOrHistory == null) return;
        this.rOTA2CardOrHistory = rOTA2CardOrHistory;
    }

    public Integer getrOTA2FromAKUOrVPT() {
        return rOTA2FromAKUOrVPT;
    }

    public void setrOTA2FromAKUOrVPT(Integer rOTA2FromAKUOrVPT) {
        if(rOTA2FromAKUOrVPT == null) return;
        this.rOTA2FromAKUOrVPT = rOTA2FromAKUOrVPT;
    }

    public String getoPV3Date() {
        return oPV3Date;
    }

    public void setoPV3Date(String oPV3Date) {
        if(oPV3Date == null) return;
        this.oPV3Date = oPV3Date;
    }

    public Integer getoPV3CardOrHistory() {
        return oPV3CardOrHistory;
    }

    public void setoPV3CardOrHistory(Integer oPV3CardOrHistory) {
        if(oPV3CardOrHistory == null) return;
        this.oPV3CardOrHistory = oPV3CardOrHistory;
    }

    public Integer getoPV3FromAKUOrVPT() {
        return oPV3FromAKUOrVPT;
    }

    public void setoPV3FromAKUOrVPT(Integer oPV3FromAKUOrVPT) {
        if(oPV3FromAKUOrVPT == null) return;
        this.oPV3FromAKUOrVPT = oPV3FromAKUOrVPT;
    }

    public String getpENTA3Date() {
        return pENTA3Date;
    }

    public void setpENTA3Date(String pENTA3Date) {
        if(pENTA3Date == null) return;
        this.pENTA3Date = pENTA3Date;
    }

    public Integer getpENTA3CardOrHistory() {
        return pENTA3CardOrHistory;
    }

    public void setpENTA3CardOrHistory(Integer pENTA3CardOrHistory) {
        if(pENTA3CardOrHistory == null) return;
        this.pENTA3CardOrHistory = pENTA3CardOrHistory;
    }

    public Integer getpENTA3FromAKUOrVPT() {
        return pENTA3FromAKUOrVPT;
    }

    public void setpENTA3FromAKUOrVPT(Integer pENTA3FromAKUOrVPT) {
        if(pENTA3FromAKUOrVPT == null) return;
        this.pENTA3FromAKUOrVPT = pENTA3FromAKUOrVPT;
    }

    public String getpCV3Date() {
        return pCV3Date;
    }

    public void setpCV3Date(String pCV3Date) {
        if(pCV3Date == null) return;
        this.pCV3Date = pCV3Date;
    }

    public Integer getpCV3CardOrHistory() {
        return pCV3CardOrHistory;
    }

    public void setpCV3CardOrHistory(Integer pCV3CardOrHistory) {
        if(pCV3CardOrHistory == null) return;
        this.pCV3CardOrHistory = pCV3CardOrHistory;
    }

    public Integer getpCV3FromAKUOrVPT() {
        return pCV3FromAKUOrVPT;
    }

    public void setpCV3FromAKUOrVPT(Integer pCV3FromAKUOrVPT) {
        if(pCV3FromAKUOrVPT == null) return;
        this.pCV3FromAKUOrVPT = pCV3FromAKUOrVPT;
    }

    public String getiPVDate() {
        return iPVDate;
    }

    public void setiPVDate(String iPVDate) {
        if(iPVDate == null) return;
        this.iPVDate = iPVDate;
    }

    public Integer getiPVCardOrHistory() {
        return iPVCardOrHistory;
    }

    public void setiPVCardOrHistory(Integer iPVCardOrHistory) {
        if(iPVCardOrHistory == null) return;
        this.iPVCardOrHistory = iPVCardOrHistory;
    }

    public Integer getiPVFromAKUOrVPT() {
        return iPVFromAKUOrVPT;
    }

    public void setiPVFromAKUOrVPT(Integer iPVFromAKUOrVPT) {
        if(iPVFromAKUOrVPT == null) return;
        this.iPVFromAKUOrVPT = iPVFromAKUOrVPT;
    }
}