class Rectangle1 
{
	public double length;
	public double width;
	Rectangle1(double length,double width)
	{
	 this.length=length;
	 this.width=width;
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
		Rectangle1 f1=new Rectangle1(3.14,2.2);
		Rectangle1 f2=new Rectangle1(2.2,3.14);
        Rectangle1 f3=new Rectangle1(3.22,3.2);

		f1.display();
		f2.display();
		f2.display();

	}
}
