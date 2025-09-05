/*
Write a program to print numbers from 1 to 50. For multiples of 3, print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for numbers which are multiples of both 3 and 5 print "FizzBuzz". Store the results in a String array and display the array.
Hint => 
Create a String array of size 50. Use a for loop from 1 to 50, apply the FizzBuzz logic, and store the result in the array. Display the array.
*/
public class FizzBuzzArray {
    public static void main(String[] args) {
        String[] arr = new String[50];
        for (int i = 1; i <= 50; i++) {
            if (i % 15 == 0) arr[i-1] = "FizzBuzz";
            else if (i % 3 == 0) arr[i-1] = "Fizz";
            else if (i % 5 == 0) arr[i-1] = "Buzz";
            else arr[i-1] = Integer.toString(i);
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
