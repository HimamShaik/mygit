class prime_no_1 
{
	public static void main(String[] args) 
	{
		int a=3;
		int b=6;
		
		for (int i=a;i<=b ;i++ )
		{
			boolean isprime=true;
			for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					isprime=false;
				}
			}
			if (isprime==true)
			{
				System.out.println(i+" :is a prime no");
			}
			else
			{
			 System.out.println(i+" : is not a prime no");
			}
		}
	}
}
