package Inheritence;




public class Car extends Vehicle {
	
	int c=16;
	
	public void show()
	{
		System.out.println("child class method");
	}
	
	
	public static void main(String args[])
	{
		
		Car ob1=new Car();
		ob1.show();
		ob1.display();
		System.out.println("Value of a is"+ob1.a);
		System.out.println("Value of c is"+ob1.c);
		

		
	}
	
	
	

}

