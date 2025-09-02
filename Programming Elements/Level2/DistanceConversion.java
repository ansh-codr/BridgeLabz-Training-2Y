/*Task:
Write a program to convert a given distance in feet to yards and miles.

Hint:
	•	1 yard = 3 feet
	•	1 mile = 1760 yards

Input (I/P):
	•	distanceInFeet

Output (O/P): The distance in yards is ___ while the distance in miles is ___ */
package Level2;
import java.util.Scanner;

public class DistanceConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n", distanceInYards, distanceInMiles);

        scanner.close();
    }
}
