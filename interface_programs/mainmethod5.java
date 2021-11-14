interface phoneno1
{
	void himam();
}
abstract class phoneno2
{
	abstract public void abhi();
}
class phone  extends phoneno2 implements phoneno1 
{
   public void himam()
	{
      		System.out.println("call himam");

   }
   public void abhi()
	{
      		System.out.println("call abhi");

   }
}
class mainmethod5 
{
	public static void main(String[] args) 
	{
		phone p1=new phone();
		p1.himam();
		p1.abhi();
	}
}
