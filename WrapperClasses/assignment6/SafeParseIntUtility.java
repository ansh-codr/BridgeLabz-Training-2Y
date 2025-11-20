package assignment6;

public class SafeParseIntUtility {
    public static void main(String[] args) {
        String[] inputs = {"123", "abc", "45.6", "0"};
        for (String input : inputs) {
            System.out.println(input + ":" + safeParseInt(input));
        }
    }

    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
