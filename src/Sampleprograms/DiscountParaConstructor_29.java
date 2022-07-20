package Sampleprograms;

import java.util.Scanner;

public class DiscountParaConstructor_29 
{

	
	static double amount=0;
	static double total=0;

	public DiscountParaConstructor_29(double b[])
	{
		
		for(int i=0;i<=b.length-1;i++)
		{
			total=total+b[i];
		}
		
	}
	
	void discount()
	{
		if(total>5000)
		{
			System.out.println("Total amount="+total);
			System.out.println("Discount= "+(total*0.2));
			amount=total-(total*0.2);
			
		}
		else
		{
			System.out.println("Total amount="+total);
		    amount=total;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		int length=sc.nextInt();
		System.out.println("Enter "+length+" item prices");
		double a[]=new double[length];
		for(int i=0;i<=length-1;i++)
		{
			a[i]=sc.nextDouble();
		}
		
		DiscountParaConstructor_29 d1=new DiscountParaConstructor_29(a);
		d1.discount();
		System.out.println("amount to pay= "+amount);
		
	}

}
