/*
Write a program to find all the factors of a number and store them in an array. Display the array.
Hint => 
Get an integer input from the user. Use a for loop to find all factors and store them in an array. Display the array of factors.
*/
public class FactorsArray {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] temp = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                temp[count++] = i;
            }
        }
        int[] factors = new int[count];
        for (int i = 0; i < count; i++) {
            factors[i] = temp[i];
        }
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();
        sc.close();
    }
}
