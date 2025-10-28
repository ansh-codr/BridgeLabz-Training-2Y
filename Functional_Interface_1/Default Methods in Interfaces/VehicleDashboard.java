public interface VehicleDashboard {
    void displaySpeed();
    
    default void displayBattery() {
        System.out.println("Battery: 80%");
    }
}