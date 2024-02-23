package Abstraction;

public class Employe extends Employeess
{
 public double paymentHour;
 public double workingHour;
 
 public Employe(String name,double salary,double paymentHour,double workingHour)
 {

	 super(name,salary);
	 this.workingHour=workingHour;
	 this.paymentHour=paymentHour;
	 
 }
 public double calculateSalary()	
 {
	 return paymentHour*workingHour;
 }
 
	
}
