package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5;


import java.util.List;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.PregnantWomanDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.TeamDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.StudiesDTO;

public class FormCrf5b {

    private Integer id;

    private TeamDTO team;

    private StudiesDTO studies;

    private PregnantWomanDTO pregnantWoman;

    private String q18;
    private String q19;
    private String q20;
    private String q21;
    private String q22;
    private String q23;
    private String q24;

    private List<FormCrf5bDetails> details;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public PregnantWomanDTO getPregnantWoman() {
        return pregnantWoman;
    }

    public void setPregnantWoman(PregnantWomanDTO pregnantWoman) {
        this.pregnantWoman = pregnantWoman;
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

    public List<FormCrf5bDetails> getDetails() {
        return details;
    }

    public void setDetails(List<FormCrf5bDetails> details) {
        this.details = details;
    }
}
