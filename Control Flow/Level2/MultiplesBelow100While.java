package Level2;
/*
Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint:
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Create a counter variable and assign counter = 100; Use a while till the counter > 0
Inside the loop, check if the counter perfectly divides the number. If true, print the counter and continue the loop.
*/
import java.util.Scanner;
public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int counter = 100;
            System.out.print("Multiples: ");
            while (counter > 0) {
                if (counter % number == 0) System.out.print(counter + " ");
                counter--;
            }
            System.out.println();
        } else {
            System.out.println("Not a valid input");
        }
        sc.close();
    }
}
