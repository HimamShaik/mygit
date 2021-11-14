interface Mobile 
{
	void futures();
}
class Seller implements Mobile
{
	public void futures()
	{
	  System.out.println("high_speed,good_looking,perfect_use");
	}
	public void Manfacture()
	{
	  System.out.println("mother board have control pannel to control");
	}
}
class Shop
{
	public static void sell(Seller r1)
	{
	  r1.futures();
	  r1.Manfacture();
	}
}
class main
{
	public static void main(String[] args) 
	{
		Shop.sell(new Seller());
	}
}
