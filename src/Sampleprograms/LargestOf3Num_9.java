package Sampleprograms;

import java.util.Scanner;

public class LargestOf3Num_9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if((num3>num1)&&(num3>num2))
		{
			System.out.println(num3 +"is the largest number");
		}
		else if((num2>num3)&&(num2>num1))
		{
			System.out.println(num2 +"is the largest number");	
		}
		else
		{
			System.out.println(num1 +"is the largest number");	
		}
		

	}

}
