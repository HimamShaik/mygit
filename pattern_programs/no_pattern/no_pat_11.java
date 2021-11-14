class no_pat_11 
{
	public static void main(String[] args) 
	{
		int n=13;
		
		for (int i=1;i<=4 ;i++ )
		{
			char ch='m';
		    int k=13;
			for (int j=1;j<=n ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(k--);
				}
				else
				{
				System.out.print(ch--);
				}

			}
			System.out.println();
		}
	}
}
