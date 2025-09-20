// Vehicle and Transport System: Vehicle (base), Car, Truck, Motorcycle (subclasses)
// Demonstrates: inheritance and polymorphism with an array of Vehicle

class Vehicle {
    private int maxSpeed;
    private String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public int getMaxSpeed() { return maxSpeed; }
    public String getFuelType() { return fuelType; }

    public void displayInfo() {
        System.out.println("Vehicle [maxSpeed=" + maxSpeed + ", fuelType=" + fuelType + "]");
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car [maxSpeed=" + getMaxSpeed() + ", fuelType=" + getFuelType() + ", seats=" + seatCapacity + "]");
    }
}

class Truck extends Vehicle {
    private double cargoCapacityTons;

    public Truck(int maxSpeed, String fuelType, double cargoCapacityTons) {
        super(maxSpeed, fuelType);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck [maxSpeed=" + getMaxSpeed() + ", fuelType=" + getFuelType() + ", cargo=" + cargoCapacityTons + " tons]");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasCarrier;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle [maxSpeed=" + getMaxSpeed() + ", fuelType=" + getFuelType() + ", hasCarrier=" + hasCarrier + "]");
    }
}

public class VehicleTransportMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Car(220, "Petrol", 5),
            new Truck(140, "Diesel", 12.5),
            new Motorcycle(160, "Petrol", true)
        };
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
