package Abstraction;

public abstract class NewEmp 
{
	String name;
	double salary;
	
	public NewEmp(String name,double Salary)
	{
		this.name=name;
		this.salary=salary;
	
	}
	
	public abstract double calculateSalary();

}
