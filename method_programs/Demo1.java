/*prgm for non-static variable calling in main method */
class Demo1 
{
	public int h=65;
	public static void main(String[] args) 
	{
		System.out.println("starting");
		Demo1 obj=new Demo1();
		
		System.out.println(obj.h);
		System.out.println("ended");
	}
}