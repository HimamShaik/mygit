class A
{
public int i=20;
}
class B extends A
{
public double j=23.0;
public void text()
	{
System.out.println("i value is :"+ i);
System.out.println("j value is :"+ j);

}

}
class MainClass2
{
	public static void main(String[] args) 
	{
		new B().text();
	}
}
