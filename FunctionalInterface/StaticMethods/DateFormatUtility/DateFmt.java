package FunctionalInterface.StaticMethods.DateFormatUtility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface dfmt {
    static String fmt(String s, LocalDate d) {
        if ("short".equals(s)) return d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        else return d.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
