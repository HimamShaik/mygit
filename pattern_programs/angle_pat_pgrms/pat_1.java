class pat_1 
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='A';
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(ch++ +" ");
				}
				else
				{
				System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
