class spy_no 
{
	public static void main(String[] args) 
	{ 
		int n=1;
		int m=102;
		
		for (int i=n;i<=m ;i++ )
		{
			int prod=1;
		       
		        int sum=0;
				int temp=i;
				
			while (temp>0)
			{
				sum=sum+temp%10;
				prod=prod*temp%10;
				temp/=10;
			}
			
			if (sum==prod)
			{
				System.out.println(i+"this is a spy no");
			}
			
			
		
		}
	}
}