public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;  // исправлено
    private final boolean canFlip;
    private final String registrationNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress,
                 boolean canFlip, String registrationNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.canFlip = canFlip;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {  // исправлено
        return deliveryAddress;
    }

    public boolean isCanFlip() {
        return canFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo withUpdatedInfo(Dimensions newDimensions, double newWeight, String newAddress) {
        return new Cargo(newDimensions, newWeight, newAddress, canFlip, registrationNumber, isFragile);
    }
}