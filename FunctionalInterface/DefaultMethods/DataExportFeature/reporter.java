package FunctionalInterface.DefaultMethods.DataExportFeature;

interface reporter {
    void exportCSV();
    void exportPDF();
    default void exportToJSON() { System.out.println("json"); }
}
