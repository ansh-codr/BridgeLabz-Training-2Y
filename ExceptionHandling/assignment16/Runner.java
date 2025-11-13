package assignment16;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        try {
            FileHandler handler = new FileHandler("data.txt");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
