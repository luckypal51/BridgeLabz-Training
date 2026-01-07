package com.searching.StringBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Concat {
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String s1 = read.readLine();
		String s2 = read.readLine();
		
		StringBuffer str = new StringBuffer(s1);
		str.append(s2);
		
		System.out.println(str.toString());
		
	}
}
