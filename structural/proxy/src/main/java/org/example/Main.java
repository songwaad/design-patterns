package org.example;

import org.example.proxy.DeputyDistrictChief;
import org.example.proxy.DistrictChief;
import org.example.proxy.DistrictChiefInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Mueang Phuket District ---");

        DistrictChiefInterface districtChief = new DistrictChief("Aong-Ard", "Chartnugsoo");
        DistrictChiefInterface deputyDistrictChief = new DeputyDistrictChief("Thanoo", "Photonng", (DistrictChief) districtChief);

        String requestPermission = "Request for permission to set up a service location.";
        String requestAssistance = "Request for assistance for disaster victims.";

        deputyDistrictChief.signDocument(requestAssistance);
        deputyDistrictChief.signDocument(requestPermission);

        String legalDoc = "";
        deputyDistrictChief.signDocument(legalDoc);

        String legalDoc2 = "Test";

        if(districtChief.signDocument(legalDoc2)) {
            System.out.println("\ndistrictChief :: OK");
        } else {
            System.out.println("\ndistrictChief :: Not OK");
        }

    }
}