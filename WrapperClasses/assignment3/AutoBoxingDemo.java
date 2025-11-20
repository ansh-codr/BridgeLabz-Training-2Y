package assignment3;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(5);
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
