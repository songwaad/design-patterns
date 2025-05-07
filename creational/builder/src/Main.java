import builder.Builder;
import builder.Computer;
import builder.GamingOfficeBuilder;
import builder.OfficeComputerBuilder;

public class Main {

    public static void main(String[] args) {
        // Office Computer Builder
        Builder builder = new OfficeComputerBuilder();

        // Director
        Director director = new Director();

        // Director call make2monitor
        System.out.println("---- 1. Make Office Computer 2 Monitor -----");
        director.makeComputer2Monitor(builder);
        Computer computer = builder.getComputer();
        computer.show();

        // Director call make2monitor
        System.out.println("---- 2. Make Office Computer Only Case -----");
        director.makeComputerOnlyCase(builder);
        computer = builder.getComputer();
        computer.show();

        // ---------------------------------------------------------------

        // Gaming Computer Builder
        builder = new GamingOfficeBuilder();


        // Director call make2monitor
        System.out.println("---- 3. Make Gaming Computer 2 Monitor -----");
        director.makeComputer2Monitor(builder);
        computer = builder.getComputer();
        computer.show();

        // Director call make2monitor
        System.out.println("---- 4. Make Gamin Computer Only Case -----");
        director.makeComputerOnlyCase(builder);
        computer = builder.getComputer();
        computer.show();

    }
}