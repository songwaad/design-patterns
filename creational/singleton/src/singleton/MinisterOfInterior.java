package singleton;

public class MinisterOfInterior {
    private static MinisterOfInterior ministerOfInterior;
    Person minister;

    private MinisterOfInterior(Person person) {
        this.minister = person;
    }

    public static MinisterOfInterior getMinisterOfInterior() {
        if (ministerOfInterior==null) {
            ministerOfInterior = new MinisterOfInterior(new Person());
        }

        return ministerOfInterior;
    }

    public void setNewMinister(Person person) {
        this.minister = person;
    }

    public void getMinisterDetail() {
        System.out.println("Minister Of Interior : " + this.minister.firstname + " " + this.minister.lastname);
    }

    public void setMission(String missionDetail) {
        System.out.println("Minister Of Interior get Mission : " + missionDetail);
    }


}
