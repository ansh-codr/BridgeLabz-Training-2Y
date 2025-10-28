public class ExportTest {
    public static void main(String[] args) {
        DataExporter reporter = new ReportGenerator();
        
        reporter.exportToCSV();
        reporter.exportToPDF();
        reporter.exportToJSON();
    }
}