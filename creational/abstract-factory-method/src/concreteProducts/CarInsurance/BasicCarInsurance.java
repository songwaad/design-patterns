package concreteProducts.CarInsurance;

import products.CarInsurance;

public class BasicCarInsurance extends CarInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Basic Car Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Basic Car Insurance Price");
    }
}
