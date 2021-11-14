class Ass8 
{
	public static void move()
	{
		int a=76;
	System.out.println(a);
	}
	public void fly()
	{
		int b=67;
	System.out.println(b);
	}
	public static int c=34;
	public int d=43;

	public static void main(String[] args) 
	{
		System.out.println("process started");
		move();
		Ass8 hai = new Ass8();
		hai.fly();
		System.out.println(c);
		System.out.println(hai.d);
	}
}
