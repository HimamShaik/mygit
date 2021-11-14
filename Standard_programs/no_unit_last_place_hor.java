// wap to print the no form its unit last place in horizontal way
class no_unit_last_place_hor
{
	public static void main(String[] args) 
	{
	 int number=365;
	 int rem=0; 
	 while (number>0)
	 {
      
	   System.out.print(number%10+"  ");
        number=number/10;

	 }


	}
}