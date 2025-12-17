import java.util.*;
public class AreaTriangle{
       public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        double areas = 0.5*base*height;
        double areasInches= areas/2.54;
        System.out.println("area of a triangle in square inches "+areasInches+" and square centimeters "+areas);
}
}