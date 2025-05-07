package factory;

import products.CarInsurance;
import products.HeathInsurance;
import products.LifeInsurance;

public interface InsuranceFactory {
    public HeathInsurance createHeathInsurance();
    public LifeInsurance createLifeInsurance();
    public CarInsurance createCarInsurance();
}
