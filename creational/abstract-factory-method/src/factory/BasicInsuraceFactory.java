package factory;

import concreteProducts.CarInsurance.BasicCarInsurance;
import concreteProducts.HeathInsurance.BasicHeathInsurance;
import concreteProducts.LifeInsurance.BasicLifeInsurance;
import products.CarInsurance;
import products.HeathInsurance;
import products.LifeInsurance;

public class BasicInsuraceFactory implements InsuranceFactory {
    @Override
    public HeathInsurance createHeathInsurance() {
        return new BasicHeathInsurance();
    }

    @Override
    public LifeInsurance createLifeInsurance() {
        return new BasicLifeInsurance();
    }

    @Override
    public CarInsurance createCarInsurance() {
        return new BasicCarInsurance();
    }
}
