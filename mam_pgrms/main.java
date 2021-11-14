interface sample
{
	public void move();
}
interface demo extends sample
 {
	public void walk();
	public void move();
 }
 class main1 implements demo
 {
	 public void walk()
	{
	System.out.println("walk daily 3kms");
    }
	public void move()
	{
	System.out.println("move a bit");
	}
 }
class main 
  {
	public static void main(String[] args) 
	{
		main1 d1= new main1();
		d1.walk();
		d1.move();
	}
}
