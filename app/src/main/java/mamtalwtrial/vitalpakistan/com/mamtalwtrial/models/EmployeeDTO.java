package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EmployeeDTO {

    private Integer id;

    private String name;
    private String designation;
    private Integer accessStatus;

    private TeamDTO team;

    private List<FormCrf1DTO> form;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(Integer accessStatus) {
        this.accessStatus = accessStatus;
    }

    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public List<FormCrf1DTO> getForm() {
        return form;
    }

    public void setForm(List<FormCrf1DTO> form) {
        this.form = form;
    }
}
