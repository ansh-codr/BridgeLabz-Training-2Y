package Level1;
// Take user input for course fee and discount percentage. Calculate the discount and final fee.
// Input: fee, discountPercent
// Output: The discount amount is INR ___ and final discounted fee is INR ___

import java.util.Scanner;

public class DiscountedCourseFeeUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course fee: ");
        double fee = scanner.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discounted course fee is " + finalFee);
    }
}
