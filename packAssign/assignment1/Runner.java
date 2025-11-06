import college.student.Student;
import college.faculty.Faculty;

public class Runner {
    public static void main(String[] args) {
        Student s = new Student("ram", 1);
        s.displayStudentDetails();
        Faculty f = new Faculty("sita", "math");
        f.displayFacultyDetails();
    }
}
