package com.constructinstance.level1;
import java.util.*;
public class Circle {
	
	double radius;
	
	public Circle() {
		this(10);
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		Circle c;
		if(radius<0) {
			c = new Circle();
		}else {
			c = new Circle(radius);
		}
		
		System.out.println(c.radius);
	}
}
