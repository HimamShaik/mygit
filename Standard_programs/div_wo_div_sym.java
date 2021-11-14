// wap to finr quocient with using divison symbol
class div_wo_div_sym
{
	public static void main(String[] args) 
	{
		int divident =21;
		int divison = 3;
		int count=0;
		int temp=divident;
		while (divident>=divison)
		{
			count++;
			divident=divident-divison;
		}
				System.out.println(count);

	}
}
