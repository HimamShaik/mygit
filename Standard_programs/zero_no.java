class zero_no 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=100;
		int count=0;
		for (int i=m;i<=n ;i++ )
		{
			int a=i;
			while (a>0)
			{
				if (a%10==0)
				{
					count++;
				}
				a=a/10;
			}
		}
		System.out.println(count+": zero are preent in"+m+"and"+n);
	}
}
