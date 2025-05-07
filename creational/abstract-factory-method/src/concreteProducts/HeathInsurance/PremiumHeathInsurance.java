package concreteProducts.HeathInsurance;

import products.HeathInsurance;

public class PremiumHeathInsurance extends HeathInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Premium Heath Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Premium Heath Insurance Price");
    }
}
