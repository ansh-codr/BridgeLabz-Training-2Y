/**
 * Smart Light class representing a smart light with different activation behaviors
 */
public class SmartLight {
    private String location;
    private boolean isOn;
    private int brightness; // 0-100
    private String color;
    
    public SmartLight(String location) {
        this.location = location;
        this.isOn = false;
        this.brightness = 0;
        this.color = "white";
    }
    
    public void activateLight(int brightness, String color) {
        this.isOn = true;
        this.brightness = brightness;
        this.color = color;
        System.out.println("Light in " + location + " activated: " + 
                          brightness + "% brightness, " + color + " color");
    }
    
    public void turnOff() {
        this.isOn = false;
        this.brightness = 0;
        System.out.println("Light in " + location + " turned off");
    }
    
    // Getters
    public String getLocation() { return location; }
    public boolean isOn() { return isOn; }
    public int getBrightness() { return brightness; }
    public String getColor() { return color; }
    
    @Override
    public String toString() {
        return "SmartLight{" +
                "location='" + location + '\'' +
                ", isOn=" + isOn +
                ", brightness=" + brightness +
                ", color='" + color + '\'' +
                '}';
    }
}