package com.studyopedia;
import java.util.*;
	class parent
	{
		public void speaks()
		{
			System.out.println("speaks");
		}
	}
	class child extends parent
	{
		public void talk()
		{
			System.out.println("talks");
		}
	}
	
	public class single_level_inheritance 
	{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			child c1 = new child();
			c1.speaks();
			c1.talk();
		}
	}
	
/*types of inheritance in java:
	1. single
	2. multi-level
	3. hierarchical
	4. hybrid
	
	**Java does not support multiple inheritance(in which multiple parent classes inherit a single child class),
	but other programming languages contain it*/
