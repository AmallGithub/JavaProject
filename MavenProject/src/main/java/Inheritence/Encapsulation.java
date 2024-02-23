package Inheritence;

public class Encapsulation 
{
	private String name;
	private int accno;
	private String address;
	
public void setter(String name,int accno,String address)
{
	this.name=name;
	this.accno=accno;
	this.address=address;
}

public void getter()
{
	System.out.println("Name is"+name);
	System.out.println("Accno is"+accno);
	System.out.println("Address is"+address);
	
}

}



