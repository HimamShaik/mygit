class perfect_no 
{
	public static void main(String[] args) 
	{
		int m=6;
		int n=28;
		
		
		for (int i=m;i<=n ;i++ )
		{   
			int a=i;
			int sum=0;
			for (int j=1;j<a;j++ )
			{	
			if (a%j==0)
			{
				sum=sum+j;
			}
			} 
		if (sum==i)
		{
			System.out.println(a+"prefect no");
		}
		}
		
	}
}
