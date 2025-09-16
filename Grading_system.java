package com.studyopedia;

import java.util.Scanner;

public class Grading_system {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks:");
		int marks = sc.nextInt();
		if(marks>=80 && marks<=100)
		{
			System.out.print("Grade A");
		}
		else if(marks>=60 && marks<=79)
		{
			System.out.print("Grade B");
		}
		else if(marks>=40 && marks<=59)
		{
			System.out.print("Grade C");
		}
		else if(marks<40)
		{
			System.out.print("Fail");
		}
		else 
		{
			System.out.print("Invalid marks");
		}

	}

}
