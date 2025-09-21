package com.studyopedia;
class student12
	{
		private String name;
		private int rno;
		private int marks;
		
		student12(String name, int rno, int marks)
		{
			this.name=name;
			this.rno=rno;
			this.marks=marks;
		}
			
		public void setMarks(int marks)
		{
			this.marks=marks;						//in setter block, we always write like this only (this.marks=marks;) because we are accessing that value from the private block
													//setter is used to access the private block publicly
		}
		
		public void getMarks()
		{
			System.out.println(marks);				//getter is used to print the data inside the private block/file
		}
		
		public void displayDetails()
		{
			System.out.println(name+" "+rno+" "+marks);
		}
	}
		public class student_encapsulation 
		{
			public static void main(String[] args) 
			{
				student12 s1 = new student12("abc", 01, 35);
				s1.setMarks(35);
				s1.getMarks();
				s1.displayDetails();
		
			}
		}
