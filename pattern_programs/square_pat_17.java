class square_pat_17
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if (j==1 || i==j || i==n || j==n || i+j==n+1)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
