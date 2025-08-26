package Level1;
/*Take height in centimeters and convert it into feet and inches.
Hint:
	•	1 foot = 12 inches
	•	1 inch = 2.54 cm
Input : take input -- height in cm
Output : Your Height in cm is ___ while in feet is ___ and inches is ___
 */
import java.util.Scanner;
public class HeightConversionToCm {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double cm = input.nextDouble();
        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
        input.close();
    }     
 }



