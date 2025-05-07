import factory.GreenTeaCreator;
import factory.LemonTeaCreator;
import factory.MilkTeaCreator;
import factory.TeaCreator;

public class Main {

    public static void client(TeaCreator tea) {
        tea.making();
        System.out.println();
    }

    public static void main(String[] args) {
        TeaCreator tea = new GreenTeaCreator();
        client(tea);
        tea = new LemonTeaCreator();
        client(tea);
        tea = new MilkTeaCreator();
        client(tea);
    }
}