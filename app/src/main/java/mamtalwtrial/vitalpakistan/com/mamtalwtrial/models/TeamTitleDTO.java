package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import java.util.List;

public class TeamTitleDTO {
    private Integer id;
    private String title;

    private List<TeamDTO> teams;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TeamDTO> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamDTO> teams) {
        this.teams = teams;
    }
}
