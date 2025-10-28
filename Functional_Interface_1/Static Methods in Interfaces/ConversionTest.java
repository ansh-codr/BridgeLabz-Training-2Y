public class ConversionTest {
    public static void main(String[] args) {
        double km = 10;
        double kg = 5;
        
        double miles = UnitConverter.kmToMiles(km);
        double lbs = UnitConverter.kgToLbs(kg);
        
        System.out.println(km + " km = " + miles + " miles");
        System.out.println(kg + " kg = " + lbs + " lbs");
    }
}