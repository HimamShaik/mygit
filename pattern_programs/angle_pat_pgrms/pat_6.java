class pat_6 
{
	public static void main(String[] args) 
	{
		int n=4;
		
		for (int i=1;i<=n ;i++ )
		{
			int k=1;
		    char ch='a';
			for (int j=1;j<=i ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(ch++ +" ");
				}
				else
				
				System.out.print(k++ +" ");
				
			}
			System.out.println();
		}
	}
}
