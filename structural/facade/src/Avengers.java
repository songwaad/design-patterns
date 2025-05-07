import subsystem.CarolDanvers;
import subsystem.StephenStrange;
import subsystem.TonyStrak;

public class Avengers {
    protected StephenStrange drStrange;
    protected CarolDanvers captainMarvel;
    protected TonyStrak ironMan;

    Avengers() {
        drStrange = new StephenStrange();
        captainMarvel = new CarolDanvers();
        ironMan = new TonyStrak();
    }

    public void evacuatePeople(String location) {
        drStrange.openPotals(location);
        captainMarvel.getHyperspaceJump(location);
        System.out.println("Evacuate People -> " + location);
    }

    public void attack(String threat,Integer threatLevel) {
        System.out.println("\nAttack:");
        if(threatLevel<2) {
            captainMarvel.getEnergyBlast();
        } else if (threatLevel == 2) {
            captainMarvel.getEnergyBlast();
            ironMan.getMissile();
        } else if (threatLevel == 3) {
            ironMan.hackSystem(threat);
            captainMarvel.getSuperNovaBlast();
            ironMan.getMissile();
        } else if (threatLevel > 3) {
            drStrange.predictWin(threat);
            captainMarvel.getSuperNovaBlast();
            ironMan.getMissile();
        }
    }

    public void defend(Integer threatLevel, String location) {
        System.out.println("\nDefend:");
        if(threatLevel<2) {
            ironMan.getPowerShield();
        } else if (threatLevel == 2) {
            ironMan.getArmorDrone();
            ironMan.getPowerShield();
        } else if (threatLevel == 3) {
            ironMan.getArmorDrone();
            drStrange.makeMagicShield();
        } else if (threatLevel > 3) {
            drStrange.rewindTime();
        }
    }
}
