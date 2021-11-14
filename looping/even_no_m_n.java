//wap to print even no's nd m to n no's which is div by 3 & 7
class even_no_m_n
{
	public static void main(String[] args) 
	{
		int m=20;
		int n=45;
		int count=0;
		for (int i=m;i<=n ; i++)
		{
			
			if (i%3==0 && i%7==0 && i%2==0)
			{
		System.out.println(i);
		count++;

			}
		
		}
		System.out.println(count);
	}
}
