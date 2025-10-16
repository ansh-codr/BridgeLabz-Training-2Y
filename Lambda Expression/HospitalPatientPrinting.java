import java.util.*;
import java.util.stream.Collectors;

/**
 * Hospital Patient ID Printing System using Method References
 * Demonstrates various types of method references instead of lambdas
 */
public class HospitalPatientPrinting {
    private List<Patient> patients;
    
    public HospitalPatientPrinting() {
        this.patients = new ArrayList<>();
        initializePatients();
    }
    
    private void initializePatients() {
        patients.add(new Patient("P001", "John", "Smith", 45, "Cardiology", "555-0101"));
        patients.add(new Patient("P002", "Jane", "Doe", 32, "Neurology", "555-0102"));
        patients.add(new Patient("P003", "Bob", "Johnson", 67, "Orthopedics", "555-0103"));
        patients.add(new Patient("P004", "Alice", "Wilson", 28, "Pediatrics", "555-0104"));
        patients.add(new Patient("P005", "Charlie", "Brown", 54, "Emergency", "555-0105"));
        patients.add(new Patient("P006", "Diana", "Prince", 39, "Dermatology", "555-0106"));
        patients.add(new Patient("P007", "Bruce", "Wayne", 42, "Surgery", "555-0107"));
        patients.add(new Patient("P008", "Clark", "Kent", 35, "Radiology", "555-0108"));
        patients.add(new Patient("P009", "Peter", "Parker", 26, "ICU", "555-0109"));
        patients.add(new Patient("P010", "Tony", "Stark", 48, "Cardiology", "555-0110"));
    }
    
    // 1. Static Method Reference - Print patient IDs
    public void printAllPatientIds() {
        System.out.println("\n🆔 PRINTING ALL PATIENT IDs (Static Method Reference) 🆔");
        System.out.println("Using Patient::printPatientId method reference");
        System.out.println("─".repeat(60));
        
        // Using method reference instead of lambda: patient -> Patient.printPatientId(patient)
        patients.forEach(Patient::printPatientId);
        System.out.println("─".repeat(60));
    }
    
    // 2. Static Method Reference - Print detailed patient info
    public void printAllPatientDetails() {
        System.out.println("\n📋 PRINTING PATIENT DETAILS (Static Method Reference) 📋");
        System.out.println("Using Patient::printPatientDetails method reference");
        System.out.println("─".repeat(80));
        
        // Using method reference instead of lambda: patient -> Patient.printPatientDetails(patient)
        patients.forEach(Patient::printPatientDetails);
        System.out.println("─".repeat(80));
    }
    
    // 3. Instance Method Reference (of particular object) - Print using System.out
    public void printPatientIdsUsingSystemOut() {
        System.out.println("\n🖨️ PRINTING PATIENT IDs (Instance Method Reference - System.out) 🖨️");
        System.out.println("Using System.out::println method reference");
        System.out.println("─".repeat(70));
        
        // Extract patient IDs and print using method reference
        // Instead of: patientId -> System.out.println(patientId)
        patients.stream()
                .map(Patient::getPatientId)  // Method reference to get patient ID
                .forEach(System.out::println);  // Method reference to print
        System.out.println("─".repeat(70));
    }
    
    // 4. Instance Method Reference (of arbitrary object) - Print using instance method
    public void printPatientIdsUsingInstanceMethod() {
        System.out.println("\n🔢 PRINTING PATIENT IDs (Instance Method Reference - Patient::printId) 🔢");
        System.out.println("Using Patient::printId method reference");
        System.out.println("─".repeat(70));
        
        // Using instance method reference instead of lambda: patient -> patient.printId()
        patients.forEach(Patient::printId);
        System.out.println("─".repeat(70));
    }
    
    // 5. Method Reference with Stream operations
    public void demonstrateStreamMethodReferences() {
        System.out.println("\n🌊 STREAM OPERATIONS WITH METHOD REFERENCES 🌊");
        
        // Get all patient IDs using method reference
        System.out.println("\n1. Collecting all Patient IDs:");
        List<String> patientIds = patients.stream()
                .map(Patient::getPatientId)  // Method reference instead of patient -> patient.getPatientId()
                .collect(Collectors.toList());
        patientIds.forEach(System.out::println);  // Method reference instead of id -> System.out.println(id)
        
        // Get all full names using method reference
        System.out.println("\n2. Collecting all Full Names:");
        List<String> fullNames = patients.stream()
                .map(Patient::getFullName)  // Method reference instead of patient -> patient.getFullName()
                .collect(Collectors.toList());
        fullNames.forEach(System.out::println);
        
        // Get all departments using method reference
        System.out.println("\n3. Collecting all Departments:");
        Set<String> departments = patients.stream()
                .map(Patient::getDepartment)  // Method reference
                .collect(Collectors.toSet());
        departments.forEach(System.out::println);
        
        // Get all ages using method reference
        System.out.println("\n4. Collecting all Ages:");
        List<Integer> ages = patients.stream()
                .map(Patient::getAge)  // Method reference instead of patient -> patient.getAge()
                .collect(Collectors.toList());
        ages.forEach(System.out::println);
    }
    
    // 6. Filtering and method references combined
    public void filterAndPrintWithMethodReferences() {
        System.out.println("\n🔍 FILTERING WITH METHOD REFERENCES 🔍");
        
        // Find patients in Cardiology department
        System.out.println("\n1. Cardiology Patients:");
        patients.stream()
                .filter(patient -> patient.getDepartment().equals("Cardiology"))
                .map(Patient::getPatientId)  // Method reference
                .forEach(System.out::println);  // Method reference
        
        // Find patients over 40 years old
        System.out.println("\n2. Patients over 40 years old:");
        patients.stream()
                .filter(patient -> patient.getAge() > 40)
                .forEach(Patient::printPatientDetails);  // Method reference
        
        // Find patients with specific name pattern
        System.out.println("\n3. Patients with 'J' names:");
        patients.stream()
                .filter(patient -> patient.getFirstName().startsWith("J"))
                .forEach(Patient::printPatientId);  // Method reference
    }
    
    // 7. Sorting with method references
    public void sortAndPrintWithMethodReferences() {
        System.out.println("\n📊 SORTING WITH METHOD REFERENCES 📊");
        
        // Sort by patient ID and print
        System.out.println("\n1. Sorted by Patient ID:");
        patients.stream()
                .sorted(Comparator.comparing(Patient::getPatientId))  // Method reference in comparator
                .map(Patient::getPatientId)  // Method reference
                .forEach(System.out::println);  // Method reference
        
        // Sort by age and print details
        System.out.println("\n2. Sorted by Age:");
        patients.stream()
                .sorted(Comparator.comparing(Patient::getAge))  // Method reference in comparator
                .forEach(Patient::printPatientDetails);  // Method reference
        
        // Sort by full name and print
        System.out.println("\n3. Sorted by Full Name:");
        patients.stream()
                .sorted(Comparator.comparing(Patient::getFullName))  // Method reference in comparator
                .map(Patient::getFullName)  // Method reference
                .forEach(System.out::println);  // Method reference
    }
    
    // 8. Grouping with method references
    public void groupAndPrintWithMethodReferences() {
        System.out.println("\n👥 GROUPING WITH METHOD REFERENCES 👥");
        
        // Group patients by department
        System.out.println("\nPatients grouped by Department:");
        Map<String, List<Patient>> patientsByDept = patients.stream()
                .collect(Collectors.groupingBy(Patient::getDepartment));  // Method reference
        
        patientsByDept.forEach((dept, patientList) -> {
            System.out.println("\n" + dept + " Department:");
            patientList.forEach(Patient::printPatientId);  // Method reference
        });
        
        // Group by age ranges
        System.out.println("\nPatients grouped by Age Range:");
        Map<String, List<Patient>> patientsByAgeRange = patients.stream()
                .collect(Collectors.groupingBy(patient -> {
                    int age = patient.getAge();
                    if (age < 30) return "Young (< 30)";
                    else if (age < 50) return "Middle-aged (30-49)";
                    else return "Senior (50+)";
                }));
        
        patientsByAgeRange.forEach((ageRange, patientList) -> {
            System.out.println("\n" + ageRange + ":");
            patientList.forEach(Patient::printPatientDetails);  // Method reference
        });
    }
    
    // 9. Custom method reference examples
    public void customMethodReferenceExamples() {
        System.out.println("\n🎯 CUSTOM METHOD REFERENCE EXAMPLES 🎯");
        
        // Create a custom printer class
        PatientPrinter printer = new PatientPrinter();
        
        System.out.println("\n1. Using custom instance method reference:");
        patients.forEach(printer::printFormattedPatient);  // Instance method reference
        
        System.out.println("\n2. Using custom static method reference:");
        patients.forEach(PatientPrinter::printPatientSummary);  // Static method reference
    }
    
    // 10. Administrative functions with method references
    public void administrativeFunctions() {
        System.out.println("\n🏥 ADMINISTRATIVE FUNCTIONS 🏥");
        
        // Generate patient ID list for verification
        System.out.println("\n📝 Patient ID Verification List:");
        System.out.println("Total Patients: " + patients.size());
        System.out.println("Patient IDs:");
        patients.stream()
                .map(Patient::getPatientId)
                .sorted()  // Natural order sorting
                .forEach(id -> System.out.println("  ✓ " + id));
        
        // Generate department summary
        System.out.println("\n🏢 Department Summary:");
        Map<String, Long> departmentCount = patients.stream()
                .collect(Collectors.groupingBy(Patient::getDepartment, Collectors.counting()));
        
        departmentCount.forEach((dept, count) -> 
                System.out.println("  " + dept + ": " + count + " patient(s)"));
        
        // Generate contact list
        System.out.println("\n📞 Emergency Contact List:");
        patients.stream()
                .sorted(Comparator.comparing(Patient::getLastName))
                .forEach(patient -> System.out.println("  " + patient.getFullName() + 
                        " (" + patient.getPatientId() + ") - " + patient.getPhoneNumber()));
    }
    
    // Helper class for custom method references
    static class PatientPrinter {
        // Instance method for method reference
        public void printFormattedPatient(Patient patient) {
            System.out.printf("🏥 %-8s | %-20s | %s%n", 
                    patient.getPatientId(), 
                    patient.getFullName(), 
                    patient.getDepartment());
        }
        
        // Static method for method reference
        public static void printPatientSummary(Patient patient) {
            System.out.printf("📋 %s: %s (%d years, %s)%n", 
                    patient.getPatientId(), 
                    patient.getFullName(), 
                    patient.getAge(), 
                    patient.getDepartment());
        }
    }
    
    // Main method to demonstrate all method reference examples
    public static void main(String[] args) {
        HospitalPatientPrinting system = new HospitalPatientPrinting();
        
        System.out.println("🏥 HOSPITAL PATIENT ID PRINTING SYSTEM 🏥");
        System.out.println("Using Method References Instead of Lambda Expressions");
        System.out.println("═".repeat(80));
        
        // Demonstrate different types of method references
        system.printAllPatientIds();
        system.printAllPatientDetails();
        system.printPatientIdsUsingSystemOut();
        system.printPatientIdsUsingInstanceMethod();
        system.demonstrateStreamMethodReferences();
        system.filterAndPrintWithMethodReferences();
        system.sortAndPrintWithMethodReferences();
        system.groupAndPrintWithMethodReferences();
        system.customMethodReferenceExamples();
        system.administrativeFunctions();
        
        System.out.println("\n✅ Method Reference demonstration completed!");
        System.out.println("\n📚 Types of Method References Demonstrated:");
        System.out.println("  1. Static Method Reference: ClassName::staticMethodName");
        System.out.println("  2. Instance Method Reference (particular object): object::instanceMethodName");
        System.out.println("  3. Instance Method Reference (arbitrary object): ClassName::instanceMethodName");
        System.out.println("  4. Constructor Reference: ClassName::new (see Invoice example)");
    }
}