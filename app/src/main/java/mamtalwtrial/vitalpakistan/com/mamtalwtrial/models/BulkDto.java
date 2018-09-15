package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;


import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf2.FormCrf2DTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3a.FormCrf3aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3b.FormCrf3bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c.FormCrf3cDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4a.FormCrf4aDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf4.crf4b.FormCrf4bDTO;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5a;
import mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf5.FormCrf5b;

public class BulkDto {

    private FormCrf2DTO formCrf2;
    private FormCrf3aDTO formCrf3a;
    private FormCrf3bDTO formCrf3b;
    private FormCrf3cDTO formCrf3c;
    private FormCrf4aDTO formCrf4a;
    private FormCrf4bDTO formCrf4bDTO;
    private FormCrf5a formCrf5a;
    private FormCrf5b formCrf5b;

    public BulkDto() {
    }

    public BulkDto(FormCrf2DTO formCrf2, FormCrf3aDTO formCrf3a, FormCrf3bDTO formCrf3b, FormCrf3cDTO formCrf3c, FormCrf4aDTO formCrf4a, FormCrf4bDTO formCrf4bDTO, FormCrf5a formCrf5a, FormCrf5b formCrf5b) {
        this.formCrf2 = formCrf2;
        this.formCrf3a = formCrf3a;
        this.formCrf3b = formCrf3b;
        this.formCrf3c = formCrf3c;
        this.formCrf4a = formCrf4a;
        this.formCrf4bDTO = formCrf4bDTO;
        this.formCrf5a = formCrf5a;
        this.formCrf5b = formCrf5b;
    }

    public FormCrf4aDTO getFormCrf4a() {
        return formCrf4a;
    }

    public void setFormCrf4a(FormCrf4aDTO formCrf4a) {
        this.formCrf4a = formCrf4a;
    }

    public FormCrf4bDTO getFormCrf4b() {
        return formCrf4bDTO;
    }

    public void setFormCrf4b(FormCrf4bDTO formCrf4b) {
        this.formCrf4bDTO = formCrf4b;
    }

    public FormCrf5a getFormCrf5a() {
        return formCrf5a;
    }

    public void setFormCrf5a(FormCrf5a formCrf5a) {
        this.formCrf5a = formCrf5a;
    }

    public FormCrf5b getFormCrf5b() {
        return formCrf5b;
    }

    public void setFormCrf5b(FormCrf5b formCrf5b) {
        this.formCrf5b = formCrf5b;
    }

    public FormCrf2DTO getFormCrf2() {
        return formCrf2;
    }

    public void setFormCrf2(FormCrf2DTO formCrf2) {
        this.formCrf2 = formCrf2;
    }

    public FormCrf3aDTO getFormCrf3a() {
        return formCrf3a;
    }

    public void setFormCrf3a(FormCrf3aDTO formCrf3a) {
        this.formCrf3a = formCrf3a;
    }

    public FormCrf3bDTO getFormCrf3b() {
        return formCrf3b;
    }

    public void setFormCrf3b(FormCrf3bDTO formCrf3b) {
        this.formCrf3b = formCrf3b;
    }

    public FormCrf3cDTO getFormCrf3c() {
        return formCrf3c;
    }

    public void setFormCrf3c(FormCrf3cDTO formCrf3c) {
        this.formCrf3c = formCrf3c;
    }
}
