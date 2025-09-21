package com.studyopedia;
import java.util.Scanner;
	class Vehicle
	{
		String status;
		
		Vehicle()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter status:");
			this.status=sc.nextLine();
		}
		
		public void carStatus()
		{
			if(status.equals("start"))					
			{
				System.out.println("car started");
			}
			else if(status.equals("stop"))
			{
				System.out.println("car stopped");
			}
			else
			{
				System.out.println("inavlid");
			}
		}
		
	}
		public class abstraction_ex1
		{
			public static void main(String[] args) 
			{
				Vehicle v1 = new Vehicle();
			//	v1.Vehicle();
				v1.carStatus();	
			}
		}
