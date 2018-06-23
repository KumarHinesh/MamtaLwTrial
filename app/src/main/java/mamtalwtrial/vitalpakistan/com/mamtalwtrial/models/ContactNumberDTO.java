package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

public class ContactNumberDTO {
    private Integer id;

    private String contactNumber; //lw_crf1_33
    private FormCrf1DTO form;

    public ContactNumberDTO() {
    }

    public ContactNumberDTO(Integer id, String contactNumber) {
        this.id = id;
        this.contactNumber = contactNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public FormCrf1DTO getForm() {
        return form;
    }

    public void setForm(FormCrf1DTO form) {
        this.form = form;
    }
}
