package com.classandobject.level2;

public class PalindromeChecker {
	//Attribute
		String text;
		
		//Creating the method check palindrome
		PalindromeChecker(String text) {
			this.text=text;
			
		}
		//Creating the method to check its palindrome or not
		public boolean isPalindrome() {
		//To remove the space and return consistent text
		String cleantext=text.replaceAll("\\s","").toLowerCase();
		
		//to reverse the string
		String reverseText=new StringBuilder(cleantext).reverse().toString();
		
		return cleantext.equals(reverseText);
		}
		
		public void diplayResult() {
			if(isPalindrome()) {
				System.out.println(text+" is palindrome");
				}
			else {
				System.out.println(text+" is not Palindrome");
			}
		}
}
