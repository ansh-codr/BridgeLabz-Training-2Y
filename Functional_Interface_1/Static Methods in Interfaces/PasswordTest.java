public class PasswordTest {
    public static void main(String[] args) {
        String password1 = "hello";
        String password2 = "password123";
        String password3 = "mypassword";
        
        SecurityUtils.isPasswordStrong(password1);
        SecurityUtils.isPasswordStrong(password2);
        SecurityUtils.isPasswordStrong(password3);
    }
}