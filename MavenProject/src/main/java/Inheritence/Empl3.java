package Inheritence;

public class Empl3 extends Empl2
{
	void generateSalarySlip() 
	{
        double totalSalary = bPay + hra - pf - deduction + bonus;

        System.out.println("\nSalary Slip");
        System.out.println("Basic Pay: " + bPay);
        System.out.println("Deduction: " + deduction);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

	public static void main(String args[])
	{
		Empl3 ob1= new Empl3();
		ob1.getInput();
		ob1.calculate();
		ob1.generateSalarySlip();
		
		
		
	}

}	
