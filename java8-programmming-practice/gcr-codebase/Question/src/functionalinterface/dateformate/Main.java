package functionalinterface.dateformate;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        System.out.println(DateFormatUtil.formatDate(invoiceDate, "dd-MM-yyyy"));
        System.out.println(DateFormatUtil.formatDate(invoiceDate, "dd/MM/yyyy"));
        System.out.println(DateFormatUtil.formatDate(invoiceDate, "MMM dd, yyyy"));
    }
}
