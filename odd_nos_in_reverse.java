package com.studyopedia;

import java.util.Scanner;

public class odd_nos_in_reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--)			//another_method:-> for(int i=n; i<=n; i--)______ if(i%2==1)______System.out.println(i);
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}

	}

}
