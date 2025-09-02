/*Task:
Write a program to create a basic calculator that performs addition, subtraction, multiplication, and division.

Hint:
	•	Create variables number1 and number2.
	•	Take user input for both numbers (floating-point).
	•	Perform arithmetic operations and assign the results to variables.
	•	Print the results in a single statement.

Input (I/P):
	•	number1, number2

Output (O/P): The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
 */
package Level2;

import java.util.Scanner; // <-- Add this line

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        sc.close();
    }
}