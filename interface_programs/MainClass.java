interface Sample
{
	public void text();
}
class Hai implements Sample
{
	public void text()
	{
	 		System.out.println("text me later");

	}
}
class MainClass
{
	public static void main(String[] args) 
	{
		new Hai().text();
	}
}