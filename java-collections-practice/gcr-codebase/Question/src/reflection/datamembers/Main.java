package reflection.datamembers;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
	   Demo d = new Demo();
	   Class<?> cl = d.getClass();
	   
	   System.out.println("class  Name : "+cl.getName());
	   System.out.println("field  Name : "+Arrays.toString(cl.getDeclaredFields()));
	   System.out.println("method Name : "+Arrays.toString(cl.getMethods()));
   }
}
