import java.util.function.Predicate;

public class TemperatureAlertSystem {
    
    public static void main(String[] args) {
        Predicate<Double> isHot = temp -> temp > 35.0;
        
        double temp1 = 25.0;
        double temp2 = 40.0;
        double temp3 = 33.0;
        
        if (isHot.test(temp1)) {
            System.out.println("Temperature " + temp1 + " is too hot!");
        } else {
            System.out.println("Temperature " + temp1 + " is normal");
        }
        
        if (isHot.test(temp2)) {
            System.out.println("Temperature " + temp2 + " is too hot!");
        } else {
            System.out.println("Temperature " + temp2 + " is normal");
        }
        
        if (isHot.test(temp3)) {
            System.out.println("Temperature " + temp3 + " is too hot!");
        } else {
            System.out.println("Temperature " + temp3 + " is normal");
        }
    }
}