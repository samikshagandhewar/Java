package com.studyopedia;

import java.util.Scanner;

public class sum_of_array {

	public static void main(String[] args) {
		int arr[] = {12, 23, 21, 32, 11}; 
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}

}
