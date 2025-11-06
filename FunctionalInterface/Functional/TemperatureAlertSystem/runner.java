package FunctionalInterface.Functional.TemperatureAlertSystem;

import java.util.function.Predicate;

public class runner {
    public static void main(String[] a) {
        Predicate<Double> p = x -> x > 30;
        double t = 35;
        if (p.test(t)) System.out.println("alert"); else System.out.println("ok");
    }
}
