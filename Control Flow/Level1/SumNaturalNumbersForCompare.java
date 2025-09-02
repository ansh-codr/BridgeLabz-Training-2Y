package Level1;
/*
Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers.
Hint:
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
*/
import java.util.Scanner;
public class SumNaturalNumbersForCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Are both results equal? " + (sumFor == sumFormula));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
