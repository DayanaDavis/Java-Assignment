package Sampleprograms;

import java.util.Scanner;

public class LinearSearch_20 {
	

	public static void main(String[] args) {
		System.out.println("Enter the length of a array");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int a[]=new int[length];
		int index=0;
		int count=0;
		System.out.println("Enter "+length+" numbers to the array");
		for (int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int search=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				index=i;
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(search+" find at the position "+index);
		}
		else
		{
			System.out.println(search+" not found");	
		}
	}

}
