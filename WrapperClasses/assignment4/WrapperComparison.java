package assignment4;

public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a.equals(b));
        System.out.println("Small values cached, larger not");
    }
}
