import java.util.*;
public class OTP{
	public static void main(String[] args){
		generate();
		
	}
	public static void generate(){
		Random r = new Random();
		long [] otp = new long[10];
		for(int i =0;i<10;i++){
			otp[i]= r.nextLong(899999)+10000;
		}
		System.out.println(Arrays.toString(otp));
		System.out.println("The otp are unique : "+check(otp));
	}
	public static boolean check(long[] otp){
		for(int i =0;i<otp.length-1;i++){
			for(int j=i+1;j<otp.length;j++){
				if(otp[i]==otp[j]){
					return false;
				}
			}
		}
		return true;
	}
} 