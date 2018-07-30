package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import java.util.List;

public class PregnantWomanDTO {

    private Integer id;
    private String assessmentId; //lw_crf_1_01

    private String name; //lw_crf_1_09

    private String husbandName; //lw_crf_1_10

    private String lmp;
    private Float avgMuac;
    private Integer FormStatus;

    private Integer visitStatus;

    public Integer getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(Integer visitStatus) {
        this.visitStatus = visitStatus;
    }

    private DSSAddressDTO dssAddress;

    private List<ContactNumberDTO> contactNumbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public DSSAddressDTO getDssAddress() {
        return dssAddress;
    }

    public void setDssAddress(DSSAddressDTO dssAddress) {
        this.dssAddress = dssAddress;
    }

    public String getLmp() {
        return lmp;
    }

    public void setLmp(String lmp) {
        this.lmp = lmp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ContactNumberDTO> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(List<ContactNumberDTO> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public Float getAvgMuac() {
        return avgMuac;
    }

    public void setAvgMuac(Float avgMuac) {
        this.avgMuac = avgMuac;
    }

    public Integer getFormStatus() {
        return FormStatus;
    }

    public void setFormStatus(Integer formStatus) {
        FormStatus = formStatus;
    }
}
