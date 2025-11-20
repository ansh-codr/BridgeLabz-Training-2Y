package assignment10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeAgeStats {
    public static void main(String[] args) {
        int[] ages = {25, 32, 41, 29, 38};
        List<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age);
        }
        System.out.println(Collections.min(ageList));
        System.out.println(Collections.max(ageList));
    }
}
