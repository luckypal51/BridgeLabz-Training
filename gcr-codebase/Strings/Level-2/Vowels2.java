import java.util.*;
public class Vowels2{
   public static void main(String[]args){
	   Scanner sc = new Scanner(System.in);
	   String s = sc.next();
	   
	   String s2 = toLower(s);
	   String[][] arr = isVowel(s2);
	  for(String[]a:arr){
		  System.out.println(Arrays.toString(a));
	  }
	   
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
   public static String[][] isVowel(String s){
	   String vowel = "aeiou";
	  
	   int i =0;
	   String [][] arr = new String[s.length()][2];
	   for(char a : s.toCharArray()){
		   if(Character.isAlphabetic(a)){
			   if(vowel.contains(""+a)){
				  arr[i][0]= ""+a;
				  arr[i][1]="Vowels";
			   }else{
				 arr[i][0]= ""+a;
				 arr[i][1]="Consonent";
			   }
		   }else{
			   arr[i][0]=""+a;
			   arr[i][1]="Not a letter";
		   }
		   i++;
	   }
	   return arr;
   }
}