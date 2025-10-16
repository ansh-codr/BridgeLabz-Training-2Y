/**
 * Patient class representing a hospital patient
 */
public class Patient {
    private String patientId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;
    private String phoneNumber;
    
    public Patient(String patientId, String firstName, String lastName, int age, String department, String phoneNumber) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }
    
    // Getters
    public String getPatientId() { return patientId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public String getPhoneNumber() { return phoneNumber; }
    
    // Method for printing patient ID (for method reference demonstration)
    public static void printPatientId(Patient patient) {
        System.out.println("Patient ID: " + patient.getPatientId());
    }
    
    // Method for detailed patient info printing
    public static void printPatientDetails(Patient patient) {
        System.out.println("ID: " + patient.getPatientId() + " | Name: " + patient.getFullName() + 
                          " | Age: " + patient.getAge() + " | Dept: " + patient.getDepartment());
    }
    
    // Instance method for printing
    public void printId() {
        System.out.println("ID: " + this.patientId);
    }
    
    @Override
    public String toString() {
        return String.format("Patient{ID='%s', Name='%s', Age=%d, Dept='%s', Phone='%s'}", 
                patientId, getFullName(), age, department, phoneNumber);
    }
}