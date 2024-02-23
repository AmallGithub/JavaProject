package Inheritence;

public class StringPal 

{
	
	public void CheckPal(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		
		StringBuffer s1=sb.reverse();
		//StringBuffer ob1=sb2.reverse();
		System.out.println(s);
		String st=s1.toString();
		
		if(s.equalsIgnoreCase(st))
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not a Palindrome");
		
		}
	}
		
	
	public static void main(String args[])
	{
	 
		StringPal ob= new StringPal();
		ob.CheckPal("JAVA");
		ob.CheckPal("MALAYALAM");
		
	

	
	}
			

}
