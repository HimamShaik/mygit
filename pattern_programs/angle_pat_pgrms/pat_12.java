class pat_12 
{
	public static void main(String[] args) 
	{
		int n=4,count=0;
		for (int i=1;i<=n ;i++ )
		{
			int a;
			count+=i;
			a=count;
			for (int j=1;j<=i ;j++ )
			{
              System.out.print(a +" ");
			 a--;
			}
             System.out.println();
		}
	}
}
