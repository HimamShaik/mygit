//wap to find product of the given no 356
class pro_no
{
	public static void main(String[] args)
	{
		int number=356;
		int rem;
		int pro=1;
		int temp=number;
		while (number>0)
		{
			
			rem=number%10;
			pro=pro*rem;
			number=number/10;
		}
		System.out.println("product of given "+temp+" no is:"+pro);

	}
}
