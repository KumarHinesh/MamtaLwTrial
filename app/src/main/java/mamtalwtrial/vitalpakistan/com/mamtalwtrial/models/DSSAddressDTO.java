package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import java.util.List;

public class DSSAddressDTO {
    private Integer id;

    private String site; //lw_crf_1_11

    private String para; //lw_crf_1_12

    private String block; //lw_crf_1_13

    private String structure; //lw_crf_1_14

    private String householdOrFamily; //lw_crf_1_15

    private Integer womanNumber;//lw_crf_1_16

    private List<PregnantWomanDTO> pregnantWomen;

    public DSSAddressDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getHouseholdOrFamily() {
        return householdOrFamily;
    }

    public void setHouseholdOrFamily(String householdOrFamily) {
        this.householdOrFamily = householdOrFamily;
    }

    public Integer getWomanNumber() {
        return womanNumber;
    }

    public void setWomanNumber(Integer womanNumber) {
        this.womanNumber = womanNumber;
    }

    public List<PregnantWomanDTO> getPregnantWomen() {
        return pregnantWomen;
    }

    public void setPregnantWomen(List<PregnantWomanDTO> pregnantWomen) {
        this.pregnantWomen = pregnantWomen;
    }
}
