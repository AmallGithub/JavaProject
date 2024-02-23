package Abstraction;

public abstract class Employeess
{
	public String name;
	public double salary;
	
	
	public Employeess(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public abstract double calculateSalary();

}
