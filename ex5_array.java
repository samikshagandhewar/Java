package com.studyopedia;

import java.util.Scanner;
public class ex5_array {

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
		System.out.println("Array elements:");
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
