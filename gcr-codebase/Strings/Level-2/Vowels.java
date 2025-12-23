import java.util.*;
public class Vowels{
   public static void main(String[]args){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.next();
	   
	   String s2 = toLower(s);
	   int[] arr = isVowel(s2);
	   System.out.println("The number vowel persent is "+arr[0]);
	   System.out.println("The number consonent persent is "+arr[1]);
	   
   }
   public static String toLower(String s){
	   StringBuilder str = new StringBuilder();
	   for(char a:s.toCharArray()){
		   int n = (int) a;
		   if(n>=65&&n<=91){
			   int x = (int) (a-'A');
			   char an = (char)(x+97);
			   str.append(""+an);
		   }else{
			   str.append(""+a);
		   }
	   }
	   return str.toString();
   }
   public static int[] isVowel(String s){
	   String vowel = "aeiou";
	   int v =0;
	   int c =0;
	   int [] arr = new int[2];
	   for(char a : s.toCharArray()){
		   if(Character.isAlphabetic(a)){
			   if(vowel.contains(""+a)){
				   v++;
			   }else{
				   c++;
			   }
		   }
	   }
	   arr[0]=v;
	   arr[1]=c;
	   return arr;
   }
}