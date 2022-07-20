package Sampleprograms;

import java.util.Scanner;

public class Amstrong_15 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int temp;
		int reverse=0;
		do
		{
			
			temp=num%10;
			num=num/10;
			
			reverse=(reverse+(temp*temp*temp));
		
			
		}while(num!=0);
		if(num1==reverse)
		{
			System.out.println(num1+ " is a amstrong number");
		}
		else
		{
			System.out.println(num1+ " is not a amstrong number");
		}

	}

}
