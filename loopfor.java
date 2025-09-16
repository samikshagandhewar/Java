package com.studyopedia;

import java.util.Scanner;

public class loopfor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)				//applicable only to problems where the number of iterations are known 
		{
			System.out.println("Hello World");
		}
	}

}
