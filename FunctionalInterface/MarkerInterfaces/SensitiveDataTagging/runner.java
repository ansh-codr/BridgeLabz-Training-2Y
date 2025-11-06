package FunctionalInterface.MarkerInterfaces.SensitiveDataTagging;

public class runner {
    public static void main(String[] a) {
        user u = new user();
        if (u instanceof Sensitive) System.out.println("encrypt"); else System.out.println("plain");
    }
}
