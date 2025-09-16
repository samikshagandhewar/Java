package com.studyopedia;

public class occurrences_of_1 {

	public static void main(String[] args) {
		int arr[]= {1,2,1,32,3,1,1,1,4,1,5,3,6,1,8,1};
		
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==1)
			{
				count+=1;
			}
		}
		System.out.println(count);		
	}

}
