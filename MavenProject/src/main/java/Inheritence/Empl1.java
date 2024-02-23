package Inheritence;
import java.util.Scanner; 

public class Empl1 
{
	float bPay,deduction,bonus;
	
	void getInput() 
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter basic pay: ");
        bPay = s.nextFloat();
        System.out.print("Enter deduction: ");
        deduction = s.nextFloat();
        System.out.print("Enter bonus: ");
        bonus = s.nextFloat();
        
	}
}	


