class Rectangle 
{
	public double l;
	public double w;
	public double getArea()
	{
	 return 2*l*w;
	}
	public void display()
	{
	System.out.println("getArea is :"+getArea());
	}
	public static void main(String[] args) 
	{
		Rectangle c1=new Rectangle();
				Rectangle c2=new Rectangle();
						Rectangle c3=new Rectangle();
						c1.l=22;
						c2.l=23;
						c3.l=24;
						c1.w=12;
						c2.w=13;
						c3.w=14;
						c1.getArea();
						c2.getArea();
						c3.getArea();
						c1.display();
						c2.display();
						c3.display();



		System.out.println("process ended");
	}
}
