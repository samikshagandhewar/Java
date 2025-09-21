package com.studyopedia;
import java.util.*;
public class arraylist_methods 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
		arr.add(6);
		System.out.println(arr);
		
		arr.add(0, 24);
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		
		arr.set(2,  54);
		System.out.println(arr);
		
		arr.remove(0);
		System.out.println(arr);
			
		System.out.println(arr.size());
		
		System.out.println(arr.isEmpty());
		
		System.out.println(arr.contains(1));
		
		arr.clear();
		System.out.println(arr);
		
		System.out.println(arr.isEmpty());
	}
}
/*common ArrayList methods:
1. add(element): adds at end
2. add(index, element): adds at specific index*
3. get(index):returns element at index
4. set(index, element): replaces element at index
5. remove(index): removes element at index
6. size: returns size
7. clear()/: removes all elements
8. contains(element): checks if element present in arraylist
9. isEmpty():checks if list is empty or not
*/