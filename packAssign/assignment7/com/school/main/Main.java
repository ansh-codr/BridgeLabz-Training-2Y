package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("lisa", 70, 80, 90);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        String g = a.findGrade(avg);
        System.out.println(s.toString());
        System.out.println(avg);
        System.out.println(g);
    }
}
