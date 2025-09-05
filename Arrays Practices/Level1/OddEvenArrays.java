/*
Write a program to store 10 numbers in an array and display all odd and even numbers separately.
Hint => 
Create an integer array of size 10 and get user input to store in the array.
Use a for loop to display all even numbers and another for loop to display all odd numbers.
*/
public class OddEvenArrays {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.print("\nOdd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
