package Inheritence;

public class Emp2 extends Emp1
{
	float hra,pf;
	
	public void setHra(float hra) 
	{
		this.hra=hra;
	}
	public float getHra() 
	{
		return hra=(float) (0.5*salary);
	}
	public void setPf(float pf)
	{
		this.pf=pf;
	}
	public float getPf() 
	{
		return pf=(float) (.20*salary);
	}
}