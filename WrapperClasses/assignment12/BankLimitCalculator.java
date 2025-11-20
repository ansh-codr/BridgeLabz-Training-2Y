package assignment12;

public class BankLimitCalculator {
    public static void main(String[] args) {
        Double stored = 1000.0;
        System.out.println(remainingLimit(stored, 200.0));
        System.out.println(remainingLimit(500.0, 150.0));
        System.out.println(remainingLimit(null, 50.0));
    }

    public static double remainingLimit(Double limit, double used) {
        if (limit == null) {
            return 0.0;
        }
        return limit - used;
    }
}
