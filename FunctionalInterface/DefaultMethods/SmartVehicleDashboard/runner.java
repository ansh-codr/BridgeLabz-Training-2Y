package FunctionalInterface.DefaultMethods.SmartVehicleDashboard;

public class runner {
    public static void main(String[] a) {
        car c = new car();
        ev e = new ev();
        c.displaySpeed(50);
        c.displayBattery(0);
        e.displaySpeed(40);
        e.displayBattery(80);
    }
}
