class P
{
public int i=10;
}
class Q extends P
{
	public double j=2.3;
	public void info()
	{
			System.out.println("i value is :"+i);
						System.out.println("j value is :"+j);


	}
}
class R extends P
{
	public double k=2.4;
	public void print()
	{
	System.out.println("i value is :"+i);
						System.out.println("k value is :"+k);
	}
}
class MainClass4

{
	public static void main(String[] args) 
	{
      Q b1=new Q();
	  b1.info();
	  R b2=new R();
	  b2.print();

	}
}
