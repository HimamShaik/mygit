/* wap tp preform to multiplybin three ways and retuen the result, all the methods must be non static, call the method,
+recevie the result and print result in the main method */
class  Mul3
{
	public int test1(int i, int j)
	{
	return i*j;
	}
	public double test1(int i, double j)
	{
	return i*j;
	}
	public double test1(double i,double j)
	{
	return i*j;
	}

	public static void main(String[] args) 
	{
		System.out.println("process started....");
		Mul3 obj= new Mul3();
		int a=obj.test1(2,3);
		double b=obj.test1(3,2.5);
		double c=obj.test1(2.5,3.5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("process ended....");
		}
}
