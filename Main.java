public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Vendor1", "Computer1");
        computer1.setProcessor(new Processor(3.5, 4, "Intel", 0.5));
        computer1.setRam(new RAM("DDR4", 8, 0.2));
        computer1.setStorage(new Storage("SSD", 2567, 0.1));
        computer1.setDisplay(new Display(15.6, "IPS", 0.7));
        computer1.setKeyboard(new Keyboard("Mechanical", true, 0.6));

        Computer computer2 = new Computer("Vendor2", "Computer2");
        computer2.setProcessor(new Processor(2.8, 2, "AMD", 0.4));
        computer2.setRam(new RAM("DDR3", 16, 0.3));
        computer2.setStorage(new Storage("HDD", 512, 0.2));
        computer2.setDisplay(new Display(14.0, "TN", 0.5));
        computer2.setKeyboard(new Keyboard("Membrane", false, 0.4));

        System.out.println("Computer 1:");
        System.out.println(computer1.toString());
        System.out.println("Total Weight: " + computer1.calculateTotalWeight() + " kg\n");

        System.out.println("Computer 2:");
        System.out.println(computer2.toString());
        System.out.println("Total Weight: " + computer2.calculateTotalWeight() + " kg");
    }
}