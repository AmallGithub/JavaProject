package Inheritence;

public class Emp3 extends Emp2 {
	
	float totalSalary;
	public void setTotalSalary(float totalSalary) 
	{
		
		this.totalSalary=totalSalary;
	}
	
	public float getTotalSalary() 
	{
		return totalSalary= salary + hra - pf - deduction + bonus;
	}
	
	public void salarySlip() 
	{
		System.out.println("Basic pay "+salary);
		System.out.println("Deduction "+deduction);
		System.out.println("hra "+hra);
		System.out.println("pf "+pf);
		System.out.println("Bonus "+bonus);
		System.out.println("Total salary x"+totalSalary);
	}
	public static void main(String args[])
	{
		Emp3 c3=new Emp3();
		c3.setBasicPay(50000);
		c3.getDeduction();
		c3.getHra();
		c3.getPf();
		c3.getBonus();
		c3.getTotalSalary();
		c3.salarySlip();
//		/c3.getDeduction();
		}
}

