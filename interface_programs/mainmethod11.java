interface hotel
{
	void room();
}
class hostel implements hotel
{
	public void room()
	{
	 System.out.println("both hotel and hostels have room rent");
	}
}

class mainmethod11 
{
	public static void main(String[] args) 
	{
		hotel h1=new hostel();
		h1.room();
	}
}
