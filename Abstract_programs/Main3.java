abstract class H
{
	abstract public void hai();
	abstract public void hello();
}
class G extends H
{
	public void hai()
	{
	System.out.println("we start our intro with hai");
	}
	public void hello()
	{
	System.out.println("hai reply hello");
	}
}
 class I extends G
 {
    public void hai()
	{
	 System.out.println("we text hai in whatsup");
	}
	public void hello()
	{
	System.out.println("we get replay hello");
	}
}
class Main3
{
	public static void main(String[] args) 
	{
		G g1=new G();
		I i1=new I();
		g1.hai();
		g1.hello();
		i1.hai();
		i1.hello();
	}
}
