package Inheritence;

public class StringPall 

{
	
	public void CheckPal(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		//StringBuffer sb2=new StringBuffer("Malayalam");
		
		//System.out.println("The reverse of the string is "+sb.reverse());
		//System.out.println("The reverse of the string is "+sb2.reverse());
		
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
	 
		StringPall ob= new StringPall();
		ob.CheckPal("JAVA");
		ob.CheckPal("MALAYALAM");
		
	

	
	}
			

}
