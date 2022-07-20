package addDivisionby10_36;

import java.util.Scanner;

import javax.management.remote.SubjectDelegationPermission;

public class Class_2 extends Class_1
{

	void addition(int a,int b)
	{
		System.out.println("total= "+total);
	
	}

	boolean division()
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		super.addition(a, b);
		addition(a, b);
		if((total%10)==0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Class_2 c1=new Class_2();
		if(c1.division())
			System.out.println("Divisible by 10");
		else
			System.out.println("NOT Divisible by 10");
	
	}

}
