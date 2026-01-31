package lamda.objectinitialization;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
     public static void main(String[] args) {
		ArrayList<String> transactionid = new ArrayList<>();
	    transactionid.add("KXM1245312");
	    transactionid.add("FXM7854512");
	    transactionid.add("PXM4545000");
	    
	    ArrayList<Transaction> obj = (ArrayList<Transaction>) transactionid.stream().map(Transaction::new).collect(Collectors.toList());
	    
	    obj.stream().forEach(System.out::println);
	}
}
