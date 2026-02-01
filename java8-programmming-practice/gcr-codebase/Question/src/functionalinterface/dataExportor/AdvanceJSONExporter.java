package functionalinterface.dataExportor;

class AdvancedJSONExporter implements DataExporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting data using advanced exporter");
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("Exporting data to JSON (custom implementation)");
    }
}
