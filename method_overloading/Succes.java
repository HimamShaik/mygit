/* wap to method overload static and non static method to gether*/
class demo 
{
	public static void karlo(int i, double j)
	{
		System.out.println(i+j);
	
	}
	public void karlo(double i,int j)
	{
	System.out.println(i+j);
	}
	public static void main(String[] args) 
	{
		System.out.println("calling both static and non static methods in overload");
		karlo(2,4);
		demo obj=new demo();
	    obj.karlo(6,3);

		System.out.println("called both static and non static methods in overload");

	}
}
