package com.studyopedia;

import java.util.Scanner;

public class vol_of_sphere {

	public static void main(String[] args) {
			System.out.print("Enter radius:");
			Scanner sc = new Scanner(System.in);
			int r = sc.nextInt();
			
			double volume = 4*3.14*r*r*r/3;
			System.out.println(volume);
		
	}

}
