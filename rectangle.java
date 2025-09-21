package com.studyopedia;

import java.util.Scanner;

class rectangle1
{
	int l, b;
	rectangle1(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	
	public void area()
	{
		System.out.println(l*b);
	}
	
	public void perimeter()
	{
		System.out.println(2*(l+b));
	}
}
	public class rectangle {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter length:");
			int l =sc.nextInt();
			System.out.println("Enter breadth:");
			int b =sc.nextInt();
			
		/*	rectangle1 r = new rectangle1(12, 21);				//using constructor
			r.area();
			r.perimeter();*/
			rectangle1 r = new rectangle1(l,b);				// the starting and ending name to create object should be same as the class(here, rectangle)
			r.area();
			r.perimeter();								//if parameters are given inside the method name(here area()), then give user input variables inside the object created for method
														// for example r.area(l, b)
														
														//if parameters are not given inside the method name(here area()), then give user input variables inside the object creation statement
														// for example rectangle1 r = new rectangle1(l, b)
		}						
					// if we initialize variables inside the class, then those variables should be used inside the object creation statement
					//for example rectangle1 r = new rectangle1(l, b)
					// if we cannot initialize variables inside class, then those variables are used inside the objects created for methods
					// here for example, r.area(l, b)
	
	}
