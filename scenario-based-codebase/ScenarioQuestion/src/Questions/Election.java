package Questions;
import java.util.*;
public class Election{
	public static int count =0;
	public static int bjp =0;
	public static int congress=0;
	public static int nota = 0;
	String name;
    int age;
	boolean vote = false;
	
	Election(String name,int age){ 
	    this.name = name;
		this.age = age;
	}
	public boolean validAge(){
		if(this.age>=18){
			return true;
		}
		return false;
	}
	public void vote(char c){
	    if(!vote&&validAge()){
		   if(c=='b'||c=='B'){
		     bjp++;
			this.vote = true;
		}else if (c=='c'||c=='C'){
			congress++;
			this.vote = true;
		}else{
			nota++;
			this.vote = true;
		}
		 System.out.println("Voting successful 🎉");
		}else{
			System.out.println("Not eligible for vote ");
		}
	}
	public static void result(){
		System.out.println("The total vote of BJP is "+bjp);
		System.out.println("The total vote of Congress is "+congress);
    	System.out.println("The total vote of Nota is "+nota);
	}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		while(true){
			  System.out.println("Enter your name :");
        String s = sc.nextLine();

        System.out.println("Enter your age :");
        int n = sc.nextInt();
        sc.nextLine();

        Election el = new Election(s, n);

        System.out.println("Enter 'B' for BJP :");
        System.out.println("Enter 'C' for Congress :");
        System.out.println("Enter 'N' for Nota :");
        System.out.println("Enter 'E' for Exit :");

        char v = sc.next().charAt(0);
        sc.nextLine();
        if(v == 'E' || v == 'e'){
            break;
        }
			el.vote(v);
		}
		result();
	}
}