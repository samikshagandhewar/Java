package com.studyopedia;

import java.util.Scanner;

public class number_guess_game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		int n = sc.nextInt();
		System.out.print("enter user_no.:");
		int m = sc.nextInt();
		
		int i=1;
		while(n!=m)
		{
			if(n>m)
			{
				System.out.print("too low,");
			}
			else
			{
				System.out.print("too high,");
			}
			System.out.println(" try again");
			m = sc.nextInt();
			i++;		
		}
		System.out.print("Correct guess");	
	}
}
