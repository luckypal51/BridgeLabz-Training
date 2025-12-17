public class PenDistribution{
	public static void main(String[] args){
        int pens = 14;
        int students =3;
        int penPerStudent = pens/students; // get the no of pens each student get
        int penRemaining =  pens%students; // get the no of pens remaining
        System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+penRemaining);
}
}