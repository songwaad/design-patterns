package org.example.abtraction;

import org.example.implementation.Sponsor;

public class Chelsea extends FootballTeam {

    public Chelsea(Sponsor sponsor, String league, String stadium) {
        super(sponsor, league, stadium);
    }

    @Override
    public String getTeamDetail() {
        return "\nChelsea \n" + super.getTeamDetail();
    }
}
