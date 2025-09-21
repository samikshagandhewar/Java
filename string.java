package com.studyopedia;

public class string {

	public static void main(String[] args) {
		
		/*String string_name = "value";
		String string_name = new String("value");*/
		
		String str = "Hello";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(1, 3));
		
		boolean  S = str.contains("abc");
				System.out.println(S);
				String st = str.replace("l", "n");
				System.out.println(st);

	}
	
}
