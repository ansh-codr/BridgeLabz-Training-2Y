import java.util.*;
import java.util.stream.Collectors;

public class HRNameUppercasingSystem {
    private List<Employee> employees;
    
    public HRNameUppercasingSystem() {
        this.employees = new ArrayList<>();
        initializeEmployees();
    }
    
    private void initializeEmployees() {
        employees.add(new Employee("E001", "john", "smith", "IT", "Software Engineer", 75000.00));
        employees.add(new Employee("E002", "jane", "doe", "HR", "HR Manager", 68000.00));
        employees.add(new Employee("E003", "bob", "johnson", "Finance", "Accountant", 62000.00));
        employees.add(new Employee("E004", "alice", "wilson", "Marketing", "Marketing Specialist", 58000.00));
        employees.add(new Employee("E005", "charlie", "brown", "IT", "DevOps Engineer", 72000.00));
    }
    
    public void uppercaseFirstNames() {
        System.out.println("Uppercase First Names:");
        List<String> uppercaseFirstNames = employees.stream()
                .map(Employee::getFirstName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
        uppercaseFirstNames.forEach(System.out::println);
    }
    
    public void uppercaseFullNames() {
        System.out.println("Uppercase Full Names:");
        List<String> uppercaseFullNames = employees.stream()
                .map(Employee::getFullName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
        uppercaseFullNames.forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        HRNameUppercasingSystem system = new HRNameUppercasingSystem();
        
        system.uppercaseFirstNames();
        System.out.println();
        system.uppercaseFullNames();
    }
}
    public static void main(String[] args) {
        HRNameUppercasingSystem system = new HRNameUppercasingSystem();
        
        system.uppercaseFirstNames();
        System.out.println();
        system.uppercaseFullNames();
    }
}