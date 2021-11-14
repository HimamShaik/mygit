// wap to print alphabets with there pos
class Alphabets 
{
	public static void main(String[] args) 
	{
		char a='A';
		char b='Z';
		int count=0;
        for (char i=a;i<=b ;i++ )
        {
		
          System.out.print(i+"--->");
		  count++;
		  System.out.println(count);
        }
	}
}
