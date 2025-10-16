/**
 * Employee class representing an employee
 */
public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private String position;
    private double salary;
    
    public Employee(String employeeId, String firstName, String lastName, String department, String position, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
    
    // Getters
    public String getEmployeeId() { return employeeId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName; }
    public String getDepartment() { return department; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    
    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    @Override
    public String toString() {
        return String.format("Employee{ID='%s', Name='%s', Dept='%s', Position='%s', Salary=%.2f}", 
                employeeId, getFullName(), department, position, salary);
    }
}