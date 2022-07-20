package Sampleprograms;

public class AvgArea_28 
{
	float total_1;
	double area=0;
	float avg=0;
	void avg(int a,int b,int c)
	{
		total_1=a+b+c;
		System.out.println("Sum="+total_1);
		avg=total_1/3;
		System.out.println("Avg="+avg);
		
	}
	void avg(float a,float b, float c)
	{
		total_1=a+b+c;
		System.out.println("Sum="+total_1);
		avg=total_1/3;
		System.out.println("Avg="+avg);	
	}
	void area(double r)
	{
		area=(3.14*r*r);
		System.out.println("Circle area="+area);
		
	}
	void area(int a)
	{
		area=(a*a);
		System.out.println("Square area="+area);
	}
	void area(int a,int b)
	{
		area=(a*b);
		System.out.println("Rectangle area="+area);
	}
	

	public static void main(String[] args) 
	{
		AvgArea_28 a1=new AvgArea_28();
		a1.avg(10,20,40);
		a1.avg(12.4f, 12.0f, 34.50f);
		a1.area(10);
		a1.area(10.0);
		a1.area(12,13);
	}

}
