package com.studyopedia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Arraylist2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> marks = new ArrayList<>(Arrays.asList());
		
		marks.add(70);
		marks.add(65);
		marks.add(90);
		marks.add(85);
		marks.add(88);
		System.out.println(marks);
		
		marks.set(1, 99);
		System.out.println(marks);
		
		marks.remove(2);
		System.out.println(marks);
		
		marks.remove(3);
		System.out.println(marks);
		
		System.out.println(marks.size());
		
		int sum=0;
		for(int i : marks)
		{
			sum+=i;
		}
		System.out.println(sum);
			
		int percentage = (sum/marks.size());			//we cannot write the formula of percentage somewhere else and print it somewhere else, 
																	//the input and output of a particular thing should be in the same block.
		System.out.println("Percentage: "+percentage);
		
		
	}

}
