package com.studyopedia;
import java.util.Scanner;
public class diagonal_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int arr[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];					// we will use arr[i][j] to add to sum, not i or j individually as this is for loop
				}
				
				else if(j==(arr.length-1)-i)		//to check secondary diagonal, we will use the logic (length of array - 1) - i ;
				{
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);
		
		
	}

}
