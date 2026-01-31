package lamda.smarthouse;

import java.util.*;

public class House {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		LightWorking l = null;
		if(s.equalsIgnoreCase("dull")) {
			l =()->{System.out.println("lower the light brightness");};
		}else if(s.equalsIgnoreCase("moon light")){
			l = ()->{System.out.println("moon lighting on");};
		}else if(s.equalsIgnoreCase("bright")) {
			l = ()->{System.out.println("Lights working at full power");};
		}else {
	        l = () ->{System.out.println("No valid trigger detected");};
	    }
		l.light();
		
	}
}
