package com.studyopedia;
import java.util.Scanner;
public class USD_to_INR {
	public static double USD_INR()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter USD value: ");
		int USD = sc.nextInt();
		
		return USD*88.09;
	}
	public static void main(String[] args) 
	{
		System.out.println("USD to INR = Rs."+USD_INR());

	}

}
