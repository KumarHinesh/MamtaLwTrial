package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models.crf3.crf3c;

public class ChildWeightCrf3cDTO {

    private Integer id;

    private Float reader1;

    private Float reader2;
    private String readerCode1;
    private String readerCode2;
    private Float difference;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getReader1() {
        return reader1;
    }

    public void setReader1(Float reader1) {
        this.reader1 = reader1;
    }

    public Float getReader2() {
        return reader2;
    }

    public void setReader2(Float reader2) {
        this.reader2 = reader2;
    }

    public Float getDifference() {
        return difference;
    }

    public void setDifference(Float difference) {
        this.difference = difference;
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
}
