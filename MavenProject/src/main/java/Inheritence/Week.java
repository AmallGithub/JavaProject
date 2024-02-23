package Inheritence;

public  class Week extends Days
{
	
	int b=20;
	public void display()
	{
	System.out.println("Value of b is"+b);
	}
	
	public Week()
	{
		System.out.println("Child class constructor");
	}
	
	public void show()
	{
		super.show();
		
		System.out.println("parent class variable"+super.a);
		
	}
	
	public static void main(String args[])
	{
	
		Week o= new Week();
		o.show();
		
		
	}
	

}
