/*
Write a program to take user input for 5 numbers and check whether a number is positive, negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/
public class ArrayPosNegEvenOddCompare {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0) System.out.println(num + " is positive and even");
                else System.out.println(num + " is positive and odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        if (arr[0] == arr[4]) System.out.println("First and last elements are equal");
        else if (arr[0] > arr[4]) System.out.println("First element is greater than last");
        else System.out.println("First element is less than last");
        sc.close();
    }
}
