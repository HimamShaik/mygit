class per_sq_no_2
{
	public static void main(String[] args) 
	{
		int m=16;
		int n=36;
		
		for (int j=m;j<=n;j++ )
		{
			int a=j;
			boolean ischeck=false;
		for (int i=1;i<=j ;i++ )
		{
			if (i*i==j)
			{
				ischeck=true;
				break;
			}
		}
			if (ischeck==true)
			{
				System.out.println(a+" :perfect sq no");
			}
		}
	}
}
