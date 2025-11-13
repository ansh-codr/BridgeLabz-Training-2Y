package assignment8;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter temperature: ");
            double temp = sc.nextDouble();
            System.out.println("Enter unit (C/F): ");
            char unit = sc.next().charAt(0);
            converter.convert(temp, unit);
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
