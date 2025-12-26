import java.util.*;
public class Calendar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int year = sc.nextInt();
		
	   String[] day = {"Sun","Mon","Tue","Web","Thu","Fri","Sat"};
	   int [][] calen = new int [6][7];
	   int count = 1;
	   for(int i = 0;i<6;i++){
		   for(int j=0;j<7;j++){
			   if(i==0){
				   if(j>=isDay(1,month,year)){ calen[i][j]=count++;}
				  
			   }else{
				    calen[i][j]=count++;
			   }
			   if(count>numberOfDay(month,year)){
				   break;
			   }
		   }
		     if(count>numberOfDay(month,year)){
				   break;
			   }  
	   }
	   System.out.println(monthId(month)+" "+year);
	   System.out.println(Arrays.toString(day));
	   for(int [] a: calen){
		  	 System.out.println(Arrays.toString(a));
 
	   }
	}
	public static String monthId(int m){
		if(m==1){
			return "January";
		}
		if(m==2){
			return "February"
		}
		if(m==3){
			return "March";
		}
		if(m==4){
			return "April";
		}
		if(m==5){
			return "May";
		}
		if(m==6){
			return "June";
		}
		if(m==7){
			return "July";
		}
		if(m==8){
			return "August";
		}
		if(m==9){
			return "September";
		}
		if(m==10){
			return "October";
		}
		if(m==11){
			return "November";
		}
		return "December";
	}
	public static int numberOfDay(int m,int y){
	if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)){
		return 31;
	}else{
		if(m==2){
			if(isLeap(y)){
				return 29;
			}else{
				return 28;
			}
		}else{
			return 30;
		}
	}
	}
	public static boolean isLeap(int n){
		if(n>=1582){
			if((n%400==0)||((n%4==0)&&(n%100!=0))){
				return true;;
			}
		}
		return false;
	}
	public static int isDay(int d , int m,int y){
		int y0=y-(14-m)/12;
		int x =y0+(y0/4)-(y0/100)+(y0/400);
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+((31*m0)/12))%7;
		return d0;
	}
}