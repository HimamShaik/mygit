/* copies of members */
class Run
	{
	public static int a=87;
	public int b=99;
	public static void main(String[] args) 
	{
		System.out.println("Exe starts...");
		System.out.println(a);
		Run r1= new Run();
		Run r2= new Run();
		Run r3= new Run();
		System.out.println(r1.b);
		System.out.println(r2.b);
		System.out.println(r3.b);
		System.out.println("Exe ends...");

	}
}
