package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import java.util.List;

public class PregnantWomanDTO {

    private String assessmentId; //lw_crf_1_01

    private String name; //lw_crf_1_09

    private String husbandName; //lw_crf_1_10

    private String lmp;

    private DSSAddressDTO dssAddress;

    private List<FormCrf1DTO> form;

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

    public String getAssessmentId() {     return assessmentId;}

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public DSSAddressDTO getDssAddress() {
        return dssAddress;
    }

    public void setDssAddress(DSSAddressDTO dssAddress) {
        this.dssAddress = dssAddress;
    }

    public List<FormCrf1DTO> getForm() {
        return form;
    }

    public void setForm(List<FormCrf1DTO> form) {
        this.form = form;
    }

    public String getLmp() {
        return lmp;
    }

    public void setLmp(String lmp) {
        this.lmp = lmp;
    }
}
