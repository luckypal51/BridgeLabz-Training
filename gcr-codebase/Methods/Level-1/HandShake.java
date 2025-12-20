import java.util.*;
public class HandShake{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numberOfStudent = sc.nextInt();
		
		int numberOfHandshake = handShake(numberOfStudent);
		System.out.println("The number of handshake possible are "+numberOfHandshake);
	}
	
	public static int handShake(int n){
		return (n * (n - 1)) / 2;
	}
}