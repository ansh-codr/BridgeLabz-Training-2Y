package FunctionalInterface.StaticMethods.PasswordStrengthValidator;

interface SecurityUtils {
    static boolean check(String p) {
        boolean ok = p != null && p.length() >= 6;
        boolean num = false;
        for (char c : p.toCharArray()) if (Character.isDigit(c)) { num = true; break; }
        return ok && num;
    }
}
