class test1 
{
	public void move()
	{
		System.out.println("move lika a tiger..");
	}
	public static void main(String[] args) 
	{
		System.out.println("execution started...");
		test1 obj= new test1();
		obj.move();
		obj.fly();
		System.out.println("execution ended...");
	}
	public void fly()
	{
		System.out.println("fly like a bird...");
}
}
