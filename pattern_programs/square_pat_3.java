//Wap to print square pattern with A,#,* and ! symbols
class square_pat_3 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++ )
			{
				if (i==1 && j==4)
				{
					System.out.print("# ");
				}
				else if (i==2 && j==2)
				{
					System.out.print("# ");
				}
				else if (i==3 && j==1)
				{
					System.out.print("% ");
				}
				else if (i==3 && j==3)
				{
					System.out.print("! ");
				}
				else if (i==4 && j==4)
				{
					System.out.print("* ");
				}
				else 
				{
				System.out.print("A ");
				}
			}
			System.out.println();
		}
	}
}