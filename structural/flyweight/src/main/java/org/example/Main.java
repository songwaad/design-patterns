package org.example;

import org.example.context.KGBAgent;
import org.example.factory.KGBTeamFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("{ KBG Agent }\n");

        KGBTeamFactory kgbTeamFactory = new KGBTeamFactory();

        KGBAgent putin = new KGBAgent("White Bear",
                "active",
                "Top Secret",
                "Has Fallen",
                "Moscow, Russia",
                "Deep infiltration",
                kgbTeamFactory);

        KGBAgent evelynSalt = new KGBAgent(
                "The Shadow",
                "Rogue",
                "Classified",
                "Black Widow",
                "Washington DC, USA",
                "Undercover infiltration",
                kgbTeamFactory

        );

        System.out.println("{ putin, evelySalt }\n");

        putin.showInfo();
        evelynSalt.showInfo();

        System.out.println("\n{ show team }");
        kgbTeamFactory.showAllTeam();

        KGBAgent volkov = new KGBAgent("Phantom",
                "active",
                "Ultra Classified",
                "Has Fallen",
                "Moscow, Russia",
                "Deep infiltration",
                kgbTeamFactory);

        KGBAgent anya = new KGBAgent(
                "Red Fox",
                "active",
                "Classified",
                "Black Widow",
                "Washington DC, USA",
                "Undercover infiltration",
                kgbTeamFactory

        );

        System.out.println("\n{ volkov,anya }");
        volkov.showInfo();
        anya.showInfo();

        System.out.println("\n{ show team }");
        kgbTeamFactory.showAllTeam();

        KGBAgent ivanov = new KGBAgent("Deep Cover",
                "active",
                "Top Secret",
                "Black Widow",
                "Moscow, Russia",
                "Deep infiltration",
                kgbTeamFactory);

        System.out.println("{ ivanov }\n");
        ivanov.showInfo();

        System.out.println("\n{ show team }");
        kgbTeamFactory.showAllTeam();

        ivanov.changeTeam("Has Fallen", kgbTeamFactory);
        ivanov.showInfo();

        ivanov.changeTeam("BB So cute in 3 World", kgbTeamFactory);


    }
}