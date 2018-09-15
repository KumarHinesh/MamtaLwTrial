package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.Crf4Complete;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a.FormCrf4aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4b.FormCrf4bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5b;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf6.FormCrf6;

public class FormCRF4AllAnd5ADTO {

    private boolean formCRF4aAndbStatus;
    private Crf4Complete formCrf4Complete;
    private boolean formCRF5aStatus;
    private FormCrf5a formCrf5a;

    public boolean isFormCRF4aAndbStatus() {
        return formCRF4aAndbStatus;
    }

    public void setFormCRF4aAndbStatus(boolean formCRF4aAndbStatus) {
        this.formCRF4aAndbStatus = formCRF4aAndbStatus;
    }

    public Crf4Complete getFormCrf4Complete() {
        return formCrf4Complete;
    }

    public void setFormCrf4Complete(Crf4Complete formCrf4Complete) {
        this.formCrf4Complete = formCrf4Complete;
    }

    public boolean isFormCRF5aStatus() {
        return formCRF5aStatus;
    }

    public void setFormCRF5aStatus(boolean formCRF5aStatus) {
        this.formCRF5aStatus = formCRF5aStatus;
    }

    public FormCrf5a getFormCrf5a() {
        return formCrf5a;
    }

    public void setFormCrf5a(FormCrf5a formCrf5a) {
        this.formCrf5a = formCrf5a;
    }
}
