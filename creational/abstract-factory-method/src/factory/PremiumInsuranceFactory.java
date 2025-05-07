package factory;

import concreteProducts.CarInsurance.PremiumCarInsurance;
import concreteProducts.HeathInsurance.PremiumHeathInsurance;
import concreteProducts.LifeInsurance.PremiumLifeInsurance;
import products.CarInsurance;
import products.HeathInsurance;
import products.LifeInsurance;

public class PremiumInsuranceFactory implements InsuranceFactory{
    @Override
    public HeathInsurance createHeathInsurance() {
        return new PremiumHeathInsurance();
    }

    @Override
    public LifeInsurance createLifeInsurance() {
        return new PremiumLifeInsurance();
    }

    @Override
    public CarInsurance createCarInsurance() {
        return new PremiumCarInsurance();
    }
}
