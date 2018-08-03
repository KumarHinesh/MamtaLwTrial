package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a;


import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.StudiesDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a.FormCrf4aDetailsDTO;

public class FormCrf4aDTO {

    private Integer id;

    private Integer followupStatus;
    private Integer followupId;
    private Integer formStatus;

    public Integer getFollowupStatus() {
        return followupStatus;
    }

    public void setFollowupStatus(Integer followupStatus) {
        this.followupStatus = followupStatus;
    }

    public Integer getFollowupId() {
        return followupId;
    }

    public void setFollowupId(Integer followupId) {
        this.followupId = followupId;
    }

    public Integer getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(Integer formStatus) {
        this.formStatus = formStatus;
    }

    private TeamDTO team;
    private StudiesDTO studies;
    private List<FormCrf4aDetailsDTO> details;
    private PregnantWomanDTO pregnantWoman;
    private String dateOfAttempt;
    private String timeOfAttempt;
    private String codeOfResearhStaff;
    private String q9;
    private String q18;
    private String q19;
    private String q20;
    private String q21;
    private String q22;
    private String q23;
    private String q24;
    private String q25;
    private String q26;

    public String getQ9() {
        return q9;
    }

    public void setQ9(String q9) {
        this.q9 = q9;
    }

    private String q74;
    private String q75;
    private String q76;
    private String q77;
    private String q78;

    private String counsilStartTime;
    private String counsilEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateOfAttempt() {
        return dateOfAttempt;
    }

    public void setDateOfAttempt(String dateOfAttempt) {
        this.dateOfAttempt = dateOfAttempt;
    }

    public String getTimeOfAttempt() {
        return timeOfAttempt;
    }

    public void setTimeOfAttempt(String timeOfAttempt) {
        this.timeOfAttempt = timeOfAttempt;
    }

    public String getCodeOfResearhStaff() {
        return codeOfResearhStaff;
    }

    public void setCodeOfResearhStaff(String codeOfResearhStaff) {
        this.codeOfResearhStaff = codeOfResearhStaff;
    }

    public String getQ18() {
        return q18;
    }

    public void setQ18(String q18) {
        this.q18 = q18;
    }

    public String getQ19() {
        return q19;
    }

    public void setQ19(String q19) {
        this.q19 = q19;
    }

    public String getQ20() {
        return q20;
    }

    public void setQ20(String q20) {
        this.q20 = q20;
    }

    public String getQ21() {
        return q21;
    }

    public void setQ21(String q21) {
        this.q21 = q21;
    }

    public String getQ22() {
        return q22;
    }

    public void setQ22(String q22) {
        this.q22 = q22;
    }

    public String getQ23() {
        return q23;
    }

    public void setQ23(String q23) {
        this.q23 = q23;
    }

    public String getQ24() {
        return q24;
    }

    public void setQ24(String q24) {
        this.q24 = q24;
    }

    public String getQ25() {
        return q25;
    }

    public void setQ25(String q25) {
        this.q25 = q25;
    }

    public String getQ26() {
        return q26;
    }

    public void setQ26(String q26) {
        this.q26 = q26;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public StudiesDTO getStudies() {
        return studies;
    }

    public void setStudies(StudiesDTO studies) {
        this.studies = studies;
    }

    public List<FormCrf4aDetailsDTO> getDetails() {
        return details;
    }

    public void setDetails(List<FormCrf4aDetailsDTO> details) {
        this.details = details;
    }

    public PregnantWomanDTO getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWomanDTO pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

    public String getQ74() {
        return q74;
    }

    public void setQ74(String q74) {
        this.q74 = q74;
    }

    public String getQ75() {
        return q75;
    }

    public void setQ75(String q75) {
        this.q75 = q75;
    }

    public String getQ76() {
        return q76;
    }

    public void setQ76(String q76) {
        this.q76 = q76;
    }

    public String getQ77() {
        return q77;
    }

    public void setQ77(String q77) {
        this.q77 = q77;
    }

    public String getQ78() {
        return q78;
    }

    public void setQ78(String q78) {
        this.q78 = q78;
    }

    public String getCounsilStartTime() {
        return counsilStartTime;
    }

    public void setCounsilStartTime(String counsilStartTime) {
        this.counsilStartTime = counsilStartTime;
    }

    public String getCounsilEndTime() {
        return counsilEndTime;
    }

    public void setCounsilEndTime(String counsilEndTime) {
        this.counsilEndTime = counsilEndTime;
    }
}
