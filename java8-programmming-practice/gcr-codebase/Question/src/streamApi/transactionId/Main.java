package streamApi.transactionId;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
     public static void main(String[] args) {
		ArrayList<String> transactionId = new ArrayList<>();
        transactionId.add("PX78451");
        transactionId.add("MX75451");
        transactionId.add("RXK7845");
        
        transactionId.stream().forEach(x->System.out.println(LocalDateTime.now()+" - Transaction: "+x));
	}
}
