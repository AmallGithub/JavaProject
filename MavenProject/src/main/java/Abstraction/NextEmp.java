package Abstraction;

public class NextEmp extends NewEmp
{
	public double workingHours;
	public double paymentHours;
	
	public NextEmp(String name, double Salary,double workingHours, double paymentHours ) 
	{
		super(name, Salary);
		this.workingHours=workingHours;
		this.paymentHours=paymentHours;
	}
	
	public double calculateSalary()
	{
		return workingHours*paymentHours;
	}

}
