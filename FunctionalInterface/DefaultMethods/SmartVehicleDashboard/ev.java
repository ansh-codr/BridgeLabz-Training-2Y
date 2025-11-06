package FunctionalInterface.DefaultMethods.SmartVehicleDashboard;

class ev implements veh {
    public void displaySpeed(int s) { System.out.println("speed " + s); }
    public void displayBattery(int b) { System.out.println("batt " + b + "%"); }
}
