import java.util.Scanner;

    public class Main1 {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = scanner.nextInt();
            elevator.move(floor);
        }
    }
}