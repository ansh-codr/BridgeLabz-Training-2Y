package Level1;
/*
2. Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/
import java.util.Scanner;
public class FirstIsSmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();
        boolean isSmallest = n1 < n2 && n1 < n3;
        System.out.println("Is the first number the smallest? " + isSmallest);
        sc.close();
    }
}
