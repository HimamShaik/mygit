class spy_no_2 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=102;
		for (int i=m;i<=n ;i++ )
		{
			int a=i;
			int sum=0;
			int prod=1;
			while (a>0)
			{
				sum=sum+a%10;
				prod=prod*a%10;
				a=a/10;
			}
			if (sum==prod)
			{
				System.out.println(i+"the given no is spy no");
			}
		}
	}
}