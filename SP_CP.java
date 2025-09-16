package com.studyopedia;

import java.util.Scanner;
public class SP_CP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter CP:");
		int CP = sc.nextInt();
		System.out.print("Enter SP:");
		int SP = sc.nextInt();
		
		if(SP>CP)
		{
			System.out.print("Profit is generated");
		}
		else if(CP>SP)
		{
			System.out.print("Loss is incurred");
		}
		else
		{
			System.out.print("No profit-No loss");
		}
	}

}
