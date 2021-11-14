//Wap to print square pattern with $ and @ symbols
class Square_pat_2
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if (i>=3 && j>=3 && i<4 && j<4) //if(i==3 && j==3)
				{
					System.out.print("@ ");
				}
				else
				{
				System.out.print("$ ");
				}
			}
			System.out.println();
		}
	}
}
