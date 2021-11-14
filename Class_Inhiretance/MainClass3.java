class M 
{
	public double i=2.5;
}
class N extends M
{
	public int j=22;
}
class O extends N
{
	public int k=33;
	public void display()
	{
			System.out.println("i value is :"+i);
			System.out.println("j value is :"+j);
			System.out.println("k value is :"+k);



	}
}
class MainClass3
{
	public static void main(String[] args) 
	{
		O b1=new O();
		b1.display();
		
	}
}
