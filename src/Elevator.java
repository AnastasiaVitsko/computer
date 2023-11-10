
public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor--;
            System.out.println("Лифт двигается вниз. Текущий этаж: " + currentFloor);
        } else {
            System.out.println("Ошибка: Лифт уже на самом нижнем этаже");
        }
    }

    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor++;
            System.out.println("Лифт двигается вверх. Текущий этаж: " + currentFloor);
        } else {
            System.out.println("Ошибка: Лифт уже на самом верхнем этаже");
        }
    }

    public void move(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            while (currentFloor > floor) {
                moveDown();
            }
            while (currentFloor < floor) {
                moveUp();
            }
            System.out.println("Лифт достиг целевого этажа: " + currentFloor);
        } else {
            System.out.println("Ошибка: Неверный этаж");
        }
    }
}
