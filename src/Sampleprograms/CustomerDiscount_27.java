package Sampleprograms;

import java.util.Scanner;

public class CustomerDiscount_27 
{
	static double amount=0;

	double total(double b[])
	{
		double total=0;
		for(int i=0;i<=b.length-1;i++)
		{
			total=total+b[i];
		}
		return total;
	}
	
	void discount(double total)
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
		CustomerDiscount_27 c1=new CustomerDiscount_27();
		double total=c1.total(a);
		c1.discount(total);
		System.out.println("amount to pay= "+amount);
		
	}

}
