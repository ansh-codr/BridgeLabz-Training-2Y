import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Invoice class representing a business invoice
 */
public class Invoice {
    private String invoiceId;
    private String transactionId;
    private String customerId;
    private String customerName;
    private double amount;
    private LocalDate invoiceDate;
    private LocalDateTime createdAt;
    private String status;
    private String description;
    
    // Constructor for creating invoice from transaction ID (for constructor reference)
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
        this.invoiceId = "INV-" + transactionId;
        this.invoiceDate = LocalDate.now();
        this.createdAt = LocalDateTime.now();
        this.status = "PENDING";
        this.description = "Invoice generated from transaction " + transactionId;
        
        // Simulate data based on transaction ID
        initializeFromTransactionId(transactionId);
    }
    
    // Full constructor
    public Invoice(String invoiceId, String transactionId, String customerId, String customerName, 
                  double amount, String description) {
        this.invoiceId = invoiceId;
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.amount = amount;
        this.description = description;
        this.invoiceDate = LocalDate.now();
        this.createdAt = LocalDateTime.now();
        this.status = "PENDING";
    }
    
    // Initialize invoice data based on transaction ID (simulation)
    private void initializeFromTransactionId(String transactionId) {
        // Simulate customer data based on transaction ID
        int txnNum = Integer.parseInt(transactionId.replaceAll("\\D", ""));
        
        this.customerId = "CUST-" + String.format("%03d", (txnNum % 100) + 1);
        this.amount = 100.0 + (txnNum % 900); // Random amount between 100-999
        
        // Simulate customer names
        String[] firstNames = {"John", "Jane", "Alice", "Bob", "Charlie", "Diana", "Eve", "Frank"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis"};
        
        this.customerName = firstNames[txnNum % firstNames.length] + " " + 
                           lastNames[(txnNum / 10) % lastNames.length];
        
        this.description = "Payment for services - Transaction " + transactionId;
    }
    
    // Getters
    public String getInvoiceId() { return invoiceId; }
    public String getTransactionId() { return transactionId; }
    public String getCustomerId() { return customerId; }
    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }
    public LocalDate getInvoiceDate() { return invoiceDate; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getStatus() { return status; }
    public String getDescription() { return description; }
    
    // Setters
    public void setStatus(String status) { this.status = status; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDescription(String description) { this.description = description; }
    
    // Business methods
    public void markAsPaid() {
        this.status = "PAID";
    }
    
    public void markAsOverdue() {
        this.status = "OVERDUE";
    }
    
    public boolean isPaid() {
        return "PAID".equals(status);
    }
    
    public boolean isOverdue() {
        return "OVERDUE".equals(status);
    }
    
    public double calculateTax(double taxRate) {
        return amount * taxRate / 100;
    }
    
    public double getTotalWithTax(double taxRate) {
        return amount + calculateTax(taxRate);
    }
    
    @Override
    public String toString() {
        return String.format("Invoice{ID='%s', TxnID='%s', Customer='%s (%s)', Amount=$%.2f, Date=%s, Status=%s}", 
                invoiceId, transactionId, customerName, customerId, amount, invoiceDate, status);
    }
    
    public String getDetailedInfo() {
        return String.format(
                "═══════════════════════════════════════════════════════════════%n" +
                "                          INVOICE                              %n" +
                "═══════════════════════════════════════════════════════════════%n" +
                "Invoice ID:      %s%n" +
                "Transaction ID:  %s%n" +
                "Customer ID:     %s%n" +
                "Customer Name:   %s%n" +
                "Amount:          $%.2f%n" +
                "Invoice Date:    %s%n" +
                "Created At:      %s%n" +
                "Status:          %s%n" +
                "Description:     %s%n" +
                "═══════════════════════════════════════════════════════════════%n",
                invoiceId, transactionId, customerId, customerName, amount, 
                invoiceDate, createdAt.toString().substring(0, 19), status, description);
    }
}