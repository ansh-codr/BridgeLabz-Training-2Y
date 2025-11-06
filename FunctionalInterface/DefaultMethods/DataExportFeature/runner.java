package FunctionalInterface.DefaultMethods.DataExportFeature;

public class runner {
    public static void main(String[] a) {
        r1 x = new r1();
        x.exportCSV();
        x.exportPDF();
        x.exportToJSON();
    }
}
