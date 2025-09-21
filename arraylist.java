package com.studyopedia;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		//arraylist=dynamic size arrays
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println(arr);
		//ArrayList<data_type> name = new ArrayList<>();						//similar to array:-> in array: int arr[]= new int{1,2,3,4};
		//wrapper classes: Integer, Boolean, String, FLoat, Character etc.
		
		//In Java, a wrapper class is a class that wraps (encapsulates) a primitive data type into an object.
		//Since primitives like int, char, boolean are not objects, Java provides wrapper classes so that these
		//values can be treated like objects when needed (e.g., in collections like ArrayList which work only with objects).
	}
	

}
