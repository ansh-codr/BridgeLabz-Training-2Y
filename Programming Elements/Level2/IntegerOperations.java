/*
 * Task:
Write an IntOperation program by taking three integers: a, b, and c. Perform and print the following operations:
	•	a + b * c
	•	a * b + c
	•	c + a / b
	•	a % b + c

Hint:
	•	Understand operator precedence while performing these operations.

Input (I/P):
	•	a, b, c

Output (O/P): The results of Int Operations are ___, ___, ___, and ___
 */
package Level2;
import java.util.Scanner;

public class IntegerOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third integer (c): ");
        int c = scanner.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n", result1, result2, result3, result4);

        scanner.close();
    }
}
