

import Inheritence.SampleInterface;

public class SampleClass implements SampleInterface
{
	public void show()
	{
		System.out.println("MAXVALUE");
	}
	public void print()
	{
		System.out.println("MINVALUE");
	}



public static void main(String args[])
{
	SampleInterface ob= new SampleClass();
	ob.show();
	ob.print();
}
}
