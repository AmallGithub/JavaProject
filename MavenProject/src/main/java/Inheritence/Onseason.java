  

package Inheritence;

public class Onseason extends Offseason
{
	float price,discount,total;
	
	public void setPrice(float price)
	
	{
		this.price=price;
		
	}
	
	public float getPrice(float price)
	
	{
		return price;
		
	}

	public void setDiscount(float discount)
	
	{
		this.discount=discount;
		
	}
	
	public float getDiscount()
	{
		
		discount=(float).40 * price;
		return total=price-discount;
	}

	public void display()
	{
		System.out.println("The amount after discount on Onseason is "+total);
	}

}
	


