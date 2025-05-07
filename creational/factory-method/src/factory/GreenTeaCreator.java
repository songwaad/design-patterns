package factory;

import product.GreenTea;
import product.Tea;

public class GreenTeaCreator extends TeaCreator{
    @Override
    public Tea getTea() {
        return new GreenTea();
    }
}
