package concreteProducts.LifeInsurance;

import products.LifeInsurance;

public class BasicLifeInsurance extends LifeInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Basic Life Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Basic Life Insurance Price");
    }
}
