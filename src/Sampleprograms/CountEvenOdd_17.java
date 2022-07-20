package Sampleprograms;

public class CountEvenOdd_17 {

	public static void main(String[] args) 
	{
		int even=0,odd=0;
		for(int i=10;i<=20;i++)
		{
			if(i%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println(even+" even numbers");
		System.out.println(odd+" odd numbers");

	}

}
