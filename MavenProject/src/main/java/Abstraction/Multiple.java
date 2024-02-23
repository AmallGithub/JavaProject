package Abstraction;

public class Multiple implements SampleInterfaces,Trees
{
	public  void show()
	{
		System.out.println("MAXVALUE1");	
	}

	public  void print()
	{
		System.out.println("MINVALUE1");
		
	}
	
	public  void shows()
	{
		System.out.println("MAXVALUE2");	
	}

	public  void prints()
	{
		System.out.println("MINVALUE2");
		
	}
	
	public void name()
	{
		System.out.println("Name");
		
	}
	
	public static void main(String args[])
	{
		Multiple ob= new Multiple();
		ob.show();
		ob.print();
		ob.shows();
		ob.prints();
		ob.name();
	}
	
	
	
}
