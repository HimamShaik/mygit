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
	public static double karlo(double i,double j)
	{
	return i+j;
	}
	public int karlo(int i,int j)
	{
	return i+j;
	}
	public static void main(String[] args) 
	{
		System.out.println("calling both static and non static methods in overload");
		karlo(2,4.0);

		demo obj=new demo();
	    obj.karlo(6.0,3);

		double k=karlo(2.0,4.0);

		int j=obj.karlo(6,3);

		System.out.println(k);

		System.out.println(j);

        System.out.println("called both static and non static methods in overload");

	}
}
