package assignment3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter username: ");
            String user = sc.nextLine();
            System.out.println("Enter password: ");
            String pass = sc.nextLine();
            login.validate(user, pass);
        } catch (InvalidCredentialsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Please try again.");
        }
        sc.close();
    }
}
