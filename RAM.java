public class RAM {
    private final String type;
    private final int capacity;
    private final double weight;

    public RAM(String type, int capacity, double weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}

