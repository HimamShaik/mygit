class Flower
{
  public void pula()
	{
    System.out.println("flower smell is for pleasent");
  }
}
class Rose extends Flower
{
	public void gulabi()
	{
	  System.out.println("rose are red and white colour");
	}
}
class Lilly extends Flower
{
	public void famous()
	{
	  System.out.println("lilly are most used flowers");
	}
} 
class Jasmin extends Flower
{
	public void white()
	{
	  System.out.println("jasmin are in white colour");
	}
}
class Garden1
{
	public static  void display(Rose r1)
	{
		r1.pula();
	   r1.gulabi();
	}
	public static void show(Lilly l1)
	{
	  l1.pula();
	  l1.famous();
	}
	public static void print(Jasmin j1)
	{
	  j1.pula();
	  j1.white();
	}
}
class Garden2
{
	public static void visible(Flower f1)
	{
	   f1.pula();
	   if(f1 instanceof Rose)
		{
	      Rose r1=(Rose) f1;
		  r1.gulabi();
	   }
	   else if (f1 instanceof Lilly)
	   {
		   Lilly l1=(Lilly) f1;
		   l1.famous();
	   }
	   else if (f1 instanceof Jasmin)
	   {
		   Jasmin j1=(Jasmin) f1;
		   j1.white();
	   }
	}
}

class MainClass 
{
	public static void main(String[] args) 
	{
				System.out.println("........spelization method proces start......");
                Garden1.display(new Rose());
				Garden1.show(new Lilly());
				Garden1.print(new Jasmin());
				System.out.println("........spelization method proces ended......");
             
			    System.out.println("........***************************......");

               	System.out.println("........genralization method proces start......");

				 Garden2.visible(new Rose());
				 Garden2.visible(new Lilly());
				 Garden2.visible(new Jasmin());
				System.out.println("........genralization method proces ended......");


	}
}