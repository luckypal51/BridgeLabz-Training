public class DiscountFees{
	public static void main(String[] args){
        float fees = 125000f;
        float discount =10f;
        float discountPrice = (fees/100)*discount; // This formula is used to calculate discounted amount
        float payableAmount = fees- discountPrice;// By this we will get payable amount
        System.out.println("The discount amount is INR "+discountPrice+" and final discounted fee is INR "+payableAmount);
}
} 
