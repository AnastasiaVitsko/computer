import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер этажа: ");

            if (scanner.hasNextInt()) {
                int floor = scanner.nextInt();
                elevator.move(floor);
            } else {
                System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                scanner.next();
            }
        }
    }
}