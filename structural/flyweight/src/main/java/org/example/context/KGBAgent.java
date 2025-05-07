package org.example.context;

import org.example.factory.KGBTeamFactory;
import org.example.flyweight.KGBTeam;

public class KGBAgent {
    private String codeName;
    private String status;
    private String secretLevel;
    private KGBTeam team;

    public KGBAgent(String codeName, String status, String secretLevel, String teamName, String teamLocation, String teamObjective, KGBTeamFactory factory) {
        this.codeName = codeName;
        this.status = status;
        this.secretLevel = secretLevel;
        this.team = factory.getKGBTeam(teamName, teamLocation, teamObjective);
    }

    public void changeTeam(String teamName, KGBTeamFactory factory) {
        this.team = factory.getKGBTeamByName(teamName);
    }

    public void showInfo() {
        team.showAgentInfo(codeName, status, secretLevel);
    }
}
