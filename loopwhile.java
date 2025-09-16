package com.studyopedia;

import java.util.Scanner;

public class loopwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		int i=1;
		while(i<=n)									//if the condition is true, then only the program will run otherwise it will get stuck in an infinite loop
		{
			System.out.println("Hello, Samiksha");
			i++;
		}
	}

}
