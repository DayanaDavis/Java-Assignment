package Sampleprograms;

import java.util.Scanner;

public class BubbleSort_21 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the length of a array");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int a[]=new int[length];
		
		int temp=0;
		System.out.println("Enter "+length+" numbers to the array");
		for (int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
			if(a[j-1]>a[j])
			{
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println("******Sorted Array*******");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");	
		}

	}

}
