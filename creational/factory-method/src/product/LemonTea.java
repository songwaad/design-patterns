package product;

public class LemonTea implements Tea {
    @Override
    public void prepare() {
        System.out.println("Prepare LemonTea");
    }

    @Override
    public void brew() {
        System.out.println("Brew LemonTea");
    }

    @Override
    public void put() {
        System.out.println("Put LemonTea");
    }
}
