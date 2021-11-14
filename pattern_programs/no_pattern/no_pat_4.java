class no_pat_4 
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				System.out.print(k++ +" ");
				if(k>9)
				{
				k=1;
				}
			}
			System.out.println();
		}
	}
}
