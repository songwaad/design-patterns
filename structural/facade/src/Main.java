public class Main {

    public static void main(String[] args) {
        Avengers avengers = new Avengers();

        // Wanda Level 100
        System.out.println("\n--- 1. Wanda Level 100 ---");
        avengers.defend(100, "kamar-taj");
        avengers.evacuatePeople("kamar-taj");
        avengers.attack("Wanda", 100);

        // Villain Level 1
        System.out.println("\n--- 2. Villain Level 1 ---");
        avengers.defend(1, "New York");
        avengers.attack("Villain", 1);

        // Villains Level 2
        System.out.println("\n--- 3. Villains Level 2 ---");
        avengers.defend(2, "New York");
        avengers.attack("Villains", 2);

        // Aliens Level 3
        System.out.println("\n--- 4. Aliens Level 3 ---");
        avengers.evacuatePeople("Phuket");
        avengers.defend(3, "Phuket");
        avengers.attack("Aliens", 3);

    }
}