interface TwoWheler
{
	void bike();
}
abstract class fourwheler
{
	abstract public void car();
}
class vehicle extends fourwheler implements TwoWheler
{
  public void bike()
	{
            System.out.println("bike is comfort in trafic");
    }
     public void car()
	 {
             System.out.println("car is comfort in luggage carring");
     }
}
class mainmethod6 
{
	public static void main(String[] args) 
	{
	   vehicle a=new vehicle();
	   a.bike();
	   a.car();
	}
}