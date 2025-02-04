package exo_2;

public class Customer {

	private String name;
	private int id;
	private int discount;
	
	public Customer (String name, int id, int discount)
	{
		this.name =  name ;
		this.id = id;
		this.discount = discount;
	}

	public String getName()
	{
		return name;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public int getDiscount()
	{
		return discount;
	}
	
	public void setDiscount (int discount)
	{
		this.discount = discount;
	}
	
	public String toString ()
	{
		return name+"("+id+")"+discount;
	}
}
