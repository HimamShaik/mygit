class Dog 
{
	public String dName;

	Dog(String z)
	{
	dName = z;
	}
	public void display()
	{
	System.out.println("Dog name is :"+dName);
	}
	public static void main(String[] args) 
	{
		Dog d1=new Dog("jimmy");
		Dog d2=new Dog("puppy");
		Dog d3=new Dog("rummy");
		d1.display();
		d2.display();
		d3.display();


	}
}
