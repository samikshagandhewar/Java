package com.studyopedia;

import java.util.Scanner;

public class ex13_foreach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		for (int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.println("Enter array elements at " +i+j+": ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("array: ");
		for(int i[] : arr)
		{
			for(int j : i)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
