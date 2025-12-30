import java.util.*;
public class Train{
	static int count = 0;
	static boolean [][] ticket = new boolean[10][4]; 
	public static void view(){
	
		System.out.println("--------------Train ticket view----------------");
		System.out.println("NA stand for Not Available! :");
		System.out.println("AV stand for Available      :");
		for(int i = 0;i<ticket.length;i++){
			System.out.print(i+" | ");
			for(int j = 0;j<ticket[0].length;j++){
				if(ticket[i][j]== true){
					System.out.print("NA="+j+" | ");
				}else{
					System.out.print("AV="+j+" | ");
				}
			}
			System.out.println();
		}
	}
	public static void book(int i , int j){
		if(ticket[i][j]==true){
			System.out.println("Seat is already filled !");
		    return;
		}
		ticket[i][j] =true;
		count++;
		System.out.println("Successfully booked the seat");
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("------Welcome to railway ticket booking-----");
		do{
			System.out.println(" ");
			System.out.println("Enter 'v' to view seats :");
			System.out.println("Enter 'b' to book seats :");
			System.out.println("Enter 'e' to exit       :");
			char ch = sc.next().charAt(0);
			if(ch=='e'||ch=='E'){
				System.out.println("Thank you !         :");
				break;
			}
			else if(ch=='v'||ch=='V'){
				view();
			}
			else if(ch=='b'||ch=='B'){
				System.out.println("Enter the row :");
				int i = sc.nextInt();
				System.out.println("Enter the seat no :");
				int j = sc.nextInt();
				book(i,j);
			}
		}while(true);
	}
}