class pat_2 
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='A';
		for (int i=1;i<=n ;i++ )
		{
			for (int j=3;j>=i ;j-- )
			{
				System.out.print("  ");
			}
			for (int k=1;k<=i ;k++ )
			{
				System.out.print(ch +" ");
				ch+=2;
			}
			System.out.println();
		}
	}
}