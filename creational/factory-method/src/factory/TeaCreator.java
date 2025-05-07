package factory;

import product.Tea;

public abstract class TeaCreator {
    public void making() {
        System.out.println("Making Tea...");
        Tea tea = getTea();
        tea.prepare();
        tea.brew();
        tea.put();
    }

    public abstract Tea getTea();
}
