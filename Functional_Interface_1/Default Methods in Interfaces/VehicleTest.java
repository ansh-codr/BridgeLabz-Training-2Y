public class VehicleTest {
    public static void main(String[] args) {
        VehicleDashboard car = new ElectricCar();
        
        car.displaySpeed();
        car.displayBattery();
    }
}