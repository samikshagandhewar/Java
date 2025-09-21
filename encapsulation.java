package com.studyopedia;

class Teacher
		{
			private int salary;
			String name;
			
			Teacher( int salary, String name)
			{
				this.salary=salary;
				this.name=name;
			}
			public void getter()
			{
				System.out.println(salary);
			}
			public void setSalary(int sal)
			{
				this.salary=sal;
			}
		}
			public class encapsulation 
			{
				public static void main(String[] args) 
				{
					Teacher t1 = new Teacher(5000, "XYZ");
					t1.getter();
					t1.setSalary(5000);
				}
			}
