abstract class P
{
	abstract public void move();
}
class Q extends P
{
	public void move()
	{
	System.out.println("bhaya thoda side dengeh..");
	}
	public void info()
	{
	System.out.println("every thing there is a info..");
	}
}
class R extends P
{
	public void move()
	{
	System.out.println("move a bit...");
	}
	public void print()
	{
	System.out.println("print the paper..");
	}
}
class Main
{
	public static void main(String[]args)
	{
	Q q1=new Q();
	R r1=new R();
	q1.move();
	q1.info();
	r1.move();
	r1.print();
	}
}