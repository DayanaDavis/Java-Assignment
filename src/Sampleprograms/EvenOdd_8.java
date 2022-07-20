package Sampleprograms;

import java.util.Scanner;

public class EvenOdd_8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		float num=sc.nextFloat();
		if(num%2==0)
		{
			System.out.print(num+" is a even number");	
		}
		else
		{
			System.out.print(num+" is a Odd number");
		}
		

	}

}
