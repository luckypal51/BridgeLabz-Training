package functionalinterface.dataExportor;

public class Main {
	public static void main(String[] args) {

        DataExporter csv = new CSVExporter();
        csv.export("Sales Report");
        csv.exportToJSON("Sales Report");

        DataExporter pdf = new PDFExporter();
        pdf.export("Invoice Report");
        pdf.exportToJSON("Invoice Report");

        DataExporter json = new AdvancedJSONExporter();
        json.exportToJSON("Audit Report");
    }
}
