/*WAP TO CREATE TWO CLASSES IN A SINGLE FILE,FIRST CLASS CONSIST OF STATIC METHOD AND NON STATIC METHOD,
SECOND CLASS CONSIST OF MAIN METHOD WHICH WILL CALL STATIC AND NON STATIC METHOD OF FIRST CLASS */

class A1 
{
	public static void move()
	{
		System.out.println("hai this is himam");
	}
	public void fly()
	{
	    System.out.println("fly in us");
	}
}
class B1 
{
	public static void main(String[] args) 
	{
		A1.move();
		A1 b1=new A1();
		b1.fly();
		
	}
}

	
