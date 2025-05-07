package org.example;

import org.example.template_method.CommercialSoftware;
import org.example.template_method.InHouseSoftware;

public class Main {
    public static void main(String[] args) {
        InHouseSoftware attendanceSystem = new InHouseSoftware();
        InHouseSoftware carparkSystem = new InHouseSoftware();
        CommercialSoftware bbcCompany = new CommercialSoftware();

        System.out.println("\nAttendance System");
        attendanceSystem.runAutomation();

        System.out.println("\nCarpark System");
        carparkSystem.runAutomation();

        System.out.println("\nBBC Company");
        bbcCompany.runAutomation();
    }
}