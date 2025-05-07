package factory;

import concreteProducts.CarInsurance.StandardCarInsurance;
import concreteProducts.HeathInsurance.StandardHeathInsurance;
import concreteProducts.LifeInsurance.StandardLifeInsurance;
import products.CarInsurance;
import products.HeathInsurance;
import products.LifeInsurance;

public class StandardInsuranceFactory implements InsuranceFactory{
    @Override
    public HeathInsurance createHeathInsurance() {
        return new StandardHeathInsurance();
    }

    @Override
    public LifeInsurance createLifeInsurance() {
        return new StandardLifeInsurance();
    }

    @Override
    public CarInsurance createCarInsurance() {
        return new StandardCarInsurance();
    }
}
