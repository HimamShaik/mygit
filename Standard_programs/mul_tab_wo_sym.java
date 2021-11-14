//wap to print multiplication table with out using multiplication table
class mul_tab_wo_sym 
{
	public static void main(String[] args) 
	{
		int n=5;
		int sum=0;
		for (int i=1;i<=10 ;i++ )
		{
			sum=sum+n; // or sum+=n;
			System.out.println(n+"*"+i+"="+sum);
		}
	}
}
