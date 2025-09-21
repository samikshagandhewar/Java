package com.studyopedia;
import java.util.*;
public class arraylist1 {

	public static void main(String[] args) {
		/*ArrayList<String> arr = new ArrayList<>(Arrays.asList());
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		arr.add("e");
		
		for(String i : arr)
		{
			System.out.println(i);
		}*/
		// for each loop is used when we have the elements to print, we are not giving user input for the elements
		
		//when we are giving user input for the elements, we use for loop
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			System.out.println("Enter names: ");
			String name = sc.nextLine();			// here we have used the scanner for to take input of names and then print names in the arraylist
			System.out.println(name);
		}
		
		//or

		/*ArrayList<String> names = new ArrayList<>(Arrays.asList());
		{
			Scanner sc = new Scanner(System.in);
			for (int i=0; i<5; i++)
			{
				System.out.println("Enter element at index "+i);
				String element = sc.nextLine();
				names.add(element);					//here we have used the arraylist method arraylist_name.add(elements to be added) to add names in the arraylist
			}
			System.out.println(names);
		}*/
		
	}

}
