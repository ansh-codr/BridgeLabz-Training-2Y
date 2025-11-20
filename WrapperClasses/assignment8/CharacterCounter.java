package assignment8;

import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String text = sc.nextLine();
            int letters = 0;
            int digits = 0;
            int special = 0;
            for (char ch : text.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letters++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else if (!Character.isWhitespace(ch)) {
                    special++;
                }
            }
            System.out.println(letters);
            System.out.println(digits);
            System.out.println(special);
        }
    }
}
