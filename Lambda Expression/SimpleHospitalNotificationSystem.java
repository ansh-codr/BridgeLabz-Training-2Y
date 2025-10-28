import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HospitalNotificationSystem {
    private List<Alert> allAlerts;
    
    public HospitalNotificationSystem() {
        this.allAlerts = new ArrayList<>();
        initializeAlerts();
    }
    
    private void initializeAlerts() {
        allAlerts.add(new Alert("A001", "P001", "John Smith", Alert.AlertType.EMERGENCY, 
                Alert.Priority.CRITICAL, "Patient in cardiac arrest", "Emergency"));
        
        allAlerts.add(new Alert("A002", "P002", "Jane Doe", Alert.AlertType.MEDICATION, 
                Alert.Priority.HIGH, "Blood pressure medication overdue", "Cardiology"));
        
        allAlerts.add(new Alert("A003", "P003", "Bob Johnson", Alert.AlertType.VITAL_SIGNS, 
                Alert.Priority.MEDIUM, "Heart rate elevated", "ICU"));
        
        allAlerts.add(new Alert("A004", "P004", "Alice Wilson", Alert.AlertType.APPOINTMENT, 
                Alert.Priority.LOW, "Surgery scheduled for tomorrow", "Surgery"));
        
        allAlerts.add(new Alert("A005", "P005", "Charlie Brown", Alert.AlertType.LAB_RESULTS, 
                Alert.Priority.HIGH, "Abnormal blood test results", "Laboratory"));
    }
    
    public List<Alert> filterCriticalAlerts() {
        Predicate<Alert> criticalOnly = alert -> alert.getPriority() == Alert.Priority.CRITICAL;
        return allAlerts.stream().filter(criticalOnly).collect(Collectors.toList());
    }
    
    public List<Alert> filterEmergencyAlerts() {
        Predicate<Alert> emergencyOnly = alert -> alert.getAlertType() == Alert.AlertType.EMERGENCY;
        return allAlerts.stream().filter(emergencyOnly).collect(Collectors.toList());
    }
    
    public List<Alert> filterHighPriorityAlerts() {
        Predicate<Alert> highPriority = alert -> alert.getPriority() == Alert.Priority.HIGH || 
                                                 alert.getPriority() == Alert.Priority.CRITICAL;
        return allAlerts.stream().filter(highPriority).collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        HospitalNotificationSystem system = new HospitalNotificationSystem();
        
        System.out.println("All alerts:");
        system.allAlerts.forEach(System.out::println);
        
        System.out.println("\nCritical alerts:");
        system.filterCriticalAlerts().forEach(System.out::println);
        
        System.out.println("\nEmergency alerts:");
        system.filterEmergencyAlerts().forEach(System.out::println);
        
        System.out.println("\nHigh priority alerts:");
        system.filterHighPriorityAlerts().forEach(System.out::println);
    }
}