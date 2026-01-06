package com.searching.StringBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse {
	public static void main(String[] args) throws Exception{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String s = read.readLine();
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		System.out.println("Original String "+s);
		System.out.println("Reverse String Using StringBuilder "+str.toString());
	}
}
