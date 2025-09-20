// Employee Management System: Employee (base), Manager, Developer, Intern (subclasses)
// Demonstrates: inheritance, overriding, and encapsulation

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    public void displayDetails() {
        System.out.println("Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]");
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }

    @Override
    public void displayDetails() {
        System.out.println("Manager [name=" + getName() + ", id=" + getId() + ", salary=" + getSalary() + ", teamSize=" + teamSize + "]");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() { return programmingLanguage; }

    @Override
    public void displayDetails() {
        System.out.println("Developer [name=" + getName() + ", id=" + getId() + ", salary=" + getSalary() + ", language=" + programmingLanguage + "]");
    }
}

class Intern extends Employee {
    private String mentorName;

    public Intern(String name, int id, double salary, String mentorName) {
        super(name, id, salary);
        this.mentorName = mentorName;
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern [name=" + getName() + ", id=" + getId() + ", salary=" + getSalary() + ", mentor=" + mentorName + "]");
    }
}

public class EmployeeManagementMain {
    public static void main(String[] args) {
        Employee[] emps = new Employee[] {
            new Manager("Alice", 101, 120000, 8),
            new Developer("Bob", 102, 95000, "Java"),
            new Intern("Carol", 103, 30000, "Alice")
        };
        for (Employee e : emps) {
            e.displayDetails(); // polymorphism
        }
    }
}
