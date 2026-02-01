package functionalinterface.dataExportor;

interface DataExporter {

    void export(String data);

    default void exportToJSON(String data) {
        System.out.println("Exporting data to JSON (default implementation)");
    }
}
