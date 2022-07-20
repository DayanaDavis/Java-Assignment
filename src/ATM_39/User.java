package ATM_39;

import java.util.Scanner;

public class User extends Bank
{
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
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("********FEDERAL BANK********");
		User u1=new User();
	
	System.out.println("enter the pin");
	int pin=sc.nextInt();
	if(u1.ValidatePin(pin))
	{
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
				 
				 System.out.println("enter the amount to withdraw");
				 double amt=sc.nextDouble();
				 u1.withdraw(amt);
				 System.out.println("Balance= "+current_balance);
				 break;
				 
			 case 2:
				 
				 System.out.println("enter the amount to deposite");
				 double amt1=sc.nextDouble();
				 u1.deposite(amt1);
				 System.out.println("Balance= "+current_balance);
				 break;
				
			 case 3:
				 
				System.out.println("Balance= "+current_balance);
				 break;
				 
			 default:
				 System.out.println("INVALID OPTION");
					 
			 
			 }
		}while(n!=0);
			
	}
	else
	{
		System.out.println("Invalid pin");
	}

	}

}
