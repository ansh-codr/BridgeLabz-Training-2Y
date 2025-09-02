/*
 * Task:
Write a program to find the length of the side of a square using its perimeter.

Hint:
	•	Formula: Perimeter = 4 × side

Input (I/P):
	•	perimeter

Output (O/P):The length of the side is ___ whose perimeter is ____
 */
package Level2;

import java.util.Scanner;

public class SideOfSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        double side = perimeter / 4;

        System.out.printf("Each side of the square is: %.2f (Perimeter: %.2f)%n", side, perimeter);

        scanner.close();
    }
}
