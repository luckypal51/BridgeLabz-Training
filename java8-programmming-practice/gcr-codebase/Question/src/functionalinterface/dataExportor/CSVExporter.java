package functionalinterface.dataExportor;

public class CSVExporter implements DataExporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting data to CSV: " + data);
    }
}
