import java.time.LocalDateTime;

/**
 * Alert class representing a hospital patient alert
 */
public class Alert {
    private String alertId;
    private String patientId;
    private String patientName;
    private AlertType alertType;
    private Priority priority;
    private String message;
    private LocalDateTime timestamp;
    private String department;
    private boolean isAcknowledged;
    
    public enum AlertType {
        EMERGENCY, MEDICATION, VITAL_SIGNS, APPOINTMENT, DISCHARGE, ADMISSION, LAB_RESULTS, SURGERY
    }
    
    public enum Priority {
        CRITICAL, HIGH, MEDIUM, LOW
    }
    
    public Alert(String alertId, String patientId, String patientName, AlertType alertType, 
                Priority priority, String message, String department) {
        this.alertId = alertId;
        this.patientId = patientId;
        this.patientName = patientName;
        this.alertType = alertType;
        this.priority = priority;
        this.message = message;
        this.department = department;
        this.timestamp = LocalDateTime.now();
        this.isAcknowledged = false;
    }
    
    // Getters
    public String getAlertId() { return alertId; }
    public String getPatientId() { return patientId; }
    public String getPatientName() { return patientName; }
    public AlertType getAlertType() { return alertType; }
    public Priority getPriority() { return priority; }
    public String getMessage() { return message; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getDepartment() { return department; }
    public boolean isAcknowledged() { return isAcknowledged; }
    
    // Setters
    public void setAcknowledged(boolean acknowledged) { this.isAcknowledged = acknowledged; }
    
    // Check if alert is recent (within last hour)
    public boolean isRecent() {
        return timestamp.isAfter(LocalDateTime.now().minusHours(1));
    }
    
    // Check if alert is urgent (CRITICAL or HIGH priority)
    public boolean isUrgent() {
        return priority == Priority.CRITICAL || priority == Priority.HIGH;
    }
    
    @Override
    public String toString() {
        String status = isAcknowledged ? "✓" : "⚠";
        String priorityIcon = getPriorityIcon();
        return String.format("%s %s [%s] %s - %s (%s) | %s | Dept: %s | %s", 
                status, priorityIcon, alertId, patientName, patientId, 
                alertType, priority, department, 
                timestamp.toString().substring(0, 19));
    }
    
    private String getPriorityIcon() {
        switch (priority) {
            case CRITICAL: return "🔴";
            case HIGH: return "🟠";
            case MEDIUM: return "🟡";
            case LOW: return "🟢";
            default: return "⚪";
        }
    }
    
    public String getDetailedInfo() {
        return String.format("Alert ID: %s%nPatient: %s (%s)%nType: %s%nPriority: %s%nDepartment: %s%n" +
                           "Message: %s%nTime: %s%nAcknowledged: %s%n",
                alertId, patientName, patientId, alertType, priority, department,
                message, timestamp, isAcknowledged ? "Yes" : "No");
    }
}