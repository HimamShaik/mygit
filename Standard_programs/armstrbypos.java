class armstrbypos
{
	public static void main(String[] args) 
	{
		int a=100;
		int n=1000;
		int pos=4;
		int lekka=0;
		for (int j=a;j<=n ;j++ )
		{
		int sum=0;
		int rem=0;
		int c=j;
		int b=j;
		int temp=j;
		int count=0;
		while (c>0)
		{
			c=c/10;
			count++;
		}
		while (b>0)
		{
			rem=b%10;
			int pro=1;
			for (int i=1;i<=count ; i++)
			{
				pro=pro*rem;
			}
			sum=sum+pro;
			b=b/10;
		}
		if (temp==sum)
		{
			lekka++;
		}
		if (lekka==pos)
		{
			System.out.println("the given no is armstrong_no: "+sum);
			break;
		}
		}
	}
}
