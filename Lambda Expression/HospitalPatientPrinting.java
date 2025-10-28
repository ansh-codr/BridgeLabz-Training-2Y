import java.util.*;

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
    }
    
    public void printAllPatientIds() {
        System.out.println("Patient IDs:");
        patients.forEach(Patient::printPatientId);
    }
    
    public void printPatientIdsUsingSystemOut() {
        System.out.println("Patient IDs using System.out:");
        patients.stream()
                .map(Patient::getPatientId)
                .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        HospitalPatientPrinting system = new HospitalPatientPrinting();
        
        system.printAllPatientIds();
        System.out.println();
        system.printPatientIdsUsingSystemOut();
    }
}
    public static void main(String[] args) {
        HospitalPatientPrinting system = new HospitalPatientPrinting();
        
        system.printAllPatientIds();
        System.out.println();
        system.printPatientIdsUsingSystemOut();
    }
}