package assignment16;

import java.util.ArrayList;
import java.util.List;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "70", null};
        List<Integer> marks = new ArrayList<>();
        for (Object input : inputs) {
            Integer value = toInteger(input);
            if (value != null) {
                marks.add(value);
            }
        }
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = marks.isEmpty() ? 0.0 : (double) total / marks.size();
        System.out.println(marks.size());
        System.out.println(average);
    }

    private static Integer toInteger(Object input) {
        if (input instanceof Integer) {
            return (Integer) input;
        }
        if (input instanceof String) {
            String text = (String) input;
            if (text.equalsIgnoreCase("null")) {
                return null;
            }
            try {
                return Integer.valueOf(text);
            } catch (NumberFormatException e) {
                return null;
            }
        }
        if (input instanceof Number) {
            return ((Number) input).intValue();
        }
        return null;
    }
}
