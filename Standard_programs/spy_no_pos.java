class spy_no_pos 
{
	public static void main(String[] args) 
	{
		int m=1;
		int n=1000;
		int count=0;
        int pos=10;
		for (int i=m;i<=n ;i++ )
		{
			int a=i;
			int sum=0;
			int pro=1;
			
			while (a>0)
			{
				pro=pro*a%10;
				sum=sum+a%10;
	             a=a/10;
			
			}
			 
			if (sum==pro)
			{
					 count++;
			}
				if (pos==count)
				{
              System.out.println(i+" : it is a spy no");
			  break;
				}
		}
	}
}
