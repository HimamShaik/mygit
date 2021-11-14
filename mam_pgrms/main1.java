interface Sample
{
	public void add();
}
class Add1 implements Sample  
{
	public void add()
	{
		int a=10;
		int b=20;
	System.out.println("add of a & b is :"+(a+b));
	}
	public void sub()
	{
		int a=22;
		int b=13;
	System.out.println("sub of a & b is :"+(a-b));
	}
}
class Add2 implements Sample  
{
   public void add()
	{
		int a=10;
		int b=20;
	System.out.println("add of a & b is :"+(a+b));
	}
	public void div()
	{
		int a=4;
		int b=28;
	System.out.println("div of a & b is :"+(a/b));
	}
}


class main1
{
	public static void main(String[] args) 
	{
	  Add1 a1=new Add1();
	  a1.add();
	  a1.sub();
	  Add2 a2=new Add2();
	  a2.add();
	  a2.div();
	}
}
