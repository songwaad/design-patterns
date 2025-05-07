import prototype.KillerDrone;
import prototype.subKillerDrone.SteathKillerDrone;
import prototype.subKillerDrone.UnderWaterDrone;

public class Main {
    public static void main(String[] args) {
        KillerDrone killerDrone = new KillerDrone("kd-camera", "kd-weapons");
        SteathKillerDrone steathKillerDrone = new SteathKillerDrone("steath-camera", "steath-weapons", "steathtech", "noise");
        UnderWaterDrone underWaterDrone = new UnderWaterDrone("underwater-camera", "underwater-weapons", "torpedoes", "waterproof", "sonar");

        KillerDrone cloneKillerDrone = (KillerDrone) killerDrone.clone();
        cloneKillerDrone.setCamera("4k");

        SteathKillerDrone cloneSteathKillerDrone = (SteathKillerDrone) steathKillerDrone.clone();
        cloneSteathKillerDrone.setSteathTechnology("US Army");

        UnderWaterDrone cloneUnderWaterDrone = (UnderWaterDrone) underWaterDrone.clone();
        cloneUnderWaterDrone.setSonarTracking("Israel Sonar Tracking");
        cloneUnderWaterDrone.setWaterproofCoating("Russia Waterproof");

        System.out.println("\n⏹️ Prototype Object");
        System.out.println(killerDrone.toString());
        System.out.println(steathKillerDrone.toString());
        System.out.println(underWaterDrone.toString());

        System.out.println("\n✈️ Clone Object");
        System.out.println(cloneKillerDrone.toString());
        System.out.println(cloneSteathKillerDrone.toString());
        System.out.println(cloneUnderWaterDrone.toString());
    }
}