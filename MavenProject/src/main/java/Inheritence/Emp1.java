package Inheritence;

public class Emp1 
{
	float salary,deduction,bonus;

	public void setBasicPay(float salary) 

	{
		 this.salary=salary;
	}
	public float getBasicPay() 
	{
		 return salary;
	}
	public void setDeduction(float deduction)
	{
		this.deduction= deduction;
	}
	public float getDeduction()
	{
		return deduction=salary-1000;
	}
	public void setBonus(float bonus)
	{
		this.bonus=bonus;
	}
	public float getBonus() 
	{
		return bonus=salary * 15/ 100 ;
	}
}