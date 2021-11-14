/* wap to method overload static and non static method to gether*/
class static_nonstatic
{
}  
{
	public static double karlo(int i, double j)
	{
		System.out.println(i+j);
	
	}
	public double karlo(doube i,int j)
	{
	System.out.println(i+j);
	}
	public static void main(String[] args) 
	{
		System.out.println("calling both static and non static methods in overload");
		double k=karlo(2,4);
		static_nonstatic obj=new static_nonstatic();
		double d=obj.karlo(6,3);

		System.out.println("called both static and non static methods in overload");

	}
}
