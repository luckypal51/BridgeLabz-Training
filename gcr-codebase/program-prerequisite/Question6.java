import java.util.*;
public class Question6{
       public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int pa = sc.nextInt();
       float rate = sc.nextFloat();
       float time =sc.nextFloat();
       double si = (pa*rate*time)/100;
       System.out.println(si);
      }
}