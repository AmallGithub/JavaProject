package Inheritence;

public class Babydog extends Dog
{
	int c=18;
	public void color()
	{
		System.out.println("subclass 2 value is"+c);
	}
	
	public static void main(String args[])
	{
		Babydog ob1=new Babydog();
		ob1.eat();
		ob1.sleep();
		ob1.color();
		System.out.println("a is"+ob1.a);
		System.out.println("b is"+ob1.b);
		System.out.println("c is"+ob1.c);
		
	}

}
