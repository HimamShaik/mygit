class  primebypos
{
	public static void main(String[] args) 
	{
		int n=1;
		int m=100;
		int pos=5;
		int count=0;
		
		for (int k=n;k<=m ;k++ )
		{
			int a=k;
			boolean ischeck=true;
		   for (int i=2;i<a ;i++ )
		   {
			if (a%i==0)
			{
				ischeck=false;

			}
		   }
		if (ischeck==true)
		{
			count++;
		}
		if (count==pos)
		{
			System.out.println(k+": it is prime no");
			break;
		}
		}
    	
	}
}