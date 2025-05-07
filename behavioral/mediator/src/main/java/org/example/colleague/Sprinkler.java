package org.example.colleague;

public class Sprinkler extends BuildingSystem {
    public Sprinkler() {
        setName("sprinkler");
    }

    public void detectSmoke() {
        activate();
        buildingControl.notifys(this, "detect-smoke");
    }

    public void activate() {
        System.out.println(getName() + " : Active");
    }

    public void stop() {
        System.out.println(getName() + " : Stop");
    }
}
