import singleton.MinisterOfInterior;
import singleton.Person;

public class Main {
    public static void main(String[] args) {
        Person anuthin = new Person("Anuthin", "Chanveerakul");
        MinisterOfInterior ministerOfInterior = MinisterOfInterior.getMinisterOfInterior();

        ministerOfInterior.getMinisterDetail();

        System.out.println("แต่งตั้งรัฐมนตรีคนใหม่");
        ministerOfInterior.setNewMinister(anuthin);
        ministerOfInterior.getMinisterDetail();

        System.out.println("เรียกหารัฐมนตรีมหาดไทย");
        MinisterOfInterior minister = MinisterOfInterior.getMinisterOfInterior();
        minister.getMinisterDetail();

        minister.setMission("ปราบปรามยาเสพติด");

    }
}