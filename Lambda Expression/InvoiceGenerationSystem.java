import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Invoice Generation System using Constructor References
 * Demonstrates generating invoice objects from transaction IDs using constructor references
 */
public class InvoiceGenerationSystem {
    private List<String> transactionIds;
    private List<Invoice> generatedInvoices;
    private Function<String, Invoice> invoiceFactory;
    
    public InvoiceGenerationSystem() {
        this.transactionIds = new ArrayList<>();
        this.generatedInvoices = new ArrayList<>();
        
        // Constructor reference - instead of transactionId -> new Invoice(transactionId)
        this.invoiceFactory = Invoice::new;
        
        initializeTransactionIds();
    }
    
    private void initializeTransactionIds() {
        // Generate sample transaction IDs
        transactionIds.add("TXN001");
        transactionIds.add("TXN002");
        transactionIds.add("TXN003");
        transactionIds.add("TXN004");
        transactionIds.add("TXN005");
        transactionIds.add("TXN006");
        transactionIds.add("TXN007");
        transactionIds.add("TXN008");
        transactionIds.add("TXN009");
        transactionIds.add("TXN010");
        transactionIds.add("TXN011");
        transactionIds.add("TXN012");
        transactionIds.add("TXN013");
        transactionIds.add("TXN014");
        transactionIds.add("TXN015");
    }
    
    // 1. Generate invoices using constructor reference
    public void generateInvoicesFromTransactionIds() {
        System.out.println("\n🧾 GENERATING INVOICES FROM TRANSACTION IDs 🧾");
        System.out.println("Using Invoice::new constructor reference");
        System.out.println("─".repeat(80));
        
        // Using constructor reference instead of lambda: transactionId -> new Invoice(transactionId)
        generatedInvoices = transactionIds.stream()
                .map(Invoice::new)  // Constructor reference
                .collect(Collectors.toList());
        
        System.out.println("Successfully generated " + generatedInvoices.size() + " invoices:");
        generatedInvoices.forEach(invoice -> 
                System.out.println("✓ " + invoice.getInvoiceId() + " from " + invoice.getTransactionId()));
        
        System.out.println("─".repeat(80));
    }
    
    // 2. Generate invoices using function with constructor reference
    public void generateInvoicesUsingFunction() {
        System.out.println("\n🔧 GENERATING INVOICES USING FUNCTION WITH CONSTRUCTOR REFERENCE 🔧");
        System.out.println("Using Function<String, Invoice> with Invoice::new");
        System.out.println("─".repeat(80));
        
        // Using the function field that contains constructor reference
        List<Invoice> functionalInvoices = transactionIds.stream()
                .map(invoiceFactory)  // Using the function with constructor reference
                .collect(Collectors.toList());
        
        System.out.println("Generated using Function interface:");
        functionalInvoices.forEach(invoice -> 
                System.out.println("📄 " + invoice));
        
        System.out.println("─".repeat(80));
    }
    
    // 3. Parallel invoice generation using constructor reference
    public void parallelInvoiceGeneration() {
        System.out.println("\n⚡ PARALLEL INVOICE GENERATION ⚡");
        System.out.println("Using parallel stream with Invoice::new constructor reference");
        System.out.println("─".repeat(80));
        
        long startTime = System.currentTimeMillis();
        
        List<Invoice> parallelInvoices = transactionIds.parallelStream()
                .map(Invoice::new)  // Constructor reference
                .collect(Collectors.toList());
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Parallel generation completed in " + (endTime - startTime) + "ms");
        System.out.println("Generated " + parallelInvoices.size() + " invoices in parallel:");
        
        parallelInvoices.stream()
                .sorted(Comparator.comparing(Invoice::getInvoiceId))
                .forEach(invoice -> System.out.println("⚡ " + invoice.getInvoiceId()));
        
        System.out.println("─".repeat(80));
    }
    
    // 4. Batch invoice generation with different constructor references
    public void batchInvoiceGeneration() {
        System.out.println("\n📦 BATCH INVOICE GENERATION 📦");
        System.out.println("Demonstrating constructor reference in batch processing");
        System.out.println("─".repeat(80));
        
        // Generate batches of transaction IDs
        List<List<String>> batches = IntStream.range(0, transactionIds.size())
                .boxed()
                .collect(Collectors.groupingBy(i -> i / 5))  // Batch size of 5
                .values()
                .stream()
                .map(indices -> indices.stream()
                        .map(transactionIds::get)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        
        System.out.println("Processing " + batches.size() + " batches:");
        
        for (int i = 0; i < batches.size(); i++) {
            List<String> batch = batches.get(i);
            System.out.println("\nBatch " + (i + 1) + ":");
            
            List<Invoice> batchInvoices = batch.stream()
                    .map(Invoice::new)  // Constructor reference
                    .collect(Collectors.toList());
            
            batchInvoices.forEach(invoice -> 
                    System.out.println("  📄 " + invoice.getInvoiceId() + " - $" + invoice.getAmount()));
        }
        
        System.out.println("─".repeat(80));
    }
    
    // 5. Conditional invoice generation using constructor reference
    public void conditionalInvoiceGeneration() {
        System.out.println("\n❓ CONDITIONAL INVOICE GENERATION ❓");
        System.out.println("Using constructor reference with filtering");
        System.out.println("─".repeat(80));
        
        // Generate invoices only for specific transaction ID patterns
        List<Invoice> conditionalInvoices = transactionIds.stream()
                .filter(txnId -> Integer.parseInt(txnId.replaceAll("\\D", "")) % 2 == 0)  // Even numbers only
                .map(Invoice::new)  // Constructor reference
                .collect(Collectors.toList());
        
        System.out.println("Generated invoices for even-numbered transactions:");
        conditionalInvoices.forEach(invoice -> 
                System.out.println("✓ " + invoice.getInvoiceId() + " from " + invoice.getTransactionId()));
        
        System.out.println("\nTotal conditional invoices: " + conditionalInvoices.size());
        System.out.println("─".repeat(80));
    }
    
    // 6. Invoice generation with post-processing using constructor reference
    public void invoiceGenerationWithPostProcessing() {
        System.out.println("\n🔄 INVOICE GENERATION WITH POST-PROCESSING 🔄");
        System.out.println("Using constructor reference followed by additional operations");
        System.out.println("─".repeat(80));
        
        List<Invoice> processedInvoices = transactionIds.stream()
                .map(Invoice::new)  // Constructor reference
                .peek(invoice -> {  // Post-processing
                    if (invoice.getAmount() > 500) {
                        invoice.setStatus("HIGH_VALUE");
                    }
                    if (invoice.getCustomerName().startsWith("J")) {
                        invoice.setDescription("VIP Customer - " + invoice.getDescription());
                    }
                })
                .collect(Collectors.toList());
        
        System.out.println("Post-processed invoices:");
        processedInvoices.forEach(invoice -> 
                System.out.println("🔄 " + invoice.getInvoiceId() + " - " + invoice.getStatus() + 
                                 " - $" + invoice.getAmount()));
        
        System.out.println("─".repeat(80));
    }
    
    // 7. Generate invoices and group by customer using constructor reference
    public void generateAndGroupByCustomer() {
        System.out.println("\n👥 GENERATE AND GROUP BY CUSTOMER 👥");
        System.out.println("Using constructor reference with grouping operations");
        System.out.println("─".repeat(80));
        
        Map<String, List<Invoice>> invoicesByCustomer = transactionIds.stream()
                .map(Invoice::new)  // Constructor reference
                .collect(Collectors.groupingBy(Invoice::getCustomerName));
        
        System.out.println("Invoices grouped by customer:");
        invoicesByCustomer.forEach((customer, invoices) -> {
            System.out.println("\n👤 " + customer + ":");
            invoices.forEach(invoice -> 
                    System.out.println("  📄 " + invoice.getInvoiceId() + " - $" + invoice.getAmount()));
            
            double totalAmount = invoices.stream()
                    .mapToDouble(Invoice::getAmount)
                    .sum();
            System.out.println("  💰 Total: $" + String.format("%.2f", totalAmount));
        });
        
        System.out.println("─".repeat(80));
    }
    
    // 8. Generate monthly invoice report using constructor reference
    public void generateMonthlyInvoiceReport() {
        System.out.println("\n📊 MONTHLY INVOICE REPORT 📊");
        System.out.println("Using constructor reference for report generation");
        System.out.println("═".repeat(80));
        
        List<Invoice> monthlyInvoices = transactionIds.stream()
                .map(Invoice::new)  // Constructor reference
                .collect(Collectors.toList());
        
        System.out.println("MONTHLY INVOICE GENERATION REPORT");
        System.out.println("Report Date: " + java.time.LocalDate.now());
        System.out.println("─".repeat(80));
        
        // Statistics
        int totalInvoices = monthlyInvoices.size();
        double totalAmount = monthlyInvoices.stream()
                .mapToDouble(Invoice::getAmount)
                .sum();
        double averageAmount = totalAmount / totalInvoices;
        double maxAmount = monthlyInvoices.stream()
                .mapToDouble(Invoice::getAmount)
                .max()
                .orElse(0.0);
        double minAmount = monthlyInvoices.stream()
                .mapToDouble(Invoice::getAmount)
                .min()
                .orElse(0.0);
        
        System.out.printf("Total Invoices Generated: %d%n", totalInvoices);
        System.out.printf("Total Invoice Amount: $%.2f%n", totalAmount);
        System.out.printf("Average Invoice Amount: $%.2f%n", averageAmount);
        System.out.printf("Highest Invoice Amount: $%.2f%n", maxAmount);
        System.out.printf("Lowest Invoice Amount: $%.2f%n", minAmount);
        
        System.out.println("\nTop 5 Highest Value Invoices:");
        monthlyInvoices.stream()
                .sorted(Comparator.comparing(Invoice::getAmount).reversed())
                .limit(5)
                .forEach(invoice -> 
                        System.out.printf("  🏆 %s - %s - $%.2f%n", 
                                invoice.getInvoiceId(), 
                                invoice.getCustomerName(), 
                                invoice.getAmount()));
        
        System.out.println("═".repeat(80));
    }
    
    // 9. Advanced constructor reference with custom factory
    public void advancedConstructorReferenceDemo() {
        System.out.println("\n🚀 ADVANCED CONSTRUCTOR REFERENCE DEMO 🚀");
        System.out.println("Demonstrating different ways to use constructor references");
        System.out.println("─".repeat(80));
        
        // Different constructor reference approaches
        Function<String, Invoice> factory1 = Invoice::new;  // Direct constructor reference
        
        // Using constructor reference in optional
        Optional<String> optionalTxnId = Optional.of("TXN999");
        Optional<Invoice> optionalInvoice = optionalTxnId.map(Invoice::new);
        
        if (optionalInvoice.isPresent()) {
            System.out.println("Optional Invoice: " + optionalInvoice.get().getInvoiceId());
        }
        
        // Constructor reference with method chaining
        Invoice chainedInvoice = Optional.of("TXN888")
                .map(Invoice::new)  // Constructor reference
                .map(invoice -> {
                    invoice.setStatus("PRIORITY");
                    return invoice;
                })
                .orElse(null);
        
        if (chainedInvoice != null) {
            System.out.println("Chained Invoice: " + chainedInvoice.getInvoiceId() + 
                             " - Status: " + chainedInvoice.getStatus());
        }
        
        // Constructor reference in stream operations
        String result = transactionIds.stream()
                .limit(3)
                .map(Invoice::new)  // Constructor reference
                .map(Invoice::getInvoiceId)
                .collect(Collectors.joining(", "));
        
        System.out.println("Generated Invoice IDs: " + result);
        System.out.println("─".repeat(80));
    }
    
    // 10. Performance comparison: Lambda vs Constructor Reference
    public void performanceComparison() {
        System.out.println("\n⏱️ PERFORMANCE COMPARISON: LAMBDA VS CONSTRUCTOR REFERENCE ⏱️");
        System.out.println("Comparing lambda expression vs constructor reference performance");
        System.out.println("─".repeat(80));
        
        List<String> largeTxnList = IntStream.range(1, 10001)
                .mapToObj(i -> "TXN" + String.format("%05d", i))
                .collect(Collectors.toList());
        
        // Test with lambda expression
        long lambdaStart = System.nanoTime();
        List<Invoice> lambdaInvoices = largeTxnList.stream()
                .map(txnId -> new Invoice(txnId))  // Lambda expression
                .collect(Collectors.toList());
        long lambdaEnd = System.nanoTime();
        
        // Test with constructor reference
        long constructorStart = System.nanoTime();
        List<Invoice> constructorInvoices = largeTxnList.stream()
                .map(Invoice::new)  // Constructor reference
                .collect(Collectors.toList());
        long constructorEnd = System.nanoTime();
        
        long lambdaTime = (lambdaEnd - lambdaStart) / 1_000_000; // Convert to milliseconds
        long constructorTime = (constructorEnd - constructorStart) / 1_000_000;
        
        System.out.println("Performance Results (10,000 invoices):");
        System.out.printf("Lambda Expression Time: %d ms%n", lambdaTime);
        System.out.printf("Constructor Reference Time: %d ms%n", constructorTime);
        
        if (lambdaTime < constructorTime) {
            System.out.printf("Lambda was faster by %d ms%n", constructorTime - lambdaTime);
        } else if (constructorTime < lambdaTime) {
            System.out.printf("Constructor Reference was faster by %d ms%n", lambdaTime - constructorTime);
        } else {
            System.out.println("Both approaches performed equally");
        }
        
        System.out.println("Generated invoices: " + lambdaInvoices.size() + " (lambda), " + 
                          constructorInvoices.size() + " (constructor ref)");
        System.out.println("─".repeat(80));
    }
    
    // Display detailed invoice information
    public void displayDetailedInvoiceInfo() {
        if (generatedInvoices.isEmpty()) {
            generateInvoicesFromTransactionIds();
        }
        
        System.out.println("\n📋 DETAILED INVOICE INFORMATION 📋");
        System.out.println("Showing detailed info for first 3 generated invoices");
        System.out.println("─".repeat(80));
        
        generatedInvoices.stream()
                .limit(3)
                .forEach(invoice -> System.out.print(invoice.getDetailedInfo()));
    }
    
    // Main method to demonstrate all constructor reference scenarios
    public static void main(String[] args) {
        InvoiceGenerationSystem system = new InvoiceGenerationSystem();
        
        System.out.println("🧾 INVOICE GENERATION SYSTEM 🧾");
        System.out.println("Using Constructor References (Invoice::new) for Object Creation");
        System.out.println("═".repeat(90));
        
        // Demonstrate different constructor reference scenarios
        system.generateInvoicesFromTransactionIds();
        system.generateInvoicesUsingFunction();
        system.parallelInvoiceGeneration();
        system.batchInvoiceGeneration();
        system.conditionalInvoiceGeneration();
        system.invoiceGenerationWithPostProcessing();
        system.generateAndGroupByCustomer();
        system.generateMonthlyInvoiceReport();
        system.advancedConstructorReferenceDemo();
        system.performanceComparison();
        system.displayDetailedInvoiceInfo();
        
        System.out.println("\n✅ Invoice Generation System demonstration completed!");
        System.out.println("\n📚 Constructor Reference Benefits:");
        System.out.println("  • More readable than lambda: Invoice::new vs txnId -> new Invoice(txnId)");
        System.out.println("  • Potentially better performance (JVM optimization)");
        System.out.println("  • Clear intent: creating objects from constructor");
        System.out.println("  • Type safety and compile-time checking");
        System.out.println("  • Easier to refactor and maintain");
    }
}