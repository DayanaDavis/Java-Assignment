package discount_38;

import java.util.Scanner;

public class OffSeason extends OnSeason
{
	public void discount(float amt)
	{
		discount=amt*0.15;
		pay_amount=(amt-discount);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the season");
		
		OffSeason s1=new OffSeason();
		
			System.out.println("1-Offseason");
			System.out.println("2-Onseason");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Enter the amount");
				float amt=sc.nextFloat();
				s1.discount(amt);
				System.out.println("Amount to pay after discount: "+pay_amount);
				break;
				
			case 2:
				System.out.println("Enter the amount to pay");
				double amount=sc.nextDouble();
				s1.discount(amount);
				System.out.println("Amount to pay after discount: "+pay_amount);
				break;
			default:
				System.out.println("Choose the correct option");
				break;
			}
		
	}

}
