package Sampleprograms;

import java.util.Scanner;

public class ArraySum_18 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the length of a array");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int a[]=new int[length];
		int sum=0;
		System.out.println("Enter "+length+" numbers to the array");
		for (int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum= "+sum);
		
		
	}

}
