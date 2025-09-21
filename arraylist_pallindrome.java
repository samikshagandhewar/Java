package com.studyopedia;
import java.util.*;
public class arraylist_pallindrome 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,2,1));
		ArrayList<Integer> dup = new ArrayList<>();
		System.out.println(arr);
		
		//int reversed = 0;
		for(int i=arr.size()-1; i>=0; i--)
		{
			dup.add(arr.get(i));
		}
		
		if(arr.equals(dup))
		{
			System.out.println("ArrayList is pallindrome");
		}
		else
		{
			System.out.println("ArrayList is not pallindrome");
		}	
	}
}
