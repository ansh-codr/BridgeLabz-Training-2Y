package FunctionalInterface.DefaultMethods.SmartVehicleDashboard;

interface veh {
    void displaySpeed(int s);
    default void displayBattery(int b) { System.out.println("no batt"); }
}
