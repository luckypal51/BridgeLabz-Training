package streamApi.insurence;

public class Claims {
     public String claimsType;
     public double amount;
     
	 public Claims(String claimsType, double amount) {
		this.claimsType = claimsType;
		this.amount = amount;
	 }

	 @Override
	 public String toString() {
		return "Claims [claimsType=" + claimsType + ", amount=" + amount + "]";
	 }
     
     
}
