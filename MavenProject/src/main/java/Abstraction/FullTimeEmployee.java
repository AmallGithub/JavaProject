package Abstraction;

public class FullTimeEmployee  extends Employeess 
{
    public int CONST=8;
    
    
	public FullTimeEmployee(String name, double salary) 
	{
		super(name, salary);
		
		
	}
	public double calculateSalary()
	{
		return salary*CONST;
	}



public static void main(String args[])
{
	Employe ob =new Employe("Amal",10000,200,200);
	FullTimeEmployee ob1= new FullTimeEmployee("Rijo",10000);
	System.out.println("Employee Salary is"+ob.calculateSalary());
	System.out.println("Full time Employee Salary is"+ob1.calculateSalary());

	
}
}
