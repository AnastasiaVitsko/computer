public class Basket {

    private static int count = 0;
    private String items = "";
    private static int totalItemsCount = 0;
    private static int totalItemsPrice = 0;
    private int limit;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        totalItemsCount += 1;
        totalItemsPrice += totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count += count;
    }

    public static int getTotalItemsCount() {
        return totalItemsCount;
    }

    public static int getTotalItemsPrice() {
        return totalItemsPrice;
    }

    public static double averageProductPrice() {
        if (totalItemsCount == 0) {
            return 0;
        }
        return (double) totalItemsPrice / totalItemsCount;
    }

    public static double averageBasketCost() {
        if (count == 0) {
            return 0;
        }
        return (double) totalItemsPrice / count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalItemsPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalItemsCount += count;
        totalItemsPrice += count * price;
    }

    public void clear() {
        items = "";
        totalItemsPrice = 0;
        totalItemsCount = 0;
    }

    public int getTotalPrice() {
        return totalItemsPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}