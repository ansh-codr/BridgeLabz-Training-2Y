package Level2;
/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint:
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/
import java.util.Scanner;
public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int age1 = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int height1 = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int age2 = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height2 = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int age3 = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height3 = sc.nextInt();
        String youngest = (age1 < age2 && age1 < age3) ? "Amar" : (age2 < age1 && age2 < age3) ? "Akbar" : "Anthony";
        String tallest = (height1 > height2 && height1 > height3) ? "Amar" : (height2 > height1 && height2 > height3) ? "Akbar" : "Anthony";
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
        sc.close();
    }
}
