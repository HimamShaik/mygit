class  prime_no_2
{
	public static void main(String[] args) 
	{
		int n=3;
		int m=6;
		boolean ischeck=true;
		for (int k=n;k<=m ;k++ )
		{
		   for (int i=2;i<k ;i++ )
		   {
			if (k%i==0)
			{
				ischeck=false;
			}
		  }
		if (ischeck==true)
		{
			System.out.println(k+" : it is prime no");
		}
		else
		    {
			ischeck=true;
		    System.out.println(k+" : it is not a prime no");
	    	}
    	}
	}
}
