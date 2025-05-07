package concreteProducts.CarInsurance;

import products.CarInsurance;

public class PremiumCarInsurance extends CarInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Premium Car Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Premium Car Insurance Price");
    }
}
