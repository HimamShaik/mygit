//wap to print count the no's which are div by 7&5
class count_no_div
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=100;
		int count=0;
		while (a<=b)
		{
			if (a%7==0 && a%5==0)
			{
				count++;
			System.out.println(a);
			}

			a++;
			
		}
		System.out.println(count);
	}
}