package com.studyopedia;

import java.util.Scanner;

public class ex6_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter arr elements at index " +i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Odd elements:");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
