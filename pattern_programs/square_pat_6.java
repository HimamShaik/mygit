class square_pat_6 
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if (i==1 && j==1 || i==1 && j==n)
				{
					System.out.print("$ ");
				}
				else if (i>=2 && j>=2 && i<=3 && j<=3)
				{
					System.out.print("$ ");
				}
				else if (i==n && j==1 || i==n && j==n)
				{
					System.out.print("$ ");
				}
				else 
					{
				System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
