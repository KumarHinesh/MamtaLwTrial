package mamtalwtrial.vitalpakistan.com.mamtalwtrial.models;

import java.util.List;

public class SiteDTO {
    private Integer id;

    private String site;

    private List<TeamDTO> teams;
    private List<FollowupsDTO> followups;

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

    public List<TeamDTO> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamDTO> teams) {
        this.teams = teams;
    }

    public List<FollowupsDTO> getFollowups() {
        return followups;
    }

    public void setFollowups(List<FollowupsDTO> followups) {
        this.followups = followups;
    }
}
