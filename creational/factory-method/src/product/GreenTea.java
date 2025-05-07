package product;

public class GreenTea implements Tea{
    @Override
    public void prepare() {
        System.out.println("Prepare GreenTea");
    }

    @Override
    public void brew() {
        System.out.println("Brew GreenTea");
    }

    @Override
    public void put() {
        System.out.println("Put GreenTea");
    }
}
