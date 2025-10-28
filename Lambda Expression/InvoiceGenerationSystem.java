import java.util.*;
import java.util.stream.Collectors;

public class InvoiceGenerationSystem {
    private List<String> transactionIds;
    
    public InvoiceGenerationSystem() {
        this.transactionIds = new ArrayList<>();
        initializeTransactionIds();
    }
    
    private void initializeTransactionIds() {
        transactionIds.add("TXN001");
        transactionIds.add("TXN002");
        transactionIds.add("TXN003");
        transactionIds.add("TXN004");
        transactionIds.add("TXN005");
    }
    
    public void generateInvoicesFromTransactionIds() {
        System.out.println("Generating Invoices using Constructor Reference:");
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());
        
        invoices.forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        InvoiceGenerationSystem system = new InvoiceGenerationSystem();
        system.generateInvoicesFromTransactionIds();
    }
}
    public static void main(String[] args) {
        InvoiceGenerationSystem system = new InvoiceGenerationSystem();
        system.generateInvoicesFromTransactionIds();
    }
}