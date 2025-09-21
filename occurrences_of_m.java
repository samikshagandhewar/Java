package com.studyopedia;
import java.util.Scanner;
public class occurrences_of_m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = sc.next();
		
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			 if(str.charAt(i)=='m')
			 {
				 count++;
			 }
		}
		System.out.println(count);
	}
}
