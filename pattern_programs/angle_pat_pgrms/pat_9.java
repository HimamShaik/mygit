class pat_9 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1;i<=n ;i++ )
		{
			int k=5;
			char ch='a';
			for (int j=n;j>=i ;j-- )
			{
				if (i%2==0)
				{
				System.out.print(ch+" ");
				ch++;
				}
				else
				{
				System.out.print(k+" ");
				k--;
				}
			}
			System.out.println();
		}
	}
}
