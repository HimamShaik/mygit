class Rectangle 
{
	public double length;
	public double width;
	Rectangle(double A,double B)
	{
	 length=A;
	 width=B;
	}
	public double  getarea()
	{
	return length*width;
	}
	public void display()
	{
	System.out.println("length is :"+length +"width is :"+ width);
    System.out.println("getarea is :"+ getarea());
	}

	public static void main(String[] args) 
	{
		Rectangle f1=new Rectangle(3.14,2.2);
		Rectangle f2=new Rectangle(2.2,3.14);
        Rectangle f3=new Rectangle(3.22,3.2);

		f1.display();
		f2.display();
		f2.display();

	}
}