package com.studyopedia;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("The number is even");
		}
		else{
			System.out.println("The number is odd");
		}
	}

}
