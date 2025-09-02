package Level2;
/*
Rewrite the above program 7 to find the factors of a number using the while loop
Hint:
Get the input value for a variable named number and check if it is a positive integer.
Create a counter variable and run the while loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.
*/
import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number > 0) {
            int i = 1;
            System.out.print("Factors: ");
            while (i < number) {
                if (number % i == 0) System.out.print(i + " ");
                i++;
            }
            System.out.println();
        } else {
            System.out.println("Not a positive integer");
        }
        sc.close();
    }
}
