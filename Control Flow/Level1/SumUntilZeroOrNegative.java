package Level1;
/*
Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint:
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
*/
import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double val = sc.nextDouble();
            if (val <= 0) break;
            total += val;
        }
        System.out.println("Total sum: " + total);
        sc.close();
    }
}
