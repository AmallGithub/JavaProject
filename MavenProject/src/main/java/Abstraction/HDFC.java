package Abstraction;

public class HDFC implements RBI
{

	public double amount;
	public int duration;
	
	public double recurringDeposit(double amount,int duration)
	{
		
		double interest=amount*interestRate*amount;
		
		double tot_Amount= amount+interest;
		
		return tot_Amount;
		
				
				
	}
	
	
public static void main(String args[])
{
	HDFC ob =new HDFC();
	double dep_amount=1000;
	int dep_duration=5;
	double tot_Amount=  ob.recurringDeposit(dep_amount, dep_duration);
	System.out.println("Amount after  "+dep_duration + "years is" +tot_Amount);
	
}
}
