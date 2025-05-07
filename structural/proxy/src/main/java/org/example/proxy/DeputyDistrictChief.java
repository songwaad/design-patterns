package org.example.proxy;

public class DeputyDistrictChief implements DistrictChiefInterface {

    private String firstname;
    private String lastname;
    private DistrictChief districtChief;

    public DeputyDistrictChief(String firstname, String lastname, DistrictChief districtChief) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.districtChief = districtChief;
    }

    public Boolean validate(String document) {
        return !document.isEmpty();
    }

    public String filter(String document) {
        return "Filter ✅ \n" + document;
    }

    @Override
    public Boolean signDocument(String document) {
        if (!validate(document)) {
            System.out.println("The document is incorrect. ❌\n");
            return false;
        }

        String filterDoc = filter(document);

        if (!districtChief.signDocument(filterDoc)) {
            System.out.println("Document rejected. ❌\n");
            return false;
        }

        System.out.println(filterDoc);
        System.out.println("Document Approve ✅\n");
        return true;
    }
}
