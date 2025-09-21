package com.studyopedia;
import java.util.Scanner;
public class print_string_elements_one_by_one {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str =  sc.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
	}
}
