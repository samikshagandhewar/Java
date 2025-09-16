package com.studyopedia;

import java.util.Scanner;

public class greater_lesser_equal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m:");
		int m = sc.nextInt();
		System.out.print("Enter n:");
		int n = sc.nextInt();
		
		if(m>n)
		{
			System.out.print(m+ " is greater");
		}
		else if(n>m)
		{
			System.out.print(n+ " is greater");
		}
		else
		{
			System.out.print("both are equal");
		}

	}

}
