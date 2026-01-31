package lamda.objectinitialization;

public class Transaction {
    public String transactionId;

	public Transaction(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + "] object successfully created";
	}
    
    
}
