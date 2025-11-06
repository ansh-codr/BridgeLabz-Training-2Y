package FunctionalInterface.Define.MultiVehicleRentalSystem;

public class runner {
    public static void main(String[] args) {
        vehicle c = new car();
        vehicle b = new bike();
        vehicle s = new bus();

        c.rent();
        c.returnVehicle();

        b.rent();
        b.returnVehicle();

        s.rent();
        s.returnVehicle();
    }
}