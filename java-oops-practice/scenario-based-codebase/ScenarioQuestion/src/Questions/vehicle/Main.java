package Questions.vehicle;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Company com = new Company();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(" ");
			System.out.println("Enter 'B' to Rent bike  : ");
			System.out.println("Enter 'C' to Rent car   : ");
			System.out.println("Enter 'T' to Rent truck : ");
			System.out.println("Enter 'D' to see details: ");
			System.out.println("Enter 'E' to exit       : ");
			
			char  ch = sc.next().charAt(0);
			sc.nextLine();
			ch= Character.toLowerCase(ch);
			if(ch=='b') {
				System.out.println("Enter your name : ");
				String name = sc.nextLine();
				System.out.println("Enter vehicle no: ");
				String vehcile = sc.nextLine();
				System.out.println("Enter Days      : ");
				double days = sc.nextDouble();
				Bike bike = new Bike(name,vehcile,days);
				com.choice(bike);
			}else if(ch=='c') {
				System.out.println("Enter your name : ");
				String name = sc.nextLine();
				System.out.println("Enter vehicle no: ");
				String vehcile = sc.nextLine();
				System.out.println("Enter Days      : ");
				double days = sc.nextDouble();
				Car car = new Car(name,vehcile,days);
				com.choice(car);
			}else if(ch=='t') {
				System.out.println("Enter your name : ");
				String name = sc.nextLine();
				System.out.println("Enter vehicle no: ");
				String vehcile = sc.nextLine();
				System.out.println("Enter Days      : ");
				double days = sc.nextDouble();
				sc.nextLine();
				Truck truck = new Truck(name,vehcile,days);
				com.choice(truck);
			}else if(ch=='d') {
				System.out.println("Enter vehicle no:");
				String no = sc.nextLine();
				com.details(no);
			}else {
				System.out.println("thank you come again");
				break;
			}
		}while(true);
	}
}
