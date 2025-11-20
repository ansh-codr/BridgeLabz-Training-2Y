package assignment17;

import java.util.ArrayList;
import java.util.List;

public class WrapperPerformanceBenchmark {
    private static final int SIZE = 1_000_000;

    public static void main(String[] args) {
        long listStart = System.nanoTime();
        List<Integer> list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
        long listSum = 0;
        for (int value : list) {
            listSum += value;
        }
        long listEnd = System.nanoTime();

        long arrayStart = System.nanoTime();
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = i;
        }
        long arraySum = 0;
        for (int value : array) {
            arraySum += value;
        }
        long arrayEnd = System.nanoTime();

        System.out.println(listSum);
        System.out.println(listEnd - listStart);
        System.out.println(arraySum);
        System.out.println(arrayEnd - arrayStart);
    }
}
