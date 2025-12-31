package Questions;
import java.util.*;
public class Quiz {
    static String[] question = {"Why Java is Platfrom independent ?","Why java is not fully object oriented pragming language.","What is release date of java.","Who created java"};
    static String[][]options = {{"a.JVM","b.Compiler","c.Class loader","d.Garbage Collector"},{"a.Objects","b.JVM","c.Primitive data type","d.Inherietence"},{"a.1947","b.1971","c.2003","d.2023"},{"a.Lucky Pal","b.Himesh Kurmi","c.Nageshwar Patel","d.James Gosling"}} ;
    static char[] ans = {'a','c','b','d'};
    static int idx=0;
    static char[]option = new char[4];
    public static void input(Scanner sc) {
    	option[idx++]= sc.next().charAt(0);
    	sc.nextLine();
    }
    public static void show() {
    	Scanner sc = new Scanner(System.in);
    	for(int i =0;i<question.length;i++) {
    		System.out.println(question[i]);
    		for(int j = 0;j<options[0].length;j++) {
    			System.out.println(options[i][j]);
    		}
    		input(sc);
    	}
    }
    public static void check() {
    	int points = 0;
    	for(int i =0;i<ans.length;i++) {
    		if(ans[i]==option[i]) {
    			points++;
    		}
    	}
    	System.out.println("Total points : "+points);
    }
    public static void main(String[] args) {
    	System.out.println("---Welcome to the Java quiz Game---");
    	show();
    	check();
    }
}
