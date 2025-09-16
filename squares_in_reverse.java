package com.studyopedia;

import java.util.Scanner;

public class squares_in_reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--){
			System.out.println(i*i);
		}
	}

}
