class strong_by_pos
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=1000;
		int pos=3;
		int count=0;
		for (int j=m;j<=n ;j++ )
		{
		 int a=j;
		 int rem=0;
		 int sum=0;
		while(a>0)
		{
		 int fact=1;
		 rem=a%10;
		 for (int i=1;i<=rem ;i++ )
			{
			 fact=fact*i;
			}
		     sum=sum+fact;
		       a=a/10;
		}
		if (j==sum)
		{
          count++;
		}
		if (pos==count)
		{
		 System.out.println(j+"the given no is strong no");
		 break;

		}
		}
	}
}
