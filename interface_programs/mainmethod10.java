abstract class fourwheler
{
	abstract public void car();
}
class sixwheler extends fourwheler
{
	public void car()
	{
	  System.out.println("car have four and six wheler");
	}
}
class mainmethod10 
{
	public static void main(String[] args) 
	{
		fourwheler f1=new sixwheler();
		f1.car();	
	}
}
