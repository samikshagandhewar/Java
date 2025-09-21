package com.studyopedia;

import java.util.Scanner;

class student1
{
	String name;
	int marks[];
	
		student1(String name, int marks[])				//[] is used to indicate array
		{
			this.name=name;
			this.marks=marks;
		}
		
		public int avg()
		{
			int sum=0;
			for(int i : marks)
			{
				sum+=i;
			}
			return sum/marks.length;
		}
}

		public class student {
		
			public static void main(String[] args) {
				student1 s1 = new student1 ("abc", new int[]{12, 15, 18});
				
				System.out.println(s1.avg());
			}
		}
