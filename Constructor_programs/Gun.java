class Gun
{
	public String gName;
	public double bullets;
	
	Gun(String i,int j)
	{
	gName = i;
	bullets=j;
	}
	public void display()
	{
	 System.out.println(gName+"shoots"+bullets+"bullets");

	}
	public static void main(String[] args) 
	{
		Gun d1=new Gun("MR16",30);
		Gun d2=new Gun("AKM",40);
		Gun d3=new Gun("SCAR_L",30);
		d1.display();
		d2.display();
		d3.display();


	}
}