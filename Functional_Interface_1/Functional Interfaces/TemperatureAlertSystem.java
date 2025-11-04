public class TemperatureAlertSystem {
    static boolean isHot(double t) { return t > 35.0; }

    public static void main(String[] args) {
        double temp1 = 25.0;
        double temp2 = 40.0;
        double temp3 = 33.0;

        System.out.println("Temperature " + temp1 + (isHot(temp1) ? " is too hot!" : " is normal"));
        System.out.println("Temperature " + temp2 + (isHot(temp2) ? " is too hot!" : " is normal"));
        System.out.println("Temperature " + temp3 + (isHot(temp3) ? " is too hot!" : " is normal"));
    }
}