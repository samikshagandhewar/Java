package com.studyopedia;
import java.util.Scanner;
public class three_digit_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		if(n>99 && n<1000)
		{
			System.out.print("Its a three digit number");
		}
		else
		{
			System.out.print("Its not a three digit number");
		}
	}

}
