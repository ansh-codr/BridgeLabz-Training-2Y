package assignment1;

import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();
            Integer obj = value;
            System.out.println(value);
            System.out.println(obj);
        }
    }
}
