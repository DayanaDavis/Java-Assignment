package Sampleprograms;

public class NameAge_22 {
	
	static String name;
	static int age;
	static void setNameAge(String n,int a)
	{
		name=n;
		age=a;
		
	}
	
	static void getNameAge()
	{
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) 
	{
	setNameAge("dayana", 27);
	getNameAge();
	setNameAge("Evaan", 2);
	getNameAge();
	setNameAge("Jose",33);
	getNameAge();

	}

}
