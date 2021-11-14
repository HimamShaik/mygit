class met2
{
     public int a=10;
	public static void move()
	{
		met2 r1=new met2();
     System.out.println(r1.a);
	}
	
	
	public static void main(String[] args) 
	{
		 
		move();
		System.out.println("static method access non-static variable by using referance variable");
	}
}
