package concreteProducts.LifeInsurance;

import products.LifeInsurance;

public class StandardLifeInsurance extends LifeInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Standard Life Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Standard Life Insurance Price");
    }
}
