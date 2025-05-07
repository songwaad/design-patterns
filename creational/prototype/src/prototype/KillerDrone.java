package prototype;

public class KillerDrone implements Prototype {

    private String camera;
    private String weapons;

    @Override
    public Prototype clone() {
        return new KillerDrone(this);
    }

    public KillerDrone(KillerDrone prototype) {
        this.camera = prototype.camera;
        this.weapons = prototype.weapons;
    }

    public KillerDrone(String camera, String weapons) {
        this.camera = camera;
        this.weapons = weapons;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "KillerDrone{" +
                "camera='" + camera + '\'' +
                ", weapons='" + weapons + '\'' +
                '}';
    }
}
