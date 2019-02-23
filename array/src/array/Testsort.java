package array;

import java.util.Scanner;

public class Testsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	
	//public static void accept()
//	{
		int arr[]=new int[5];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many no.s u want to enter:");
			
		for(i=0;i<arr.length;i++)
		arr[i]=sc.nextInt();
		
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]){
				
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			//System.out.println(arr[j]);
		}
		for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
	//}

	}
}
	
