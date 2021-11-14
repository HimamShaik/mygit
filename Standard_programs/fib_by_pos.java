class fib_by_pos 
{
	public static void main(String[] args) 
	{
		int pos=20;
		int count=0;
		int n1=0;
		int n2=1;
		int n3=0;
		for (int i=1;i<=i+1 ;i++ )
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if (n3>0)
			{
				count++;
			}
			if (count==pos)
		{
          System.out.println("the "+pos+" pos of fibanocci no is: "+n3);
		  break;
		}

		}
		
		
	}
}
