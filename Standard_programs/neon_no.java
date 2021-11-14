class neon_no 
{
	public static void main(String[] args) 
	{
		int n=3;
		int sum=0;
		int sq=n*n;
		while (sq>0)
		{
			sum=sum+sq%10;
			sq=sq/10;
		}
		if (sum==n)
		{
			System.out.println("it is a neon no");
		}
		else
	    {
		System.out.println("it is not neon no");
		}
	}
}
