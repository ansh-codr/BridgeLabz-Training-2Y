/*
Write a program to copy all elements of a 2D array to a 1D array and display the 1D array.
Hint => 
Define a 2D array of size 2x3 and get user input to store in the array.
Create a 1D array of size 6. Use nested loops to copy elements from 2D to 1D array.
Display the 1D array.
*/
public class Copy2DArrayTo1D {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] arr2D = new int[2][3];
        System.out.println("Enter 6 elements for 2x3 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }
        int[] arr1D = new int[6];
        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1D[k++] = arr2D[i][j];
            }
        }
        System.out.print("1D array: ");
        for (int val : arr1D) {
            System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}
