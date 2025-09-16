package com.studyopedia;
import java.util.Scanner;
public class control_flow_break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n:");
		int n = sc.nextInt();
		for(int i=1; i<=8; i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
	}

}
