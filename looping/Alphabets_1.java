// wap to print alphabets with there pos in horijointal way
class Alphabets_1
{
	public static void main(String[] args) 
	{
		char a='A';
		char b='J';
		char e='K';
		char d='Z';

        for (char i=a;i<=b ;i++ )
        {
		  System.out.print("  "+i);
        }
		for (char h=e;h<=d ;h++ )
		{
		  System.out.print("   "+h);
		}
		System.out.println();
		for (int c=1;c<=26 ;c++ )
		{ 
			System.out.print("  "+c);
		}
	}
}
