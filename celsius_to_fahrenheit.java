package com.studyopedia;

import java.util.Scanner;

public class celsius_to_fahrenheit {

	public static void main(String[] args) {
		System.out.print("Enter temp:");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		double F = temp*9/5+32;
		System.out.print(F);
	}

}
