import java.util.*;
public class RPC{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of round you want to play :");
		int n = sc.nextInt();
		String [][] arr = new String[n][3];
		while(n-->0){
		  System.out.println("Enter the 0 Rock, 1 Paper, 2 Scissors");
           int u = sc.nextInt();
           int c = computerSelection();
           arr[n][0]=""+n;
           arr[n][1]=""+whoWin(u,c);
           arr[n][2]= whatIs(u);		   
		}
		
		for(String[] a:arr){
			System.out.println("Round "+a[0]+" winner is "+a[1]+" your choice is "+ a[2]);
		}
	}
	public static int computerSelection(){
		Random r = new Random();
		int n = r.nextInt(2);
		return n;
	}
	public static String whatIs(int u){
		if(u==0){
			return "ROCK";
		}
		if(u==1){
			return "PAPER";
		}
		if(u==2){
			return "SCISSORS";
		}
		return "not valid choice";
	}
	public static String whoWin(int u,int c){
		if(u==c){
			return "draw";
		}
		if((u==0&&c==2)||(u==1&&c==0)||(u==2&&c==1)){
			return "You win";
		}
		else{
			return "Computer win";
		}
	}
}