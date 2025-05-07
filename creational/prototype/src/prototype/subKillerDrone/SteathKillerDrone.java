package prototype.subKillerDrone;

import prototype.KillerDrone;
import prototype.Prototype;

public class SteathKillerDrone extends KillerDrone {

    private String steathTechnology;
    private String noiseReduction;

    public SteathKillerDrone(SteathKillerDrone prototype) {
        super(prototype);
        this.steathTechnology = prototype.steathTechnology;
        this.noiseReduction = prototype.noiseReduction;
    }

    public Prototype clone() {
        return new SteathKillerDrone(this);
    }

    public SteathKillerDrone(String camera, String weapons, String steathTechnology, String noiseReduction) {
        super(camera, weapons);
        this.steathTechnology = steathTechnology;
        this.noiseReduction = noiseReduction;
    }

    public String getSteathTechnology() {
        return steathTechnology;
    }

    public void setSteathTechnology(String steathTechnology) {
        this.steathTechnology = steathTechnology;
    }

    public String getNoiseReduction() {
        return noiseReduction;
    }

    public void setNoiseReduction(String noiseReduction) {
        this.noiseReduction = noiseReduction;
    }

    @Override
    public String toString() {
        return "SteathKillerDrone{" +
                "steathTechnology='" + steathTechnology + '\'' +
                ", noiseReduction='" + noiseReduction + '\'' +
                '}';
    }
}
