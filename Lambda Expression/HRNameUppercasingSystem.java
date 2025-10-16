import java.util.*;
import java.util.stream.Collectors;

/**
 * HR Name Uppercasing System using String::toUpperCase Method Reference
 * Demonstrates converting employee names to uppercase for HR letters
 */
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
        employees.add(new Employee("E006", "diana", "prince", "Sales", "Sales Manager", 65000.00));
        employees.add(new Employee("E007", "bruce", "wayne", "Executive", "CEO", 150000.00));
        employees.add(new Employee("E008", "clark", "kent", "IT", "Senior Developer", 85000.00));
        employees.add(new Employee("E009", "peter", "parker", "Design", "UI/UX Designer", 60000.00));
        employees.add(new Employee("E010", "tony", "stark", "Executive", "CTO", 140000.00));
    }
    
    // 1. Convert all first names to uppercase using String::toUpperCase
    public void uppercaseFirstNames() {
        System.out.println("\n📝 CONVERTING FIRST NAMES TO UPPERCASE 📝");
        System.out.println("Using String::toUpperCase method reference");
        System.out.println("─".repeat(60));
        
        List<String> uppercaseFirstNames = employees.stream()
                .map(Employee::getFirstName)  // Get first name
                .map(String::toUpperCase)     // Method reference instead of name -> name.toUpperCase()
                .collect(Collectors.toList());
        
        System.out.println("Original → Uppercase First Names:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%-10s → %s%n", 
                    employees.get(i).getFirstName(), 
                    uppercaseFirstNames.get(i));
        }
        System.out.println("─".repeat(60));
    }
    
    // 2. Convert all last names to uppercase using String::toUpperCase
    public void uppercaseLastNames() {
        System.out.println("\n📝 CONVERTING LAST NAMES TO UPPERCASE 📝");
        System.out.println("Using String::toUpperCase method reference");
        System.out.println("─".repeat(60));
        
        List<String> uppercaseLastNames = employees.stream()
                .map(Employee::getLastName)   // Get last name
                .map(String::toUpperCase)     // Method reference instead of name -> name.toUpperCase()
                .collect(Collectors.toList());
        
        System.out.println("Original → Uppercase Last Names:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%-10s → %s%n", 
                    employees.get(i).getLastName(), 
                    uppercaseLastNames.get(i));
        }
        System.out.println("─".repeat(60));
    }
    
    // 3. Convert all full names to uppercase using String::toUpperCase
    public void uppercaseFullNames() {
        System.out.println("\n📝 CONVERTING FULL NAMES TO UPPERCASE 📝");
        System.out.println("Using String::toUpperCase method reference");
        System.out.println("─".repeat(70));
        
        List<String> uppercaseFullNames = employees.stream()
                .map(Employee::getFullName)   // Get full name
                .map(String::toUpperCase)     // Method reference instead of name -> name.toUpperCase()
                .collect(Collectors.toList());
        
        System.out.println("Original → Uppercase Full Names:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%-20s → %s%n", 
                    employees.get(i).getFullName(), 
                    uppercaseFullNames.get(i));
        }
        System.out.println("─".repeat(70));
    }
    
    // 4. Generate HR letter with uppercase names
    public void generateHRLetter() {
        System.out.println("\n💼 GENERATING HR LETTER WITH UPPERCASE NAMES 💼");
        System.out.println("Using String::toUpperCase method reference for formal letters");
        System.out.println("═".repeat(80));
        
        System.out.println("COMPANY ANNOUNCEMENT LETTER");
        System.out.println("═".repeat(80));
        System.out.println("TO: ALL EMPLOYEES");
        System.out.println("FROM: HUMAN RESOURCES DEPARTMENT");
        System.out.println("DATE: " + java.time.LocalDate.now());
        System.out.println("RE: ANNUAL PERFORMANCE REVIEW NOTIFICATION");
        System.out.println();
        System.out.println("Dear Team,");
        System.out.println();
        System.out.println("This letter serves as formal notification that the annual performance");
        System.out.println("review process will begin next month. The following employees are");
        System.out.println("scheduled for review:");
        System.out.println();
        
        // Generate uppercase employee list using method reference
        employees.stream()
                .map(Employee::getFullName)
                .map(String::toUpperCase)  // Method reference for uppercase conversion
                .forEach(name -> System.out.println("• " + name));
        
        System.out.println();
        System.out.println("Please ensure all documentation is prepared accordingly.");
        System.out.println();
        System.out.println("Best regards,");
        System.out.println("HR DEPARTMENT");
        System.out.println("═".repeat(80));
    }
    
    // 5. Department-wise uppercase name listing
    public void departmentWiseUppercaseNames() {
        System.out.println("\n🏢 DEPARTMENT-WISE UPPERCASE NAME LISTING 🏢");
        System.out.println("Using String::toUpperCase method reference");
        System.out.println("─".repeat(80));
        
        Map<String, List<String>> departmentNames = employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment().toUpperCase(),  // Group by uppercase department
                        Collectors.mapping(
                                Employee::getFullName,              // Get full name
                                Collectors.mapping(
                                        String::toUpperCase,         // Method reference to uppercase
                                        Collectors.toList()
                                )
                        )
                ));
        
        departmentNames.forEach((department, names) -> {
            System.out.println("\n" + department + " DEPARTMENT:");
            names.forEach(name -> System.out.println("  • " + name));
        });
        System.out.println("─".repeat(80));
    }
    
    // 6. Generate employee directory with uppercase formatting
    public void generateEmployeeDirectory() {
        System.out.println("\n📖 EMPLOYEE DIRECTORY (UPPERCASE FORMAT) 📖");
        System.out.println("Using String::toUpperCase method reference");
        System.out.println("═".repeat(100));
        
        System.out.printf("%-12s | %-25s | %-15s | %-20s | %-12s%n", 
                "EMP ID", "FULL NAME", "DEPARTMENT", "POSITION", "SALARY");
        System.out.println("─".repeat(100));
        
        employees.stream()
                .forEach(emp -> {
                    String uppercaseName = emp.getFullName().toUpperCase();
                    String uppercaseDept = emp.getDepartment().toUpperCase();
                    String uppercasePos = emp.getPosition().toUpperCase();
                    
                    System.out.printf("%-12s | %-25s | %-15s | %-20s | $%-11.2f%n",
                            emp.getEmployeeId(),
                            uppercaseName,
                            uppercaseDept,
                            uppercasePos,
                            emp.getSalary());
                });
        System.out.println("─".repeat(100));
    }
    
    // 7. Generate payroll report with uppercase names
    public void generatePayrollReport() {
        System.out.println("\n💰 PAYROLL REPORT (UPPERCASE NAMES) 💰");
        System.out.println("Using String::toUpperCase method reference");
        System.out.println("═".repeat(80));
        
        System.out.println("MONTHLY PAYROLL SUMMARY");
        System.out.println("REPORT DATE: " + java.time.LocalDate.now());
        System.out.println("─".repeat(80));
        
        double totalPayroll = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        
        System.out.printf("TOTAL EMPLOYEES: %d%n", employees.size());
        System.out.printf("TOTAL MONTHLY PAYROLL: $%.2f%n%n", totalPayroll);
        
        System.out.println("EMPLOYEE SALARY BREAKDOWN:");
        System.out.println("─".repeat(50));
        
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(emp -> {
                    String uppercaseName = emp.getFullName().toUpperCase();
                    System.out.printf("%-25s: $%,10.2f%n", uppercaseName, emp.getSalary());
                });
        
        System.out.println("─".repeat(50));
        System.out.printf("TOTAL: $%,15.2f%n", totalPayroll);
        System.out.println("═".repeat(80));
    }
    
    // 8. Generate promotion announcement with uppercase names
    public void generatePromotionAnnouncement() {
        System.out.println("\n🎉 PROMOTION ANNOUNCEMENT 🎉");
        System.out.println("Using String::toUpperCase method reference");
        System.out.println("═".repeat(80));
        
        // Simulate promotion for high earners
        List<Employee> promotedEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 70000)
                .collect(Collectors.toList());
        
        System.out.println("OFFICIAL PROMOTION ANNOUNCEMENT");
        System.out.println("═".repeat(80));
        System.out.println("TO: ALL STAFF");
        System.out.println("FROM: EXECUTIVE MANAGEMENT");
        System.out.println("DATE: " + java.time.LocalDate.now());
        System.out.println();
        System.out.println("We are pleased to announce the following promotions:");
        System.out.println();
        
        promotedEmployees.stream()
                .map(Employee::getFullName)
                .map(String::toUpperCase)  // Method reference for uppercase
                .forEach(name -> System.out.println("🌟 " + name + " - PROMOTED TO SENIOR LEVEL"));
        
        System.out.println();
        System.out.println("Please join us in congratulating these outstanding team members.");
        System.out.println();
        System.out.println("MANAGEMENT TEAM");
        System.out.println("═".repeat(80));
    }
    
    // 9. Employee name comparison (original vs uppercase)
    public void compareOriginalAndUppercaseNames() {
        System.out.println("\n🔄 ORIGINAL VS UPPERCASE NAME COMPARISON 🔄");
        System.out.println("Demonstrating String::toUpperCase method reference transformation");
        System.out.println("═".repeat(90));
        
        System.out.printf("%-15s | %-25s | %-25s%n", "EMPLOYEE ID", "ORIGINAL NAME", "UPPERCASE NAME");
        System.out.println("─".repeat(90));
        
        employees.forEach(emp -> {
            String original = emp.getFullName();
            String uppercase = original.toUpperCase();  // Could use method reference in stream
            
            System.out.printf("%-15s | %-25s | %-25s%n", 
                    emp.getEmployeeId(), original, uppercase);
        });
        
        System.out.println("─".repeat(90));
        
        // Using stream with method reference
        System.out.println("\nUsing Stream with Method Reference:");
        List<String> uppercaseNames = employees.stream()
                .map(Employee::getFullName)
                .map(String::toUpperCase)  // Method reference
                .collect(Collectors.toList());
        
        uppercaseNames.forEach(name -> System.out.println("• " + name));
    }
    
    // 10. Generate various HR documents with different name formats
    public void generateVariousHRDocuments() {
        System.out.println("\n📄 VARIOUS HR DOCUMENTS WITH DIFFERENT NAME FORMATS 📄");
        System.out.println("Demonstrating multiple uses of String::toUpperCase method reference");
        System.out.println("═".repeat(90));
        
        // 1. Emergency Contact List (Uppercase)
        System.out.println("\n1. EMERGENCY CONTACT LIST:");
        System.out.println("─".repeat(40));
        employees.stream()
                .map(Employee::getFullName)
                .map(String::toUpperCase)  // Method reference
                .sorted()
                .forEach(name -> System.out.println("🚨 " + name));
        
        // 2. Training Attendance Sheet (Uppercase)
        System.out.println("\n2. TRAINING ATTENDANCE SHEET:");
        System.out.println("─".repeat(40));
        System.out.println("DATE: " + java.time.LocalDate.now());
        System.out.println("TOPIC: WORKPLACE SAFETY TRAINING");
        System.out.println();
        employees.stream()
                .map(Employee::getFullName)
                .map(String::toUpperCase)  // Method reference
                .forEach(name -> System.out.println("□ " + name + " ________________"));
        
        // 3. Department Heads (Uppercase)
        System.out.println("\n3. DEPARTMENT LEADERSHIP:");
        System.out.println("─".repeat(40));
        employees.stream()
                .filter(emp -> emp.getPosition().toLowerCase().contains("manager") || 
                              emp.getPosition().toLowerCase().contains("ceo") ||
                              emp.getPosition().toLowerCase().contains("cto"))
                .map(Employee::getFullName)
                .map(String::toUpperCase)  // Method reference
                .forEach(name -> System.out.println("👔 " + name + " - LEADERSHIP"));
    }
    
    // 11. Statistical analysis with name formatting
    public void nameStatisticsAnalysis() {
        System.out.println("\n📊 NAME STATISTICS ANALYSIS 📊");
        System.out.println("Using String::toUpperCase for consistent analysis");
        System.out.println("─".repeat(60));
        
        // Count unique first names (case-insensitive)
        long uniqueFirstNames = employees.stream()
                .map(Employee::getFirstName)
                .map(String::toUpperCase)  // Method reference for case-insensitive comparison
                .distinct()
                .count();
        
        // Count unique last names (case-insensitive)
        long uniqueLastNames = employees.stream()
                .map(Employee::getLastName)
                .map(String::toUpperCase)  // Method reference
                .distinct()
                .count();
        
        // Find most common first letter of first names
        Map<Character, Long> firstLetterCount = employees.stream()
                .map(Employee::getFirstName)
                .map(String::toUpperCase)  // Method reference
                .map(name -> name.charAt(0))
                .collect(Collectors.groupingBy(letter -> letter, Collectors.counting()));
        
        System.out.println("Name Statistics:");
        System.out.println("  • Total Employees: " + employees.size());
        System.out.println("  • Unique First Names: " + uniqueFirstNames);
        System.out.println("  • Unique Last Names: " + uniqueLastNames);
        System.out.println("\nFirst Name Initial Distribution:");
        firstLetterCount.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .forEach(entry -> System.out.println("  • " + entry.getKey() + ": " + entry.getValue() + " employee(s)"));
    }
    
    // Main method to demonstrate all name uppercasing scenarios
    public static void main(String[] args) {
        HRNameUppercasingSystem system = new HRNameUppercasingSystem();
        
        System.out.println("👔 HR NAME UPPERCASING SYSTEM 👔");
        System.out.println("Using String::toUpperCase Method Reference for HR Letters");
        System.out.println("═".repeat(90));
        
        // Demonstrate different name uppercasing scenarios
        system.uppercaseFirstNames();
        system.uppercaseLastNames();
        system.uppercaseFullNames();
        system.generateHRLetter();
        system.departmentWiseUppercaseNames();
        system.generateEmployeeDirectory();
        system.generatePayrollReport();
        system.generatePromotionAnnouncement();
        system.compareOriginalAndUppercaseNames();
        system.generateVariousHRDocuments();
        system.nameStatisticsAnalysis();
        
        System.out.println("\n✅ HR Name Uppercasing System demonstration completed!");
        System.out.println("\n📚 Method Reference Used: String::toUpperCase");
        System.out.println("  • Instead of: name -> name.toUpperCase()");
        System.out.println("  • Benefits: More readable, concise, and performant");
        System.out.println("  • Usage: Converting names to uppercase for formal HR documents");
    }
}