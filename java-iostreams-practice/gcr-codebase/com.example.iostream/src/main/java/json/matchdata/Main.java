package json.matchdata;



public class Main {
    public static void main(String[] args) throws Exception {

        JsonProcessor.processJson("file/ipl.json","file/ipl_censored.json");

        CsvProcessor.processCsv("file/ipl.csv","file/ipl_censored.csv");
    }
}
