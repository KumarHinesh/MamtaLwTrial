package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FollowupsDTO {
    private Integer id;

    private String date;
    private String time;
    private Integer status;
    private String description;

    private FollowupDetails followupDetails;

    private TeamDTO team;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public TeamDTO getTeam() {
        return team;
    }

    public void setTeam(TeamDTO team) {
        this.team = team;
    }

    public FollowupDetails getFollowupDetails() {
        return followupDetails;
    }

    public void setFollowupDetails(FollowupDetails followupDetails) {
        this.followupDetails = followupDetails;
    }
}
