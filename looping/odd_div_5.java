//wap to print odd no's and div by 5 in decending order
class odd_div_5 
{
	public static void main(String[] args) 
	{
		int a=100;
		int b=1;
		for (int i=a;i>=b ;--i )
		{
			if (i%2==1 && i%5==0)
			{
		   	System.out.print(i+"  ");

			}
		}
	}
}
