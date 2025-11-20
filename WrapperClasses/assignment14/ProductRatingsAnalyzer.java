package assignment14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] legacy = {4, 5, 3};
        List<Integer> modern = new ArrayList<>(Arrays.asList(5, null, 4, 2));
        List<Integer> combined = new ArrayList<>();
        for (int rating : legacy) {
            combined.add(rating);
        }
        combined.addAll(modern);
        int total = 0;
        int count = 0;
        for (Integer rating : combined) {
            if (Objects.nonNull(rating)) {
                total += rating;
                count++;
            }
        }
        double average = count == 0 ? 0.0 : (double) total / count;
        System.out.println(count);
        System.out.println(average);
    }
}
