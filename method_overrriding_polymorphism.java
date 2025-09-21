package com.studyopedia;
	class maths
	{
		public void add(int a, int b)
		{
			System.out.println(a+b);
		}
	}
	class add extends maths
	{
		public void add(int a, int b)
		{
			System.out.println(a*b);
		}
	}
	public class method_overrriding_polymorphism {
	
		public static void main(String[] args) {
			add m1 = new add();
			maths m2 = new maths();
			m1.add(8, 9);
			m2.add(7, 8);
	
		}
	
	}
