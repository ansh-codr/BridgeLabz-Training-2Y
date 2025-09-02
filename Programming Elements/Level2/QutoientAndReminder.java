/*
 * Task:
Write a program to take two numbers and print their quotient and remainder.

Hint:
	•	Use division operator (/) for quotient.
	•	Use modulus operator (%) for remainder.

Input (I/P):
	•	number1, number2

Output (O/P): The Quotient is ___ and Remainder is ___ of two numbers ___ and ___
 */
package Level2;
import java.util.Scanner;
public class QutoientAndReminder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d%n", quotient, remainder, number1, number2);

        scanner.close();
    }
}
