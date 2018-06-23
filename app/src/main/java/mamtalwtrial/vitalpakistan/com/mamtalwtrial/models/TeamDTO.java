package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import android.content.Intent;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TeamDTO {

    private String date;
    private String time;
    private Integer id;
    private String userName;
    private String password;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private TeamTitleDTO team;

    private List<EmployeeDTO> employees;

    private SiteDTO site;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TeamTitleDTO getTeam() {
        return team;
    }

    public void setTeam(TeamTitleDTO team) {
        this.team = team;
    }

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
    }

    public SiteDTO getSite() {
        return site;
    }

    public void setSite(SiteDTO site) {
        this.site = site;
    }


}
