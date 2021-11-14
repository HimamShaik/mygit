class no_pat_9 
{
	public static void main(String[] args) 
	{ 
		int n=4;
		int k=1;
		    char ch='a';
		for (int i=1;i<=n ;i++ )
		{
			
			for (int j=1;j<=n ;j++ )
			{
				if (j%2==0)
				{
					System.out.print(k++ +" ");
				}
				else
				{
				System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}
}
