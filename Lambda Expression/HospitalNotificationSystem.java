import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hospital Notification Filtering System using Lambda Expressions with Predicate
 * Demonstrates filtering alerts based on user preferences
 */
public class HospitalNotificationSystem {
    private List<Alert> allAlerts;
    private Map<String, Predicate<Alert>> filterPreferences;
    
    public HospitalNotificationSystem() {
        this.allAlerts = new ArrayList<>();
        this.filterPreferences = new HashMap<>();
        initializeAlerts();
        initializeDefaultFilters();
    }
    
    private void initializeAlerts() {
        // Sample alerts for demonstration
        allAlerts.add(new Alert("A001", "P001", "John Smith", Alert.AlertType.EMERGENCY, 
                Alert.Priority.CRITICAL, "Patient in cardiac arrest - Room 301", "Emergency"));
        
        allAlerts.add(new Alert("A002", "P002", "Jane Doe", Alert.AlertType.MEDICATION, 
                Alert.Priority.HIGH, "Blood pressure medication overdue", "Cardiology"));
        
        allAlerts.add(new Alert("A003", "P003", "Bob Johnson", Alert.AlertType.VITAL_SIGNS, 
                Alert.Priority.MEDIUM, "Heart rate elevated - 120 bpm", "ICU"));
        
        allAlerts.add(new Alert("A004", "P004", "Alice Wilson", Alert.AlertType.APPOINTMENT, 
                Alert.Priority.LOW, "Surgery scheduled for tomorrow 8:00 AM", "Surgery"));
        
        allAlerts.add(new Alert("A005", "P005", "Charlie Brown", Alert.AlertType.LAB_RESULTS, 
                Alert.Priority.HIGH, "Abnormal blood test results available", "Laboratory"));
        
        allAlerts.add(new Alert("A006", "P006", "Diana Prince", Alert.AlertType.DISCHARGE, 
                Alert.Priority.MEDIUM, "Patient ready for discharge - complete paperwork", "General"));
        
        allAlerts.add(new Alert("A007", "P007", "Bruce Wayne", Alert.AlertType.SURGERY, 
                Alert.Priority.CRITICAL, "Emergency surgery required immediately", "Surgery"));
        
        allAlerts.add(new Alert("A008", "P008", "Clark Kent", Alert.AlertType.ADMISSION, 
                Alert.Priority.MEDIUM, "New patient admission - Room 205", "General"));
        
        allAlerts.add(new Alert("A009", "P009", "Peter Parker", Alert.AlertType.VITAL_SIGNS, 
                Alert.Priority.HIGH, "Blood oxygen level critical - 85%", "ICU"));
        
        allAlerts.add(new Alert("A010", "P010", "Tony Stark", Alert.AlertType.MEDICATION, 
                Alert.Priority.LOW, "Daily medication reminder", "Cardiology"));
    }
    
    private void initializeDefaultFilters() {
        // Critical alerts only
        filterPreferences.put("critical_only", 
                alert -> alert.getPriority() == Alert.Priority.CRITICAL);
        
        // High priority and above
        filterPreferences.put("urgent_alerts", 
                alert -> alert.getPriority() == Alert.Priority.CRITICAL || 
                        alert.getPriority() == Alert.Priority.HIGH);
        
        // Emergency alerts only
        filterPreferences.put("emergency_only", 
                alert -> alert.getAlertType() == Alert.AlertType.EMERGENCY);
        
        // Medical alerts (Emergency, Medication, Vital Signs)
        filterPreferences.put("medical_alerts", 
                alert -> alert.getAlertType() == Alert.AlertType.EMERGENCY ||
                        alert.getAlertType() == Alert.AlertType.MEDICATION ||
                        alert.getAlertType() == Alert.AlertType.VITAL_SIGNS);
        
        // Administrative alerts (Appointment, Discharge, Admission)
        filterPreferences.put("admin_alerts", 
                alert -> alert.getAlertType() == Alert.AlertType.APPOINTMENT ||
                        alert.getAlertType() == Alert.AlertType.DISCHARGE ||
                        alert.getAlertType() == Alert.AlertType.ADMISSION);
        
        // Recent alerts (within last hour)
        filterPreferences.put("recent_alerts", Alert::isRecent);
        
        // Unacknowledged alerts
        filterPreferences.put("unacknowledged", alert -> !alert.isAcknowledged());
        
        // ICU department alerts
        filterPreferences.put("icu_alerts", 
                alert -> alert.getDepartment().equalsIgnoreCase("ICU"));
        
        // Surgery related alerts
        filterPreferences.put("surgery_alerts", 
                alert -> alert.getDepartment().equalsIgnoreCase("Surgery") ||
                        alert.getAlertType() == Alert.AlertType.SURGERY);
    }
    
    // Filter alerts by single predicate
    public List<Alert> filterAlerts(Predicate<Alert> filter) {
        return allAlerts.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }
    
    // Filter alerts by predefined preference
    public List<Alert> filterByPreference(String preferenceName) {
        System.out.println("\n🔍 Filtering by preference: " + preferenceName.toUpperCase());
        Predicate<Alert> filter = filterPreferences.get(preferenceName);
        if (filter != null) {
            List<Alert> filtered = filterAlerts(filter);
            displayAlerts(filtered);
            return filtered;
        } else {
            System.out.println("❌ Filter preference not found: " + preferenceName);
            return new ArrayList<>();
        }
    }
    
    // Complex filtering with multiple criteria
    public void complexFiltering() {
        System.out.println("\n🔍 COMPLEX FILTERING EXAMPLES 🔍");
        
        // High priority alerts in ICU that are unacknowledged
        System.out.println("\n1. High Priority + ICU + Unacknowledged:");
        List<Alert> complex1 = filterAlerts(
                alert -> alert.isUrgent() && 
                        alert.getDepartment().equalsIgnoreCase("ICU") && 
                        !alert.isAcknowledged()
        );
        displayAlerts(complex1);
        
        // Emergency or Surgery alerts with Critical priority
        System.out.println("\n2. (Emergency OR Surgery) + Critical Priority:");
        List<Alert> complex2 = filterAlerts(
                alert -> (alert.getAlertType() == Alert.AlertType.EMERGENCY || 
                         alert.getAlertType() == Alert.AlertType.SURGERY) &&
                        alert.getPriority() == Alert.Priority.CRITICAL
        );
        displayAlerts(complex2);
        
        // Medication alerts that are NOT low priority
        System.out.println("\n3. Medication Alerts (NOT Low Priority):");
        List<Alert> complex3 = filterAlerts(
                alert -> alert.getAlertType() == Alert.AlertType.MEDICATION &&
                        alert.getPriority() != Alert.Priority.LOW
        );
        displayAlerts(complex3);
        
        // Alerts for specific patient name pattern
        System.out.println("\n4. Patients with names containing 'John' or 'Jane':");
        List<Alert> complex4 = filterAlerts(
                alert -> alert.getPatientName().toLowerCase().contains("john") ||
                        alert.getPatientName().toLowerCase().contains("jane")
        );
        displayAlerts(complex4);
    }
    
    // Department-specific filtering
    public void filterByDepartment(String department) {
        System.out.println("\n🏥 Filtering by Department: " + department.toUpperCase());
        List<Alert> filtered = filterAlerts(
                alert -> alert.getDepartment().equalsIgnoreCase(department)
        );
        displayAlerts(filtered);
    }
    
    // Priority-based filtering
    public void filterByPriority(Alert.Priority priority) {
        System.out.println("\n⚡ Filtering by Priority: " + priority);
        List<Alert> filtered = filterAlerts(
                alert -> alert.getPriority() == priority
        );
        displayAlerts(filtered);
    }
    
    // Alert type filtering
    public void filterByAlertType(Alert.AlertType alertType) {
        System.out.println("\n📋 Filtering by Alert Type: " + alertType);
        List<Alert> filtered = filterAlerts(
                alert -> alert.getAlertType() == alertType
        );
        displayAlerts(filtered);
    }
    
    // Combine multiple predicates with AND
    public void combineFiltersAND(String preference1, String preference2) {
        System.out.println("\n🔗 Combining Filters with AND: " + preference1 + " + " + preference2);
        Predicate<Alert> filter1 = filterPreferences.get(preference1);
        Predicate<Alert> filter2 = filterPreferences.get(preference2);
        
        if (filter1 != null && filter2 != null) {
            List<Alert> filtered = filterAlerts(filter1.and(filter2));
            displayAlerts(filtered);
        } else {
            System.out.println("❌ One or both filter preferences not found");
        }
    }
    
    // Combine multiple predicates with OR
    public void combineFiltersOR(String preference1, String preference2) {
        System.out.println("\n🔗 Combining Filters with OR: " + preference1 + " OR " + preference2);
        Predicate<Alert> filter1 = filterPreferences.get(preference1);
        Predicate<Alert> filter2 = filterPreferences.get(preference2);
        
        if (filter1 != null && filter2 != null) {
            List<Alert> filtered = filterAlerts(filter1.or(filter2));
            displayAlerts(filtered);
        } else {
            System.out.println("❌ One or both filter preferences not found");
        }
    }
    
    // Negate a filter
    public void negateFilter(String preferenceName) {
        System.out.println("\n❌ Negating Filter: NOT " + preferenceName);
        Predicate<Alert> filter = filterPreferences.get(preferenceName);
        
        if (filter != null) {
            List<Alert> filtered = filterAlerts(filter.negate());
            displayAlerts(filtered);
        } else {
            System.out.println("❌ Filter preference not found: " + preferenceName);
        }
    }
    
    // Custom user preference filter
    public void addCustomFilter(String filterName, Predicate<Alert> customFilter) {
        filterPreferences.put(filterName, customFilter);
        System.out.println("✅ Custom filter '" + filterName + "' added successfully!");
    }
    
    // User preference simulation
    public void simulateUserPreferences(String userRole) {
        System.out.println("\n👤 Simulating User Preferences for: " + userRole.toUpperCase());
        
        switch (userRole.toLowerCase()) {
            case "doctor":
                System.out.println("Doctor preferences: Medical alerts + High priority");
                combineFiltersAND("medical_alerts", "urgent_alerts");
                break;
                
            case "nurse":
                System.out.println("Nurse preferences: All alerts except Low priority");
                negateFilter("critical_only"); // This will show non-critical
                // Better approach for nurse - show medium, high, critical
                List<Alert> nurseAlerts = filterAlerts(
                        alert -> alert.getPriority() != Alert.Priority.LOW
                );
                displayAlerts(nurseAlerts);
                break;
                
            case "admin":
                System.out.println("Admin preferences: Administrative alerts only");
                filterByPreference("admin_alerts");
                break;
                
            case "emergency":
                System.out.println("Emergency staff preferences: Critical + Emergency alerts");
                List<Alert> emergencyAlerts = filterAlerts(
                        alert -> alert.getPriority() == Alert.Priority.CRITICAL ||
                                alert.getAlertType() == Alert.AlertType.EMERGENCY
                );
                displayAlerts(emergencyAlerts);
                break;
                
            case "surgeon":
                System.out.println("Surgeon preferences: Surgery-related alerts");
                filterByPreference("surgery_alerts");
                break;
                
            default:
                System.out.println("Unknown role. Showing all unacknowledged alerts.");
                filterByPreference("unacknowledged");
        }
    }
    
    // Advanced filtering with time-based predicates
    public void timeBasedFiltering() {
        System.out.println("\n⏰ TIME-BASED FILTERING EXAMPLES ⏰");
        
        // Alerts from last hour
        System.out.println("\n1. Recent alerts (last hour):");
        filterByPreference("recent_alerts");
        
        // Simulate older alerts
        System.out.println("\n2. All alerts (including older ones):");
        List<Alert> allAlertsView = filterAlerts(alert -> true); // Show all
        displayAlerts(allAlertsView);
    }
    
    // Statistical analysis using predicates
    public void generateStatistics() {
        System.out.println("\n📊 ALERT STATISTICS 📊");
        
        long totalAlerts = allAlerts.size();
        long criticalCount = allAlerts.stream().filter(alert -> alert.getPriority() == Alert.Priority.CRITICAL).count();
        long urgentCount = allAlerts.stream().filter(Alert::isUrgent).count();
        long medicalCount = allAlerts.stream().filter(filterPreferences.get("medical_alerts")).count();
        long unacknowledgedCount = allAlerts.stream().filter(alert -> !alert.isAcknowledged()).count();
        
        System.out.println("Total Alerts: " + totalAlerts);
        System.out.println("Critical Alerts: " + criticalCount + " (" + (criticalCount * 100 / totalAlerts) + "%)");
        System.out.println("Urgent Alerts: " + urgentCount + " (" + (urgentCount * 100 / totalAlerts) + "%)");
        System.out.println("Medical Alerts: " + medicalCount + " (" + (medicalCount * 100 / totalAlerts) + "%)");
        System.out.println("Unacknowledged: " + unacknowledgedCount + " (" + (unacknowledgedCount * 100 / totalAlerts) + "%)");
        
        // Department breakdown
        System.out.println("\nDepartment Breakdown:");
        Map<String, Long> departmentCount = allAlerts.stream()
                .collect(Collectors.groupingBy(Alert::getDepartment, Collectors.counting()));
        departmentCount.forEach((dept, count) -> 
                System.out.println("  " + dept + ": " + count + " alerts"));
    }
    
    // Helper method to display alerts
    private void displayAlerts(List<Alert> alerts) {
        if (alerts.isEmpty()) {
            System.out.println("  📭 No alerts match the filter criteria.");
        } else {
            System.out.println("  📨 Found " + alerts.size() + " alert(s):");
            System.out.println("  " + "─".repeat(100));
            alerts.forEach(alert -> System.out.println("  " + alert));
            System.out.println("  " + "─".repeat(100));
        }
    }
    
    // Display all available filters
    public void showAvailableFilters() {
        System.out.println("\n📋 AVAILABLE FILTER PREFERENCES 📋");
        filterPreferences.keySet().forEach(filter -> 
                System.out.println("  • " + filter));
    }
    
    // Main method to demonstrate the notification filtering system
    public static void main(String[] args) {
        HospitalNotificationSystem system = new HospitalNotificationSystem();
        
        System.out.println("🏥 HOSPITAL NOTIFICATION FILTERING SYSTEM 🏥");
        System.out.println("Using Lambda Expressions with Predicate for Alert Filtering");
        System.out.println("═".repeat(100));
        
        // Show all available filters
        system.showAvailableFilters();
        
        // Demonstrate predefined filters
        system.filterByPreference("critical_only");
        system.filterByPreference("urgent_alerts");
        system.filterByPreference("emergency_only");
        system.filterByPreference("medical_alerts");
        system.filterByPreference("admin_alerts");
        system.filterByPreference("recent_alerts");
        system.filterByPreference("unacknowledged");
        system.filterByPreference("icu_alerts");
        system.filterByPreference("surgery_alerts");
        
        // Demonstrate complex filtering
        system.complexFiltering();
        
        // Demonstrate filter combinations
        system.combineFiltersAND("urgent_alerts", "unacknowledged");
        system.combineFiltersOR("emergency_only", "surgery_alerts");
        system.negateFilter("critical_only");
        
        // Demonstrate department, priority, and type filtering
        system.filterByDepartment("ICU");
        system.filterByPriority(Alert.Priority.HIGH);
        system.filterByAlertType(Alert.AlertType.MEDICATION);
        
        // Add custom filter
        system.addCustomFilter("patient_specific", 
                alert -> alert.getPatientName().startsWith("J"));
        system.filterByPreference("patient_specific");
        
        // Simulate different user roles
        system.simulateUserPreferences("doctor");
        system.simulateUserPreferences("nurse");
        system.simulateUserPreferences("admin");
        system.simulateUserPreferences("emergency");
        system.simulateUserPreferences("surgeon");
        
        // Time-based filtering
        system.timeBasedFiltering();
        
        // Generate statistics
        system.generateStatistics();
        
        System.out.println("\n✅ Hospital Notification Filtering System demonstration completed!");
    }
}