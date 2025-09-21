package com.studyopedia;

	class v
	{
		String name;
		int price;
		
		v(String name, int price){
			this.name = name;
			this.price = price;
			
		}
	}
	class Toyota extends v{
		Toyota(String name, int price){
			
			super(name,price);
			
		}
	}
	class Suzuki extends v{
		Suzuki(String name, int price){
			super(name,price);
		}
		
	}
	
	public class hierarchical_ex {
	         
		public static void main(String[] args) {
			
			Toyota t1 = new Toyota("Fortuner",5000000);
			Suzuki s1 = new Suzuki("Suzuki",800000);
			System.out.println(t1.name+" "+t1.price);
			System.out.println(s1.name+" "+s1.price);
			
		}
	}
/*hybrid inheritance - mix of all other inheritances*/
 