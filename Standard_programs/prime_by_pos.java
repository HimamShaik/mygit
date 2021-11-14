class prime_by_pos 
{
	public static void main(String[] args) 
	{
		int pos=7;
		int count=0;
		for (int i=1;i<=i+1 ;i++ )
		{
			int a=i;
			boolean ischeck=true;
			for (int j=2; j<a;j++ )
		    {
					if (a%j==0)
					{
						ischeck=false;
					}
			}
					if (ischeck==true)
					{
						count++;
					}
					
					if (pos==count)
					{
						System.out.println(pos+" : pos of prime no is "+i);
						break;
					}
		}
	}
}