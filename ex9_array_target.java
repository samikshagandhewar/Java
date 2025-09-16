//linear search		TC=O(n)
package com.studyopedia;

public class ex9_array_target {

	public static void main(String[] args) {
		int arr[] = {4,5,7,8,9,1,2,45,41,35};
		
		int target = 45;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				System.out.println(i);
				break;			//not necessary, but if the target element is present more than once than it is required
			}
		}

	}

}
