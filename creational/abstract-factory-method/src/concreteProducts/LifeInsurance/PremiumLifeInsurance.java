package concreteProducts.LifeInsurance;

import products.LifeInsurance;

public class PremiumLifeInsurance extends LifeInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Premium Life Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Premium Life Insurance Price");
    }
}
