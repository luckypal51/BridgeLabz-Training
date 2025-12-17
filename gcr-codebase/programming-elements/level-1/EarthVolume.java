import java.util.*;
public class EarthVolume{
 	public static void main(String[] args){
        int  radius = 6378;
        double volumeKm = (4/3)*Math.PI*radius*radius*radius;// Math.PI is used to extract pie value from Math class 
        double volumeMiles = volumeKm*1.6;
        System.out.println("The volume of earth in cubic kilometers is "+volumeKm+" and cubic miles is "+volumeMiles);
}
} 
        