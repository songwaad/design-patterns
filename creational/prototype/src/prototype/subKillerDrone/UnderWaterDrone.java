package prototype.subKillerDrone;

import prototype.KillerDrone;
import prototype.Prototype;

public class UnderWaterDrone extends KillerDrone {

    private String torpedoes;
    private String waterproofCoating;
    private String sonarTracking;

    public UnderWaterDrone(UnderWaterDrone prototype) {
        super(prototype);
        this.torpedoes = prototype.torpedoes;
        this.waterproofCoating = prototype.waterproofCoating;
        this.sonarTracking = prototype.sonarTracking;
    }

    public Prototype clone() {
        return new UnderWaterDrone(this);
    }

    public UnderWaterDrone(String camera, String weapons, String torpedoes, String waterproofCoating, String sonarTracking) {
        super(camera, weapons);
        this.torpedoes = torpedoes;
        this.waterproofCoating = waterproofCoating;
        this.sonarTracking = sonarTracking;
    }

    public String getTorpedoes() {
        return torpedoes;
    }

    public void setTorpedoes(String torpedoes) {
        this.torpedoes = torpedoes;
    }

    public String getWaterproofCoating() {
        return waterproofCoating;
    }

    public void setWaterproofCoating(String waterproofCoating) {
        this.waterproofCoating = waterproofCoating;
    }

    public String getSonarTracking() {
        return sonarTracking;
    }

    public void setSonarTracking(String sonarTracking) {
        this.sonarTracking = sonarTracking;
    }

    @Override
    public String toString() {
        return "UnderWaterDrone{" +
                "torpedoes='" + torpedoes + '\'' +
                ", waterproofCoating='" + waterproofCoating + '\'' +
                ", sonarTracking='" + sonarTracking + '\'' +
                '}';
    }
}
