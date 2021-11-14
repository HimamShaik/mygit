//wap to print summation and product of the numbers between m and n
class summ_pro_of_no
{
	public static void main(String[] args) 
	{
		int a=1;
		int sum=0;
		int mul=1;
		while (a<10)
		{
			sum=sum+a;
			mul=mul*a;
			a++;
		}
				System.out.println("summation of two numbers:"+sum);
				System.out.println("product of two numbers:"+mul);


	}
}
