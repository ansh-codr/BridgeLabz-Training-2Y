package Level2;
/*
 * Task:
Write a program to calculate the area of a triangle using its base and height (in cm). Display the area in square centimeters and square inches.

Hint:
	•	Formula: Area = ½ * base * height
	•	Conversion: 1 inch = 2.54 cm

Input (I/P):
	•	base, height

Output (O/P): The Area of the triangle in sq in is ___ and sq cm is ___
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter base (in cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = scanner.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaSqIn, areaSqCm);

        scanner.close();
    }
}
