package Questions;
import java.util.*;
public class Parking{
	public static boolean occupancy = false;
	public String ownerName;
	public String carNumber;
	
	public boolean checkOccupancy(){
		if(!occupancy){
			return false;
		}else{
			return true;
		}
	}
	public Parking(String ownerName, String carNumber){
		this.ownerName = ownerName;
		this.carNumber = carNumber;
	}
	
	
	public void park(){
		if(occupancy){
			System.out.println("The parking is occupied !");
			return;
		}
		occupancy = true;
		System.out.println("The car has been parked "+this.carNumber);
	}
	
	public boolean exit(){
		if(!occupancy){
			System.out.println("The parking is already empty !");
			return false;
		}
		occupancy = false;
		System.out.println("The car "+this.carNumber+" is exiting the parking !");
		System.out.println("Thank you for coming ");
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name =sc.nextLine();
		System.out.println("Enter the car number :");
		String carno = sc.nextLine();
		
		Parking p = new Parking(name,carno);
		do{
			System.out.println(" ");
			System.out.println("Enter 'O' to check occupancy   :");
			System.out.println("Enter 'P' for parking          :");
			System.out.println("Enter 'E' for exiting parking  :");
			char op = sc.next().charAt(0);
			op = Character.toUpperCase(op);
			
			switch(op){
				case 'O':
				  System.out.println("The parking is full "+p.checkOccupancy());
				  break;
				case 'P':
				   p.park();
				   break;
				case 'E':
				   if(p.exit()){
					   System.exit(0);
				   }
				   break;
				default:
				  System.out.println("Enter the valid options ");
				  break;
			}
			
		}while(true);
	}
	}