class Shape
{
	public void rotate()
	{
			System.out.println("Rotate clock wise....");

	}
}
class Rect  extends Shape
{

}
class Circle extends Shape
{
	public void rotate()
	{
			System.out.println("rotate Anti-clock wise....");
	}
 
}
class Triangle extends Shape
{
 
}
class Main1
{
	public static void main(String[] args) 
	{
		new Triangle().rotate();
		new Rect().rotate();
		new Circle().rotate();
	}
}