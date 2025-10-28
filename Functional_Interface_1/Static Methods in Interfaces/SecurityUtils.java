public interface SecurityUtils {
    
    static boolean isPasswordStrong(String password) {
        if (password.length() >= 8) {
            System.out.println("Password is strong");
            return true;
        } else {
            System.out.println("Password is weak");
            return false;
        }
    }
}