class Circle 
{
	public static double pi=3.14;
	public double r;
	public double areaOfCircle()
	{
	return 2*pi*r;
	}
	public void display()
	{
		System.out.println("areaOfCircle is :"+ areaOfCircle());
	}
	public static void main(String[] args) 
	{
          Circle b1=new Circle();
		            Circle b2=new Circle();
					Circle b3=new Circle();
					b1.r=3.2;
					b2.r=4.5;
					b3.r=2.4;
					b1.areaOfCircle();
					b2.areaOfCircle();
					b3.areaOfCircle();
					b1.display();
					b2.display();
					b3.display();
 





		System.out.println("done the process");
	}
}
