//wap to chech the given no product is eual to summ are not
class pro_sum_equal 
{
	public static void main(String[] args) 
	{
		int a=123;
		int rem=0;
		int summ=0;
		int pro=1;
		int remp=a;
		while (a>0)
		{
			rem=a%10;
			summ=summ+rem;
			pro=pro*rem;
			a=a/10;
		}
		if (pro==summ)
		{
		System.out.println(pro+" is equal to "+summ);

		}
		else
		{
		 System.out.println(pro+" is not equal to "+summ);
		}
	}
}