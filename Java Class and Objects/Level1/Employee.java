// Level1 - Program 1: Employee Details
// Best practices: private fields, constructor with this, simple display method, comments
public class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    // Getters (if needed later)
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }
}