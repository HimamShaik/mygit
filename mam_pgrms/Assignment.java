interface Run
{
	public void display();
}
class Walk
{
	public void print()
	{
	System.out.println("Given statement o/p is printed");
	}
}
class Assign implements Run
{
	public void display()
	{
	System.out.println("display the expression");
	}
	public void run()
	{
	System.out.println("life is full of running");
	}
}

class Assignment 
{
	public static void main(String[] args) 
	{
		Assign a1=new Assign();
		a1.display();
		a1.run();
		Walk w1=new Walk();
		w1.print();
	}
}