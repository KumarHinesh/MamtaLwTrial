package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4;


import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a.FormCrf4aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4b.FormCrf4bDTO;

public class Crf4Complete {

    private String followUpNum;

    public String getFollowUpNum() {
        return followUpNum;
    }

    public void setFollowUpNum(String followUpNum) {
        this.followUpNum = followUpNum;
    }

    private FormCrf4aDTO formCrf4a;
    private FormCrf4bDTO formCrf4b;

    public Crf4Complete() {
    }

    public Crf4Complete(FormCrf4aDTO formCrf4a, FormCrf4bDTO formCrf4b) {
        this.formCrf4a = formCrf4a;
        this.formCrf4b = formCrf4b;
    }

    public FormCrf4aDTO getFormCrf4a() {
        return formCrf4a;
    }

    public void setFormCrf4a(FormCrf4aDTO formCrf4a) {
        this.formCrf4a = formCrf4a;
    }

    public FormCrf4bDTO getFormCrf4b() {
        return formCrf4b;
    }

    public void setFormCrf4b(FormCrf4bDTO formCrf4b) {
        this.formCrf4b = formCrf4b;
    }
}
