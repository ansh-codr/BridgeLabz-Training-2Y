package Level1;
/*Compute the volume of Earth in cubic kilometers and cubic miles.
Hint:
	•	Volume of Sphere = (4/3) × π × r³
	•	Radius of Earth = 6378 km 
    Output : The volume of Earth in cubic kilometers is ___ and in cubic miles is ___
    */
public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378.0; // Radius of Earth in km
        double volumeKm3 = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double volumeMiles3 = volumeKm3 * 0.239913; // Convert km³ to miles³
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and in cubic miles is " + volumeMiles3);
    }
}
