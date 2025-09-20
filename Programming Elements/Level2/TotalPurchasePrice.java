/*
 * Task:
Write a program to calculate the total purchase price based on the unit price and quantity.

Input (I/P):
	•	unitPrice, quantity

Output (O/P): The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
 */
package Level2;

import java.util.Scanner;
public class TotalPurchasePrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);

        scanner.close();
    }
}
