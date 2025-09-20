package Level1;
/*
Rewrite program 14 using for loop
Hint:
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result.
*/
import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n > 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial: " + fact);
        } else {
            System.out.println("Not a positive integer");
        }
        sc.close();
    }
}
