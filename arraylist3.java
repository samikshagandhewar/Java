package com.studyopedia;
import java.util.*;
public class arraylist3 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,2,4,5,7,6,4,4,3,5,4,8,4,8));
		System.out.println(arr);
		ArrayList<Integer> dup = new ArrayList<>();
		for(int i : arr)
		{
			if(!dup.contains(i))
			{
				dup.add(i);
			}
		}
		System.out.println(dup);
	}
}
