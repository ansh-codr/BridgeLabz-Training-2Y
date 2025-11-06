package FunctionalInterface.Define.MultiVehicleRentalSystem;

public class bike implements vehicle {
    public void rent() {
        System.out.println("Bike rented");
    }
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
    
}
