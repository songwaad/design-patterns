package org.example;

import org.example.abtraction.Chelsea;
import org.example.abtraction.FootballTeam;
import org.example.abtraction.RealMadrid;
import org.example.implementation.Emirates;
import org.example.implementation.Etihad;
import org.example.implementation.Sponsor;

public class Main {
    public static void main(String[] args) {
        System.out.println("FootballTeam");

        Sponsor emirates = new Emirates("Fly Better","Emirates Benefits");
        Sponsor etihad = new Etihad("The World Is Our Home", "Etihad Benefits");

        FootballTeam chelsea = new Chelsea(emirates,"EPL","Stamford Bridge");
        FootballTeam realMadrid = new RealMadrid(etihad, "Laliga", "Santiago Bernabeu");

        System.out.println(chelsea.getTeamDetail());

        System.out.println(realMadrid.getTeamDetail());

        System.out.println("--- change Sponsor ---");
        realMadrid.setSponsor(emirates);
        System.out.println(realMadrid.getTeamDetail());

        etihad.setBenefits("etihad new Benefits");
        chelsea.setSponsor(etihad);
        System.out.println(chelsea.getTeamDetail());

    }
}