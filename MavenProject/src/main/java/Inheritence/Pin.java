	package Inheritence;
	import java.util.*;
	
	public class Pin 
	
	{
		public static void main(String args[])
		{
		
		ATM ob=new ATM();
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Pin Number");
		int c=s.nextInt();
		ob.setter(c);
		ob.getter();
		ob.validatepin(c);
		ob.withdraw();
		
		
		
		
		
	
	}
	}
