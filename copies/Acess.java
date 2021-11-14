 class Acess
{
	public static int d=12;
	public void fly()
	{
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		Acess d1=new Acess();
		d1.fly();
		System.out.println("non-static method acess static variable by using referance variable");
	}
}
