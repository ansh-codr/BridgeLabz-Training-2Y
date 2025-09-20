/*
Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value
*/
public class ArraySumUpTo10OrZero {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[] arr = new double[10];
        int index = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double val = sc.nextDouble();
            if (val <= 0 || index == 10) break;
            arr[index++] = val;
        }
        double total = 0.0;
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }
        System.out.println("\nTotal sum: " + total);
        sc.close();
    }
}
