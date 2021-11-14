interface room1
{
	void doorno1();
}
interface room2
{
	void doorno2();
}
interface room3
{
	void doorno3();
}
class apartment implements room1,room2,room3
{
	public void doorno1()
	{
       		System.out.println("himam door no");

	}
	public void doorno2()
	{
       		System.out.println("gopal door no");

	}
	public void doorno3()
	{
       		System.out.println("abhi door no");

	}
}


class Mainclass3 
{
	public static void main(String[] args) 
	{
		apartment r1=new apartment();
		r1.doorno1();
		r1.doorno2();
		r1.doorno3();
	}
}
