class palindron 
{
	public static void main(String[] args) 
	{
		int a=253;
		int rem=0;
		int summ=0;
		int temp=a;
		while (a>0)
		{
			rem=a%10;
			summ=summ*10+rem;
			a=a/10;
		}
		if (temp==summ)
		{
		System.out.println("the given no is palindrom"+summ);
		}
		else 
		{
		System.out.println("no is not a palindrom no"+summ);
		}
	}
}