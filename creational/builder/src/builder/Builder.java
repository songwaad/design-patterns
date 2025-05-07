package builder;

public interface Builder {
    public void reset();
    public void buildCpu();
    public void buildMainboard();
    public void buildVgaCard();
    public void buildRam();
    public void buildHarddisk();
    public void buildSSD();
    public void buildPSU();
    public void buildCase();
    public void buildCooler();
    public void buildMonitor();
    public void buildMouse();
    public void buildKeyboard();
    public void buildWindows();
    public void buildAntiVirus();

    Computer getComputer();
}
