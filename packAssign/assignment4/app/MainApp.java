import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("ana", 2);
        System.out.println(s.getName());
        System.out.println(s.getRollNumber());
    }
}
