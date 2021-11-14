class summ_of_no
{
	public static void main(String[] args) 
	{
	 int number=365;
	 int rem=0;
	 int summ=0;
	 int temp=number;
	 while (number>0)
	 {
         summ=summ+number%10;
		number=number/10;
		 

	 }
	 System.out.println("the summation of the "+temp +" is :"+summ);


	}
}
