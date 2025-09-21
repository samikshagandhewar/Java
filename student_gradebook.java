package com.studyopedia;
import java.util.Scanner;
	class stud1
	{
		String name;
		int rno;
		int marks[];
		
		stud1(String name, int rno, int marks[])
		{
			this.name = name;
			this.rno = rno;
			this.marks=marks;
		}
		
		public int getAvg()
		{
			int sum=0;
			for(int i : marks)
			{
				sum+=i;
			}
			return sum/marks.length;				// formula: avg = sum/ marks length		
													//return can only be used if the data type with access specifier is not void
													// here public int, for example
		}
		
		public void get_grade()
		{
			if(getAvg()>80)							//instead of writing the method in the loop multiple times, we can assign a variable to the method
													// for example = int a = this.getAvg()
			{
				System.out.println("Grade A");
			}
			else if(getAvg()>60 && getAvg()<=80)
			{
				System.out.println("Grade B");
			}
			else if(getAvg()>=40 && getAvg()<=60)
			{
				System.out.println("Grade C");
			}
			else if(getAvg()<40)
			{
				System.out.println("Fail");
			}
		}
	}
		public class student_gradebook {
		
			public static void main(String[] args) {
				stud1 s1 = new stud1("abc", 12, new int[] {92,85,88,94});
				s1.getAvg();
				s1.get_grade();
			}
		
		}
