// Single Inheritance Sample 2: Smart Home Devices

class Device {
    private String deviceId;
    private String status; // e.g., ONLINE, OFFLINE

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() { return deviceId; }
    public String getStatus() { return status; }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        System.out.println("Thermostat [id=" + getDeviceId() + ", status=" + getStatus() + ", temp=" + temperatureSetting + "°C]");
    }
}

public class SmartHomeSingleInheritanceMain {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T-1001", "ONLINE", 22.5);
        t.displayStatus();
    }
}
