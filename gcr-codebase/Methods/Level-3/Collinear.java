import java.util.*;
public class Collinear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		float x3 = sc.nextFloat();
		float y3 = sc.nextFloat();
		
		System.out.println("The point collinear by slop : "+slop(x1,y1,x2,y2,x3,y3));
		System.out.println("The point collinear by triangle : "+triangle(x1,y1,x2,y2,x3,y3));
	}
	public static boolean slop(float x1,float y1, float x2, float y2, float x3, float y3){
		float ab=(y2 - y1)/(x2 - x1);
		float bc=(y3 - y2)/(x3 - x2);
		float ac=(y3 - y1)/(x3 - x1);
		
		return (ab==bc&&bc==ac)?true:false;
	}
	public static boolean triangle(float x1,float y1, float x2, float y2, float x3, float y3){
		double area =  0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		return area==0?true:false;
	}
}