package org.example.colleague;

import org.example.mediator.BuildingControl;

public class BuildingSystem {
    private String name;
    protected BuildingControl buildingControl;

    protected void setName(String name) {
        this.name = name;
    }

    public void setBuildingControl(BuildingControl buildingControl) {
        this.buildingControl = buildingControl;
    }

    public String getName() {
        return this.name;
    }
}
