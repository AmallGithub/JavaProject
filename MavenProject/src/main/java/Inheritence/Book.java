package Inheritence;

public class Book 
{
    protected int a=10;
    protected void show()
	{
		System.out.println("Value of a is"+a );
	}
	
	public static void main(String args[])
	{
		Book ob= new Book();
		ob.show();
		
	}

}
