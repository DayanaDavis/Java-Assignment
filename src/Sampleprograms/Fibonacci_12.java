package Sampleprograms;

import java.util.Scanner;

public class Fibonacci_12 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of fibonacci series");
		int n=sc.nextInt();
		int first=0;
		int second=1;
		int third;
		System.out.println("*****Fibonacci Series******");
		System.out.println(first);
		System.out.println(second);
		
		for(int i=1;i<=n-2;i++)
		{
			third=first+second;
			first=second;
			second=third;
			System.out.println(third);
			
		}

	}

}
