package IceCream;

//abstract class
public abstract class IceCream {
	//declare variables
	private String type;
	private double cost1;
	private double cost2;
	
	//default constructor
	public IceCream()
	{
		type = "";
		cost1 = 0;
	}
	//overloaded constructor 
	public IceCream(String ty, double c,double c2)
	{
		type = ty;
		cost1 = c;
		cost2=c2;
	}	
	//set type
	public void setType(String ty)
	{
		type = ty;
	}
	//set cost1
	public void setCost1(double c)
	{
		cost1 = c;
	}
	//set cost2
	public void setCost2(double c2)
	{
		cost2=c2;
	}
	//get type
	public String getType()
	{
		return type;
	}
	//get cost1
	public double getCost1()
	{
		return cost1;
	}
	//get cost2
	public double getCost2()
	{
		return cost2;
	}
	//abstract method for flavour
	public abstract void flavour();
	//abstract method for topping
	public abstract void topping();
	//method for flavours 
	public void flavours()
	{
		//flavours
		System.out.println("F L A V O U R S \n");
		String flavour[]={"1.Cookies and Cream","2.Moose Tracks","3.Cookie Dough","4.Chocolate","5.Vanilla"};
		for(int i=0;i<flavour.length;i++) 
		{
			System.out.println(flavour[i]);
		}
	}
	//method for toppings 
	public void toppings()
	{
		//toppings
		System.out.println("T O P P I N G S \n");
		String topping[]= {"1.Chocolate Chips","2.Oreo Crumbs","3.Chocolate Syrup","4.Sprinkles","5.Strawberries"};
		for(int i=0;i<topping.length;i++) 
		{
			System.out.println(topping[i]); 
		}
	
	}

		
		
}
