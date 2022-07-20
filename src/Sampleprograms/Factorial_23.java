package Sampleprograms;

import java.util.Scanner;

public class Factorial_23 {

	public static void main(String[] args)
	{
		System.out.println("Enter a number to find the factorial");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (num==0)
		{
			System.out.println("Factorial of "+num+" is 1");	
		}
		else
		{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
		
		}
	}

}
