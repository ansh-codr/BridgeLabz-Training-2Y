// Hierarchical Inheritance Sample 2: School System with Different Roles

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Teacher: " + getName() + ", subject=" + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Student: " + getName() + ", grade=" + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Staff: " + getName() + ", department=" + department);
    }
}

public class SchoolRolesHierarchicalMain {
    public static void main(String[] args) {
        Person[] people = new Person[] {
            new Teacher("Mr. Rao", 40, "Mathematics"),
            new Student("Ansh", 19, "12th Grade"),
            new Staff("Priya", 33, "Administration")
        };
        for (Person p : people) {
            if (p instanceof Teacher) ((Teacher)p).displayRole();
            if (p instanceof Student) ((Student)p).displayRole();
            if (p instanceof Staff) ((Staff)p).displayRole();
        }
    }
}
