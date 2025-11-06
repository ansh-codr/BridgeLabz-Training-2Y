package FunctionalInterface.MarkerInterfaces.CloningPrototypeObjects;

public class runner {
    public static void main(String[] a) {
        thing t1 = new thing(5);
        thing t2 = t1.copy();
        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}
