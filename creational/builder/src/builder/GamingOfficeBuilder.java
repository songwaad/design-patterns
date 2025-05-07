package builder;

public class GamingOfficeBuilder implements Builder {
    private Computer computer;

    @Override
    public void reset() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Gaming Cpu, ");
    }

    @Override
    public void buildMainboard() {
        computer.setMainboard("Gaming Mainboard, ");
    }

    @Override
    public void buildVgaCard() {
        computer.setVga("Gaming VGA, ");
    }

    @Override
    public void buildRam() {
        computer.setRam("Gaming Ram, ");
    }

    @Override
    public void buildHarddisk() {
        computer.setHdd("Gaming HDD, ");
    }

    @Override
    public void buildSSD() {
        computer.setSsd("Gaming SSD, ");
    }

    @Override
    public void buildPSU() {
        computer.setPsu("Gaming PSU, ");
    }

    @Override
    public void buildCase() {
        computer.setComputerCase("Gaming Case, ");
    }

    @Override
    public void buildCooler() {
        computer.setCooler("Gaming Cooler, ");
    }

    @Override
    public void buildMonitor() {
        computer.setMoniter("Gaming Monitor, ");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("Gaming Mouse, ");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("Gaming Keyboard, ");
    }

    @Override
    public void buildWindows() {
        computer.setWindows("Gaming Windows, ");
    }

    @Override
    public void buildAntiVirus() {
        computer.setAntivirus("Gaming Antivirus, ");
    }

    @Override
    public Computer getComputer() {
        Computer result = this.computer;
        reset();
        return result;
    }

}
