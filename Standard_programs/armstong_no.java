class armstong_no 
{
	public static void main(String[] args) 
	{
		int a=153;
		int sum=0;
		int rem=0;
		int c=a;
		int b=a;
		int count=0;
		while (a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println("the count digits of given no is:"+count);
		while (c>0)
		{
			rem=c%10;
			int pro=1;
			for (int i=1;i<=count ; i++)
			{
				pro=pro*rem;
			}
			sum=sum+pro;
			c=c/10;
		}
		if (b==sum)
		{
			System.out.println("the given no is armstrong_no: "+sum);
		}
		else
		{
		System.out.println(b+"no is a not armstrong no");
		}
		
	}
}
