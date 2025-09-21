package com.studyopedia;
import java.util.Scanner;
public class largest_of_3_nos {
	public static int largest(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		
		else if(b>a && b>c)
		{
			return b;
		}
		
		else if(c>a && c>b)				//we can use else also
		{
			return c;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(largest(12, 25, 27));
	}
}
