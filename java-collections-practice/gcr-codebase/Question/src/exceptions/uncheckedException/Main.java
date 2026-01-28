package exceptions.uncheckedException;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the text");
    	int n = 0;
    	try{
    		n = sc.nextInt();
    		n = n/0;
    	}catch(InputMismatchException e) {
    		System.out.println("Input type requied is integer");
    	}catch(ArithmeticException e) {
    		System.out.println("Arithemetic exception accurs");
    	}
    }
}
