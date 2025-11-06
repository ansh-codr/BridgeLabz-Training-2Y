package FunctionalInterface.StaticMethods.DateFormatUtility;

import java.time.LocalDate;

public class runner {
    public static void main(String[] a) {
        LocalDate d = LocalDate.of(2025,11,5);
        System.out.println(dfmt.fmt("short", d));
        System.out.println(dfmt.fmt("long", d));
    }
}
