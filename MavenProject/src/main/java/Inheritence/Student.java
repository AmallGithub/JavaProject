package Inheritence;

public class Student 
{
	String name;
	int age;
	Address a;
	
	public Student(String name,int age,Address a)
	{
		this.name=name;
		this.age=age;
		this.a=a;
	}
	
	public void display()
	{
		System.out.println("Name is "+name);
		System.out.println("age is "+age);
		System.out.println("House name  is "+a.housename);
		System.out.println("House Number is "+a.houseno);
		System.out.println("City is "+a.city);
		
		
	}
	
	public static void main (String args[])
	{
		Address ob1= new Address("Anugraha",123,682024,"ekm");
		Student s= new Student("Amal",30,ob1);
		s.display();
		
	}

}
