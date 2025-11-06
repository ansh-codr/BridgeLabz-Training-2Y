package com.university.department.cse;

public class Course {
    private String name;
    
    public Course(String name) {
        this.name = name;
    }
    
    public void showCourse() {
        System.out.println("Course: " + name);
    }
}
