package com.studyopedia;

import java.util.Scanner;

public class loop_dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		{
			int i=1;
			do {										//if the condition is not true, then also the program will run for once in do-while loop
				System.out.println("Hello world");
				i++;
			}while(i<=n);
		}

	}

}
