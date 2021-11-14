class strong_no_2
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=50000;
		for (int j=m;j<=n ;j++ )
		{
		 int a=j;
		 int prod=1;
		 int sum=0;
		while(a>0)
		{
		 int fact=1;
		 prod=a%10;
		 for (int i=1;i<=prod ;i++ )
			{
			 fact=fact*i;
			}
		     sum=sum+fact;
		       a=a/10;
		}
		if (j==sum)
		{
		 System.out.println(sum+"the given no is strong no");

		}
		}
	}
}
