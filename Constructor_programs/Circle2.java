class Circle2
{
	
	public double pi;
	public double r;
	Circle2(double pi,double r)
	{
	 this.pi=pi;
	 this.r=r;
	 
	}
	public double areaOfCircle()
	{
	return 2*pi*r;
	}
	public void display()
	{
	System.out.println("pi is :"+pi+"r is :"+r);
    System.out.println("areaOfCircle is :"+ areaOfCircle());
	}

	public static void main(String[] args) 
	{
		Circle2 k1=new Circle2(3.14,2.2);
		Circle2 k2=new Circle2(3.14,4.2);
        Circle2 k3=new Circle2(3.14,3.2);

		k1.display();
		k2.display();
		k2.display();

	}
}
