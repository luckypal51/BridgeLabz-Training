import java.util.*;
public class DiscountInput{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);// To take input 
        float fees = input.nextFloat();
        float discount = input.nextFloat();
        double discountFees = (fees/100)*discount;
        double payableAmount = fees - discountFees;
        System.out.println("The discount amount is INR "+discountFees+" and final discounted fee is INR "+payableAmount);
}
}