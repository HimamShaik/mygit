class prime_no 
{
	public static void main(String[] args) 
	{
		int n=11;
		boolean ischeck=true;
		for (int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{
				ischeck=false;
				
			}
		}
		if (ischeck==true)
		{
			System.out.println("it is prime no");
		}
		else
		{
		System.out.println("it is not a prime no");
		}
	}
}
