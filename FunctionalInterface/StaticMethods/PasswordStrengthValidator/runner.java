package FunctionalInterface.StaticMethods.PasswordStrengthValidator;

public class runner {
    public static void main(String[] a) {
        String p1 = "abc123";
        String p2 = "abc";
        System.out.println(SecurityUtils.check(p1) ? "strong" : "weak");
        System.out.println(SecurityUtils.check(p2) ? "strong" : "weak");
    }
}
