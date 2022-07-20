package Sampleprograms;

import java.util.Scanner;

public class Area_31 
{
	double area;
	void area(float r)
	{
		area=(3.14*r*r);
		System.out.println("Circle area="+area);
		
	}
	void area(double a)
	{
		area=(a*a);
		System.out.println("Square area="+area);
	}
	void area(float a,float b)
	{
		area=(a*b);
		System.out.println("Rectangle area="+area);
	}
	


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Area_31 a1=new Area_31();
		char n;
		
		do
		{
			System.out.println("a.Circle Area");
			System.out.println("b.rectangle area");
			System.out.println("c.square area");
			System.out.println("Select the options===>");
			 String s=sc.next();
			 n=s.charAt(0);
			 switch(n)
			 {
			 case 'a':
				 System.out.println("Enter the radius of a circle");
				 float r=sc.nextFloat();
				 a1.area(r);
				 break;
			 case 'b':
				 System.out.println("Enter the length and breadth of rectangle");
				 float l=sc.nextFloat();
				 float b=sc.nextFloat();
				 a1.area(l,b);
				 break;
			 case 'c':
				 System.out.println("Enter the side of a square");
				 double a=sc.nextDouble();
				 a1.area(a);
				 break;
			 default:
				 System.out.println("INVALID OPTION");
				 System.out.println("Select the correct option");
			 
			 }
		}while(n!=0);
		

	}

}
