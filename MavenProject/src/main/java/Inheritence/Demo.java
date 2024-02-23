package Inheritence;

public  class Demo extends Samples
	{ 
		public void show()
		{
			System.out.println("Implementation of Abstract method");
			
		}
	
		public static void main(String args[])
		{
			Demo ob=new Demo();
			
			ob.show();
			ob.disp();
		}
		
	}