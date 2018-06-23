package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Set;

public class FormCrf1DTO {

    // for my use
    private int followUpPositionInList;


    private int followupId;
    private Long id;
    private Integer followupStatus;
    private String counselingStartDate;
    private String counselingEndDate;

    private PregnantWomanDTO pregnantWoman;

    private Set<ContactNumberDTO> contactNumbers;

    private List<MuacAssesmentDTO> muacAssesments;

    private TeamDTO team;


    public int getFollowupId() {
        return followupId;
    }

    public void setFollowupId(int followupId) {
        this.followupId = followupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Integer visitStatus;
    private Integer formStatus;

    private String q02;

    private String q03;

    private String q21;

    private String q22;

    private String q23;

    private String q24;

    private String q25;

    private String q26;

    private String q27;

    private String q28;

    private String q29;

    private String q30;

    private String q31;

    private String q32;

    private String q34;

    public Integer getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(Integer visitStatus) {
        this.visitStatus = visitStatus;
    }

    public int getFollowUpPositionInList() {
        return followUpPositionInList;
    }

    public void setFollowUpPositionInList(int followUpPositionInList) {
        this.followUpPositionInList = followUpPositionInList;
    }

    public String getQ02() {
        return q02;
    }

    public void setQ02(String q02) {
        this.q02 = q02;
    }

    public String getQ03() {
        return q03;
    }

    public void setQ03(String q03) {
        this.q03 = q03;
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

    public String getQ27() {
        return q27;
    }

    public void setQ27(String q27) {
        this.q27 = q27;
    }

    public String getQ28() {
        return q28;
    }

    public void setQ28(String q28) {
        this.q28 = q28;
    }

    public String getQ29() {
        return q29;
    }

    public void setQ29(String q29) {
        this.q29 = q29;
    }

    public String getQ30() {
        return q30;
    }

    public void setQ30(String q30) {
        this.q30 = q30;
    }

    public String getQ31() {
        return q31;
    }

    public void setQ31(String q31) {
        this.q31 = q31;
    }

    public String getQ32() {
        return q32;
    }

    public void setQ32(String q32) {
        this.q32 = q32;
    }

    public String getQ34() {
        return q34;
    }

    public void setQ34(String q34) {
        this.q34 = q34;
    }

    public PregnantWomanDTO getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWomanDTO pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

    public Set<ContactNumberDTO> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(Set<ContactNumberDTO> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public List<MuacAssesmentDTO> getMuacAssesments() {
        return muacAssesments;
    }

    public void setMuacAssesments(List<MuacAssesmentDTO> muacAssesments) {
        this.muacAssesments = muacAssesments;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public Integer getFollowupStatus() {
        return followupStatus;
    }

    public void setFollowupStatus(Integer followupStatus) {
        this.followupStatus = followupStatus;
    }

    public String getCounselingStartDate() {
        return counselingStartDate;
    }

    public void setCounselingStartDate(String counselingStartDate) {
        this.counselingStartDate = counselingStartDate;
    }

    public String getCounselingEndDate() {
        return counselingEndDate;
    }

    public void setCounselingEndDate(String counselingEndDate) {
        this.counselingEndDate = counselingEndDate;
    }

    public Integer getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(Integer formStatus) {
        this.formStatus = formStatus;
    }
}
