package builder;

public class OfficeComputerBuilder implements Builder {
    private Computer computer;

    @Override
    public void reset() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Office Cpu, ");
    }

    @Override
    public void buildMainboard() {
        computer.setMainboard("Office Mainboard, ");
    }

    @Override
    public void buildVgaCard() {
        computer.setVga("Office VGA, ");
    }

    @Override
    public void buildRam() {
        computer.setRam("Office Ram, ");
    }

    @Override
    public void buildHarddisk() {
        computer.setHdd("Office HDD, ");
    }

    @Override
    public void buildSSD() {
        computer.setSsd("Office SSD, ");
    }

    @Override
    public void buildPSU() {
        computer.setPsu("Office PSU, ");
    }

    @Override
    public void buildCase() {
        computer.setComputerCase("Office Case, ");
    }

    @Override
    public void buildCooler() {
        computer.setCooler("Office Cooler, ");
    }

    @Override
    public void buildMonitor() {
        computer.setMoniter("Office Monitor, ");
    }

    @Override
    public void buildMouse() {
        computer.setMouse("Office Mouse, ");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("Office Keyboard, ");
    }

    @Override
    public void buildWindows() {
        computer.setWindows("Office Windows, ");
    }

    @Override
    public void buildAntiVirus() {
        computer.setAntivirus("Office Antivirus, ");
    }

    @Override
    public Computer getComputer() {
        Computer result = this.computer;
        reset();
        return result;
    }

}
