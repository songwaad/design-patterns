package factory;

import product.MilkTea;
import product.Tea;

public class MilkTeaCreator extends TeaCreator {
    @Override
    public Tea getTea() {
        return new MilkTea();
    }
}
