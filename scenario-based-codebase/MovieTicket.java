import java.util.*;
public class MovieTicket{
	static boolean[][] ticket = new boolean[8][6];
	
	public static void view(){
		for(int i =0;i<ticket.length;i++){
		
				System.out.print(i+". |");
			
			for(int j =0;j<ticket[0].length;j++){
				if(i<2){
					if(ticket[i][j]){
						System.out.print("NA (S): "+j+" | ");
					}else{
						System.out.print("AV (S): "+j+" | ");
					}
				}
				if(i>=2&&i<5){
					if(ticket[i][j]){
						System.out.print("NA (G): "+j+" | ");
					}else{
						System.out.print("AV (G): "+j+" | ");
					}
				}
				if(i>=5){
					if(ticket[i][j]){
						System.out.print("NA (P): "+j+" | ");
					}else{
						System.out.print("AV (P): "+j+" | ");
					}
				}
			}
			System.out.println();
		}
	}
	public static void book(int i, int j){
		if(ticket[i][j]){
			System.out.println("The seat is already booked");
			return;
		}
		ticket[i][j] = true;
		System.out.println("The seat booked successfully ");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter v to view seats  :");
			System.out.println("Enter b to book seats  :");
			System.out.println("Enter e to exit        :");
			char ch = sc.next().charAt(0);
			if(ch=='v'||ch=='V'){
				view();
		}else if(ch=='b'||ch=='B'){
			   System.out.println("Enter the row       :");
			   int i = sc.nextInt();
			   System.out.println("Enter seat number   :");
			   int j = sc.nextInt();
			   book(i,j);
		}else if(ch=='e'||ch=='E'){
			System.out.println("Thank you come again");
			  break;
		}
		}while(true);
		
	}
}