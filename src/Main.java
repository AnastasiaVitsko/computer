public class Main {
    public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(5.5, 44.4, 32.5);
    Cargo originalCargo = new Cargo(dimensions, 67.5,
        "64 St Ss",true, "4325GG", true);
    Cargo updatedCargo = originalCargo.withUpdatedInfo(new Dimensions(55.7, 447.4, 352.5),
            333.4, "54 GH tt");
        System.out.println("Original Cargo: " + originalCargo.getDeliveryAddress());
        System.out.println("Updated Cargo: " + updatedCargo.getDimensions().calculateVolume());
    }
    }

