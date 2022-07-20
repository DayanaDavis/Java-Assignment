package Sampleprograms;

import java.util.Scanner;

public class AddMatrice_19 
{

	void printMatrice(int a[][])
	{
	for (int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a[i].length-1;j++)
		{
			System.out.print(a[i][j]+" ");	
		}
		System.out.println("");
	}
	
		
	}
	void add(int a[][],int b[][],int r,int c)
	{
		int d[][]=new int[r][c];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				d[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("sum of two matrices");
		printMatrice(d);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and colonms of matrices");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter first"+r+"*"+c+"matrice");
		for(int i=0;i<=r-1;i++)
		{
			for(int j=0;j<=c-1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		AddMatrice_19 a1=new AddMatrice_19();
		int b[][]=new int[r][c];
		System.out.println("enter Second"+r+"*"+c+"matrice");
		for(int i=0;i<=r-1;i++)
		{
			for(int j=0;j<=c-1;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		a1.printMatrice(a);
		System.out.println("********************");
		a1.printMatrice(b);
		a1.add(a,b,r,c);
	}

}
