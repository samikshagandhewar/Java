package com.studyopedia;
import java.util.*;
//non-static program
/*public class methods_functions{ 	// class declarations should not have parenthesis

		public void greet(String name)
			{
				System.out.println("Good morning "+name);
			}
		
		public static void main(String[] args)
		{
			methods_functions m1 = new methods_functions();
			m1.greet("XYZ");
		}
}*/
//static program
public class methods_functions{
	public static void greet(String name)
	{
		System.out.println("Good morning "+name);
	}
	
	public static void main(String[] args)
	{
		greet("abc");
	}
}
	
	
	
	
	/* functions/methods:
	-> reusable block of code
	-> two types: 1. static: no need to create object       2. non-static: need to create an object creation statement and object
	
	Syntax of non-static:
	public class main{
		access_specifier return_data_type function_name(parameters)
		{
			//block of code
			//return (optional)
		}
	}
	main obj.name = new Main();
	obj_name.function_name(parameter values);
	
	example of non-static:
	public class main{
		public void greet(String name)
		{
			SOP("Good morning"+name);
		}
		
		public static void main(String[] args)
		{
			Main m1 = new Main();
			m1.greet("XYZ");
		}
	Syntax of static:
	public class main{
		access_specifier static return_data_type function_name(parameters)
		{
			//block
			//return
		}
	
	example of static:
	public class main{
		public static void greet(String name)
		{
			SOP("Good morning");
		}
	}
	public static void main(String[] args)
	{
		greet("ABC");
	}
	
		ceooffice@fuelfornation.com
		

*/