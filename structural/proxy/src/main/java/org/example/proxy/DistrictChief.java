package org.example.proxy;

public class DistrictChief implements DistrictChiefInterface {

    private String firstname;
    private String lastname;

    public DistrictChief(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Boolean signDocument(String docenment) {
        return true;
    }
}
