package Inheritence;

public class Adress extends Students
{
	String address;
	
	public void SetAddress(String address) 
	{
		this.address=address;
	}
	public String getAddress( ) 
	{
		return address;
	}
	public void DisplayStudent() 
	{
		System.out.println("Name "+name);
		System.out.println("Rolenumber "+rollnumber);
		System.out.println("Address "+address);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Adress ad= new Adress();
		ad.setStudentName("AMAL");
		ad.setRollNumber(41);
		ad.SetAddress("Kochi");
		ad.DisplayStudent();
		
		
	}
}

