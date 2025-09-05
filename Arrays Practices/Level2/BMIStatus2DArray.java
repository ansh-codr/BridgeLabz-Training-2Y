/*
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
*/
import java.util.Scanner;
public class BMIStatus2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3]; // 0: height, 1: weight, 2: BMI
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            double h, w;
            do {
                System.out.print("Enter height in meters for person " + (i+1) + ": ");
                h = sc.nextDouble();
            } while (h <= 0);
            do {
                System.out.print("Enter weight in kg for person " + (i+1) + ": ");
                w = sc.nextDouble();
            } while (w <= 0);
            personData[i][0] = h;
            personData[i][1] = w;
            personData[i][2] = w / (h * h);
            if (personData[i][2] <= 18.4) weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i+1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        sc.close();
    }
}
