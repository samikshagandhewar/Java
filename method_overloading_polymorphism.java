package com.studyopedia;
		class multiply
		{
			public void mul(int a, int b)
			{
				System.out.println(a*b);
			}
			
			public void mul(int a, int b, int c)
			{
				System.out.println(a*b*c);
			}
			
		}
		public class method_overloading_polymorphism {
		
			public static void main(String[] args) {
				multiply m1 = new multiply();
				m1.mul(15, 8, 3);
		
			}
		
		}
//this same example is for operator overloading
		
/*		public class method_overloading_polymorphism 
		{
			public static void main(String[] args) {
				int a = 10, b = 20;
		        System.out.println(a + b); // + acts as addition
		
		        String s1 = "Hello", s2 = " World";
		        System.out.println(s1 + s2); // + acts as concatenation
			}
		}*/