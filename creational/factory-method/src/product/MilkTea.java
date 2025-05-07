package product;

public class MilkTea implements Tea{
    @Override
    public void prepare() {
        System.out.println("Prepare Milk");
    }

    @Override
    public void brew() {
        System.out.println("Brew Milk");
    }

    @Override
    public void put() {
        System.out.println("Put Milk");
    }
}
