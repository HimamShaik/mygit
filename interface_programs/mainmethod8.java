interface power
{
	void bhp();
}
interface torque
{
	void bhp();
}
class engine implements power,torque
{
	public void bhp()
	{
	 System.out.println("engine power define in bhp");
	}
	public void bhp()
	{
	 System.out.println("engine torque defined in nm");
	}
}
class mainmethod8 
{
	public static void main(String[] args) 
	{
       engine e1=new engine();
	   e1.bhp();
	   e1.bhp();
	}
}
