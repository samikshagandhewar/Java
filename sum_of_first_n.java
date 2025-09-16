package com.studyopedia;

import java.util.Scanner;

public class sum_of_first_n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=sum+i;
		}
		System.out.print(sum);
	}
}
