package Abstraction;

public class FinalEmp extends NewEmp
{
	public int CONST=8;
	
	public FinalEmp(String name,double salary)
	{
		super(name,salary);
	}
	
	
    
	public double calculateSalary()
	{
		
		return salary*CONST;
	}
	
	

	public static void main(String args[])
	{
		
		NextEmp obj= new NextEmp("Amal",10000,200,400);
		FinalEmp obc = new FinalEmp("JAMAL",111);
		
		System.out.println("Salary of emp is"+obj.calculateSalary());
		System.out.println("Salary of final emp is"+obc.calculateSalary());

		
		
	}
}
