package Level1;
/*The University charges INR 1,25,000 for a course and offers a 10% discount. Find the discounted amount and final payable fee.
Input: None
Output:The discount amount is INR ___ and final discounted fee is INR ___
 */
public class DiscountedCourseFees {
    public static void main(String[] args) {
        int courseFee = 125000;
        double discount = 0.1;
        double discountedAmount = courseFee * discount;
        double finalFee = courseFee - discountedAmount;
        System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + finalFee);
    }
}
