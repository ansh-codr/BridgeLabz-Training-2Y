package assignment11;

public class AgeValidator {
    public static void main(String[] args) {
        String[] inputs = {"17", "18", "21", "abc"};
        for (String input : inputs) {
            System.out.println(input + ":" + isValidAdult(input));
        }
    }

    public static boolean isValidAdult(String value) {
        try {
            return Integer.parseInt(value) >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
