package Level1;
/*Convert distance in kilometers to miles using user input.
Hint:
	•	1 mile = 1.6 km

Input: take input from user
Output : The total miles is ___ mile for the given ___ km
 */

import java.util.Scanner;

public class KilometersToMilesConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
    }
}
