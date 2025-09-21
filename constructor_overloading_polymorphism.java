package com.studyopedia;
class student123
	{
		String name;
		int age;
		
		student123()
		{
			System.out.println("Constructor is called");
		}
		
		student123(String name)
		{
			System.out.println("Second constructor");
			this.name = name;
		}
		
		student123(String name, int age)
		{
			System.out.println("Third constructor");
			this.name=name;
			this.age=age;
		}
	}
		public class constructor_overloading_polymorphism {
	
		public static void main(String[] args) {
			student123 s1 = new student123();
			student123 s2 = new student123("abc");					//constructor is only passed in the object creation statement
			student123 s3 = new student123("pqr", 15);	
			//s2.student123("Abc");										//methods are passed while making objects
		}
	
	}
	
		/*polymorphism  = poly -> many ; morphism -> forms
		 1. compile time polymorphism : Which method will run is known before program execution
		 	-constructor overloading: multiple constructors in the same class but with different parameter lists.
		 	-method overloading: multiple methods with the same name in a class but different parameter lists
		 	-operator overloading
		 	
		 2. runtime polymorphism : Which method will run depends on the object type, not the reference
		 	-method overriding*/
		 