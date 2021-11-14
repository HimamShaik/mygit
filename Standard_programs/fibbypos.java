class fibbypos 
{
	public static void main(String[] args) 
	{
		int pos=100;
		int n1=0;
		int n2=1;
		int n3=0;
		for (int i=1;i<=25 ;i++ )
		{
			n3=n1+n2;
			if (n3<=pos)
			{
				System.out.println(n3);
			}
			n1=n2;
			n2=n3;
		}
		
	}
}
