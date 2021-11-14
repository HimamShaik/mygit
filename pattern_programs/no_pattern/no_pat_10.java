class no_pat_10 
{
	public static void main(String[] args) 
	{ 
		int n=5;
		
		for (int i=1;i<=4 ;i++ )
		{
			int k=5;
		char ch='e';
			
			for (int j=1;j<=5 ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(k-- +" ");
				}
				else
				{
				System.out.print(ch-- +" ");
				}
			}
			System.out.println();
		}
	}
}
