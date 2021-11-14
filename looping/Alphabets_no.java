//wap to print alphabets position of a particular alhabet
class Alphabets_no 
{
	public static void main(String[] args) 
	{
		char a='D';
		int count=1;
		for (char i='A';i<='Z' ;i++,count++)
		{
			 
			if (i==a)
			{
				System.out.println(count);
			}
		}

	}
}
