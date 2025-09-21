package com.studyopedia;

	class SecureFile
	{
		private String password;
		public String username;
			
		SecureFile(String password, String username)	//parameterized constructor
		{
			this.password=password;
			this.username=username;
		}
		
		public void printpass()				//getter
		{
			System.out.println("Old password: " + password);
		}
		
		public void updatepass(String new_pass)		//setter
		{
			this.password=new_pass;
			System.out.println("New password: "+new_pass);
		}
	}
	public class password_protected_file {
	
		public static void main(String[] args) {
			SecureFile p1 = new SecureFile("Abc@1234", "abc123");		//object creation
			
			p1.printpass();
			System.out.println();
			p1.updatepass("Abc_123");
		}
	
	}
