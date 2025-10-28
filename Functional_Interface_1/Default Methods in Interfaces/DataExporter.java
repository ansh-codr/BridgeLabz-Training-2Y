public interface DataExporter {
    void exportToCSV();
    void exportToPDF();
    
    default void exportToJSON() {
        System.out.println("Data exported to JSON format");
    }
}