package com.studyopedia;

public class ex11_array {

	public static void main(String[] args) {
		int arr[]= {47,41,58,28,43,39,89,70};
		
		int index = 0;
		for(int i : arr)
		{
			if(i%7==0)
			{
				System.out.println(i+" "+index);
				break;
			}
			index++;
		}
		
		
	}

}
