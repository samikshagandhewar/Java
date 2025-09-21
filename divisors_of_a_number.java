package com.studyopedia;

import java.util.Scanner;
import java.util.ArrayList;

public class divisors_of_a_number {

	public static ArrayList<Integer> divisor(int n)		//here arraylist<integer> is a data type and divisor is a method name
	{
		ArrayList<Integer> arr=new ArrayList<>();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				arr.add(i);		//this statement or arraylist method is important and is always used when we initialize an empty arraylist
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		System.out.println(divisor(10));	
	}
}
