package concreteProducts.CarInsurance;

import products.CarInsurance;

public class StandardCarInsurance extends CarInsurance {
    @Override
    public void getInsurancePolicy() {
        System.out.println("Standard Car Insurance Policy");
    }

    @Override
    public void getPrice() {
        System.out.println("Standard Car Insurance Price");
    }
}
