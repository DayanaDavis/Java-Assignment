package Sampleprograms;

import java.util.Scanner;

public class BankAccount_26 {
	Scanner sc=new Scanner(System.in);
	static double current_balance=10000;
	static int accountNo=12345;
	
	double deposite(double amt)
	{
		current_balance=current_balance+amt;
		return current_balance;
	}
	void withdraw(double amt)
	{
		if (current_balance>amt)
		{
			current_balance=current_balance-amt;
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	boolean check()
	{
		System.out.println("enter the account no");
		int num=sc.nextInt();
		if(num==accountNo)
			return true;
		else
			return false;
	}
	
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("FEDERAL BANK");
		BankAccount_26 ob=new BankAccount_26();
		int n;
		do
		{
			System.out.println("1.Withdraw");
			System.out.println("2.deposit");
			System.out.println("3.check balance");
			System.out.println("Select the options===>");
			 n=sc.nextInt();
			 switch(n)
			 {
			 case 1:
				 if(ob.check()==true)
				 {
				 System.out.println("enter the amount to withdraw");
				 double amt=sc.nextDouble();
				 ob.withdraw(amt);
				 System.out.println("Balance= "+current_balance);
				 break;
				 }
				 else
				 {
					 System.out.println("wrong accountNo"); 
					 break;
				 }
			 case 2:
				 if(ob.check()==true)
				 {
				 System.out.println("enter the amount to deposite");
				 double amt=sc.nextDouble();
				 ob.deposite(amt);
				 System.out.println("Balance= "+current_balance);
				 break;
				 }
				 else
				 {
					 System.out.println("wrong accountNo"); 
					 break;
				 }
			 case 3:
				 if(ob.check()==true)
				 {
				System.out.println("Balance= "+current_balance);
				 break;
				 }
				 else
				 {
					 System.out.println("wrong accountNo"); 
					 break;
				 } 
			 default:
				 System.out.println("INVALID OPTION");
					 
			 
			 }
		}while(n!=0);
		

	}

}
