package FunctionalInterface.Functional.StringLengthChecker;

import java.util.function.Function;

public class runner {
    public static void main(String[] a) {
        Function<String,Integer> f = s -> s.length();
        String m = "hello world";
        int lim = 10;
        if (f.apply(m) > lim) System.out.println("long"); else System.out.println("ok");
    }
}
