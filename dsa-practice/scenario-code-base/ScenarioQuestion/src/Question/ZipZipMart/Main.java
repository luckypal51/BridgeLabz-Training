package Question.ZipZipMart;

public class Main {
	public static void main(String[] args) {

        Transaction[] sales = {
            new Transaction("2026-01-15", 1200),
            new Transaction("2026-01-14", 800),
            new Transaction("2026-01-15", 500),
            new Transaction("2026-01-13", 1500)
        };

        ZipZipMartReport.mergeSort(sales, 0, sales.length - 1);
        ZipZipMartReport.display(sales);
    }
}
