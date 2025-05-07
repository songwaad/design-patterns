package org.example.mediator;

import org.example.colleague.BuildingSystem;

public interface BuildingControl {
    public void notifys(BuildingSystem sender, String event);
}
