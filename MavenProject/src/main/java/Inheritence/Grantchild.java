package Inheritence;//multiple inheritence

public class Grantchild extends Parent
{
	int m=2;
	public void name()
	{
		System.out.println("The age of grantchild is "+m);
	}
	
	public static void main(String args[])
	{
		Grantchild ob1=new Grantchild();
		Child ob2=new Child();
		ob1.age();
		ob2.color();
		ob1.name();
		ob2.age();
		
		
		
	}

}
