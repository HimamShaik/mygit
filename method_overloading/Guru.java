class Guru 
{
	public static void main(int i, int j)
	{
	System.out.println(i+j);

	}
	public static void main(double i, double j)
	{
	System.out.println(i+j);
	}
	public static void main(String[] args) 
	{
		main(2,2);
		main(2.0, 4.0);
		System.out.println("main method over loaded");
	}
}
