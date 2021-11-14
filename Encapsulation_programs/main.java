class calender
{
	private int monthNum;
	public int fetch()
	{
	 return this.monthNum;
	}
	public void receive(int monthNum)
	{
	if (monthNum>=1 && monthNum<=12)
	{
		this.monthNum=monthNum;
	}
	else 
		{
         //throw Exception;
	    }
	}
}

class main 
{
	public static void main(String[] args) 
	{
		calender c1=new calender();
		c1.receive(7
			);
		System.out.println(c1.fetch());
	}
}
