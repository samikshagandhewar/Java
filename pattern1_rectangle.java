package com.studyopedia;

import java.util.Scanner;

public class pattern1_rectangle 
{

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);
				System.out.print("enter a number:");
				int n = sc.nextInt();
				
				for(int i=1; i<=n; i++)			//step 1: find the no. of rows = condition for outer loop
				{								//step 2: identify the no. of columns for every row
					for(int j=1; j<=n; j++)		//step 3: what do you want to print
					{
						System.out.print("*");
					}
					System.out.println();
				}
	}
}

