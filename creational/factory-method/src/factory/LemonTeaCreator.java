package factory;

import product.LemonTea;
import product.Tea;

public class LemonTeaCreator extends TeaCreator {
    @Override
    public Tea getTea() {
        return new LemonTea();
    }
}
