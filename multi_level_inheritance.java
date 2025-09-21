package com.studyopedia;
	class animal
	{
		public void animal()
		{
			System.out.println("I am an animal");
		}
	}
	
	class dog extends animal
	{
		public void dog()
		{
			System.out.println("I am a dog");
		}
	}
	
	class puppy extends dog
	{
		public void puppy()
		{
			System.out.println("I am a puppy");
		}
	}
	public class multi_level_inheritance 
	{
	
		public static void main(String[] args) 
		{
			puppy p1 = new puppy();
			p1.puppy();
			p1.dog();
			p1.animal();
		}
	
	}
