class met1
{
     public int a=10;
	public void move()
	{
     System.out.println(a);
	}
	public static void main(String[] args) 
	{
		met1 r1=new met1();
		r1.move();
		System.out.println("non-static method access non-static variable directly");
	}
}