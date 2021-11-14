class A 
{
	public static int d=4;
	public int e=3;
}
class B
{
	public static void main(String[] args) 
	{
		System.out.println(A.d);
	    A s1=new A();
		System.out.println(s1.e);
		System.out.println("class A using and class B is executing");
	}
}
