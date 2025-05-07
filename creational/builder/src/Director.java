import builder.Builder;

public class Director {
    public void makeComputer2Monitor(Builder builder) {
        builder.reset();
        builder.buildCpu();
        builder.buildMainboard();
        builder.buildVgaCard();
        builder.buildRam();
        builder.buildSSD();
        builder.buildPSU();
        builder.buildCase();
        builder.buildCooler();
        builder.buildMonitor();
        builder.buildMonitor();
        builder.buildMouse();
        builder.buildKeyboard();
        builder.buildWindows();
        builder.buildAntiVirus();
    }

    public void makeComputerOnlyCase(Builder builder) {
        builder.reset();
        builder.buildCpu();
        builder.buildMainboard();
        builder.buildVgaCard();
        builder.buildRam();
        builder.buildSSD();
        builder.buildPSU();
        builder.buildCase();
        builder.buildCooler();
    }
}
