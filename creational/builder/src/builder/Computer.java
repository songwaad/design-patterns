package builder;

import java.util.List;

public class Computer {
    private String cpu;
    private String mainboard;
    private String vga;
    private String ram;
    private String hdd;
    private String ssd;
    private String psu;
    private String computerCase;
    private String cooler;
    private String moniter;
    private String mouse;
    private String keyboard;
    private String windows;
    private String antivirus;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public void setComputerCase(String computerCase) {
        this.computerCase = computerCase;
    }

    public void setCooler(String cooler) {
        this.cooler = cooler;
    }

    public void setMoniter(String moniter) {
        if(this.moniter==null) {
            this.moniter = moniter;
        } else {
            this.moniter += moniter;
        }
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setAntivirus(String antivirus) {
        this.antivirus = antivirus;
    }

    public String getMoniter() {
        return moniter;
    }

    public void show() {
        String result = "";
        if(cpu!=null)  result += "cpu : " + cpu;
        if(mainboard!=null)  result += "\nmainboard : " + mainboard;
        if(vga!=null)  result += "\nvga : " + vga;
        if(ram!=null)  result += "\nram : " + ram;
        if(hdd!=null)  result += "\nhdd : " + hdd;
        if(ssd!=null)  result += "\nssd : " + ssd;
        if(psu!=null)  result += "\npsu : " + psu;
        if(computerCase!=null)  result += "\ncomputerCase : " + computerCase;
        if(cooler!=null)  result += "\ncooler : " + cooler;
        if(moniter!=null)  result += "\nmoniter : " + moniter;
        if(mouse!=null)  result += "\nmouse : " + mouse;
        if(keyboard!=null)  result += "\nkeyboard : " + keyboard;
        if(windows!=null)  result += "\nwindows : " + windows;
        if(antivirus!=null)  result += "\nantivirus : " + antivirus;
        result += "\n";
        System.out.println(result);
    }
}
