/*
Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order  
*/
import java.util.Scanner;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int n = number, count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        int index = 0;
        while (n != 0) {
            digits[index++] = n % 10;
            n /= 10;
        }
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        sc.close();
    }
}
