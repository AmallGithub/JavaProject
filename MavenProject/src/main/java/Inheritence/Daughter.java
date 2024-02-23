package Inheritence;//hybrid Inheritence

public class Daughter extends Male 
{
	
	public void showD()
	{
		System.out.println("Base class is Daughter");
	}
	public static void main(String args[])    
	{    
	
	Son obj = new Son();  
	obj.showS();  
	obj.showF();    
	obj.showG();  
	Daughter obj2 = new Daughter();  
	obj2.showD();  
	obj2.showF();   
	obj2.showG();    
	}    
	}  


