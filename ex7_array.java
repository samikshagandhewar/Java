package com.studyopedia;

public class ex7_array {

	public static void main(String[] args) {
		int arr[]= {10,20,31,40,50,60,70};
		
		int sum=0;
		int index=-1;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
			if(sum>=100)
			{
				index=i;
				break;
			}
		}
		System.out.println("index = "+index+", sum = "+sum);
		
	}

}
