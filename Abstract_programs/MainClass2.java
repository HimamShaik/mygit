abstract class E 
{
	public void jump()
	{
			System.out.println("jump high...");

	}
	abstract public void fly();
}
class F extends E
{
	public void fly()
	{
			System.out.println("fly like a bird...");

	}
}

class MainClass2
{
	public static void main(String[] args) 
	{
		new F().jump();
		new F().fly();
	}
}
