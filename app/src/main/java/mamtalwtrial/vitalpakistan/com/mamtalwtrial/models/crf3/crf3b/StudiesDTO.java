package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;

public class StudiesDTO {
    private String studyId;

    private String studyCode;

    private PregnantWomanDTO pregnantWoman;

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public PregnantWomanDTO getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWomanDTO pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
    }

    public String getStudyCode() {
        return studyCode;
    }

    public void setStudyCode(String studyCode) {
        this.studyCode = studyCode;
    }
}
