/*
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/
import java.util.Scanner;
public class DigitFrequencyArray {
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
        temp = n;
        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }
        int[] freq = new int[10];
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }
        System.out.println("Digit : Frequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println(i + " : " + freq[i]);
        }
        sc.close();
    }
}
