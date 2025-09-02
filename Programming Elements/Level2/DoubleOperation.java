/*
 * Task:
Write a DoubleOpt program similar to the above, but take double values (a, b, c) and perform the same operations:
	•	a + b * c
	•	a * b + c
	•	c + a / b
	•	a % b + c

Input (I/P):
	•	a, b, c

Output (O/P):The results of Double Operations are ___, ___, ___, and ___
 */
package Level2;
import java.util.Scanner;

public class DoubleOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first double (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second double (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter third double (c): ");
        double c = scanner.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n", result1, result2, result3, result4);

        scanner.close();
    }
}
