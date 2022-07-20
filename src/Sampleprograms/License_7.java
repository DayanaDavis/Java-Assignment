package Sampleprograms;

import java.util.Scanner;

public class License_7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name");
		String name=sc.next();
		System.out.print("Enter Age");
		float age=sc.nextFloat();
		if(age>=18)
		{
			System.out.print(name+ " is eligible for license");
		}
		else
		{
			System.out.print(name+ " is not eligible for license");
		}
		

	}

}
