package org.example.abtraction;

import org.example.implementation.Sponsor;

abstract public class FootballTeam {
    private Sponsor sponsor;
    private String league;
    private String stadium;

    public FootballTeam(Sponsor sponsor, String league, String stadium) {
        this.sponsor = sponsor;
        this.league = league;
        this.stadium = stadium;
    }

    public String getTeamDetail() {
        return "League : " + league + "\n" +
                "Stadium : " + stadium + "\n" +
                "--- Sponsor : " + sponsor.getName() + "\n" +
                "Slogan : " + sponsor.getSlogan() + "\n" +
                "Benefits : " + sponsor.getBenefits() + "\n";
    };

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
