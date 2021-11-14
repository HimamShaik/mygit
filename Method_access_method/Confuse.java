class one
{
	public static int a=12;
	public double b=12.5;
}
class two
{
	public static void hai()
	{
		System.out.println("2nd static method started");
		System.out.println(one.a);
		System.out.println("2nd static method ended");
	}
	public void hello()
	{
	System.out.println("2nd non static method started");
	one obj= new one();
	System.out.println(obj.b);
	System.out.println("2nd non static method ended");

	}
}
class three
{
	public static int c=10;
	public double d=10.5;
	public static void karlo()
	{
		System.out.println("3rd static method started");
		two.hai();
		System.out.println(c);
	    System.out.println("3rd static method ended");
	}
	public void andy()
	{
	  System.out.println("3rd non static method started");
	  two obj2=new two();
	  obj2.hello();
		System.out.println(d);
		three obj1=new three();
		obj1.karlo();
				System.out.println("3rd non static method ended");

	}
}
class Confuse

{
	public static void main(String[] args) 
	{
				System.out.println("process started");
         three obj3=new three();
		obj3.andy();
				System.out.println("process ended");

	}
}
