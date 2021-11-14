//wap to print position of a alphabets
class Alphabets_no_1 
{
	public static void main(String[] args) 
	{
		int a=4;
		int count=1;
		for (char i='A';i<='Z' ;i++, count++ )
		{
			if (count==a)
			{
				System.out.println(i);
			}
		}

	}
}
