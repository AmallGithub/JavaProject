package Inheritence;

public class Audine extends Google
{
	public void image()
	 {
		 System.out.println("Abstract method 2 calling");
		 
	 }
	 public void audio()
	 {
	 	System.out.println("Abstarct method 2 calling");
	 }
public void display()
{
	System.out.println("Non abstract method");
}



public static void main(String args[])
{
	Audine ob=new Audine();
	Imagine ob2=new Imagine();
	ob.image();
	ob.audio();
	ob2.image();
	ob2.audio();
	ob.display();
}
}