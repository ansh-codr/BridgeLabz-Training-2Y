// Hybrid Inheritance Sample 2: Vehicle Management with interfaces

interface Refuelable {
    void refuel();
}

class BaseVehicle {
    private int maxSpeed;
    private String model;

    public BaseVehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() { return maxSpeed; }
    public String getModel() { return model; }

    public void displayInfo() {
        System.out.println("Vehicle [model=" + model + ", maxSpeed=" + maxSpeed + "]");
    }
}

class ElectricVehicle extends BaseVehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(getModel() + " is charging...");
    }

    @Override
    public void displayInfo() {
        System.out.println("Electric " + getModel() + " (" + getMaxSpeed() + " km/h)");
    }
}

class PetrolVehicle extends BaseVehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(getModel() + " is refueling with petrol...");
    }

    @Override
    public void displayInfo() {
        System.out.println("Petrol " + getModel() + " (" + getMaxSpeed() + " km/h)");
    }
}

public class VehicleHybridMain {
    public static void main(String[] args) {
        BaseVehicle ev = new ElectricVehicle(200, "Model-E");
        BaseVehicle pv = new PetrolVehicle(220, "Model-P");

        ev.displayInfo();
        pv.displayInfo();

        ((ElectricVehicle) ev).charge();
        ((PetrolVehicle) pv).refuel();
    }
}
