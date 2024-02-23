package Abstraction;

public class HDFCM implements RBIM
{
	double amount;
	int duration;
	
	public double reccurring_Dep(double amount,int duration)
	{
		double interest= amount*duration*interst_Rate;
		
		double tot_Amount=amount+interest;
		
		return tot_Amount;
	}
	

  public static void main(String args[])
  {
	  HDFCM ob= new HDFCM();
	  double amount =10000;
	  int duration=6;
	  Double total_amount=ob.reccurring_Dep(amount, duration);
	  System.out.println("The deposited amount after "+ duration +"years is "+total_amount);
	  
  }
}
