class pat_8 
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1;i<=n ;i++ )
		{
			char ch='e';
			for (int j=2;j<=i ;j++)
			{
				System.out.print("  ");
			}
			for (int k=n;k>=i ;k-- )
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}
