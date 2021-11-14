class Circle1
{
	public String round;
	public double pi;
	public double r;
	Circle1(String hai,double A,double B)
	{
		round=hai;
	 pi=A;
	 r=B;
	}
	public double areaOfCircle()
	{
	return 2*pi*r;
	}
	public void display()
	{
	System.out.println("round is:"+round+"pi is :"+pi+"r is :"+r);
    System.out.println("areaOfCircle is :"+ areaOfCircle());
	}

	public static void main(String[] args) 
	{
		Circle1 k1=new Circle1("whole",3.14,2.2);
		Circle1 k2=new Circle1("whole1",3.14,4.2);
        Circle1 k3=new Circle1("whole2",3.14,3.2);

		k1.display();
		k2.display();
		k2.display();

	}
}
