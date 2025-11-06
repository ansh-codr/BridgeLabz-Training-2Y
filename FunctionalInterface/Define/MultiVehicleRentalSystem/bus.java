package FunctionalInterface.Define.MultiVehicleRentalSystem;

public class bus implements vehicle {
    public void rent() {
        System.out.println("Bus rented");
    }
    public void returnVehicle() {
        System.out.println("Bus returned");
    }
    
}
