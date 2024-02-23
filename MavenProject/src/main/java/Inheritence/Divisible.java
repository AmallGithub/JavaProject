package Inheritence;

public class Divisible extends ClassSum 
{
	int result1,result;
	public Divisible(int a,int b)
	{
		super(a,b);
	}
	public int addition() 
	{
		return result1=a+b;
	}
	public int checkDivisible() 
	{	
		 if (result1 % 10 == 0) 
		 {
	 System.out.println(+result1+"is Divisible by 10");
	 return result1;
		 }else 
		 {
	 return 0;
		 }
		 }
	public void display() 
	{
		System.out.println("sum ==>"+result1);	
	}
	
	public static void main(String[] args)
	{
		Divisible s=new Divisible(20,10);
		s.addition();
		s.display();
		s.checkDivisible();
		
	
	}
}

