class per_sq_no 
{
	public static void main(String[] args) 
	{
		int a=16;
		boolean ischeck=false;
		for (int i=1;i<=a ;i++ )
		{
			if (i*i==a)
			{
				ischeck=true;
				break;
			}
		}
			if (ischeck==true)
			{
				System.out.println(a+" :perfect sq no");
			}
			else
			{
			System.out.println(a+"not a perfect sq no");
			}
	}
}