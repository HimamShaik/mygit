interface compt1
{
	void seat1();
}
interface compt2
{
	void seat2();
}
interface train extends compt1,compt2
{
	void seat3();
}
class s implements train
{
	public void seat1()
	{
	System.out.println("ladies");
	}
	public void seat2()
	{
	System.out.println("mens");
	}
	public void seat3()
	{
	System.out.println("pilot");
	}
}


class mainclass4 
{
	public static void main(String[] args) 
	{
		s s1=new s();
		s1.seat1();
		s1.seat2();
		s1.seat3();
		
	}
}
