package Sampleprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections_42
{
	static ArrayList<String> colors=new ArrayList<String>();

	void addElements(int l)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+l+" elements");
		
		for (int i=0;i<=l-1;i++)
		{
			String s=sc.next();
			colors.add(s);
		}
		
	}
	void printElements()
	{
		System.out.println(colors);	
	}
	void retrieveElement(int index)
	{
		
		System.out.println("Retrievedelement="+ colors.get(index)+" at "+index);
		
	}
	void iterate()
	{
		Iterator<String> it =  colors.iterator();
		 while(it.hasNext())
		 {
			 String str=it.next();
			 System.out.println(str);
		 }
		
	}
	void search(String search)
	{
		int count=0;
		Iterator<String> it =  colors.iterator();
		 while(it.hasNext())
		 {
			 String str=it.next();
			if (str.equalsIgnoreCase(search))
			{
				System.out.println("element found at index of"+colors.indexOf(str));
				count++;
			break;
			}
			
		}
		 if(count==0)
		 {
			 System.out.println("element not found");
		 }
		 
	}
	void remove(int index)
	{
		colors.remove(index);
		
	}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		Collections_42 c1=new Collections_42();
		System.out.println("Enter the no of elements");
		int length=sc.nextInt();
		int index;
		c1.addElements(length);
		c1.printElements();
		System.out.println("Enter index to retrieve elements");
		index=sc.nextInt();
		c1.retrieveElement(index);
		c1.iterate();
		System.out.println("Enter index to delete the elements");
		index=sc.nextInt();
		c1.remove(index);
		c1.iterate();
		System.out.println("Enter element to search");
		String search =sc.next();
		c1.search(search);
	}

}
