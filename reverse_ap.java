package com.studyopedia;

import java.util.Scanner;

public class reverse_ap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		System.out.print("Enter a:");
		int a = sc.nextInt();
		System.out.print("Enter d:");
		int d = sc.nextInt();
		
		for(int i=n; i>=1; i--)
		{
			System.out.println(a);
			a-=d;
		}
			
	}

}
