// wap to print alphabets and his ascii values in horijontal position
class Ascii_val_1 
{
	public static void main(String[] args) 
	{
		char a='A';
		char b='Z';
		for (char i=a;i<=b ;i++ )
		{
          System.out.print(i+"  "); 
		}
		System.out.println();
		for (int h=a;h<=b ;h++ )
		{
			System.out.print(h+" ");
		}
		
	}
}