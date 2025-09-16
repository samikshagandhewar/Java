package com.studyopedia;

public class ex10_array {

	public static void main(String[] args) {
		int arr[]= {45,24,19,75,31,28};
		
		int max = arr[0];
		int min = arr[0];
		int index = -1;
		int index1 = -1;
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				index = i;
			}
			if(min>arr[i])
			{
				min=arr[i];
				index1 = i;
			}
		}
		System.out.println(max+" "+index);
		System.out.println(min+" "+index1);	
	}
}
