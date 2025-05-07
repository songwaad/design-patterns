package org.example.abtraction;

import org.example.implementation.Sponsor;

public class RealMadrid extends FootballTeam{
    public RealMadrid(Sponsor sponsor, String league, String stadium) {
        super(sponsor, league, stadium);
    }

    @Override
    public String getTeamDetail() {
        return "\nReal Madrid \n" + super.getTeamDetail();
    }
}
