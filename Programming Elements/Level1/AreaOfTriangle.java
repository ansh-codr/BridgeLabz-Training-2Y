package Level1;
/*
 * 
Find the area of a triangle using base and height (in square inches and square centimeters).
Formula: Area = ½ × base × height
Input: base, height
Output:The area of triangle is ___ sq. inches and ___ sq. cm
 */
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of triangle is " + area + " sq. cm");
        input.close();
    }
}
