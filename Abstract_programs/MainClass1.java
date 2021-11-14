abstract class C
{
  abstract public void move();
  abstract public void walk();

}
class D extends C
{
 public void move()
 {
     System.out.println("move a bit...");
 }
 public void walk()
{
     System.out.println("walk through a zebra crossing...");
 }
}
class MainClass1
{
	public static void main(String[] args) 
	{
		D b1=new D();
		b1.move();
		b1.walk();

	}
}
