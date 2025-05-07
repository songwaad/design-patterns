package concreteProducts.HeathInsurance;

import products.HeathInsurance;

public class BasicHeathInsurance extends HeathInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Basic Heath Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Basic Heath Insurance Price");
    }
}
