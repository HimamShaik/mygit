class square_pat_12 
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=9 ;j++ )
			{
				if (i==1 || j==1 || i==j || i==n/2+1)
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
