package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

public class MuacAssesmentDTO {
    private Integer id;

    private String readerCode1;
    private String readerCode2;

    private Float reading1;

    private Float reading2;

    private Float difference;

    private FormCrf1DTO form;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReaderCode1() {
        return readerCode1;
    }

    public void setReaderCode1(String readerCode1) {
        this.readerCode1 = readerCode1;
    }

    public String getReaderCode2() {
        return readerCode2;
    }

    public void setReaderCode2(String readerCode2) {
        this.readerCode2 = readerCode2;
    }

    public Float getReading1() {
        return reading1;
    }

    public void setReading1(Float reading1) {
        this.reading1 = reading1;
    }

    public Float getReading2() {
        return reading2;
    }

    public void setReading2(Float reading2) {
        this.reading2 = reading2;
    }

    public Float getDifference() {
        return difference;
    }

    public void setDifference(Float difference) {
        this.difference = difference;
    }

    public FormCrf1DTO getForm() {
        return form;
    }

    public void setForm(FormCrf1DTO form) {
        this.form = form;
    }
}
