package com.studyopedia;

import java.util.Scanner;

public class control_flow_continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
