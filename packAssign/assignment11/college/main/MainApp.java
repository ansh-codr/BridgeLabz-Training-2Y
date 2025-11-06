package college.main;

import static java.lang.Math.*;
import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("amit", 1);
        Faculty f = new Faculty("neha", "cs");
        Department d = new Department("cse");
        s.displayStudentDetails();
        f.displayFacultyDetails();
        d.show();
        System.out.println(max(2,3));
    }
}
