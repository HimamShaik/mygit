/*wap for method over loading for temp convertion i,e. if input is int celsius return output in fahrenheit or 
if the input is in fahrenhit return output in celsius */
class  TempCon
{
	public static int temp(int i)
	{
	return (i*2)+30;
	}
	public static double temp(double j)
	{
	return (j-30)/2;
	}
	public static void main(String[] args) 
	{
		System.out.println("entered value in celsius is=12...");
		int fahrenheit=temp(12);
		System.out.println(fahrenheit + " : celsius to fahrenheit is");
		System.out.println("entered value in fahrenheit is=54...");
		double celcius=temp(54.0);
		System.out.println(celcius +" : farhenhit to celsius  is");

	}
}
