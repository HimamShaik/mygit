class overloading 
{
	public static void test(int i,int j)
	{
	System.out.println("inside method 2 int args ");
	}
	public static void test(int i, double j)
	{
	System.out.println("inside method 1 int and 1 double args ");
	}
	public static void test(int i, int j, int k)
	{
	System.out.println("inside method 3 int args ");
	}
	public static void test(double i,int j)
	{
	System.out.println("inside method 1 double and 1 int args ");
	}


	public static void main(String[] args) 
	{
		System.out.println("process start");
		test(2,3);
		test(2, 2.5);
		test(2,3,4);
		test(4.5,3);
		System.out.println("process start");
	}
}