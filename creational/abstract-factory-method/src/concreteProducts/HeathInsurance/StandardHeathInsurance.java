package concreteProducts.HeathInsurance;

import products.HeathInsurance;

public class StandardHeathInsurance extends HeathInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Standard Heath Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Standard Heath Insurance Price");
    }
}
