package Inheritence;
import java.util.*;

public class ATM 





{
	private int pin_no;
	
	
	public int setter(int pin_no)
	{
		
		
		this.pin_no=pin_no;
		return pin_no;
		
	}

	public void getter()
	{
		System.out.println("Pin Numberis :"+pin_no);
		
	}
	
	public void validatepin(int pin_no)
	{
			
		if( (pin_no==1001|pin_no==1234|pin_no==1212))
		{
			System.out.println("Validated");
			withdraw();
		}
		else
		{
			System.out.println("Wrong");
		}
	}		
	
	public void withdraw()
	{
		int bal=5000;
		
		System.out.println("Current balance is"+bal);

		System.out.println("Enter the Amount you need to Withdraw?");
		
		Scanner sb= new Scanner(System.in);
		int amount=sb.nextInt();
		bal=bal-amount;
		System.out.println("Balance after withdrawal is"+bal);
		
		
		
		
		
		
	}
		
	

}
