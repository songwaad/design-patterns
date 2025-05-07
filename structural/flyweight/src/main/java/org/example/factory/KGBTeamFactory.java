package org.example.factory;

import org.example.flyweight.KGBTeam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class KGBTeamFactory {
    private HashMap<String, KGBTeam> kgbTeam = new HashMap<>();

    public KGBTeam getKGBTeam(String name, String baseLocation, String teamObjective) {
        if(!kgbTeam.containsKey(name)) {
            kgbTeam.put(name, new KGBTeam(name, baseLocation, teamObjective));
        }
        return kgbTeam.get(name);
    }

    public KGBTeam getKGBTeamByName(String name) {
        try {
            if (!kgbTeam.containsKey(name)) {
                throw new NoSuchElementException("KGB Team with name " + name + " does not exist.");
            }
            return kgbTeam.get(name);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public void showAllTeam() {
        Iterator<KGBTeam> iterator = kgbTeam.values().iterator();
        while (iterator.hasNext()) {
            System.out.println("-----");
            System.out.println(iterator.next().getInfo());
        }
    }
}
