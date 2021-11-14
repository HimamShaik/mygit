class sunny_no 
{
	public static void main(String[] args) 
	{
		int n=63;
		int sum=n+1;
		boolean ischeck=false;
		for (int i=1;i<=sum ;i++ )
		{
			if (i*i==sum)
			{
			
			ischeck=true;
			break;
			}
		}
	    if (ischeck==true)
	    {
			System.out.println("it is a sunny no");
	    }
		else
		{
		System.out.println("it is a not sunny no");
		}

}
}
