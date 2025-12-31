package Questions;
import java.util.*;
public class DigitalClock{
	public static void main(String[] args){
		for(int i = 1;i<24;i++){
			if(i==13){
				System.out.println("The power cuts");
				break;
			}
			for(int j =0;j<60;j++){
				if(i<10&&j<10){
					System.out.println("0"+i+" : 0"+j);
				}
				else if(i<10){
					System.out.println("0"+i+" : "+j);
				}
				else if(j<10){
					System.out.println(i+" : 0"+j);
				}else{
                    System.out.println(i+" : "+j);
				}
			}
		}
	}
}