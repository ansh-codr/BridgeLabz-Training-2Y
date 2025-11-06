package college.department;

public class Department {
    private String name;
    
    public Department(String name) {
        this.name = name;
    }
    
    public void show() {
        System.out.println("Department: " + name);
    }
}
