class duck_no 
{
	public static void main(String[] args) 
	{
		int n=0403,pos=4;
		int n1=n;
		int rem,count=0;
		while (n>0)
		{
			rem=n%10;
            n=n/10;
			count++;
		}
		if (pos==count)
		{
		System.out.println(" it is duck no");
		}
		else
		{
		System.out.println("not duck no");
		}
	}
}
