package assignment3;

public class LoginSystem {
    private String validUser = "admin";
    private String validPass = "password123";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password");
        }
        System.out.println("Login successful!");
    }
}
