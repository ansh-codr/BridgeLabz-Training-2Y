package FunctionalInterface.Define.MultiVehicleRentalSystem;
public class car implements vehicle {
    public void rent() {
        System.out.println("Car rented");
    }
    public void returnVehicle() {
        System.out.println("Car returned");
    }
    
}
