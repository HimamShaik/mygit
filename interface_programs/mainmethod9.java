class engine
{
	public void bike()
	{
	 System.out.println("boys fav is bike");
	}
}
class space extends engine
{
	public void bike()
	{
	 System.out.println("two persons can go easily");
	}
}
class mainmethod9 
{
	public static void main(String[] args) 
	{ 
              engine e1=new space();
			  e1.bike();
	}
}