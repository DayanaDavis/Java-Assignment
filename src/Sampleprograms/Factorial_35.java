package Sampleprograms;

import java.util.Scanner;

public class Factorial_35 
{
	int fact=1;
	void findFactorial(int num)
	{
		for(int i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		printResult(num);
		
	}
	void printResult(int num)
	{
		System.out.println(num+"! ="+fact);	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find the factorial");
		int num=sc.nextInt();
		Factorial_35 f1=new Factorial_35();
		f1.findFactorial(num);
		

	}

}
