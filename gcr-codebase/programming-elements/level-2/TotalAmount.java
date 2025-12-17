import java.util.*;
public class TotalAmount{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	float unitPrice =sc.nextFloat();
        float quantity =sc.nextFloat();
        float purchaseAmount = unitPrice*quantity;
        System.out.println(" The total purchase price is INR "+purchaseAmount+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
}
}

        